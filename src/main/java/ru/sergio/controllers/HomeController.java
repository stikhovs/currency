package ru.sergio.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import ru.sergio.component.DateChoose;
import ru.sergio.component.ValuteComponent;
import ru.sergio.entities.ValCurs;
import ru.sergio.services.ValuteService;

@Controller
public class HomeController {

	@Autowired
	private ValuteService valuteService;
	
	@GetMapping("/")
	public String goHome(Model model) {
		model.addAttribute("datechoose", new DateChoose());
		return "index";
	}
	
	@PostMapping("/")
	public String result(@ModelAttribute("datechoose") DateChoose datechoose, Model model) {		
		RestTemplate restTemplate = new RestTemplate();
		//System.out.println(datechoose.getDate());
        ValCurs curs = restTemplate.getForObject("http://www.cbr.ru/scripts/XML_daily.asp?date_req=" + datechoose.getDate(), ValCurs.class);
        
        List<ValuteComponent> valuteList = new ArrayList<>();
        curs.getValute().forEach(valute -> {valuteList.add(new ValuteComponent(
        		valute.getId(), 
        		valuteService.getNameOfValuteById(valute.getId()), 
        		valute.getValue())
        		);
        });
        
        //System.out.println(valuteService.getNameOfValuteById("R01235"));
        //model.addAttribute("names", valuteService.getIdAndNameMap());
        model.addAttribute("curs", curs);
        model.addAttribute("valuteList", valuteList);
        
		return "result";
	}
	
	
}

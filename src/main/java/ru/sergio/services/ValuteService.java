package ru.sergio.services;

import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import ru.sergio.entities.NameOfValute;
import ru.sergio.entities.ValuteNameItem;

@Service
public class ValuteService {

	public String getNameOfValuteById(String id) {
		RestTemplate restTemplate = new RestTemplate();
		NameOfValute name = restTemplate.getForObject("http://www.cbr.ru/scripts/XML_val.asp?d=0", NameOfValute.class);
		
		ValuteNameItem valuteItem = name.getItem().stream().filter(item -> item.getId().equals(id)).findFirst().get();
		
		return valuteItem.getName();
	}
	
	
	public Map<String, String> getIdAndNameMap(){
		RestTemplate restTemplate = new RestTemplate();
		NameOfValute name = restTemplate.getForObject("http://www.cbr.ru/scripts/XML_val.asp?d=0", NameOfValute.class);
		return name.getItem().stream().collect(Collectors.toMap(ValuteNameItem::getId, ValuteNameItem::getName));
	}
	
}

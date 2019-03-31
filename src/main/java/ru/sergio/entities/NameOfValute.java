package ru.sergio.entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Valuta")
public class NameOfValute {

	@JacksonXmlProperty(localName = "name", isAttribute = true)
	private String name;
	
	@JacksonXmlElementWrapper(localName = "Item", useWrapping = false)
	@JacksonXmlProperty(localName = "Item")
	private List<ValuteNameItem> item = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ValuteNameItem> getItem() {
		return item;
	}

	public void setItem(List<ValuteNameItem> item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "NameOfValute [name=" + name + ", item=" + item + "]";
	}
	
	
	
}

package ru.sergio.entities;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "ValCurs")
public class ValCurs {

	@JacksonXmlProperty(localName = "Date", isAttribute = true)
	private String date;
	@JacksonXmlProperty(localName = "name", isAttribute = true)
	private String name;

	@JacksonXmlElementWrapper(localName = "Valute", useWrapping = false)
	@JacksonXmlProperty(localName="Valute")
	private List<Valute> valute = new ArrayList<>();
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	
	public List<Valute> getValute() {
		return valute;
	}
	public void setValute(List<Valute> valute) {
		this.valute = valute;
	}
	@Override
	public String toString() {
		return "ValCurs [date=" + date + ", name=" + name + ", valute=" + valute + "]";
	}
	
	
	
}

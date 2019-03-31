package ru.sergio.entities;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Valute")
public class Valute {
	@JacksonXmlProperty(localName = "ID", isAttribute = true)
	private String id;
	@JacksonXmlProperty(localName = "NumCode")
	private int numCode;
	@JacksonXmlProperty(localName = "CharCode")
	private String charCode;
	@JacksonXmlProperty(localName = "Nominal")
	private int nominal;
	@JacksonXmlProperty(localName = "Name")
	private String name;
	@JacksonXmlProperty(localName = "Value")
	private double value;
	
	
	


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public int getNumCode() {
		return numCode;
	}


	public void setNumCode(int numCode) {
		this.numCode = numCode;
	}


	public String getCharCode() {
		return charCode;
	}


	public void setCharCode(String charCode) {
		this.charCode = charCode;
	}


	public int getNominal() {
		return nominal;
	}


	public void setNominal(int nominal) {
		this.nominal = nominal;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = Double.parseDouble(value.replace(",", "."));
	}


	@Override
	public String toString() {
		return "Valute [id=" + id + ", numCode=" + numCode + ", charCode=" + charCode + ", nominal=" + nominal
				+ ", name=" + name + ", value=" + value + "]";
	}

	
	
}

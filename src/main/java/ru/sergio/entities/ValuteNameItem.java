package ru.sergio.entities;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Item")
public class ValuteNameItem {

	@JacksonXmlProperty(localName = "ID", isAttribute = true)
	private String id;
	
	@JacksonXmlProperty(localName = "Name")
	private String name;
	
	@JacksonXmlProperty(localName = "EngName")
	private String engName;
	
	@JacksonXmlProperty(localName = "Nominal")
	private int nominal;
	
	@JacksonXmlProperty(localName = "ParentCode")
	private String parentCode;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEngName() {
		return engName;
	}

	public void setEngName(String engName) {
		this.engName = engName;
	}

	public int getNominal() {
		return nominal;
	}

	public void setNominal(int nominal) {
		this.nominal = nominal;
	}

	public String getParentCode() {
		return parentCode;
	}

	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	@Override
	public String toString() {
		return "ValuteNameItem [id=" + id + ", name=" + name + ", engName=" + engName + ", nominal=" + nominal
				+ ", parentCode=" + parentCode + "]";
	}
	
	
	
}

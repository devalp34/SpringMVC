package com.pkg;

import java.util.LinkedHashMap;

public class Student {

	String FirstName;
	String LastName;
	String Country;
	private LinkedHashMap<String,String> countryOption;
	String languageSelect;
	String[] multiSelect;
	
	public String[] getMultiSelect() {
		return multiSelect;
	}

	public void setMultiSelect(String[] multiSelect) {
		this.multiSelect = multiSelect;
	}

	public String getLanguageSelect() {
		return languageSelect;
	}

	public void setLanguageSelect(String languageSelect) {
		this.languageSelect = languageSelect;
	}

	public Student()
	{
		countryOption = new LinkedHashMap<>();
		countryOption.put("Bra", "Brazil");
		countryOption.put("Rus", "Russia");
		countryOption.put("Ind", "India");
		countryOption.put("Chi", "China");
		countryOption.put("Sou", "South Africa");
	}

	public LinkedHashMap<String, String> getCountryOption() {
		return countryOption;
	}

//	public void setCountryOption(LinkedHashMap<String, String> countryOption) {
//		this.countryOption = countryOption;
//	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	
}

package com.pack.sooriya;

import java.util.LinkedHashMap;

public class Student {

	private String name;
    private String dept;
    private String gender;
    private String skills;
    private LinkedHashMap<String,String> departmentOptions;
    private LinkedHashMap<String,String> genderOptions;
    private LinkedHashMap<String,String> skillOptions;
    public Student()
    {
    	departmentOptions = new LinkedHashMap<>();
    	departmentOptions.put("CSE", "CSE");
    	departmentOptions.put("EEE", "EEE");
    	departmentOptions.put("ECE", "ECE");
    	departmentOptions.put("IT", "IT");
    	genderOptions = new LinkedHashMap<>();
    	genderOptions.put("Male", "Male");
    	genderOptions.put("Female", "Female");
    	skillOptions = new LinkedHashMap<>();
    	skillOptions.put("SpringCore","SpringCore");
    	skillOptions.put("SpringMVC", "SpringMVC");
    	skillOptions.put("Oracle","Oracle");
    	
    }
    
	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public LinkedHashMap<String, String> getSkillOptions() {
		return skillOptions;
	}

	public String getDept() {
		return dept;
	}
	

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LinkedHashMap<String, String> getGenderOptions() {
		return genderOptions;
	}
	public LinkedHashMap<String, String> getDepartmentOptions() {
		return departmentOptions;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

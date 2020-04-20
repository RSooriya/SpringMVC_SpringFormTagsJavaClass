package com.pack.sooriya;

import java.util.LinkedHashMap;

public class Student {

	private String name;
    private String dept;
    private LinkedHashMap<String,String> departmentOptions;
    public Student()
    {
    	departmentOptions = new LinkedHashMap<>();
    	departmentOptions.put("CSE", "CSE");
    	departmentOptions.put("EEE", "EEE");
    	departmentOptions.put("ECE", "ECE");
    	departmentOptions.put("IT", "IT");
    }
	public String getDept() {
		return dept;
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

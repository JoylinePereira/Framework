package com.xworkz.hackathon.controller;

import com.xworkz.hackathon.dto.ExcelDTO;

public class ExcelController {

	public ExcelController() {
		// TODO Auto-generated constructor stub
		System.out.println("Created \t"+this.getClass().getSimpleName());
	}
	
	public  void onsave(ExcelDTO dto){
		System.out.println("invoked onsave of controller");
	}
	
}

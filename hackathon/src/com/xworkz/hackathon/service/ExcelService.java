package com.xworkz.hackathon.service;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Service;

import com.xworkz.hackathon.dto.ExcelDTO;
@Service
public class ExcelService {

	public ExcelService() {
		// TODO Auto-generated constructor stub
		System.out.println("Created \t"+this.getClass().getSimpleName());
	}
	
	List<ExcelDTO> list=new ArrayList<ExcelDTO>();
	
	public List<ExcelDTO> service(String location){
		System.out.println("service method invoked");
		try {
			System.out.println("starting service method");
			FileInputStream fio=new FileInputStream(location);
			Workbook workbook =new Workbook("resources/hackathon");
			System.out.println("the workbook has\t" + workbook.getNumberOfSheets() + "\tsheets:");
			
			Sheet sheet= workbook.getSheetAt(0);
			Row row;
			
			for(int i=1;i<=(sheet.getLastRowNum();i++) {
				
				row= sheet.getRow(i);
				
				String name;
				if(row.getCell(1)==null) {
					name=null;
				}
				else
				{
					name=row.getCell(1).toString();
				}
				
				String won;
				if(row.getCell(2)==null) {
					won= null;
				}
				else
				{
					won=row.getCell(2).toString();
				}
				
				String lost;
				if(row.getCell(3)==null) {
					lost=null;
				}
				else
				{
					lost=row.getCell(3).toString();
				}
				
				String state;
				if(row.getCell(4)==null) {
					state=null;
				}
				else
				{
					state=row.getCell(4).toString();
				}
				
				ExcelDTO dto=new ExcelDTO();
				dto.setPartyName(name);
				dto.setWon(Integer.parseInt(won));
				dto.setLost(Integer.parseInt(lost));
				dto.setState(state);
				
				
				list.add(dto);
			}
			
			return list;

		} 
		
		catch (Exception e) {
			// TODO: handle exception
			System.err.println("exception created :\t");
			e.printStackTrace();
		}

		return null;
	}

}

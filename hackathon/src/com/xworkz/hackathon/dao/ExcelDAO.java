package com.xworkz.hackathon.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.hackathon.dto.ExcelDTO;

public class ExcelDAO {

	private SessionFactory factory;
	
	public ExcelDAO() {
		// TODO Auto-generated constructor stub
		System.out.println("Created \t"+this.getClass().getSimpleName());
	}
	
	
	public void save(ExcelDTO dto) {
		System.out.println("invoked save method");
		//SessionFactory factory=null;
		Session session = null;
		Transaction tx = null;
		try {
			session = factory.openSession();
			tx =session.beginTransaction();
			System.out.println("saving the data:\t"+dto);
			session.save(dto);
			tx.commit();
			System.out.println("data was saved successfully");

		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("exception created :\t");
			e.printStackTrace();
		}

		finally {

			session.close();
		}
		
	}
	
}

package com.masai.entities;

import javax.persistence.EntityManager;

import com.masai.utility.EMUtil;

public class Demo {
	
	public static void main(String[] args) {
		
		EntityManager em= EMUtil.provideEntityManager();
		
		SalariedEmployee salemp= new SalariedEmployee();
		salemp.setEmail("washim@gmail.com");
		salemp.setEmpName("Washim");
		salemp.setSalary(1200);
		
		SalariedEmployee salemp2= new SalariedEmployee();
		salemp.setEmail("raza@gmail.com");
		salemp.setEmpName("raza");
		salemp.setSalary(1000);
		
		SalariedEmployee salemp3= new SalariedEmployee();
		salemp.setEmail("riya@gmail.com");
		salemp.setEmpName("Riya");
		salemp.setSalary(1200);
		
		SalariedEmployee salemp4= new SalariedEmployee();
		salemp.setEmail("Amit@gmail.com");
		salemp.setEmpName("Amit");
		salemp.setSalary(1200);
		
		
		ConractualEmployee cemp= new ConractualEmployee();
		cemp.setCostofperday(110);
		cemp.setEmpName("washim");
		cemp.setMobileNumber("898976767");
		cemp.setNoOfWorkingDays(2);
		
		ConractualEmployee cemp2= new ConractualEmployee();
		cemp.setCostofperday(110);
		cemp.setEmpName("amit");
		cemp.setMobileNumber("89346767");
		cemp.setNoOfWorkingDays(1);
		
		ConractualEmployee cemp3= new ConractualEmployee();
		cemp.setCostofperday(110);
		cemp.setEmpName("ravi");
		cemp.setMobileNumber("458976767");
		cemp.setNoOfWorkingDays(3);
		
		ConractualEmployee cemp4= new ConractualEmployee();
		cemp.setCostofperday(110);
		cemp.setEmpName("kisan");
		cemp.setMobileNumber("4545976767");
		cemp.setNoOfWorkingDays(2);
		
		
		
		em.getTransaction().begin();
		em.persist(salemp);
		em.persist(salemp2);
		em.persist(salemp3);
		em.persist(salemp4);
		em.persist(cemp);
		em.persist(cemp2);
		em.persist(cemp3);
		em.persist(cemp4);
		em.getTransaction().commit();
		
		
		em.close();
		System.out.println("Done....");
		
		
		
		
		
	}

}

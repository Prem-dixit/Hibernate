package com.keshav.main;


import org.hibernate.SessionFactory;

//import java.nio.file.attribute.UserDefinedFileAttributeView;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.prem.entity.Employee;





public class EmployeeRunner {

	public static void main(String[] args)  {
		Employee emp =new Employee("ram ","male",44333);
		 
	 Configuration cfg =new Configuration().configure("hibernate.cfg.xml");       //configure ye nokar hai jo  configure file se info uthaega
		 
		 SessionFactory sessionFactory=cfg.buildSessionFactory();
		 Session session=sessionFactory.openSession();
		 Transaction tx = session.beginTransaction();
		 
		 
		// session.persist(emp);
	
		 
		 
		 ///// delete query fire
		 emp=session.get(Employee.class, 3);
		 session.remove(emp);
		 
		 //// update query fire
		 
//		 emp=session.get(Employee.class, 3);
//		 emp.setName("nitin");
//		 emp.setSalary(90000);
		 
		 
		 
		 ////select query fire
		 
//		 emp=session.get(Employee.class ,5);
//		 System.out.println(emp);
         tx.commit();
	}

}
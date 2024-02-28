package com.tybsc.hibernate4_OneToMany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory = new Configuration().configure("hibernate5.cfg.xml").buildSessionFactory();
    	Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
    	
    	Certificate cert1=new Certificate("C Lang");
    	Certificate cert2=new Certificate("CPP Lang");
    	Certificate cert3=new Certificate("Java Lang");
    	
    	ArrayList<Certificate> list1 = new ArrayList<Certificate>();
    	list1.add(cert1);
    	list1.add(cert2);
    	list1.add(cert3);
    	Employee emp1 = new Employee("AAA","BBB",5000,list1);
    	
    	Certificate cert4 = new Certificate("C Lang");
    	Certificate cert5 = new Certificate("PYTHON");
    	ArrayList<Certificate> list2 = new ArrayList<Certificate>();
    	list2.add(cert4);
    	list2.add(cert5);
    	Employee emp2 = new Employee("PPP","RRR",3000,list2);
    	
    	System.out.println("\n **** EMP1*** \n"+emp1);
    	System.out.println("\n **** EMP2*** \n"+emp2+"\n");
    	
    	session.save(cert1);
    	session.save(cert2);
    	session.save(cert3);
    	session.save(cert4);
    	session.save(cert5);
    	
    	session.save(emp1);
    	session.save(emp2);
    	tx.commit();
    	
    	session.close();
    	factory.close();
    	
    	
    	
    }
}

package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.tut.MavenProject2.Address;

public class CriteriaApi 
{

	public static void main(String[] args) 
	{
	
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		Criteria c =  s.createCriteria(Address.class);
		
	    List<Address> students = c.list();
	    
	    for(Address std : students)
	    {
	    	System.out.println(std);
	    }
		
	}
}

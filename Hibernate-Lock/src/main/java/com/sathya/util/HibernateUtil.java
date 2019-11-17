package com.sathya.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	private  static  SessionFactory  factory;
	public  static  SessionFactory  getSessionFactory()
	{
		if(factory==null) {
			StandardServiceRegistry  registry=
					 new StandardServiceRegistryBuilder().configure().build();

			MetadataSources  sources=new  MetadataSources(registry);

			Metadata  metadata = sources.getMetadataBuilder().build();
			factory=metadata.getSessionFactoryBuilder().build();
		}
		return  factory;
	
	}
	public  static  void  closeSessionFactory()
	{
		if(factory!=null) {
			factory.close();
		}
	}
	

}

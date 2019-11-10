package com.sathya.dao.impl;

public class ApplicationQueries {
	public  static  String  SELECT_QUERY="from  Employee  e   where  e.deptNumber=?1";
	public  static  String  DELETE_QUERY="delete  from  Employee  e  where  e.salary > :salary";

}

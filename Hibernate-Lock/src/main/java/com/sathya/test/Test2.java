package com.sathya.test;

import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sathya.entity.Student;
import com.sathya.util.HibernateUtil;

public class Test2 {

	public static void main(String[] args) {
		Session    session=HibernateUtil.getSessionFactory().openSession();
		Transaction   tx2 = session.beginTransaction();
		Student    student=session.get(Student.class, 101);
		String  str = JOptionPane.showInputDialog("Enter marks(tx2)");
		int  x=Integer.parseInt(str);
		student.setMarks(x);
		tx2.commit();
        session.close();
        HibernateUtil.closeSessionFactory();

	}

}

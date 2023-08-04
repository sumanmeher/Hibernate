package p1;

import org.hibernate.Session;

public class StudentApp {
	private static Session session;

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setName("Suman");
		s1.setRoll("1");
		
		HibernateManager hbm = new HibernateManager();
		hbm.saveObj(s1);
	}

}

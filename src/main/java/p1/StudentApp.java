package p1;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentApp {
	private static Session session;

	public static void main(String[] args) {
//		Student s1=new Student();
//		s1.setName("Suman");
//		s1.setRoll("1");
		
		HibernateManager hbm = new HibernateManager();
//		hbm.saveObj(s1);
//		hbm.readAll();
		//hbm.readSpecific("1");
		session = HibernateManager.session;
//		Transaction transaction=session.beginTransaction();
//		Query query = session.createQuery("from Student where name=:name");
//		query.setParameter("name", "Suman");
//		List list = query.list();
//		
//		Iterator itr = list.iterator();
//		
//		while(itr.hasNext()==true) {
//			Student s = (Student) itr.next();
//			System.out.println("ID: "+s.getRoll());
//			System.out.println("Name: "+s.getName());
//			
//		}
		Transaction transaction=session.beginTransaction();
		Student s = (Student) session.get(Student.class, "1");
		s.setName("Ashi");
		session.update(s);
		System.out.println("Update Success");
		transaction.commit();
		
	}

}

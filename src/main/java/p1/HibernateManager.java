package p1;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateManager {
	private Session session;

	public HibernateManager() {
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml"); // connects to cfg
		ServiceRegistryBuilder builder = new ServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.buildServiceRegistry());

		session = sessionFactory.openSession();
		System.out.println("Connected to pf...");
	}

	public void saveObj(Student s1) {
		Transaction tran = session.beginTransaction();
		session.save(s1);
		tran.commit();
		System.out.println("Object saved");
	}

	public void readAll() {
		Transaction tran = session.beginTransaction();
		Query q = session.createQuery("From Student");
		List li = q.list();
		Iterator itr = li.iterator();
		while (itr.hasNext()) {
			Student s = (Student) itr.next();
			System.out.println("Name: " + s.getName() + "\nRoll: " + s.getRoll());
		}
		tran.commit();

	}
	public void readSpecific(String name) {
		Transaction tran = session.beginTransaction();
		Student s = (Student) session.get(Student.class, name);
		System.out.println("Name: " + s.getName() + "\nRoll: " + s.getRoll());
	}
}

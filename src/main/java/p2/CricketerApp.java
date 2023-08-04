package p2;

import org.hibernate.Session;


public class CricketerApp {
	private static Session session;

	public static void main(String[] args) {
		Cricketer c1=new Cricketer();
		c1.setName("Dhoni");
		c1.setCid("1");
		c1.setAge("41");
		c1.setCountry("India");
		
		HibernateManager hbm = new HibernateManager();
		hbm.saveObj(c1);
	}

}

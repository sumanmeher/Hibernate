package p4;

public class BookApp {
	public static void main(String[] args) {
		
		Publisher p = new Publisher();
		p.setPname("Penguin");
		Book b1=new Book();
		b1.setBname("I too had a Love Story");
		b1.setPub(p);
		
		Book b2=new Book();
		b2.setBname("You are the password to my Life");
		b2.setPub(p);
		
		HibernateManager hbm=new HibernateManager();
		hbm.insert(b1);
		hbm.insert(b2);
	}

}

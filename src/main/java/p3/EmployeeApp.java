package p3;

public class EmployeeApp {
	public static void main(String[] args) {
		
		Employee emp= new Employee();
		emp.setEmpname("Neeraj");
		
		Address addr = new Address();
		addr.setAddline("9th main cross");
		addr.setCity("Mumbai");
		addr.setState("Maharashtra");
		addr.setCountry("India");
		
		emp.setAddr(addr);
		HibernateManager hbm=new HibernateManager();
		hbm.insert(emp);
		
		
	}

}

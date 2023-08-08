package p5;

import java.util.HashSet;
import java.util.Set;

public class StudentApp {
	public static void main(String[] args) {
		Course c1=new Course();
		c1.setCname("Java");
		
		Course c2=new Course();
		c2.setCname("C++");
		
		Course c3=new Course();
		c3.setCname("Web");
		
		Set<Course> set = new HashSet<Course>();
		set.add(c1);
		set.add(c2);
		set.add(c3);
		
		Student1 s1= new Student1();
		s1.setSname("Suman");
		s1.setCou(set);
		
		Student1 s2= new Student1();
		s2.setSname("Ashi");
		s2.setCou(set);
		
		Student1 s3= new Student1();
		s3.setSname("Reeshu");
		s3.setCou(set);
		
		HibernateManager hbm = new HibernateManager();
		hbm.insert(s1);
		hbm.insert(s2);
		hbm.insert(s3);
		
	}
}

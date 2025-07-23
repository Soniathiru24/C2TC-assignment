package entityclassassignment1;

public class studentDemo {
	public static void main (String[]args) {
		student c1 =new student();
		c1.setStudentId(12);
		c1.setStudentName("soni");
		c1.setStudentCity("chennai");
	    System.out.println(c1);
	    
	    student s1 =new student();
		s1.setStudentId(13);
		s1.setStudentName("sumi");
		s1.setStudentCity("pondy");
	    System.out.println(s1);
	    
	    student d1 =new student();
		d1.setStudentId(13);
		d1.setStudentName("sumi");
		d1.setStudentCity("kerala");
	    System.out.println(d1);
	    
	}

}

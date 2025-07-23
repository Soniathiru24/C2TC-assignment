package entityclassassignment1;
import java.util.Scanner;
public class productDemo {
	public static void main(String[]agrs) {
		
		String name;
		int id;
		int price;
		product p1 =new product();
		p1.setProductId(12);
		p1.setProductName("classmate");
		p1.setProductPrice(1000);
	    System.out.println(p1);
	    
	    product p2 =new product();
		p2.setProductId(13);
		p2.setProductName("camlin");
		p2.setProductPrice(2000);
	    System.out.println(p2);
	    
	    product p3 =new product();
		p3.setProductId(14);
		p3.setProductName("doms");
		p3.setProductPrice(3000);
	    System.out.println(p3);
		
	    product p4 =new product();
		p4.setProductId(15);
		p4.setProductName("flair");
		p4.setProductPrice(5000);
	    System.out.println(p4);
		
//		product p1=new product(id,name,price);
//	    System.out.println(p1);
//	    sc.close();
	}

}

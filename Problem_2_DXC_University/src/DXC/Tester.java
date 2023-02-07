package DXC;

public class Tester {

	public static void main(String[] args) {
		CourseRegistration c=new CourseRegistration("Peter",5001,58,1005,true);
		c.calculateFee();
		CourseRegistration c1=new CourseRegistration("Peter",5001,68,1006,true);
		c1.calculateFee();
		CourseRegistration c2=new CourseRegistration("Peter",5001,78,1005,false);
		c2.calculateFee();
		

	}

}

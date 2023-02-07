package DXC;

public class Tester {

	public static void main(String[] args)
	{
		 RegularCourseCertification r= new RegularCourseCertification("Rakesh", "J2EE", 85, 5);
		    System.out.println("Student Name: " + r.getStudentName());
		    System.out.println("Course Name: " + r.getCourseName());
		    System.out.println("Registration Id: " + r.getRegistrationId());
		    System.out.println("Admission Test Marks: " + r.getAdmissionTestMarks());
		    System.out.println("Course Duration: " + r.getCourseDuration() + " months");
		    System.out.println("Total Fee: " + r.calculateFee());
		    
		    RegularCourseCertification r1= new RegularCourseCertification("Roshan", "Angular", 71,0);
		    System.out.println("Student Name: " + r1.getStudentName());
		    System.out.println("Course Name: " + r1.getCourseName());
		    System.out.println("Registration Id: " + r1.getRegistrationId());
		    System.out.println("Admission Test Marks: " + r1.getAdmissionTestMarks());
		    System.out.println("Course Duration: " + r1.getCourseDuration() + " months");
		    System.out.println("Total Fee: " + r.calculateFee());

	}

}

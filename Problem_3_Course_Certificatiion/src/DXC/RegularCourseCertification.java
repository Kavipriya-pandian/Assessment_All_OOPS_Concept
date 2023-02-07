package DXC;

public class RegularCourseCertification extends RRTechnicalCertification implements Certification
{
	private int courseDuration;
	public RegularCourseCertification(String studentName, String courseName, int admissionTestMarks,int courseDuration) {
		super(studentName, courseName, admissionTestMarks);
		this.courseDuration=courseDuration;
	}
	public int getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}
	public  double calculateFee() 
	{
	    double fee = courseDuration * regularCourseFee;
	    if (admissionTestMarks >= 90)
	    {
	      fee = (int) (fee * 0.9);
	    } else if (admissionTestMarks >= 75)
	    {
	      fee = (int) (fee * 0.95);
	    }
	    return fee;
	}
	
	

}

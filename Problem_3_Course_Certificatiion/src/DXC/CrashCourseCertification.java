package DXC;

public abstract class CrashCourseCertification extends RRTechnicalCertification implements Certification
{

	public CrashCourseCertification(String studentName, String courseName, int admissionTestMarks) {
		super(studentName, courseName, admissionTestMarks);
		// TODO Auto-generated constructor stub
	}
	public void generateRegistrationId()
	{
		registrationId = counter + 1;
	    counter += 2;
		
	}
	public double calculateFee() {
		  double serviceTax = 12.36;

	    double fee = crashCourseFee;
	    if (admissionTestMarks >= 90) {
	      fee = (int) (fee * 0.9);
	    } else if (admissionTestMarks >= 75) {
	      fee = (int) (fee * 0.95);
	    }
	    fee = (int) (fee * (1 + serviceTax / 100));
	    return fee;
	}
	

}

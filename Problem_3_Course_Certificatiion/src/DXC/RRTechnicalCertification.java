package DXC;

public class RRTechnicalCertification implements Certification
{
	private String studentName;
	private String courseName;
	protected int registrationId;
	protected int admissionTestMarks;
	static int counter;
	public RRTechnicalCertification(String studentName, String courseName, int admissionTestMarks) {
		super();
		this.studentName = studentName;
		this.courseName = courseName;
		this.admissionTestMarks = admissionTestMarks;
		this.counter=1001;
	
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}
	public int getAdmissionTestMarks() {
		return admissionTestMarks;
	}
	public void setAdmissionTestMarks(int admissionTestMarks) {
		this.admissionTestMarks = admissionTestMarks;
	}
	void generateResgistrationId()
	{
		registrationId = counter;
	    counter += 2;
	}
	public double calculateFee() {
		 {
		    return 0;
		  }
	}

}

package HMS;

public class Patient extends User {
	protected String PatientId;
	protected String PatientAge;
	protected char PatientSex;
	public Patient(String userName, String userAddress, String userPhoneNum, String userPassword, String userAccessType,
			String patientId, String patientAge, char patientSex) {
		super(userName, userAddress, userPhoneNum, userPassword, userAccessType);
		PatientId = patientId;
		PatientAge = patientAge;
		PatientSex = patientSex;
	}
	public String getPatientId() {
		return PatientId;
	}
	public void setPatientId(String patientId) {
		PatientId = patientId;
	}
	public String getPatientAge() {
		return PatientAge;
	}
	public void setPatientAge(String patientAge) {
		PatientAge = patientAge;
	}
	public char getPatientSex() {
		return PatientSex;
	}
	public void setPatientSex(char patientSex) {
		PatientSex = patientSex;
	}
	
}

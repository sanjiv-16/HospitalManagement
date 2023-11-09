package HMS;

import java.util.Objects;

public class Doctor extends User {
	protected String DoctorSpeciality;
	protected String DoctorQualifictaion;
	protected int DoctorSalary;
	
	public Doctor(String userName, String userAddress, String userPhoneNum, String userPassword, String userAccessType,
			String doctorSpeciality, String doctorQualifictaion, int doctorSalary) {
		super(userName, userAddress, userPhoneNum, userPassword, userAccessType);
		DoctorSpeciality = doctorSpeciality;
		DoctorQualifictaion = doctorQualifictaion;
		DoctorSalary = doctorSalary;
	}
	public String getDoctorSpeciality() {
		return DoctorSpeciality;
	}
	public void setDoctorSpeciality(String doctorSpeciality) {
		DoctorSpeciality = doctorSpeciality;
	}
	public String getDoctorQualifictaion() {
		return DoctorQualifictaion;
	}
	public void setDoctorQualifictaion(String doctorQualifictaion) {
		DoctorQualifictaion = doctorQualifictaion;
	}
	public int getDoctorSalary() {
		return DoctorSalary;
	}
	public void setDoctorSalary(int doctorSalary) {
		DoctorSalary = doctorSalary;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(DoctorQualifictaion, DoctorSalary, DoctorSpeciality);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	
	
}

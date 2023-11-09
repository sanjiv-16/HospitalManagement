package HMS;

public class Main {
	public static void main(String[] args) {
		System.out.println("--------------ABC Hosplital Management--------------");
		boolean WelcomePageFlag=true;
		while(WelcomePageFlag) {
			System.out.println("1. Admin Login");
			System.out.println("2. Doctor Login");
			System.out.println("3. Patient Login");
			System.out.println("4. Exit");
			System.out.print("Enter your choice : ");
			int choice=Resources.input.nextInt();
			switch(choice) {
			case 1:
			{
				String adminName;
				String adminPassword;
				System.out.print("Enter admin name : ");
				adminName=Resources.input.next();
				System.out.println();
				System.out.print("Enter admin password : ");
				adminPassword=Resources.input.next();
				if(AdminPage.adminAuthentication(adminName,adminPassword)){
					AdminPage.adminPageHandler();
				}
				break;
			}
			case 2:{
				String doctorName;
				String doctorPassword;
				System.out.print("Enter Doctor name : ");
				doctorName=Resources.input.next();
				System.out.println();
				System.out.print("Enter Docter password : ");
				doctorPassword=Resources.input.next();
				for(Doctor doctor:HealthCare.doctorList) {
					if(doctor.getUserName().equals(doctorName)&&doctor.getUserPassword().equals(doctorPassword)) {
						DoctorPage.doctorPageHandler();
					}
				}
				
				
				break;
			}
			case 3:{
				String patientName;
				String patientPassword;
				System.out.print("Enter Patient name : ");
				patientName=Resources.input.next();
				System.out.println();
				System.out.print("Enter Patient password : ");
				patientPassword=Resources.input.next();
				for(Patient patient:HealthCare.patientList) {
					if(patient.getUserName().equals(patientName)&&patient.getUserPassword().equals(patientPassword)) {
						PatientPage.patientPageHandler(patient);
					}
					else{
						//Patient TemppPatient=PatientPage.createPatient();
						PatientPage.patientPageHandler(patient);
					}
				}
				break;
			}
			
			}
			
		}
	}

}

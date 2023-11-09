package HMS;

public class AdminPage {
	public static boolean adminAuthentication(String name,String password) {
		if(name.equals("admin")&&password.equals("12345"))
			return true;
		return false;
	}
	public static boolean adminPageHandler() {
		return false;
	}

}

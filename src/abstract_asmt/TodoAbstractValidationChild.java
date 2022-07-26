package abstract_asmt;

public class TodoAbstractValidationChild extends TodoAbstractValidation {

	@Override
	public String passwordValidation(String password) {
		String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
		if((password.trim().length()>=8)&&(!password.isEmpty())&&(password.matches(pattern))) {
			System.out.println("password is valid");
			return password;
		}
		else {
			System.out.println("Invalid Password");
			System.exit(1);
			
		}
		
		return "plz enter valid password";
	}
	

}

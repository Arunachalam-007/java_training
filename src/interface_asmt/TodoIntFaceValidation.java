package interface_asmt;

public class TodoIntFaceValidation {
	//Name Validation
			public String nameValidation(String name) {
			
				String expression = "^[a-zA-Z\\s]+";
				if((name.trim().length()>3)&&(!name.isEmpty())&&(name.matches(expression))) {
					System.out.println("Name is valid");
					return name;
				}
				else {
					System.out.println("Invalid name");
					System.exit(1);	
					
				}
				return "plz enter valid name" ;
					
			}
				
			//Username validation
			public String userNameValidation(String userName) {
				if((userName.trim().length()>5)&&(!userName.isEmpty())) {
					System.out.println("User Name is valid");
					return userName;
				}
				else {
					System.out.println("Invalid user name");
					System.exit(1);	
					
				}
			return "plz enter valid user name";
		}
			
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

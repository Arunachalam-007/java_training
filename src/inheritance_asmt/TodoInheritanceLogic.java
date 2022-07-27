package inheritance_asmt;

import java.util.Scanner;

import abstract_asmt.TodoAbstract;
import abstract_asmt.TodoAbstractValidationChild;

public class TodoInheritanceLogic {
	Scanner in=new Scanner(System.in);
	TodoAbstract ta=new TodoAbstract();
	TodoAbstractValidationChild tav=new TodoAbstractValidationChild();
	
	public void nameLogic(String name) {
		String validations=tav.nameValidation(name);
		ta.setName(validations);
		System.out.println(ta.getName());
		
	}
	public void userNameLogic(String userName) {
		String userValidations=tav.userNameValidation(userName);
		ta.setUserName(userValidations);
		System.out.println(ta.getUserName());
	}
	public void passwordLogic(String password) {
		String passwordValidations=tav.passwordValidation(password);
		ta.setPassword(passwordValidations);
	}
	
	

}

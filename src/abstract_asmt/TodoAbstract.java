package abstract_asmt;

import java.util.Scanner;

import overloading_asmt.Todo;
import overloading_asmt.TodoValidation;

public class TodoAbstract {
private String name;
	
	private String userName;
	private String password;
	
	//Encapsulation setters and getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Todo [firstName=" + name + ", userName=" + userName + ", password="
				+ password + "]";
	}
	
	
	
	 

	
	

}

package testProject;

import java.util.ArrayList;
import java.util.List;

public class User {
	static String name ;
	

	List <Question> questions;
	static String result;
	
	public User(String name, String result) {
		super();
		this.name = name;
		this.result=result;
		this.questions=new ArrayList<>();
		
		
		
	}
	@Override
	public String toString() {
		return "User NAME=" + name ;
	}
}

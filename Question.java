package testProject;

public class Question {

	String questionText;
    String option1;
    String option2;
    String option3;
    String option4;
    int correctChoice;
	public Question(String questionText, String option1, String option2, String option3, String option4,
			int correctChoice) {
		super();
		this.questionText = questionText;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.correctChoice = correctChoice;
	}
	@Override
	public String toString() {
		return "\n"+"Question =" +questionText + "\n"+"option1=" + option1 + "\n"+"option2=" + option2 + "\n"+"option3="
				+ option3 + "\n"+"option4=" + option4 ;
	}
	
	
    
    
    
	
    
    
    
}

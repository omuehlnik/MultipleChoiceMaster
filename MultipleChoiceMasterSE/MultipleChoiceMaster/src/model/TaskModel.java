package model;

public class TaskModel {
	
	public enum CorrectAnswer {ANSWER_A,ANSWER_B,ANSWER_C,ANSWER_D};
	
	private String question;
	private String answerA;
	private String answerB;
	private String answerC;
	private String answerD;
	private CorrectAnswer correctAnswer;
	
	    public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswerA() {
		return answerA;
	}
	public void setAnswerA(String answerA) {
		this.answerA = answerA;
	}
	public String getAnswerB() {
		return answerB;
	}
	public void setAnswerB(String answerB) {
		this.answerB = answerB;
	}
	public String getAnswerC() {
		return answerC;
	}
	public void setAnswerC(String answerC) {
		this.answerC = answerC;
	}
	public String getAnswerD() {
		return answerD;
	}
	public void setAnswerD(String answerD) {
		this.answerD = answerD;
	}
	public CorrectAnswer getCorrectAnswer() {
		return correctAnswer;
	}
	public void setCorrectAnswer(CorrectAnswer correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
}

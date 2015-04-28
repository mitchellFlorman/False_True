package com.falsetrue.titecs.activities.db;

public class Question {
	
	private int id;
	private String text;
	private String answer;
	private String explanation;
	private String used;

	public Question(int id, String text, String answer, String explanation, String used) {
		this.id = id;
		this.text = text;
		this.answer = answer;
		this.explanation = explanation;
		this.used = used;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public String getUsed() {
		return used;
	}

	public void setUsed(String used) {
		this.used = used;
	}
	
	

}

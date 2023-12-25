package com.email.dto;

public class EmailDTO {
	
	private String subject;
	private String to;
	private String text;
	
	public EmailDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EmailDTO(String subject, String to, String text) {
		super();
		this.subject = subject;
		this.to = to;
		this.text = text;
	}

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "EmailDTO [subject=" + subject + ", to=" + to + ", text=" + text + "]";
	}

}

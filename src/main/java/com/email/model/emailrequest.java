package com.email.model;

public class emailrequest {
	private String to;
	private String subject;
	private String messege;
	
	
	public emailrequest(String to, String subject, String messege) {
		super();
		this.to = to;
		this.subject = subject;
		this.messege = messege;
	}


	public emailrequest() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getTo() {
		return to;
	}


	public void setTo(String to) {
		this.to = to;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getMessege() {
		return messege;
	}


	public void setMessege(String messege) {
		this.messege = messege;
	}


	@Override
	public String toString() {
		return "emailrequest [to=" + to + ", subject=" + subject + ", messege=" + messege + "]";
	}
	
	
	

}

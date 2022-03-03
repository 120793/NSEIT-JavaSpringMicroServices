package com.example.notes.notesapp;

public class Notes {
     int pid;
     String title;
     String auther;
     String desciption;
	public Notes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Notes(int pid, String title, String auther, String desciption) {
		super();
		this.pid = pid;
		this.title = title;
		this.auther = auther;
		this.desciption = desciption;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	public String getDesciption() {
		return desciption;
	}
	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}
     
}

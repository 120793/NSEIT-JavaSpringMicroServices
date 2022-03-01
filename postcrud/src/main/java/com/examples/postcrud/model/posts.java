package com.examples.postcrud.model;

public class posts {
int pid;
String author;
String title;
String discription;

public posts() {
	
}
public posts(int pid,String author, String title, String discription) {
	super();
	this.pid = pid;
	this.author=author;
	this.title = title;
	this.discription = discription;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDiscription() {
	return discription;
}
public void setDiscription(String discription) {
	this.discription = discription;
}


}

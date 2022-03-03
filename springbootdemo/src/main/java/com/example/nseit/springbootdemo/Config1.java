package com.example.nseit.springbootdemo;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("config2")
public class Config1 {
	String databaseDriver;
	String databaseName;
	
	public Config1() {
	}
	public Config1(String databaseDriver, String databaseName) {
	super();
	this.databaseDriver = databaseDriver;
	this.databaseName = databaseName;
	}


	 public String getDatabaseDriver() {
	return databaseDriver;
	}
	public void setDatabaseDriver(String databaseDriver) {
	this.databaseDriver = databaseDriver;
	}
	public String getDatabaseName() {
	return databaseName;
	}
	public void setDatabaseName(String databaseName) {
	this.databaseName = databaseName;
	}
}

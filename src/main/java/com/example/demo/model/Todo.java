package com.example.demo.model;

import java.sql.Date;

public class Todo {

	
	    private int id;
	    private String user;
	    private String desc;
	    private boolean isDone;
	    
		public Todo(int i, String string, String string2,boolean b) {
			// TODO Auto-generated constructor stub
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getUser() {
			return user;
		}
		public void setUser(String user) {
			this.user = user;
		}
		public String getDesc() {
			return desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		
		public boolean isDone() {
			return isDone;
		}
		public void setDone(boolean isDone) {
			this.isDone = isDone;
		}

		
	} 


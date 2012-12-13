package com.allenlsy.action;

public class TutorialAction
{
	public String execute() {
		System.out.println("Hello from execute");
		return "success"; // this is a result string. Check struts.xml
	}
}

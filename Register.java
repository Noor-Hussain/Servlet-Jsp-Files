package com.log.comp;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Register extends HttpServlet{
	
	protected void service(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException 
	{
		System.out.println("i am in register service method");
	}


}

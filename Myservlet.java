package com.mybackendservlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Myservlet extends HttpServlet {
	@Override
 protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException
 {
		PrintWriter out = resp.getWriter();
		out.print("i am in do get method for browser");
	System.out.println("i am in do get doGet() method");
	
 }

}

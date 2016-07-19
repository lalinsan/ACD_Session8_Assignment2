/*
* Student: Eduardo Aguirre
* Session 8
* Assignment 2
* Servlet that is called by the Index jsp and executes the do get Method. 
*/

package com.acadgild.controller;

//Imports Java classses
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();// Allocate a output writer to write the response message into the network socket
		out.println("Example of a Do Get"); //Prints Out Message
		out.println("Called Servlet"); //Prints Out Message
	}

}

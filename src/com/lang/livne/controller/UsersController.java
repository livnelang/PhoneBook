package com.lang.livne.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.livne.lang.model.Contact;

/**
 * Servlet implementation class controller
 */
@WebServlet(description = "Controls Incoming requests from our web page", urlPatterns = { "/controller/*" })
public class UsersController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<Integer, Contact> contacts;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsersController() {
        super();
        contacts = new HashMap<Integer, Contact>();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Getting the path
		String path = request.getPathInfo();
		// setting a dispatcher
		RequestDispatcher dispatcher = null;
		
		if(path.endsWith("add")) {
			HttpSession session = request.getSession();
			if (session.getAttribute("has_phone_book") == null) {
				session.setAttribute("has_phone_book",true);
				session.setAttribute("phonebook", contacts);
			}
			// getting parameters from web
			String name = request.getParameter("f_name");
			int id = Integer.parseInt(request.getParameter("id"));
			int phone = Integer.parseInt(request.getParameter("phone"));
			if( ! contacts.containsKey(id)) {
			Contact c1 = new Contact(name, id, phone);
			contacts.put(id, c1);
			}
		}
		
		
		else if(path.endsWith("show_contact_list")) {
				HttpSession session = request.getSession();
				dispatcher = getServletContext().getRequestDispatcher("/show_list.jsp");
				dispatcher.forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

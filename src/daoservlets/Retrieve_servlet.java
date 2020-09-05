package daoservlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.BOOK;



public class Retrieve_servlet extends HttpServlet{
     @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	BookDAO b=new BookDAO();
    	List<BOOK> data=b.getallbooks();
    	req.setAttribute("Book", data);
    	req.getRequestDispatcher("book_retrieve.jsp").forward(req,res);
    }
}

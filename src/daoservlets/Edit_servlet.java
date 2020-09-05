package daoservlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.BOOK;


public class Edit_servlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String bid=req.getParameter("bkid");
		BookDAO bdao=new BookDAO();
		BOOK book=bdao.getBookbyid(bid);
	    System.out.println(book.getBkauthor());
		req.setAttribute("Book",book);
		req.getRequestDispatcher("book_edit.jsp").forward(req, res);
	}
}

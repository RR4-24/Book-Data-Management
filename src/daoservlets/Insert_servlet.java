package daoservlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.BOOK;

public class Insert_servlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		BOOK book=new BOOK();
		book.setBkid(req.getParameter("bkid"));
		book.setBkname(req.getParameter("bkname"));
		book.setBksubject(req.getParameter("bksubject"));
		book.setBkauthor(req.getParameter("bkauthor"));
		book.setBkref(req.getParameter("bkref"));
		book.setBkprice(Integer.parseInt(req.getParameter("bkprice")));
		book.setBkqoh(Integer.parseInt(req.getParameter("bkqoh")));
		BookDAO bookdao=new BookDAO();
		try {
			bookdao.addBook(book);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		res.sendRedirect("");
	}
}

package daoservlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Delete_servlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		BookDAO book=new BookDAO();
		book.deleteBook(req.getParameter("bkid"));
		req.getRequestDispatcher("/").forward(req,res);
}
}

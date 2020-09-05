package daoservlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import models.BOOK;


public class BookDAO {
	//JDBC to retrieve all books
	 public List<BOOK> getallbooks(){
		 List <BOOK> data=null;
		 try {
			 Class.forName("com.mysql.jdbc.Driver");
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Book", "root", "12345678");
			 Statement st=con.createStatement();
			 ResultSet rs=st.executeQuery("select * from book");
			 data=new ArrayList<BOOK>();

			 while(rs.next()) {				
	   				BOOK book = new BOOK();
	   				book.setBkid(rs.getString(1));
	   				book.setBkname(rs.getString(2));
	   				book.setBksubject(rs.getString(3));
	   				book.setBkauthor(rs.getString(4));
	   				book.setBkref(rs.getString(5));
	   				book.setBkprice(rs.getInt(6));
	   				book.setBkqoh(rs.getInt(7));
	   				data.add(book);
			 }
			 st.close();
			 con.close();	
		 }catch(Exception e){
			 e.printStackTrace();
		 }
		 return data;
	 }
	 //JDBC to retrieve book by book id
	 public BOOK getBookbyid(String bkid) {
			BOOK book=null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Book", "root", "12345678");
				PreparedStatement ps=con.prepareStatement("Select * from book where bkid=?");
				ps.setString(1, bkid);
				ResultSet rs=ps.executeQuery();
				rs.next();
				book=new BOOK();
				book.setBkid(rs.getString(1));
   				book.setBkname(rs.getString(2));
   				book.setBksubject(rs.getString(3));
   				book.setBkauthor(rs.getString(4));
   				book.setBkref(rs.getString(5));
   				book.setBkprice(rs.getInt(6));
   				book.setBkqoh(rs.getInt(7));
				ps.close();
				con.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return book;
		}
	 //JDBC to insert book
	 public void addBook(BOOK book) throws SQLException {
		 try {
			 Class.forName("com.mysql.jdbc.Driver");
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Book", "root", "12345678");
			 PreparedStatement ps = con.prepareStatement("Insert into book(bkid,bkname,bksubject,bkauthor,bkref,bkprice,bkqoh) values(?,?,?,?,?,?,?)");
				
			ps.setString(1, book.getBkid());
			ps.setString(2, book.getBkname());
			ps.setString(3, book.getBksubject());
			ps.setString(4, book.getBkauthor());
			ps.setString(5, book.getBkref());
			ps.setInt(6, book.getBkprice());
			ps.setInt(7, book.getBkqoh());
			ps.executeUpdate();
			ps.close();
			con.close();
		 } catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	 //JDBC to delete book
	 public void deleteBook(String bkid) {
			boolean result=false;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Book", "root", "12345678");
				PreparedStatement ps=con.prepareStatement("delete from book where bkid=?");
				ps.setString(1,bkid);
				int res=ps.executeUpdate();
				if(res>0) {
					result=true;
				}
				ps.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	 //JDBC to update book
	 public void updateBook(BOOK book) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Book", "root", "12345678");
				PreparedStatement ps=con.prepareStatement("update book set bkname=?,bksubject=?,bkauthor=?, bkref=?, bkprice=?, bkqoh=? where bkid=?");
				ps.setString(1, book.getBkname());
				ps.setString(2, book.getBksubject());
				ps.setString(3, book.getBkauthor());
				ps.setString(4, book.getBkref());
				ps.setInt(5,book.getBkprice());
				ps.setInt(6,book.getBkqoh());
				ps.setString(7,book.getBkid());
				int res=ps.executeUpdate();
				ps.close();
				con.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

}

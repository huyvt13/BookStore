/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DB.DBConnect;
import entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import entity.BookDtls;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class Dao {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public boolean userRegistr(User us) {
        boolean f = false;
        try {
            conn = new DBConnect().getConnection();
            String sql = "insert into [dbo].[user](name,email,phone,password) values(?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, us.getName());
            ps.setString(2, us.getEmail());
            ps.setString(3, us.getPhone());
            ps.setString(4, us.getPassword());
            int i = ps.executeUpdate();
            if (i == 1) {
                f = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return f;

    }

    public User login(String email, String password) {
        User us = null;
        try {
            conn = new DBConnect().getConnection();
            String sql = "select *from [dbo].[user]\n"
                    + "where email =? and password =?";

            ps = conn.prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {
                us = new User();
                us.setId(rs.getInt(1));
                us.setName(rs.getString(2));
                us.setEmail(rs.getString(3));
                us.setPhone(rs.getString(4));
                us.setPassword(rs.getString(5));
                us.setAddress(rs.getString(6));
                us.setLandmark(rs.getString(7));
                us.setCity(rs.getString(8));
                us.setState(rs.getString(9));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return us;
    }

    public boolean addBook(BookDtls b) {
        boolean f = false;
        try {
            conn = new DBConnect().getConnection();
            String sql = "INSERT INTO [dbo].[book_dtls]\n"
                    + "           ([bookname]\n"
                    + "           ,[author]\n"
                    + "           ,[price]\n"
                    + "           ,[bookCategory]\n"
                    + "           ,[status]\n"
                    + "           ,[photoName]\n"
                    + "           ,[email])\n"
                    + "     VALUES(?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, b.getBookName());
            ps.setString(2, b.getAuthor());
            ps.setString(3, b.getPrice());
            ps.setString(4, b.getBookCategory());
            ps.setString(5, b.getStatus());
            ps.setString(6, b.getPhotoName());
            ps.setString(7, b.getEmail());
            int i = ps.executeUpdate();
            if (i == 1) {
                f = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;

    }

    public List<BookDtls> getAllBooks() {
        List<BookDtls> list = new ArrayList<>();
        BookDtls b = null;
        try {
            conn = new DBConnect().getConnection();
            String sql = "select *from book_dtls";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                b = new BookDtls();
                b.setBookId(rs.getInt(1));
                b.setBookName(rs.getString(2));
                b.setAuthor(rs.getString(3));
                b.setPrice(rs.getString(4));
                b.setBookCategory(rs.getString(5));
                b.setStatus(rs.getString(6));
                b.setPhotoName(rs.getString(7));
                b.setEmail(rs.getString(8));
                list.add(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public BookDtls getBookById(int id) {
        BookDtls b = null;
        try {
            conn = new DBConnect().getConnection();
            String sql = "select *from book_dtls where bookId =?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                b = new BookDtls();
                b.setBookId(rs.getInt(1));
                b.setBookName(rs.getString(2));
                b.setAuthor(rs.getString(3));
                b.setPrice(rs.getString(4));
                b.setBookCategory(rs.getString(5));
                b.setStatus(rs.getString(6));
                b.setPhotoName(rs.getString(7));
                b.setEmail(rs.getString(8));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }

    public boolean updateBook(BookDtls b) {
        boolean f = false;
        try {
            conn = new DBConnect().getConnection();
            String sql = "update book_dtls set bookname=?,author=?,price=?,status=?\n"
                    + "where bookId=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, b.getBookName());
            ps.setString(2, b.getAuthor());
            ps.setString(3, b.getPrice());
            ps.setString(4, b.getStatus());
            ps.setInt(5, b.getBookId());
            int i = ps.executeUpdate();
            if (i == 1) {
                f = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    public boolean deleteBook(int id) {
        boolean f = false;
        try {
             conn = new DBConnect().getConnection();
            String sql = "DELETE FROM [dbo].[book_dtls]\n"
                    + "      WHERE bookId =?";
            ps=conn.prepareStatement(sql);
            ps.setInt(1, id);
          int i=ps.executeUpdate();
            if(i==1){
                f=true;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
    
    public List<BookDtls> getNewBook() {
        List<BookDtls> list =new ArrayList<>();
        BookDtls b=null;
        try {
            conn = new DBConnect().getConnection();
             String sql ="select *from book_dtls where bookCategory = ? and [status] =? order by bookId desc";
            PreparedStatement ps =conn.prepareStatement(sql);
            ps.setString(1, "New");
            ps.setString(2, "Active");
            ResultSet rs =ps.executeQuery();
            int i=1 ;
            while(rs.next() && i <=4) {
                b =new BookDtls();
                b.setBookId(rs.getInt(1));
                b.setBookName(rs.getString(2));
                b.setAuthor(rs.getString(3));
                b.setPrice(rs.getString(4));
                b.setBookCategory(rs.getString(5));
                b.setStatus(rs.getString(6));
                b.setPhotoName(rs.getString(7));
                b.setEmail(rs.getString(8));
                list.add(b);
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public List<BookDtls> getRecentBooks() {
      List<BookDtls> list =new ArrayList<>();
        BookDtls b=null;
        try {
            conn = new DBConnect().getConnection();
            String sql ="select *from book_dtls where [status] =? order by bookId desc";
            PreparedStatement ps =conn.prepareStatement(sql);
            ps.setString(1,"Active");
            ResultSet rs =ps.executeQuery();
            int i=1 ;
            while(rs.next() && i <=4) {
                b =new BookDtls();
                b.setBookId(rs.getInt(1));
                b.setBookName(rs.getString(2));
                b.setAuthor(rs.getString(3));
                b.setPrice(rs.getString(4));
                b.setBookCategory(rs.getString(5));
                b.setStatus(rs.getString(6));
                b.setPhotoName(rs.getString(7));
                b.setEmail(rs.getString(8));
                list.add(b);
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
   public List<BookDtls> getOldBooks () {
       List<BookDtls> list =new ArrayList<>();
        BookDtls b=null;
        try {
            conn = new DBConnect().getConnection();
             String sql ="select *from book_dtls where bookCategory = ? and [status] =? order by bookId desc";
            PreparedStatement ps =conn.prepareStatement(sql);
            ps.setString(1, "Old");
            ps.setString(2, "Active");
            ResultSet rs =ps.executeQuery();
            int i=1 ;
            while(rs.next() && i <=4) {
                b =new BookDtls();
                b.setBookId(rs.getInt(1));
                b.setBookName(rs.getString(2));
                b.setAuthor(rs.getString(3));
                b.setPrice(rs.getString(4));
                b.setBookCategory(rs.getString(5));
                b.setStatus(rs.getString(6));
                b.setPhotoName(rs.getString(7));
                b.setEmail(rs.getString(8));
                list.add(b);
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
   }
}

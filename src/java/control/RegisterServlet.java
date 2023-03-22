/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package control;

import DAO.Dao;
import entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import DB.DBConnect;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author DELL
 */
public class RegisterServlet extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegisterServlet</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegisterServlet at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        try {
            String name = request.getParameter("fname");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            String password= request.getParameter("password");
            String check= request.getParameter("check");
                   // System.out.println(name+" "+email+" "+phone+" "+password+" "+check);   
                  
                  User us =new User();
                  us.setName(name);
                  us.setEmail(email);
                  us.setPhone(phone);
                  us.setPassword(password);
                  HttpSession session=request.getSession();
                  if(check!=null){
                      Dao dao=new Dao();
                  boolean f=dao.userRegistr(us);
               if(f){
                  // System.out.println("User Register Sucess..");
                  session.setAttribute("succMsg", "Register Sucessfully");
                  response.sendRedirect("register.jsp");
               }else{
                  // System.out.println("Some thing wrong on server");
                  session.setAttribute("failedMsg", "Some thing wrong on server");
                  response.sendRedirect("register.jsp");
               }
                  }
                  else{
                     // System.out.println("Please check agree& Term Condition");
                      session.setAttribute("failedMsg", "Please check agree& Term Condition");
                  response.sendRedirect("register.jsp");
                  }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

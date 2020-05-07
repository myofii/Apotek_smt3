/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import DB.FacadeKasir;
import EntityClass.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author M. Yofi Indrawan
 */
public class tambahKeranjang extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            String pesan = null;
            
            int id_barang = Integer.parseInt(request.getParameter("id_barang"));
            int id_akun = Integer.parseInt(request.getParameter("id_akun"));
            int jumlah = Integer.parseInt(request.getParameter("jumlah_barang"));
            
            FacadeKasir fc = new FacadeKasir();
            Barang barang = fc.getBarang(id_barang);
            Keranjang keranjang = new Keranjang(id_barang, jumlah, id_akun);
            if(fc.insertKeranjang(keranjang)){
                pesan = "Barang "+barang.getNama_barang()+" berhasil ditambahkan !!";
            } else {
                pesan = "Barang "+barang.getNama_barang()+" gagal ditambahkan !!";
            }
            HttpSession session = request.getSession();
            session.setAttribute("pesan",pesan);
            response.sendRedirect("/PWEB1/web/kasir.jsp");
        } finally{
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
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
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

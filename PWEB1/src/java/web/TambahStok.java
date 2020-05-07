/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import DB.FacadeGudang;
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
public class TambahStok extends HttpServlet {

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
            
            int id_akun = Integer.parseInt(request.getParameter("id_akun"));
            int id = Integer.parseInt(request.getParameter("id_barang"));
            String nama_barang = request.getParameter("nama_barang");
            int jumlah = Integer.parseInt(request.getParameter("jumlah"));
            int harga = Integer.parseInt(request.getParameter("harga"));
            int total = harga*jumlah;
            
            Barang barang = new Barang();
            barang.setId_barang(id);
            barang.setStok(jumlah);
            
            Beli beli = new Beli();
            beli.setId_barang(id);
            beli.setJumlah(jumlah);
            beli.setTotal_harga(total);
            beli.setId_akun(id_akun);
            
            FacadeGudang fc = new FacadeGudang();
            if(fc.tambahStokBarang(barang) && fc.insertBeli(beli)){
                pesan = "Stok "+nama_barang+" berhasil ditambahkan "+jumlah+" !!";
            } else {
                pesan = "Stok "+nama_barang+" gagal ditambahkan!!";
            }
            HttpSession session = request.getSession();
            session.setAttribute("pesan",pesan);
            response.sendRedirect("/PWEB1/web/gudang.jsp");
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

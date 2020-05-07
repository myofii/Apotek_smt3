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
public class selesaiTransaksi extends HttpServlet {

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
            int id = Integer.parseInt(request.getParameter("id_akun"));
            int total = Integer.parseInt(request.getParameter("total_biaya"));
            
            FacadeKasir fc = new FacadeKasir();
            Keranjang[] keranjang = fc.getKeranjang(id);
            Transaksi tr = new Transaksi(total, id);
            Jual[] jual = new Jual[keranjang.length];
            int idt = 0;
            int[] id_b = new int[keranjang.length];
            int[] jml = new int[keranjang.length];
            for (int i = 0; i < keranjang.length; i++) {
                id_b[i] = keranjang[i].getId_barang();
                jml[i] = keranjang[i].getJumlah();
            }
            if (fc.insertTransaksi(tr)) {
                idt =  fc.getLastIdTransaksi();
                for (int i = 0; i < jml.length; i++) {
                    jual[i] = new Jual(id_b[i], jml[i], id, idt);
                }
                if (jual!=null && fc.insertJual(jual)) {
                    if (fc.kurangStokBarang(jml, id_b)) {
                        fc.deleteKeranjang(id);
                        pesan = "Transaksi dengan kode '"+idt+"' telah selesai!!";
                    }
                }
            } else {
                pesan = "Transaksi dengan kode '"+idt+"' gagal!!";
            }
            HttpSession sess = request.getSession();
            sess.setAttribute("pesan", pesan);
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

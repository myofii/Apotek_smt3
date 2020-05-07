<%-- 
    Document   : tambahBarang
    Created on : Jan 14, 2020, 2:56:38 AM
    Author     : M. Yofi Indrawan
--%>

<%@page import="DB.FacadeGudang"%>
<%@page import="EntityClass.Barang"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="header.jsp"></jsp:include>
<%
    String nama_barang = request.getParameter("nama_barang");
    String harga = request.getParameter("harga");
    String tipe = request.getParameter("tipe");
    String pesan = null;
    
    Barang barang = new Barang();
    barang.setNama_barang(nama_barang);
    barang.setHarga(Integer.parseInt(harga));
    barang.setTipe(tipe);
    
    FacadeGudang fc = new FacadeGudang();
    if (fc.insertBarang(barang)) {
        pesan = "Barang "+nama_barang+" berhasil ditambahkan!!";
    } else {
        pesan = "Barang "+nama_barang+" gagal ditambahkan!!";
    }
    
    session.setAttribute("pesan", pesan);
    response.sendRedirect("/PWEB1/web/gudang.jsp");
%>
<jsp:include page="footer.html"></jsp:include>
</html>
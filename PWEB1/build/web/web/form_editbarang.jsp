<%-- 
    Document   : form_tambahbarang
    Created on : Jan 14, 2020, 12:48:39 AM
    Author     : M. Yofi Indrawan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="header.jsp" %>
<%if (login == null) {%>
<center><h1>Silahkan Login Untuk Mengakses</h1></center>
<br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
<% } else if (login.getGroup()!=3) {%>
<center><h1>Halaman Ini Tidak Bisa Di Akses</h1></center>
<br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
<% } else {%>
<jsp:useBean id="barang" class="EntityClass.Barang"/>
<jsp:useBean id="fc" class="DB.FacadeGudang"/>
<%
    String id_barang = request.getParameter("id_barang");
    if (id_barang!=null) {
        barang = fc.getDataBarang(id_barang);
%>
<div class="container py-5">
    <div class="card shadow">
        <div class="card-header">
            <a href="gudang.jsp"><button class="btn btn-primary">Kembali</button></a>
        </div>
    
        <div class="card-body">
            <form action="../EditBarangAction" method="post">
                <div class="form-group">
                  <label>ID Barang</label>
                  <input type="text" class="form-control" placeholder="ID Barang" readonly value="<%=barang.getId_barang()%>">
                </div>
              <input type="hidden" name="id_barang" value="<%=barang.getId_barang()%>">
                <div class="form-group">
                  <label>Nama Barang</label>
                  <input type="text" class="form-control" name="nama_barang" placeholder="Nama Barang" value="<%=barang.getNama_barang()%>">
                </div>
                <div class="form-group">
                  <label>Stok Barang</label>
                  <input type="text" class="form-control" placeholder="Stok Barang" readonly value="<%=barang.getStok()%>">
                </div>
                <div class="form-group">
                  <label>Harga Barang</label>
                  <input type="number" class="form-control" name="harga" placeholder="Harga Barang" value="<%=barang.getHarga()%>">
                </div>
                <div class="form-group">
                    <label>Kategori:</label>
                    <select class="form-control" name="tipe">
                        <%
                            if (barang.getTipe().equals("alat")) {%>
                            <option value="alat">Alat Kesehatan</option>
                            <option value="obat">Obat-obatan</option>
                        <% } else if(barang.getTipe().equals("obat")){%>
                            <option value="obat">Obat-obatan</option>
                            <option value="alat">Alat Kesehatan</option>
                        <%}%>
                    </select>
                </div>
                <input type="submit" class="btn btn-primary" value="Simpan">
            </form>
        </div>
    </div>
</div>

<%}
}
%>
<%@include file="footer.html" %>

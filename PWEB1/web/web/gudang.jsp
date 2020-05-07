<%-- 
    Document   : gudang
    Created on : Nov 17, 2019, 8:08:56 PM
    Author     : M. Yofi Indrawan
--%>

<%@page import="EntityClass.Barang"%>
<%@page import="DB.FacadeGudang"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
<%
    FacadeGudang fc = new FacadeGudang();
    Barang[] barang = fc.getDaftarBarang();
%>
<h2 align="center" class="py-3">Inventory Barang</h2>
<div class="container py-2">
    <% String pesan = (String)session.getAttribute("pesan");
        if (pesan!=null) {%>
        <div class="alert alert-info alert-dismissible fade show" role="alert">
        <strong><%=pesan%></strong>
        <button type="button" class="close" data-dismiss="alert" aria-label="Close">
            <span aria-hidden="true">&times;</span>
        </button>
        </div>
        <% session.setAttribute("pesan", null); }%>
    <div class="btn-group" role="group">
        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#tambahDataModal">
            Tambah Data Barang
        </button>
        <!-- Modal -->
        <div class="modal fade" id="tambahDataModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
          <div class="modal-dialog" role="document">
            <div class="modal-content">
              <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Tambah Data Barang</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                  <span aria-hidden="true">&times;</span>
                </button>
              </div>
                <form action="tambahBarangAction.jsp" method="post">
                    <div class="modal-body">
                        <div class="form-group">
                            <label>Nama barang</label>
                            <input type="text" class="form-control" name="nama_barang" placeholder="Nama barang">
                        </div>
                        <div class="form-group">
                            <label>Harga</label>
                            <input type="number" class="form-control" name="harga" placeholder="Harga">
                        </div>
                        <div class="form-group">
                            <label>Kategori:</label>
                            <select class="form-control" name="tipe">
                                <option value="Alat">Alat Kesehatan</option>
                                <option value="Obat">Obat-obatan</option>
                            </select>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Keluar</button>
                        <input type="submit" class="btn btn-primary" value="Simpan">
                    </div>
                </form>
            </div>
          </div>
        </div>
    </div>
</div>
<div class="container">
    <table class="table text-center">
        <thead>
            <tr>
                <th scope="col">No</th>
                <th scope="col">Nama Barang</th>
                <th scope="col">Tipe</th>
                <th scope="col">Stok</th>
                <th scope="col">Harga</th>
                <th scope="col">Aksi</th>
            </tr>
        </thead>
        <tbody>
            <% for (int i = 0; i < barang.length; i++) {%>
            <tr>
                <th scope="row"><%=(i + 1)%></th>
                <td><%=barang[i].getNama_barang()%></td>
                <td><%=barang[i].getTipe()%></td>
                <td><%=barang[i].getStok()%></td>
                <td>Rp.<%=barang[i].getHarga()%></td>
                <td>
                    <div class="btn-group">
                        <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Tambah Stok
                        </button>
                        <div class="dropdown-menu px-3">
                            <form action="../TambahStok" method="post">
                                <input type="hidden" name="id_akun" value="<%=login.getId()%>">
                                <input type="hidden" name="id_barang" value="<%=barang[i].getId_barang()%>">
                                <input type="hidden" name="nama_barang" value="<%=barang[i].getNama_barang()%>">
                                <input type="hidden" name="harga" value="<%=barang[i].getHarga()%>">
                                Jumlah stok : <input type="number" name="jumlah" class="form-control">
                                <center><input class="btn btn-primary" type="submit" value="Simpan"></center>
                            </form>
                        </div>
                    </div>
                    <div class="btn-group">
                        <a href="form_editbarang.jsp?id_barang=<%=barang[i].getId_barang()%>"><button type="button" class="btn btn-success" aria-haspopup="true" aria-expanded="false">
                            Ubah
                        </button></a>
                    </div>
                    <div class="btn-group">
                        <a href="../deleteBarangAction?id_barang=<%=barang[i].getId_barang()%>&nama_barang=<%=barang[i].getNama_barang()%>"><button type="button" class="btn btn-danger" aria-haspopup="true" aria-expanded="false">
                            Hapus
                            </button></a>
                    </div>
                </td>
            </tr>
            <%}%>
        </tbody>
    </table>
</div>
        <% } %>
<%@include file="footer.html" %>
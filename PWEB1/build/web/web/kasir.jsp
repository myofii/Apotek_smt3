<%-- 
    Document   : kasir
    Created on : Nov 17, 2019, 11:01:15 PM
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
        <% } else if (login.getGroup()!=2) {%>
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
<%@page import="EntityClass.*" %>
<%@page import="DB.FacadeKasir" %>
<%
    FacadeKasir fc = new FacadeKasir();
    Barang[] daftarBarang = fc.getDaftarBarang();
%>
        <datalist id="list">
            <%for(int i=0;i<daftarBarang.length;++i){%>
            <option><%=daftarBarang[i].getNama_barang()%></option>
            <%}%>
        </datalist>
        <script>
            function cari(){
                var nama=document.getElementById("nama_barang").value;
                location.href="kasir.jsp?nama_barang="+nama;
            }
        </script>
<%
    Barang barang=new Barang();
    if(request.getParameter("nama_barang")!=null)
    {
        String nama=request.getParameter("nama_barang");
        barang=fc.getDataBarang(nama);
    }
    
    Keranjang[] daftarKeranjang=fc.getKeranjang(login.getId());
%>

<%
//    String[] nama_barang = null;
//    int[] jml_barang= null;
//    int[] harga_barang= null;
//    int[] subharga= null;
//    for (int i = 0; i < daftarBarang.length; i++) {   
//        nama_barang[i] = daftarBarang[i].getNama_barang();
//        jml_barang[i] = daftarBarang[i].getStok()
//    }
%>
        <br/>
        <div class="container py-2">
            <div class="input-group">
                <input type="text" class="form-control" placeholder="Search" id="nama_barang" list="list">
                <div class="input-group-append" id="button-addon4">
                    <button class="btn btn-primary" type="button" onclick="cari()">Cari</button>
                </div>
            </div>
            <br/>
            <% String pesan = (String)session.getAttribute("pesan");
        if (pesan != null) {%>
            <div class="alert alert-info alert-dismissible fade show" role="alert">
                <strong><%=pesan%></strong>
                <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <% session.setAttribute("pesan", null);
            }%>
    <%if(request.getParameter("nama_barang")!=null&&barang.getNama_barang().equals("")){%>
        <div id="nama_barang" class="container alert alert-danger alert-dismissible fade show" role="alert">
            <strong>Data tidak ditemukan!</strong>&nbsp;
              <button type="button" class="close" data-dismiss="alert" >
                <span aria-hidden="true">&times;</span>
              </button>
        </div>
    <%}else if (!barang.getNama_barang().equals("")){%>
        <div class="container alert alert-info alert-dismissible fade show" role="alert">
            <strong>Data ditemukan!</strong>&nbsp;
              <button type="button" class="close" data-dismiss="alert" >
                <span aria-hidden="true">&times;</span>
              </button>
            <form action="../tambahKeranjang" method="post" >
            <div class="row">
                <div class="col-9">
                    <input type="hidden" name="id_barang" value="<%=barang.getId_barang()%>">
                    <input type="hidden" name="id_akun" value="<%=login.getId()%>">
                    <input type="number" min="0" max="<%=barang.getStok()%>" name="jumlah_barang" class="form-control" placeholder="Masukkan jumlah barang">
                </div>
                <div class="col-3">
                    <input type="submit" class="form-control btn btn-success" value="Tambah ke Checkout" placeholder="Tambah ke Checkout">
                </div>
            </div>
            </form>
        </div>
    <%}%>
    
</div>
<div class="container">
    <table class="table text-center">
            <tr>
                <%
                    int total = 0;
                    for (int i = 0; i < daftarKeranjang.length; i++) {
                        Barang c = fc.getBarang(daftarKeranjang[i].getId_barang());
                        total += c.getHarga() * daftarKeranjang[i].getJumlah();
                    }
                %>
                <td><h2 align="">Checkout</h2></td>
                <td colspan="4"></td>
                <td><h3 align="">Total Harga : Rp.<%=total%></h3></td>
            </tr>
            <tr>
                <th>No</th>
                <th>Nama Barang</th>
                <th>Jumlah</th>
                <th>Harga</th>
                <th>Subtotal Harga</th>
                <th>Aksi</th>
            </tr>
            <%
                for (int k = 0; k < daftarKeranjang.length; ++k) {
                    Barang b = fc.getBarang(daftarKeranjang[k].getId_barang());
            %>
            <tr>
                <td><%=(k + 1)%></td>
                <td><%=b.getNama_barang()%></td>
                <td><%=daftarKeranjang[k].getJumlah()%></td>
                <td><%=b.getHarga()%></td>
                <td><%=b.getHarga() * daftarKeranjang[k].getJumlah()%></td>
                <td><a class="btn btn-danger" href="../deleteBarangKeranjang?id=<%=daftarKeranjang[k].getId()%>">Hapus</a></td>
            </tr>
            <%}%>
            <tr>
            <form action="../selesaiTransaksi" method="post">
                <input type="hidden" name="id_akun" value="<%=login.getId()%>">
                <input type="hidden" name="total_biaya" value="<%=total%>">
                <td colspan="5"></td>
                <td><input type="submit" class="btn btn-primary" value="Selesai"></td>
            </form>
            </tr>
    </table>
</div>
        <% } %>
<%@include file="footer.html" %>

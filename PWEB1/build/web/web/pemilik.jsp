<%-- 
    Document   : pemilik
    Created on : Jan 5, 2020, 9:01:08 PM
    Author     : M. Yofi Indrawan
--%>

<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.Locale"%>
<%@page import="DB.FacadePemilik"%>
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
        <% } else if (login.getGroup()!=1) {%>
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
        <br/>
        <br/>
        <%
            FacadePemilik fc = new FacadePemilik();
            double pemasukan = 0;
            double pengeluaran = 0;
            String bulan = "01";
            if (request.getParameter("bulan")!=null) {
                bulan = request.getParameter("bulan");
            }
            pemasukan = fc.getPemasukan(bulan);
            pengeluaran = fc.getPengeluaran(bulan);

            Locale localeID = new Locale("in", "ID");
            NumberFormat fm = NumberFormat.getCurrencyInstance(localeID);
        %>
        <div class="container">
            <div class="row">
                <div class="col-3">
                    <div class="card text-white bg-primary shadow">
                        <div class="card-body">
                            <h3>Pemasukan</h3>
                            <h5>&emsp;<%=fm.format(pemasukan)%></h5>
                        </div>
                    </div>
                    <br/>
                </div>
                <div class="col-3">
                    <div class="card text-white bg-warning shadow">
                        <div class="card-body">
                            <h3>Pengeluaran</h3>
                            <h5>&emsp;<%=fm.format(pengeluaran)%></h5>
                        </div>
                    </div>
                    <br/>
                </div>
                <%
                    if ((pemasukan-pengeluaran)<0) {
                %>
                <div class="col-3">
                    <div class="card text-white bg-success shadow">
                        <div class="card-body">
                            <h3>Keuntungan</h3>
                            <h5>&emsp;Rp0,00</h5>
                        </div>
                    </div>
                    <br/>
                </div>
                <div class="col-3">
                    <div class="card text-white bg-danger shadow">
                        <div class="card-body">
                            <h3>Kerugian</h3>
                            <h5>&emsp;<%=fm.format(pemasukan-pengeluaran)%></h5>
                        </div>
                    </div>
                    <br/>
                </div>
                <% } else {%>
                <div class="col-3">
                    <div class="card text-white bg-success shadow">
                        <div class="card-body">
                            <h3>Keuntungan</h3>
                            <h5>&emsp;<%=fm.format(pemasukan-pengeluaran)%></h5>
                        </div>
                    </div>
                    <br/>
                </div>
                <div class="col-3">
                    <div class="card text-white bg-danger shadow">
                        <div class="card-body">
                            <h3>Kerugian</h3>
                            <h5>&emsp;Rp0,00</h5>
                        </div>
                    </div>
                    <br/>
                </div>
                <%}%>
            </div>
            <div class="row">
                <div class="col-12">
                    <form action="/PWEB1/web/pemilik.jsp"  method="post">
                        <div class="form-group">
                            <label>Urut Berdasarkan Bulan :</label>
                            <select class="form-control" name="bulan">
                                <option value="01">Januari</option>
                                <option value="02">Februari</option>
                                <option value="03">Maret</option>
                                <option value="04">April</option>
                                <option value="05">Mei</option>
                                <option value="06">Juni</option>
                                <option value="07">Juli</option>
                                <option value="08">Agustus</option>
                                <option value="09">September</option>
                                <option value="10">Oktober</option>
                                <option value="11">November</option>
                                <option value="12">Desember</option>
                            </select>
                        </div>
                        <input type="submit" class="btn btn-primary" value="Tampilkan">
                    </form>
                </div>
            </div>
        </div>
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
        <% } %>
<%@include file="footer.html" %>
</html>

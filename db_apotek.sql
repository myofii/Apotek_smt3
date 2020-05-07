-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 15 Jan 2020 pada 04.31
-- Versi Server: 10.1.19-MariaDB
-- PHP Version: 5.6.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_apotek`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `akun`
--

CREATE TABLE `akun` (
  `id_akun` int(11) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `nama_user` varchar(30) NOT NULL,
  `level_user` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `akun`
--

INSERT INTO `akun` (`id_akun`, `username`, `password`, `nama_user`, `level_user`) VALUES
(1, 'admin', 'admin', 'Muhammad Yofi Indrawan', 1),
(2, 'kasir', 'kasir', 'Arya Alde Prasetya', 2),
(3, 'pegawai', 'pegawai', 'Ditya Dianri', 3);

-- --------------------------------------------------------

--
-- Struktur dari tabel `barang`
--

CREATE TABLE `barang` (
  `id_barang` int(11) NOT NULL,
  `nama_barang` varchar(30) NOT NULL,
  `harga` int(9) NOT NULL,
  `stok` int(4) NOT NULL,
  `tipe` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `barang`
--

INSERT INTO `barang` (`id_barang`, `nama_barang`, `harga`, `stok`, `tipe`) VALUES
(1, 'Alkohol', 110500, 60, 'Obat'),
(2, 'Antimo Dewasa', 290000, 50, 'Obat'),
(3, 'Antimo Anak', 13000, 47, 'Obat'),
(4, 'Balsem Geliga', 90000, 70, 'Obat'),
(5, 'Betadine', 26000, 30, 'Obat'),
(6, 'Bodrex', 77000, 60, 'Obat'),
(7, 'Bodrex Extra', 45000, 80, 'Obat'),
(8, 'Bodrex F/B', 39000, 70, 'Obat'),
(9, 'Bodrex Migra', 45000, 90, 'Obat'),
(10, 'Bodrexin', 41000, 100, 'Obat'),
(11, 'Decolgen', 45000, 80, 'Obat'),
(12, 'Decolsin', 60500, 87, 'Obat'),
(13, 'Dettol Antiseptic', 16700, 90, 'Obat'),
(14, 'Entrostop Anak', 34000, 75, 'Obat'),
(15, 'Entrostop Dewasa', 72000, 70, 'Obat'),
(16, 'Enervon C', 107000, 39, 'Obat'),
(17, 'Fatigon Biasa', 49000, 89, 'Obat'),
(18, 'GPU 30ml', 96500, 91, 'Obat'),
(19, 'GPU 60ml', 166500, 91, 'Obat'),
(20, 'Hansaplast Box 100', 24000, 70, 'Obat'),
(21, 'Hemaviton Action', 56500, 25, 'Obat'),
(22, 'Hemaviton Stamina Plus', 55000, 83, 'Obat'),
(23, 'Insto', 138000, 25, 'Obat'),
(24, 'Inza', 47500, 65, 'Obat'),
(25, 'Inzana', 20000, 63, 'Obat'),
(26, 'Kalpanax Cair', 33200, 84, 'Obat'),
(27, 'Komix Dewasa', 38000, 77, 'Obat'),
(28, 'Komix Kids', 30000, 65, 'Obat'),
(29, 'Konidin', 90000, 63, 'Obat'),
(30, 'Koyo Cabe', 160000, 80, 'Obat'),
(31, 'Minyak Angin Fresh Care', 116500, 70, 'Obat'),
(32, 'Minyak Angin Safe Care', 330500, 70, 'Obat'),
(33, 'Minyak Kapak 3ml', 55500, 55, 'Obat'),
(34, 'Minyak Kapak 5ml', 96000, 55, 'Obat'),
(35, 'Minyak Kapak 10ml', 150000, 72, 'Obat'),
(36, 'Minyak Tawon CC', 498000, 89, 'Obat'),
(37, 'Minyak Tawon DD', 405000, 42, 'Obat'),
(38, 'Minyak Telon 3 Anak', 115500, 76, 'Obat'),
(39, 'Obat Batuk Woods', 13800, 88, 'Obat'),
(40, 'Oskadon', 78500, 55, 'Obat'),
(41, 'Otoskop Telinga General Care', 105000, 10, 'Alat'),
(42, 'Blood Meter ACCU Check Active', 480000, 40, 'Alat'),
(43, 'Blood Meter Easy Touch GCHB', 420000, 40, 'Alat'),
(44, 'Blood Meter Easy Touch GCU', 420000, 40, 'Alat'),
(45, 'Blood Transfusion Set', 45000, 40, 'Alat'),
(46, 'Blood Meter Nesco GCU', 420000, 40, 'Alat'),
(47, 'Catheter L/M/S', 8000, 100, 'Alat'),
(48, 'Corset Tablet', 198000, 70, 'Alat'),
(49, 'Cotton Bud', 2000, 120, 'Alat'),
(50, 'Cotton Baby Safe Kecil', 5000, 120, 'Alat'),
(51, 'Cotton Bud Lynea Besar', 8000, 120, 'Alat'),
(52, 'Cotton SWAB / Cotton SWAB ', 7000, 70, 'Alat'),
(53, 'Digital Thermometer Bayi', 25000, 100, 'Alat'),
(54, 'Digital Thermometer Boneka', 80000, 100, 'Alat'),
(55, 'Dodo Breast Pump Reguler', 26000, 70, 'Alat'),
(56, 'Dodo Breast Pump With Bottle', 13000, 60, 'Alat'),
(57, 'Face Brush ', 65000, 80, 'Alat'),
(58, 'Feeding Tube 3.5-Terumo', 20196, 90, 'Alat'),
(59, 'Feeding Tube 5/100CM Terumo', 20196, 90, 'Alat'),
(60, 'Feeding Tube 8/40CM Terumo', 22216, 90, 'Alat'),
(61, 'Humasis Before / Tes Kesuburan', 38000, 80, 'Alat'),
(62, 'Kasa Roll 4x10', 5000, 100, 'Alat'),
(63, 'Kasa Roll 4x3', 2000, 100, 'Alat'),
(64, 'Lampu Nyamuk LED ', 35000, 10, 'Alat'),
(65, 'Masker Kain Lembut', 10000, 100, 'Alat'),
(66, 'Masker Kain Motif', 5000, 100, 'Alat'),
(67, 'Masker Oxygen', 35000, 90, 'Alat'),
(68, 'Nose Up', 10000, 90, 'Alat'),
(69, 'Purbasari Lipstik Color Matte', 40000, 100, 'Alat'),
(70, 'Purbasari Lipstik Matte', 40000, 100, 'Alat');

-- --------------------------------------------------------

--
-- Struktur dari tabel `beli`
--

CREATE TABLE `beli` (
  `id` int(11) NOT NULL,
  `id_barang` int(11) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `total_harga` int(15) NOT NULL,
  `id_akun` int(11) NOT NULL,
  `tanggal_beli` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `beli`
--

INSERT INTO `beli` (`id`, `id_barang`, `jumlah`, `total_harga`, `id_akun`, `tanggal_beli`) VALUES
(1, 8, 4, 156000, 3, '2020-01-15 10:07:26'),
(2, 6, 5, 385000, 3, '2020-01-15 10:08:07'),
(3, 7, 5, 225000, 3, '2020-01-15 10:08:13'),
(4, 11, 4, 180000, 3, '2020-01-15 10:08:22'),
(5, 9, 2, 90000, 3, '2020-01-15 10:08:29');

-- --------------------------------------------------------

--
-- Struktur dari tabel `jual`
--

CREATE TABLE `jual` (
  `id_jual` int(11) NOT NULL,
  `id_barang` int(11) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `id_akun` int(11) NOT NULL,
  `id_transaksi` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `jual`
--

INSERT INTO `jual` (`id_jual`, `id_barang`, `jumlah`, `id_akun`, `id_transaksi`) VALUES
(1, 29, 4, 2, 1),
(2, 3, 3, 2, 1),
(3, 22, 4, 2, 1),
(4, 21, 9, 2, 1),
(5, 67, 10, 2, 1);

-- --------------------------------------------------------

--
-- Struktur dari tabel `keranjang`
--

CREATE TABLE `keranjang` (
  `id` int(11) NOT NULL,
  `id_barang` int(11) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `id_akun` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `id` int(11) NOT NULL,
  `total_biaya` int(9) NOT NULL,
  `tanggal_jual` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `id_akun` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `transaksi`
--

INSERT INTO `transaksi` (`id`, `total_biaya`, `tanggal_jual`, `id_akun`) VALUES
(1, 1477500, '2020-01-15 10:11:59', 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `akun`
--
ALTER TABLE `akun`
  ADD PRIMARY KEY (`id_akun`);

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`id_barang`);

--
-- Indexes for table `beli`
--
ALTER TABLE `beli`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_akun` (`id_akun`),
  ADD KEY `id_barang` (`id_barang`);

--
-- Indexes for table `jual`
--
ALTER TABLE `jual`
  ADD PRIMARY KEY (`id_jual`),
  ADD KEY `id_barang` (`id_barang`);

--
-- Indexes for table `keranjang`
--
ALTER TABLE `keranjang`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_akun` (`id_akun`),
  ADD KEY `id` (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `akun`
--
ALTER TABLE `akun`
  MODIFY `id_akun` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `barang`
--
ALTER TABLE `barang`
  MODIFY `id_barang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=71;
--
-- AUTO_INCREMENT for table `beli`
--
ALTER TABLE `beli`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `jual`
--
ALTER TABLE `jual`
  MODIFY `id_jual` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `keranjang`
--
ALTER TABLE `keranjang`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `beli`
--
ALTER TABLE `beli`
  ADD CONSTRAINT `beli_ibfk_1` FOREIGN KEY (`id_akun`) REFERENCES `akun` (`id_akun`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `beli_ibfk_2` FOREIGN KEY (`id_barang`) REFERENCES `barang` (`id_barang`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `jual`
--
ALTER TABLE `jual`
  ADD CONSTRAINT `jual_ibfk_1` FOREIGN KEY (`id_barang`) REFERENCES `barang` (`id_barang`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`id_akun`) REFERENCES `akun` (`id_akun`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

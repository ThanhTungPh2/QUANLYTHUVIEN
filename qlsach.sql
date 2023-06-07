-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th6 06, 2023 lúc 06:05 PM
-- Phiên bản máy phục vụ: 10.4.27-MariaDB
-- Phiên bản PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `qlsach`
--

DELIMITER $$
--
-- Thủ tục
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `SUA_NHAN_VIEN` (IN `manv` VARCHAR(255), IN `name` VARCHAR(255), IN `std` VARCHAR(255), IN `dc` VARCHAR(255), IN `tk` VARCHAR(255), IN `mk` VARCHAR(255), IN `role` INT)   BEGIN
   IF manv <> 'NV03' THEN
      UPDATE `nhan_vien_thu_vien` SET `NAME` = name, `PHONE` = std, `ADDRESS` = dc WHERE `MA_NV` = manv;
      DELETE FROM `tai_khoan` WHERE `MA_NV` = manv;
      INSERT INTO tai_khoan(TEN_DANG_NHAP, MAT_KHAU, MA_NV, ROLE) VALUES (tk, mk, manv, role);
   END IF;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `THEM_NV` (IN `ma_nv` VARCHAR(20), IN `name` VARCHAR(255), IN `std` VARCHAR(255), IN `dc` VARCHAR(255), IN `tk` VARCHAR(255), IN `mk` VARCHAR(255), IN `role` INT)   BEGIN
    INSERT INTO nhan_vien_thu_vien(MA_NV, NAME, PHONE, ADDRESS)
    VALUES (ma_nv, name, std, dc);
    
    INSERT INTO tai_khoan(TEN_DANG_NHAP, MAT_KHAU, MA_NV, ROLE)
    VALUES (tk, mk, ma_nv, role);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `THEM_SACH` (IN `p_ma_phieu` VARCHAR(20), IN `p_ma_sach` VARCHAR(20))   BEGIN
    -- Thêm sách vào bảng phieu_muon_sach
    INSERT INTO phieu_muon_sach (MA_PHIEU, MA_SACH) VALUES (p_ma_phieu, p_ma_sach);

    -- Cập nhật số lượng sách trong bảng sach
    UPDATE sach
    SET SO_LUONG = SO_LUONG - 1
    WHERE MA_SACH = p_ma_sach;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `XOA_NV` (IN `p_manv` VARCHAR(255))   BEGIN
   IF p_manv <> 'NV03' THEN
      DELETE FROM nhan_vien_thu_vien WHERE MA_NV = p_manv;
      DELETE FROM tai_khoan WHERE MA_NV = p_manv;
   END IF;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `XOA_SACH` (IN `p_ma_phieu` VARCHAR(20), IN `p_ma_sach` VARCHAR(20))   BEGIN
    -- Thêm sách vào bảng phieu_muon_sach
    DELETE FROM phieu_muon_sach WHERE MA_PHIEU = p_ma_phieu AND MA_SACH = p_ma_sach;

    -- Cập nhật số lượng sách trong bảng sach
    UPDATE sach
    SET SO_LUONG = SO_LUONG + 1
    WHERE MA_SACH = p_ma_sach;
END$$

--
-- Các hàm
--
CREATE DEFINER=`root`@`localhost` FUNCTION `TONG_TIEN` (`ma_phieu` VARCHAR(20)) RETURNS INT(11)  BEGIN
    DECLARE total INT;

    SELECT SUM(GIA_TIEN) INTO total
    FROM sach
    JOIN phieu_muon_sach ON sach.MA_SACH = phieu_muon_sach.MA_SACH
    WHERE phieu_muon_sach.MA_PHIEU = ma_phieu;

    RETURN total;
  END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `doc_gia`
--

CREATE TABLE `doc_gia` (
  `MA_DOC_GIA` varchar(20) NOT NULL,
  `NAME` varchar(255) NOT NULL,
  `SDT` varchar(15) NOT NULL,
  `ADDRESS` varchar(255) NOT NULL,
  `KHOA` varchar(255) NOT NULL,
  `LOP` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `doc_gia`
--

INSERT INTO `doc_gia` (`MA_DOC_GIA`, `NAME`, `SDT`, `ADDRESS`, `KHOA`, `LOP`) VALUES
('2020602363', 'Phạm Thanh Tùng', '0398068192', 'Hải Dương', 'CNTT-K15', 'CNTT2'),
('2020678543', 'GâuGaau', '0314213321', 'Thái Bìn', 'CNTT-K15', 'CNTT2'),
('2020679345', 'Phạm Thi Phương Thảo', '0987654322', 'Thái Bình', 'CNTT-K15', 'CNTT2'),
('2020689754', 'Nguyễn Văn Toàn', '0312345690', 'Thái Bình', 'CNTT-K15', 'CNTT2');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhan_vien_thu_vien`
--

CREATE TABLE `nhan_vien_thu_vien` (
  `MA_NV` varchar(20) NOT NULL,
  `NAME` varchar(255) NOT NULL,
  `PHONE` varchar(20) NOT NULL,
  `ADDRESS` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `nhan_vien_thu_vien`
--

INSERT INTO `nhan_vien_thu_vien` (`MA_NV`, `NAME`, `PHONE`, `ADDRESS`) VALUES
('NV01', 'Phạm Thanh Tùng', '0398068191', 'Hải Dương'),
('NV03', 'Phạm Thị Phương Thảo', '092343245', 'Thái Bình'),
('NV04', 'Nguyễn Văn Toàn', '092343241', 'Thái Bình');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nha_xuat_ban`
--

CREATE TABLE `nha_xuat_ban` (
  `MA_NXB` varchar(20) NOT NULL,
  `NAME` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `nha_xuat_ban`
--

INSERT INTO `nha_xuat_ban` (`MA_NXB`, `NAME`) VALUES
('NXB01', 'Hà Nội'),
('NXB02', 'Hải Dương'),
('NXB03', 'Thái Bình');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phieu_muon`
--

CREATE TABLE `phieu_muon` (
  `MA_PHIEU` varchar(20) NOT NULL,
  `MA_NV` varchar(20) NOT NULL,
  `MA_DOC_GIA` varchar(20) NOT NULL,
  `DATE_START` date NOT NULL,
  `DATE_END` date NOT NULL,
  `TRANG_THAI` varchar(30) NOT NULL DEFAULT 'ĐANG MƯỢN'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `phieu_muon`
--

INSERT INTO `phieu_muon` (`MA_PHIEU`, `MA_NV`, `MA_DOC_GIA`, `DATE_START`, `DATE_END`, `TRANG_THAI`) VALUES
('PM01', 'NV01', '2020602363', '2023-06-05', '2023-06-30', 'ĐÃ TRẢ'),
('PM02', 'NV01', '2020602363', '2023-06-05', '2023-06-30', 'ĐÃ TRẢ'),
('PM03', 'NV01', '2020679345', '2023-06-05', '2023-06-23', 'ĐÃ TRẢ'),
('PM04', 'NV01', '2020602363', '2023-06-05', '2023-06-29', 'ĐÃ TRẢ'),
('PM05', 'NV01', '2020689754', '2023-06-05', '2023-06-24', 'ĐÃ TRẢ'),
('PM06', 'NV01', '2020689754', '2023-06-05', '2023-06-29', 'ĐÃ TRẢ'),
('PM07', 'NV03', '2020602363', '2023-06-06', '2023-06-05', 'ĐANG MƯỢN');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phieu_muon_sach`
--

CREATE TABLE `phieu_muon_sach` (
  `MA_PHIEU` varchar(20) NOT NULL,
  `MA_SACH` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `phieu_muon_sach`
--

INSERT INTO `phieu_muon_sach` (`MA_PHIEU`, `MA_SACH`) VALUES
('PM07', 'S01'),
('PM07', 'S03'),
('PM07', 'S04'),
('PM07', 'S05');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sach`
--

CREATE TABLE `sach` (
  `MA_SACH` varchar(20) NOT NULL,
  `NAME` varchar(255) NOT NULL,
  `SO_LUONG` int(11) NOT NULL,
  `GIA_TIEN` int(11) NOT NULL,
  `NAM_XB` varchar(20) NOT NULL,
  `MA_NXB` varchar(20) NOT NULL,
  `MA_TAC_GIA` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `sach`
--

INSERT INTO `sach` (`MA_SACH`, `NAME`, `SO_LUONG`, `GIA_TIEN`, `NAM_XB`, `MA_NXB`, `MA_TAC_GIA`) VALUES
('S01', 'Dế Mèn Phiêu Lưu Ký', 7, 89000, '2023', 'NXB01', 'TG04'),
('S03', 'Số đỏ', 6, 50000, '2010', 'NXB01', 'TG06'),
('S04', 'Chí Phèo', 1, 75000, '2013', 'NXB01', 'TG07'),
('S05', 'Làng', 4, 35000, '2015', 'NXB01', 'TG08'),
('S06', 'Hai Đứa Trẻ', 10, 79000, '2009', 'NXB01', 'TG09'),
('S07', 'Già Thiên', 4, 79000, '2023', 'NXB03', 'TG05');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tac_gia`
--

CREATE TABLE `tac_gia` (
  `MA_TAC_GIA` varchar(20) NOT NULL,
  `NAME` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `tac_gia`
--

INSERT INTO `tac_gia` (`MA_TAC_GIA`, `NAME`) VALUES
('TG01', 'Phạm Minh Hoài'),
('TG02', 'Nguyên Thanh Châu'),
('TG03', 'Lương Minh Minh'),
('TG04', 'Tô Hoài'),
('TG05', 'Thần Đông'),
('TG06', 'Vũ Trọng Phụng'),
('TG07', 'Nam Cao'),
('TG08', 'Kim Lân'),
('TG09', 'Thạch Lam');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tai_khoan`
--

CREATE TABLE `tai_khoan` (
  `TEN_DANG_NHAP` varchar(255) NOT NULL,
  `MAT_KHAU` varchar(255) NOT NULL,
  `MA_NV` varchar(20) NOT NULL,
  `ROLE` varchar(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `tai_khoan`
--

INSERT INTO `tai_khoan` (`TEN_DANG_NHAP`, `MAT_KHAU`, `MA_NV`, `ROLE`) VALUES
('', '', 'NV03', '1'),
('ThanhTungPh2', 'Tung123', 'NV01', '0'),
('VanToan', 'Toan', 'NV04', '0');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `doc_gia`
--
ALTER TABLE `doc_gia`
  ADD PRIMARY KEY (`MA_DOC_GIA`);

--
-- Chỉ mục cho bảng `nhan_vien_thu_vien`
--
ALTER TABLE `nhan_vien_thu_vien`
  ADD PRIMARY KEY (`MA_NV`);

--
-- Chỉ mục cho bảng `nha_xuat_ban`
--
ALTER TABLE `nha_xuat_ban`
  ADD PRIMARY KEY (`MA_NXB`);

--
-- Chỉ mục cho bảng `phieu_muon`
--
ALTER TABLE `phieu_muon`
  ADD PRIMARY KEY (`MA_PHIEU`),
  ADD KEY `MA_NV` (`MA_NV`,`MA_DOC_GIA`),
  ADD KEY `MA_DOC_GIA` (`MA_DOC_GIA`);

--
-- Chỉ mục cho bảng `phieu_muon_sach`
--
ALTER TABLE `phieu_muon_sach`
  ADD PRIMARY KEY (`MA_PHIEU`,`MA_SACH`),
  ADD KEY `MA_PHIEU` (`MA_PHIEU`,`MA_SACH`),
  ADD KEY `MA_SACH` (`MA_SACH`);

--
-- Chỉ mục cho bảng `sach`
--
ALTER TABLE `sach`
  ADD PRIMARY KEY (`MA_SACH`),
  ADD KEY `MA_NXB` (`MA_NXB`,`MA_TAC_GIA`),
  ADD KEY `MA_TAC_GIA` (`MA_TAC_GIA`);

--
-- Chỉ mục cho bảng `tac_gia`
--
ALTER TABLE `tac_gia`
  ADD PRIMARY KEY (`MA_TAC_GIA`);

--
-- Chỉ mục cho bảng `tai_khoan`
--
ALTER TABLE `tai_khoan`
  ADD PRIMARY KEY (`TEN_DANG_NHAP`),
  ADD KEY `MA_NV` (`MA_NV`);

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `phieu_muon`
--
ALTER TABLE `phieu_muon`
  ADD CONSTRAINT `phieu_muon_ibfk_1` FOREIGN KEY (`MA_NV`) REFERENCES `nhan_vien_thu_vien` (`MA_NV`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `phieu_muon_ibfk_2` FOREIGN KEY (`MA_DOC_GIA`) REFERENCES `doc_gia` (`MA_DOC_GIA`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Các ràng buộc cho bảng `phieu_muon_sach`
--
ALTER TABLE `phieu_muon_sach`
  ADD CONSTRAINT `phieu_muon_sach_ibfk_1` FOREIGN KEY (`MA_PHIEU`) REFERENCES `phieu_muon` (`MA_PHIEU`) ON DELETE CASCADE ON UPDATE NO ACTION,
  ADD CONSTRAINT `phieu_muon_sach_ibfk_2` FOREIGN KEY (`MA_SACH`) REFERENCES `sach` (`MA_SACH`) ON DELETE CASCADE ON UPDATE NO ACTION;

--
-- Các ràng buộc cho bảng `sach`
--
ALTER TABLE `sach`
  ADD CONSTRAINT `sach_ibfk_2` FOREIGN KEY (`MA_TAC_GIA`) REFERENCES `tac_gia` (`MA_TAC_GIA`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `sach_ibfk_3` FOREIGN KEY (`MA_NXB`) REFERENCES `nha_xuat_ban` (`MA_NXB`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Các ràng buộc cho bảng `tai_khoan`
--
ALTER TABLE `tai_khoan`
  ADD CONSTRAINT `tai_khoan_ibfk_1` FOREIGN KEY (`MA_NV`) REFERENCES `nhan_vien_thu_vien` (`MA_NV`) ON DELETE CASCADE ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

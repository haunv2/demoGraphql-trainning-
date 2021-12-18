-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 18, 2021 at 03:42 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sof3011_lap`
--

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` bigint(11) NOT NULL,
  `fullname` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `admin` tinyint(4) NOT NULL DEFAULT 0,
  `username` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `user` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `dateCreate` timestamp NULL DEFAULT current_timestamp(),
  `dateUpdate` timestamp NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `fullname`, `email`, `password`, `admin`, `username`, `user`, `dateCreate`, `dateUpdate`) VALUES
(11, 'admin', 'admin@admin.com', '$2a$12$A4W.Q9XIh9iDPwrsDQ42i.uEYtgK/KatogyMg7yVZmJNrXu5FCRky', 1, 'admin', NULL, '2021-12-02 16:42:58', '2021-12-02 16:42:57'),
(13, 'az777', 'a@gmail.com', '$2a$12$A4W.Q9XIh9iDPwrsDQ42i.uEYtgK/KatogyMg7yVZmJNrXu5FCRky', 0, 'haunv1503', NULL, '2021-12-02 16:37:05', '2021-12-03 19:40:09'),
(14, 'af', 'fa', '$2a$12$A4W.Q9XIh9iDPwrsDQ42i.uEYtgK/KatogyMg7yVZmJNrXu5FCRky', 0, 'fafa', NULL, '2021-12-02 15:28:57', '2021-12-02 15:29:16'),
(16, 'Nguyễn Thị Dung', 'dung12@gmail.com', '$2a$12$A4W.Q9XIh9iDPwrsDQ42i.uEYtgK/KatogyMg7yVZmJNrXu5FCRky', 0, 'dungma12', NULL, '2021-12-02 15:28:57', '2021-12-02 15:29:16'),
(17, 'Nguyễn Chung Quốc', 'quoc82@gmail.com', '$2a$12$A4W.Q9XIh9iDPwrsDQ42i.uEYtgK/KatogyMg7yVZmJNrXu5FCRky', 0, 'quocms1', NULL, '2021-12-02 15:28:57', '2021-12-02 15:29:16'),
(18, 'Nguyễn Hà Thành', 'thanh2@gmail.com', '$2a$12$A4W.Q9XIh9iDPwrsDQ42i.uEYtgK/KatogyMg7yVZmJNrXu5FCRky', 0, 'thanh2', NULL, '2021-12-02 15:28:57', '2021-12-02 15:29:16'),
(19, 'Đinh Công Giang', 'giang10@gmail.com', '$2a$12$A4W.Q9XIh9iDPwrsDQ42i.uEYtgK/KatogyMg7yVZmJNrXu5FCRky', 0, 'giang10', NULL, '2021-12-02 15:28:57', '2021-12-02 15:29:16'),
(20, 'Hà Mạnh Duy', 'msd@gmail.com', '$2a$12$A4W.Q9XIh9iDPwrsDQ42i.uEYtgK/KatogyMg7yVZmJNrXu5FCRky', 0, 'msd', NULL, '2021-12-02 15:28:57', '2021-12-02 15:29:16'),
(21, 'Trương Đình Nam', 'nameo08@gmail.com', '$2a$12$A4W.Q9XIh9iDPwrsDQ42i.uEYtgK/KatogyMg7yVZmJNrXu5FCRky', 0, 'nameo08', NULL, '2021-12-02 15:28:57', '2021-12-02 15:29:16'),
(22, 'Trương Công Sơn', 'sontt@gmail.com', '$2a$12$A4W.Q9XIh9iDPwrsDQ42i.uEYtgK/KatogyMg7yVZmJNrXu5FCRky', 0, 'sontt14', NULL, '2021-12-02 15:28:57', '2021-12-02 15:29:16'),
(23, 'Dương HUyền Trang', 'trang92@gmail.com', '$2a$12$A4W.Q9XIh9iDPwrsDQ42i.uEYtgK/KatogyMg7yVZmJNrXu5FCRky', 0, 'trang92', NULL, '2021-12-02 15:28:57', '2021-12-02 15:29:16'),
(24, 'Đào Thị Cẩm', 'cam83@gmail.com', '$2a$12$A4W.Q9XIh9iDPwrsDQ42i.uEYtgK/KatogyMg7yVZmJNrXu5FCRky', 0, 'cam83', NULL, '2021-12-02 15:28:57', '2021-12-02 15:29:16'),
(25, 'Nguyễn Mạnh Hải', 'nvahai@ma.com', '$2a$12$A4W.Q9XIh9iDPwrsDQ42i.uEYtgK/KatogyMg7yVZmJNrXu5FCRky', 0, 'nvahai151', NULL, '2021-12-02 15:28:57', '2021-12-02 15:29:16'),
(26, 'Nguen van ha', 'ahuw@fmao.com', '$2a$12$A4W.Q9XIh9iDPwrsDQ42i.uEYtgK/KatogyMg7yVZmJNrXu5FCRky', 0, 'haa141', NULL, '2021-12-02 15:28:57', '2021-12-02 15:29:16'),
(27, 'Nmahs', 'ka@ma', '$2a$12$A4W.Q9XIh9iDPwrsDQ42i.uEYtgK/KatogyMg7yVZmJNrXu5FCRky', 0, 'aff999', NULL, '2021-12-02 16:43:59', '2021-12-02 16:43:59'),
(28, 'Mr kaze', 'va@babaa', '$2a$12$A4W.Q9XIh9iDPwrsDQ42i.uEYtgK/KatogyMg7yVZmJNrXu5FCRky', 0, 'MK99', NULL, '2021-12-02 16:46:37', '2021-12-02 16:46:37'),
(29, 'fafaf', 'a@gmail.comff', '$2a$12$A4W.Q9XIh9iDPwrsDQ42i.uEYtgK/KatogyMg7yVZmJNrXu5FCRky', 0, 'haunv1503fa', NULL, '2021-12-02 17:08:57', '2021-12-02 17:08:57'),
(36, 'Maria La', 'az1@gmail.com', '$2a$12$A4W.Q9XIh9iDPwrsDQ42i.uEYtgK/KatogyMg7yVZmJNrXu5FCRky', 0, 'haunv150321', NULL, '2021-12-03 15:44:11', '2021-12-03 15:44:11'),
(37, 'kafnaf', 'afa@ca.1c', '$2a$12$A4W.Q9XIh9iDPwrsDQ42i.uEYtgK/KatogyMg7yVZmJNrXu5FCRky', 0, 'mmm', NULL, '2021-12-07 03:55:38', '2021-12-07 03:55:38'),
(39, 'aaa', '114a66@gmail.com', '$2a$12$A4W.Q9XIh9iDPwrsDQ42i.uEYtgK/KatogyMg7yVZmJNrXu5FCRky', 1, 'haunv1503hh', NULL, '2021-12-07 04:05:11', '2021-12-07 04:05:11'),
(40, 'user1', 'user1s@gmail.com', '$2a$12$A4W.Q9XIh9iDPwrsDQ42i.uEYtgK/KatogyMg7yVZmJNrXu5FCRky', 0, 'user1', NULL, '2021-12-13 06:12:18', '2021-12-13 06:12:18');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `email_UNIQUE` (`email`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` bigint(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

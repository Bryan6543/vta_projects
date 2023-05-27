-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 07, 2023 at 06:17 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `stock_managment`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `adminID` varchar(32) NOT NULL,
  `aUsername` varchar(32) NOT NULL,
  `aPassword` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`adminID`, `aUsername`, `aPassword`) VALUES
('admin001', 'admin', 'admin'),
('admin01', 'adminx', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `cID` varchar(16) NOT NULL,
  `cName` varchar(32) NOT NULL,
  `cDescription` varchar(128) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`cID`, `cName`, `cDescription`) VALUES
('c001', 'Cloths', 'Shirts, underwears, etc');

-- --------------------------------------------------------

--
-- Table structure for table `restrictedarea`
--

CREATE TABLE `restrictedarea` (
  `dateTime` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `restrictedarea`
--

INSERT INTO `restrictedarea` (`dateTime`) VALUES
('2023-05-07 12:47:48');

-- --------------------------------------------------------

--
-- Table structure for table `stockmanager`
--

CREATE TABLE `stockmanager` (
  `smID` varchar(32) NOT NULL,
  `smName` varchar(32) NOT NULL,
  `smPassword` varchar(16) NOT NULL,
  `smGender` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `stockmanager`
--

INSERT INTO `stockmanager` (`smID`, `smName`, `smPassword`, `smGender`) VALUES
('sm001', 'Bryan', 'Bryan123', 'Male'),
('sm002', 'Anna', 'Anna123', 'Male');

-- --------------------------------------------------------

--
-- Table structure for table `stocks`
--

CREATE TABLE `stocks` (
  `sID` varchar(32) NOT NULL,
  `sName` varchar(32) NOT NULL,
  `sQauntity` int(16) NOT NULL,
  `sPrice` int(16) NOT NULL,
  `sCategory` varchar(16) NOT NULL,
  `sDescription` varchar(128) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `stocks`
--

INSERT INTO `stocks` (`sID`, `sName`, `sQauntity`, `sPrice`, `sCategory`, `sDescription`) VALUES
('asdsd', 'asdas', 213, 123123, 'Cloths', 'asdasd'),
('asdsdasd', 'asdas', 213, 123123123, 'Cloths', 'asdasd');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`adminID`);

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`cID`);

--
-- Indexes for table `stockmanager`
--
ALTER TABLE `stockmanager`
  ADD PRIMARY KEY (`smID`);

--
-- Indexes for table `stocks`
--
ALTER TABLE `stocks`
  ADD PRIMARY KEY (`sID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

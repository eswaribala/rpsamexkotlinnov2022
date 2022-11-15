

DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `Address_Id` bigint(20) NOT NULL AUTO_INCREMENT,
  `Door_No` varchar(5),
  `State` varchar(100),
  `City` varchar(100) NOT NULL,
  `Pincode` bigint(20) DEFAULT NULL,
  `Street_Name` varchar(150) NOT NULL,
  `Account_No` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`Address_Id`),
  KEY `Account_No` (`Account_No`),
  CONSTRAINT `Address_Id_FK` FOREIGN KEY (`Account_No`) REFERENCES `customer` (`Account_No`)
);

DROP TABLE IF EXISTS `corporate`;
CREATE TABLE `corporate` (
  `Company_Type` varchar(255) NOT NULL,
  `Account_No` bigint(20) NOT NULL,
  PRIMARY KEY (`Account_No`),
  CONSTRAINT `Corporate_FK` FOREIGN KEY (`Account_No`) REFERENCES `customer` (`Account_No`)
);

--
-- Dumping data for table `corporate`
--



--
-- Definition of table `customer`
--

DROP TABLE IF EXISTS `customer`;
CREATE DATABASE `amexdb2022` /*!40100 DEFAULT CHARACTER SET utf8 */;

CREATE TABLE `customer` (
  `Account_No` bigint(20) NOT NULL AUTO_INCREMENT,
  `Contact_Number` bigint(20) DEFAULT NULL,
  `Email` varchar(150) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Password` varchar(10) NOT NULL,
  PRIMARY KEY (`Account_No`));


--
-- Dumping data for table `customer`
--




--
-- Definition of table `individual`
--

DROP TABLE IF EXISTS `individual`;
CREATE TABLE `individual` (
  `Gender` varchar(255) DEFAULT NULL,
  `Account_No` bigint(20) NOT NULL,
  `SurName` varchar(100) DEFAULT NULL,
  `DOB` Date,
  PRIMARY KEY (`Account_No`),
  CONSTRAINT `invidividual_fk` FOREIGN KEY (`Account_No`) REFERENCES `customer` (`Account_No`)
);
--
-- Dumping data for table `individual`
--


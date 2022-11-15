

DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `Address_Id` bigint(20) NOT NULL AUTO_INCREMENT,
  `City` varchar(100) NOT NULL,
  `Pincode` bigint(20) DEFAULT NULL,
  `Street_Name` varchar(150) NOT NULL,
  `Customer_Id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`Address_Id`),
  KEY `Customer_Id` (`Customer_Id`),
  CONSTRAINT `Customer_Id` FOREIGN KEY (`Customer_Id`) REFERENCES `customer` (`Customer_Id`)
)


DROP TABLE IF EXISTS `corporate`;
CREATE TABLE `corporate` (
  `Company_Type` varchar(255) NOT NULL,
  `Customer_Id` bigint(20) NOT NULL,
  PRIMARY KEY (`Customer_Id`),
  CONSTRAINT `FKcsdj4r1w7ayq1x1wdopeevhjv` FOREIGN KEY (`Customer_Id`) REFERENCES `customer` (`Customer_Id`)
) 

--
-- Dumping data for table `corporate`
--

/*!40000 ALTER TABLE `corporate` DISABLE KEYS */;
INSERT INTO `corporate` (`Company_Type`,`Customer_Id`) VALUES 
 ('Private',2);
/*!40000 ALTER TABLE `corporate` ENABLE KEYS */;


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

/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` (`Customer_Id`,`Contact_Number`,`Email`,`First_Name`,`Last_Name`,`Middle_Name`,`Password`) VALUES 
 (1,9952032862,'eswaribala@rediffmail.com','Parameswari','Bala','','Test@123'),
 (2,9952032862,'vebconsulting2022@gmail.com','Veb Consulting','Private Limited','','Test@123'),
 (3,9952032862,'vikigmail.com','Vignesh','Manickam','','Test@123');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;


--
-- Definition of table `individual`
--

DROP TABLE IF EXISTS `individual`;
CREATE TABLE `individual` (
  `Gender` varchar(255) DEFAULT NULL,
  `Customer_Id` bigint(20) NOT NULL,
  PRIMARY KEY (`Customer_Id`),
  CONSTRAINT `FK6pwgm33ayqklcl3umkns1d26j` FOREIGN KEY (`Customer_Id`) REFERENCES `customer` (`Customer_Id`)
) 
--
-- Dumping data for table `individual`
--

/*!40000 ALTER TABLE `individual` DISABLE KEYS */;
INSERT INTO `individual` (`Gender`,`Customer_Id`) VALUES 
 ('FEMALE',1),
 ('MALE',3);
/*!40000 ALTER TABLE `individual` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

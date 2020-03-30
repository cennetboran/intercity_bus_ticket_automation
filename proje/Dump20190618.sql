-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: localhost    Database: biletuygulama
-- ------------------------------------------------------
-- Server version	8.0.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `kullanici`
--

DROP TABLE IF EXISTS `kullanici`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `kullanici` (
  `kullanici_adi` varchar(20) NOT NULL,
  `kullanici_isim` varchar(45) NOT NULL,
  `kullanici_soyisim` varchar(45) NOT NULL,
  `kullanici_sifre` varchar(45) NOT NULL,
  `cinsiyet` varchar(45) NOT NULL,
  PRIMARY KEY (`kullanici_adi`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kullanici`
--

LOCK TABLES `kullanici` WRITE;
/*!40000 ALTER TABLE `kullanici` DISABLE KEYS */;
INSERT INTO `kullanici` VALUES ('cennet1','cennet','boran','1234','kadın'),('deniz1','Deniz','Akgöl','1234','Erkek'),('duygu1','duygu1','duygu','1234','Kadın'),('emine1','emine','keskim','1234','Kadın');
/*!40000 ALTER TABLE `kullanici` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sefer`
--

DROP TABLE IF EXISTS `sefer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `sefer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `kalkis` varchar(45) NOT NULL,
  `varis` varchar(45) NOT NULL,
  `tarih` date NOT NULL,
  `kalkis_saat` int(11) NOT NULL,
  `kalkis_dakika` int(11) NOT NULL,
  `fiyat` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sefer`
--

LOCK TABLES `sefer` WRITE;
/*!40000 ALTER TABLE `sefer` DISABLE KEYS */;
INSERT INTO `sefer` VALUES (1,'Ankara','Antalya','2019-01-01',6,30,50),(2,'Antalya','Izmir','2019-01-01',6,45,70),(3,'Istanbul','Izmir','2019-09-02',8,15,60),(4,'Bursa','Ankara','2019-05-01',5,0,70),(5,'Izmir','Bursa','2018-02-12',1,45,50);
/*!40000 ALTER TABLE `sefer` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-06-18 21:32:41

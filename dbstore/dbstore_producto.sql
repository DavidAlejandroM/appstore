-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: dbstore
-- ------------------------------------------------------
-- Server version	5.7.12-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `producto` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `detalle` varchar(500) NOT NULL,
  `precio` varchar(200) NOT NULL,
  `categoria` bigint(20) NOT NULL,
  `imagen` varchar(500) NOT NULL,
  `plataforma` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `categoria` (`categoria`),
  KEY `plataforma` (`plataforma`),
  CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`categoria`) REFERENCES `categoria` (`id`),
  CONSTRAINT `producto_ibfk_2` FOREIGN KEY (`plataforma`) REFERENCES `plataforma` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES (1,'lkjñlkjasdf','33eeeee','$  23423424',1,'wowlegion.jpg',1),(2,'hola','asdf','$  10',1,'Call-of-Duty-Black-Ops-III.jpg',2),(3,'hola2','asdff','$  100',1,'wowlegion.jpg',2),(8,'Call Of Duty Black Ops 3','es un super juego','$  50008',2,'images/caratulas/Call-of-Duty-Black-Ops-III.jpg',1),(9,'World of Warcraft Legion','es un juego','$  99000',3,'images/caratulas/wowlegion.jpg',1),(10,'Assasing Creed II','muy bueno','$  50000',1,'images/caratulas/assassins_creed_2-1694124.jpg',2),(11,'Infinite','infinity es un juego para ps4 de mucha accion','$  30000',1,'images/caratulas/fdsafdsadxrgb.png',3),(12,'Grand Theft Auto V','es uno de los mejores juegos del 2014','$  90000',1,'images/caratulas/gta-v-caratula-fan.jpg',1),(13,'Halo 5','Los spartans han atacado la tierra','$  300000',1,'images/caratulas/halo-5-guardians-20151023123031_1.jpg',2),(14,'Rocket League','es un futbolito de carritos','$  50000',3,'images/caratulas/descarga.jpg',2),(15,'League of Legends','lol','$  400000',2,'images/caratulas/league.jpg',1);
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-06-06 18:22:20

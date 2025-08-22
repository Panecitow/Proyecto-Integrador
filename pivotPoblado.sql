-- MySQL dump 10.13  Distrib 8.0.42, for Win64 (x86_64)
--
-- Host: localhost    Database: pivot
-- ------------------------------------------------------
-- Server version	8.0.42

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tb_hotel`
--

DROP TABLE IF EXISTS `tb_hotel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_hotel` (
  `idHotel` int NOT NULL AUTO_INCREMENT,
  `idLugarDestacado` int NOT NULL,
  `nombreHotel` varchar(45) NOT NULL,
  `costoNoche` varchar(45) NOT NULL,
  PRIMARY KEY (`idHotel`),
  KEY `id_lugaresDestacado_idx` (`idLugarDestacado`),
  CONSTRAINT `id_lugaresDestacado` FOREIGN KEY (`idLugarDestacado`) REFERENCES `tb_lugardestacado` (`idLugarDestacado`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_hotel`
--

LOCK TABLES `tb_hotel` WRITE;
/*!40000 ALTER TABLE `tb_hotel` DISABLE KEYS */;
INSERT INTO `tb_hotel` VALUES (1,2,'El Cafetalero','850'),(2,10,'Plaza San Carlos','900'),(3,11,'Villa de Cortez','1,098'),(4,12,'Casa Blanca','1,316'),(5,13,'Xochipila','700'),(6,14,'Hotel Mi Ranchito','1530'),(7,15,'Hotel Fosado','450');
/*!40000 ALTER TABLE `tb_hotel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_lugardestacado`
--

DROP TABLE IF EXISTS `tb_lugardestacado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_lugardestacado` (
  `idLugarDestacado` int NOT NULL AUTO_INCREMENT,
  `nombreLugar` varchar(45) NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `tipoLugar` varchar(45) DEFAULT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idLugarDestacado`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_lugardestacado`
--

LOCK TABLES `tb_lugardestacado` WRITE;
/*!40000 ALTER TABLE `tb_lugardestacado` DISABLE KEYS */;
INSERT INTO `tb_lugardestacado` VALUES (1,'Cruz Celestial','Camino Rural, Nactanca S/N, Xicotepe','Lugar Turistico','Vista panorámica'),(2,'El Cafetalero','Blvrd Benito Juárez 120, Col Centro','Hotel','Céntrico y cómodo'),(3,'La Terraza','Col Centro','Restaurante','Mexicano 24 hrs'),(4,'Poema Meson Xicotepec','Hidalgo 107, Col Centro','Restaurante','Cena romántica'),(5,'Carnemiel','Vicente Guerrero 145, Col Centro','Restaurante','Bar y carnes'),(6,'Don Mundo','González Ortega 102, Col la Rivera','Restaurante','Parrilladas sabrosas'),(7,'TIZOC','Zaragoza 211, Col Centro','Restaurante','Mariscos y antojitos'),(8,'La Gran Tradición','Plaza Constitución 123, Col Centro','Restaurante','Cocina mexicana'),(9,'El Cuate','Zaragoza 140, Col Centro','Restaurante','Especialidad en pollo'),(10,'Plaza San Carlos','Hidalgo 100, Col Centro','Hotel','Hotel con restaurante'),(11,'Villa de Cortez','Miguel Negrete 105, Col Centro','Hotel','Colonial y elegante'),(12,'Casa Blanca','Blvrd Benito Juárez 264, Col Centro','Hotel','Moderno y limpio'),(13,'Xochipila','Reforma Sur 111, Col Centro','Hotel','Económico y sencillo'),(14,'Hotel Mi Ranchito','Zaragoza 267-B, Col Centro','Hotel','Tranquilo y familiar'),(15,'Hotel Fosado','Av 5 de Mayo 120, Col Centro','Hotel','Básico y funcional'),(16,'Museo Casa Carranza','Río Lerma 35, Cuauhtémoc','Lugar Turistico','Museo histórico'),(17,'Virgen de Guadalupe','Col el Tabacal, Xicotepec','Lugar Turistico','Mirador religioso'),(18,'Iglesia Católica','Iturbide 4, Col Centro','Lugar Turistico','Templo colonial'),(19,'Monumento Cafetalero','Blvrd Benito Juárez 264, Col la Rivera','Lugar Turistico','Homenaje al café'),(20,'Xochipila','Porfirio Díaz 118, Col Centro','Lugar Turistico','Sitio ceremonial');
/*!40000 ALTER TABLE `tb_lugardestacado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_lugarturistico`
--

DROP TABLE IF EXISTS `tb_lugarturistico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_lugarturistico` (
  `idLugarTuristico` int NOT NULL AUTO_INCREMENT,
  `idLugarDestacado` int NOT NULL,
  `nombreLugarTuristico` varchar(45) NOT NULL,
  `costoEntrada` varchar(45) NOT NULL,
  PRIMARY KEY (`idLugarTuristico`),
  KEY `idLugarDestacado_idx` (`idLugarDestacado`),
  CONSTRAINT `idLugarDestacado` FOREIGN KEY (`idLugarDestacado`) REFERENCES `tb_lugardestacado` (`idLugarDestacado`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_lugarturistico`
--

LOCK TABLES `tb_lugarturistico` WRITE;
/*!40000 ALTER TABLE `tb_lugarturistico` DISABLE KEYS */;
INSERT INTO `tb_lugarturistico` VALUES (1,1,'Cruz Celestial','75'),(2,16,'Virgen de Guadalupe','0'),(3,17,'Cruz Celestial','0'),(4,18,'Iglesia Católica','0'),(5,19,'Monumento Cafetalero','0'),(6,20,'Xochipila','0');
/*!40000 ALTER TABLE `tb_lugarturistico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_resenia`
--

DROP TABLE IF EXISTS `tb_resenia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_resenia` (
  `idResenia` int NOT NULL AUTO_INCREMENT,
  `idUsuario` int NOT NULL,
  `IdLugarDestacado` int NOT NULL,
  `calificacion` int NOT NULL,
  `comentario` varchar(45) DEFAULT NULL,
  `fechaResenia` varchar(45) NOT NULL,
  PRIMARY KEY (`idResenia`),
  KEY `fk_idUsuario_idx` (`idUsuario`),
  KEY `fk_idLugarDestacado_idx` (`IdLugarDestacado`),
  CONSTRAINT `fk_idLugaresDestacados` FOREIGN KEY (`IdLugarDestacado`) REFERENCES `tb_lugardestacado` (`idLugarDestacado`),
  CONSTRAINT `fk_idUsuario` FOREIGN KEY (`idUsuario`) REFERENCES `tb_usuario` (`idUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_resenia`
--

LOCK TABLES `tb_resenia` WRITE;
/*!40000 ALTER TABLE `tb_resenia` DISABLE KEYS */;
INSERT INTO `tb_resenia` VALUES (1,1,1,5,'Muy croqueta','2011-11-11'),(3,1,2,4,'MUY COQUETO','2025-10-10'),(5,1,3,1,'UwU','hoy');
/*!40000 ALTER TABLE `tb_resenia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_restaurantes`
--

DROP TABLE IF EXISTS `tb_restaurantes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_restaurantes` (
  `idRestaurantes` int NOT NULL,
  `idLugarDestacado` int NOT NULL,
  `nombreRestaurante` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idRestaurantes`),
  KEY `idLugaresDestacados_idx` (`idLugarDestacado`),
  CONSTRAINT `idLugarDestacados` FOREIGN KEY (`idLugarDestacado`) REFERENCES `tb_lugardestacado` (`idLugarDestacado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_restaurantes`
--

LOCK TABLES `tb_restaurantes` WRITE;
/*!40000 ALTER TABLE `tb_restaurantes` DISABLE KEYS */;
INSERT INTO `tb_restaurantes` VALUES (1,3,'La Terraza'),(2,4,'Poema Mesón Xicotepec'),(3,5,'Carnemiel'),(4,6,'Don Mundo'),(5,7,'TIZOC'),(6,8,'La Gran Tradición'),(7,9,'El Cuate');
/*!40000 ALTER TABLE `tb_restaurantes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_usuario`
--

DROP TABLE IF EXISTS `tb_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_usuario` (
  `idUsuario` int NOT NULL AUTO_INCREMENT,
  `nombreUsuario` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`idUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_usuario`
--

LOCK TABLES `tb_usuario` WRITE;
/*!40000 ALTER TABLE `tb_usuario` DISABLE KEYS */;
INSERT INTO `tb_usuario` VALUES (1,'Balatro','123'),(2,'Teto','1234'),(3,'Isaac','gupi'),(4,'Daratiu','croqueta');
/*!40000 ALTER TABLE `tb_usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_usuariolugar`
--

DROP TABLE IF EXISTS `tb_usuariolugar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_usuariolugar` (
  `idUsuarioLugar` int NOT NULL AUTO_INCREMENT,
  `idUsuario` int NOT NULL,
  `idLugarDestacado` int NOT NULL,
  PRIMARY KEY (`idUsuarioLugar`),
  KEY `idUsuario_idx` (`idUsuario`),
  KEY `idLugarDestacado_idx` (`idLugarDestacado`),
  CONSTRAINT `idLugarDestacado_fk` FOREIGN KEY (`idLugarDestacado`) REFERENCES `tb_lugardestacado` (`idLugarDestacado`),
  CONSTRAINT `idUsuario` FOREIGN KEY (`idUsuario`) REFERENCES `tb_usuario` (`idUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_usuariolugar`
--

LOCK TABLES `tb_usuariolugar` WRITE;
/*!40000 ALTER TABLE `tb_usuariolugar` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_usuariolugar` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-08-22  0:10:38

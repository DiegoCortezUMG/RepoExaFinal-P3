-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-06-2023 a las 19:14:51
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bdexafinalp3`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asientos`
--

CREATE TABLE `asientos` (
  `idAsientos` int(11) NOT NULL,
  `fkSala` int(11) NOT NULL,
  `Fila` int(11) DEFAULT NULL,
  `Columna` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cines`
--

CREATE TABLE `cines` (
  `idCines` int(11) NOT NULL,
  `Nombre` varchar(45) DEFAULT NULL,
  `Dirección` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `idClientes` int(11) NOT NULL,
  `Nombre` varchar(45) DEFAULT NULL,
  `Nit` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `derechos`
--

CREATE TABLE `derechos` (
  `idDerechos` int(11) NOT NULL,
  `fkPelicula` int(11) NOT NULL,
  `estadoDerechos` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `idFactura` int(11) NOT NULL,
  `fkCliente` int(11) DEFAULT NULL,
  `metodoPago` varchar(45) DEFAULT NULL,
  `subTotal` double DEFAULT NULL,
  `impuesto` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `horariocine`
--

CREATE TABLE `horariocine` (
  `idhorarioCine` int(11) NOT NULL,
  `fkPelicula` int(11) DEFAULT NULL,
  `fkSala` int(11) NOT NULL,
  `fechaHorario` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `peliculas`
--

CREATE TABLE `peliculas` (
  `idPeliculas` int(11) NOT NULL,
  `Nombre` varchar(45) DEFAULT NULL,
  `Clasificación` varchar(45) DEFAULT NULL,
  `Genero` varchar(45) DEFAULT NULL,
  `Subtitulado` varchar(45) DEFAULT NULL,
  `Idioma` varchar(45) DEFAULT NULL,
  `precio` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registropuntos`
--

CREATE TABLE `registropuntos` (
  `idregistroPuntos` int(11) NOT NULL,
  `fkCliente` int(11) NOT NULL,
  `puntosAcum` int(11) DEFAULT NULL,
  `puntosUsados` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reservaciones`
--

CREATE TABLE `reservaciones` (
  `idReservaciones` int(11) NOT NULL,
  `fkAsientos` int(11) NOT NULL,
  `subTotalAsiento` double DEFAULT NULL,
  `fkFactura` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `salas`
--

CREATE TABLE `salas` (
  `idSalas` int(11) NOT NULL,
  `fkCine` int(11) NOT NULL,
  `Descripción` varchar(100) DEFAULT NULL,
  `formatoPeli` varchar(45) DEFAULT NULL,
  `puntos` int(11) DEFAULT NULL,
  `precioSala` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_usuario`
--

CREATE TABLE `tbl_usuario` (
  `usId` int(11) NOT NULL,
  `usNombre` varchar(50) NOT NULL,
  `usClave` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tbl_usuario`
--

INSERT INTO `tbl_usuario` (`usId`, `usNombre`, `usClave`) VALUES
(1, 'diego', '123');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `asientos`
--
ALTER TABLE `asientos`
  ADD PRIMARY KEY (`idAsientos`),
  ADD KEY `fkasieS` (`fkSala`);

--
-- Indices de la tabla `cines`
--
ALTER TABLE `cines`
  ADD PRIMARY KEY (`idCines`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`idClientes`);

--
-- Indices de la tabla `derechos`
--
ALTER TABLE `derechos`
  ADD PRIMARY KEY (`idDerechos`),
  ADD KEY `fkpder` (`fkPelicula`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`idFactura`),
  ADD KEY `fkfacCl` (`fkCliente`);

--
-- Indices de la tabla `horariocine`
--
ALTER TABLE `horariocine`
  ADD PRIMARY KEY (`idhorarioCine`),
  ADD KEY `fkhcinP` (`fkPelicula`),
  ADD KEY `fkhcinSa` (`fkSala`);

--
-- Indices de la tabla `peliculas`
--
ALTER TABLE `peliculas`
  ADD PRIMARY KEY (`idPeliculas`);

--
-- Indices de la tabla `registropuntos`
--
ALTER TABLE `registropuntos`
  ADD PRIMARY KEY (`idregistroPuntos`);

--
-- Indices de la tabla `reservaciones`
--
ALTER TABLE `reservaciones`
  ADD PRIMARY KEY (`idReservaciones`),
  ADD KEY `fkresas` (`fkAsientos`),
  ADD KEY `fkresfac` (`fkFactura`);

--
-- Indices de la tabla `salas`
--
ALTER TABLE `salas`
  ADD PRIMARY KEY (`idSalas`),
  ADD KEY `fk_cinS` (`fkCine`);

--
-- Indices de la tabla `tbl_usuario`
--
ALTER TABLE `tbl_usuario`
  ADD PRIMARY KEY (`usId`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `asientos`
--
ALTER TABLE `asientos`
  MODIFY `idAsientos` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `cines`
--
ALTER TABLE `cines`
  MODIFY `idCines` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `idClientes` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `derechos`
--
ALTER TABLE `derechos`
  MODIFY `idDerechos` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `factura`
--
ALTER TABLE `factura`
  MODIFY `idFactura` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `horariocine`
--
ALTER TABLE `horariocine`
  MODIFY `idhorarioCine` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `peliculas`
--
ALTER TABLE `peliculas`
  MODIFY `idPeliculas` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `registropuntos`
--
ALTER TABLE `registropuntos`
  MODIFY `idregistroPuntos` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `reservaciones`
--
ALTER TABLE `reservaciones`
  MODIFY `idReservaciones` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `salas`
--
ALTER TABLE `salas`
  MODIFY `idSalas` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tbl_usuario`
--
ALTER TABLE `tbl_usuario`
  MODIFY `usId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `asientos`
--
ALTER TABLE `asientos`
  ADD CONSTRAINT `fkasieS` FOREIGN KEY (`fkSala`) REFERENCES `salas` (`idSalas`);

--
-- Filtros para la tabla `derechos`
--
ALTER TABLE `derechos`
  ADD CONSTRAINT `fkpder` FOREIGN KEY (`fkPelicula`) REFERENCES `peliculas` (`idPeliculas`);

--
-- Filtros para la tabla `factura`
--
ALTER TABLE `factura`
  ADD CONSTRAINT `fkfacCl` FOREIGN KEY (`fkCliente`) REFERENCES `clientes` (`idClientes`);

--
-- Filtros para la tabla `horariocine`
--
ALTER TABLE `horariocine`
  ADD CONSTRAINT `fkhcinP` FOREIGN KEY (`fkPelicula`) REFERENCES `peliculas` (`idPeliculas`),
  ADD CONSTRAINT `fkhcinSa` FOREIGN KEY (`fkSala`) REFERENCES `salas` (`idSalas`);

--
-- Filtros para la tabla `reservaciones`
--
ALTER TABLE `reservaciones`
  ADD CONSTRAINT `fkresas` FOREIGN KEY (`fkAsientos`) REFERENCES `asientos` (`idAsientos`),
  ADD CONSTRAINT `fkresfac` FOREIGN KEY (`fkFactura`) REFERENCES `factura` (`idFactura`);

--
-- Filtros para la tabla `salas`
--
ALTER TABLE `salas`
  ADD CONSTRAINT `fk_cinS` FOREIGN KEY (`fkCine`) REFERENCES `cines` (`idCines`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-09-2021 a las 21:42:44
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `challenge_questions`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `id` int(11) NOT NULL,
  `dificultad` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`id`, `dificultad`) VALUES
(1, 'Muy fácil'),
(2, 'Fácil'),
(3, 'Medio'),
(4, 'Difícil'),
(5, 'Muy difícil');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jugador`
--

CREATE TABLE `jugador` (
  `id` int(11) NOT NULL,
  `nombre` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `opciones`
--

CREATE TABLE `opciones` (
  `id` int(11) NOT NULL,
  `texto` varchar(100) NOT NULL,
  `iscorrect` tinyint(1) NOT NULL,
  `id_pregunta` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `opciones`
--

INSERT INTO `opciones` (`id`, `texto`, `iscorrect`, `id_pregunta`) VALUES
(2, 'Cosovo', 0, 1),
(3, 'Luxemburgo', 0, 1),
(4, 'Moscú', 1, 1),
(5, 'Kiev', 0, 1),
(6, 'Francia', 1, 2),
(7, 'Inglaterra', 0, 2),
(8, 'Colombia', 0, 2),
(9, 'Alemania', 0, 2),
(10, 'James K. Polk', 0, 3),
(11, 'James Madison', 0, 3),
(12, 'Thomas Jefferson', 0, 3),
(13, 'George Washington', 1, 3),
(14, 'Pupcia', 0, 4),
(15, 'Pupcia', 0, 4),
(16, 'Polska', 1, 4),
(17, 'Poland', 0, 4),
(18, 'Badung', 0, 5),
(19, 'Jakarta', 1, 5),
(20, 'Medan', 0, 5),
(21, 'Palembang', 0, 5),
(22, 'Victoria', 0, 6),
(23, 'New South Wales', 0, 6),
(24, 'Alberta', 1, 6),
(25, 'Queensland', 0, 6),
(26, 'Vulpes Vulpes', 1, 7),
(27, 'Vulpes Redus', 0, 7),
(28, 'Red Fox', 0, 7),
(29, 'Vulpes Vulpie', 0, 7),
(30, 'Gohan', 0, 8),
(31, 'Vegeta', 0, 8),
(32, 'Bardock', 0, 8),
(33, 'Raditz', 1, 8),
(34, 'Estonia', 1, 9),
(35, 'Finlandia', 0, 9),
(36, 'Suecia', 0, 9),
(37, 'Polonia', 0, 9),
(38, 'Sunrise', 0, 10),
(39, 'Satelight', 1, 10),
(40, 'Xebec', 0, 10),
(41, 'Production I.G.', 0, 10),
(42, 'Genesís', 1, 11),
(43, 'Exodo', 0, 11),
(44, 'Levítico', 0, 11),
(45, 'Números', 0, 11),
(46, 'Corazón', 0, 12),
(47, 'Hígado', 0, 12),
(48, 'Piel', 1, 12),
(49, 'Intestino delgado', 0, 12),
(50, 'Thomas Jefferson', 0, 13),
(51, 'Abraham Lincoln', 0, 13),
(52, 'Benjamin Franklin', 0, 13),
(53, 'George Washington', 1, 13),
(54, 'Hexágono', 0, 14),
(55, 'Octágono', 1, 14),
(56, 'Triángulo', 0, 14),
(57, 'Círculo', 0, 14),
(58, '8', 0, 15),
(59, '9', 0, 15),
(60, '7', 1, 15),
(61, '6', 0, 15),
(62, 'Amarillo', 0, 16),
(63, 'Naranja', 1, 16),
(64, 'Verde', 0, 16),
(65, 'Azul', 0, 16),
(66, 'O', 0, 17),
(67, 'S', 1, 17),
(68, 'A', 0, 17),
(69, 'C', 0, 17),
(70, 'Kappa', 0, 18),
(71, 'Zeta', 0, 18),
(72, 'Omega', 1, 18),
(73, 'Theta', 0, 18),
(74, '2005', 0, 19),
(75, '2003', 0, 19),
(76, '2002', 0, 19),
(77, '2004', 1, 19),
(78, 'BackRub', 1, 20),
(79, 'SearchPRO', 0, 20),
(80, 'CatMassage', 0, 20),
(81, 'Netscape Navigator', 0, 20),
(82, 'Diamantes', 0, 21),
(83, 'Tréboles', 0, 21),
(84, 'Corazones', 1, 21),
(85, 'Espadas', 0, 21),
(86, 'Rublo', 0, 22),
(87, 'Konra', 0, 22),
(88, 'Dólar', 0, 22),
(89, 'Kip', 1, 22),
(90, '1923', 0, 23),
(91, '1926', 1, 23),
(92, '1929', 0, 23),
(93, '1930', 0, 23),
(94, 'Luces brillantes', 0, 24),
(95, 'Escarabajos', 0, 24),
(96, 'Sombras', 1, 24),
(97, 'Escobas', 0, 24),
(98, 'Turco', 1, 25),
(99, 'Polaco', 0, 25),
(100, 'Danés', 0, 25),
(101, 'Alemán', 0, 25);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pregunta`
--

CREATE TABLE `pregunta` (
  `id` int(11) NOT NULL,
  `enunciado` varchar(200) NOT NULL,
  `id_categoria` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pregunta`
--

INSERT INTO `pregunta` (`id`, `enunciado`, `id_categoria`) VALUES
(1, '¿Cuál es la capital de Rusia?', 1),
(2, '¿Quien Ganó el mundial de fútbol 2018?', 1),
(3, '¿Quién fue el primer presidente de los Estados Unidos?', 2),
(4, '¿Cómo se dice \"Polonia\" en polaco?', 2),
(5, '¿Cuál es la capital de Indonesia?', 3),
(6, '¿Cuál de las siguientes no es un territorio australiano?', 3),
(7, '¿Cuál es el nombre cientifico del zorro rojo?', 4),
(8, '¿En Dragon Ball quién es el hermano de Goku?', 4),
(9, '¿En qué país está ubicado Tallinn?', 5),
(10, '¿Cuál es el estudio de grabación de \"Log Horizon\"?', 5),
(11, '¿Cuál es el primer libro del Antiguo Testamento?', 1),
(12, '¿¿Cuál es el órgano más grande del cuerpo humano?', 1),
(13, '¿Qué presidente estadounidense aparece en el billete de un dólar?', 1),
(14, '¿Qué forma geométrica se usa generalmente para las señales de alto?', 2),
(15, '¿Cuántos colores hay en un arco iris?', 2),
(16, '¿Cuál de estos colores NO aparece en el logotipo de Google?', 2),
(17, 'En el código Morse, ¿qué letra se indica con 3 puntos?', 3),
(18, '¿Cuál es la última letra del alfabeto griego?', 3),
(19, '¿Cuándo se lanzó el sitio web Facebook?', 3),
(20, '¿Cuál era el nombre original del motor de búsqueda de Google?', 4),
(21, 'En un juego de cartas estándar, ¿cuál es el único rey sin bigote?', 4),
(22, '¿Cuál es la moneda oficial de Laos?', 4),
(23, '¿En qué año nació la reina Isabel II?', 5),
(24, '¿Escofobia es el miedo a qué?', 5),
(25, '¿Cuál de los siguientes idiomas NO usa el género como parte de su gramática?', 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `premio`
--

CREATE TABLE `premio` (
  `id` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `id_jugador` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ronda`
--

CREATE TABLE `ronda` (
  `num` int(11) NOT NULL,
  `id_jugador` int(11) NOT NULL,
  `fecha` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `ispassed` tinyint(1) NOT NULL,
  `id_categoria` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `jugador`
--
ALTER TABLE `jugador`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `opciones`
--
ALTER TABLE `opciones`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_pregunta` (`id_pregunta`);

--
-- Indices de la tabla `pregunta`
--
ALTER TABLE `pregunta`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_categoria` (`id_categoria`);

--
-- Indices de la tabla `premio`
--
ALTER TABLE `premio`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_jugador` (`id_jugador`);

--
-- Indices de la tabla `ronda`
--
ALTER TABLE `ronda`
  ADD PRIMARY KEY (`num`,`id_jugador`,`fecha`),
  ADD KEY `id_categoria` (`id_categoria`),
  ADD KEY `id_jugador` (`id_jugador`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `opciones`
--
ALTER TABLE `opciones`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=102;

--
-- AUTO_INCREMENT de la tabla `pregunta`
--
ALTER TABLE `pregunta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=101;

--
-- AUTO_INCREMENT de la tabla `premio`
--
ALTER TABLE `premio`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `opciones`
--
ALTER TABLE `opciones`
  ADD CONSTRAINT `opciones_ibfk_1` FOREIGN KEY (`id_pregunta`) REFERENCES `pregunta` (`id`);

--
-- Filtros para la tabla `pregunta`
--
ALTER TABLE `pregunta`
  ADD CONSTRAINT `pregunta_ibfk_1` FOREIGN KEY (`id_categoria`) REFERENCES `categoria` (`id`);

--
-- Filtros para la tabla `premio`
--
ALTER TABLE `premio`
  ADD CONSTRAINT `premio_ibfk_1` FOREIGN KEY (`id_jugador`) REFERENCES `jugador` (`id`);

--
-- Filtros para la tabla `ronda`
--
ALTER TABLE `ronda`
  ADD CONSTRAINT `ronda_ibfk_1` FOREIGN KEY (`id_categoria`) REFERENCES `categoria` (`id`),
  ADD CONSTRAINT `ronda_ibfk_2` FOREIGN KEY (`id_jugador`) REFERENCES `jugador` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

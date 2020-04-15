-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 22-Nov-2019 às 14:41
-- Versão do servidor: 10.4.6-MariaDB
-- versão do PHP: 7.3.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `empresa`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `carros`
--

CREATE TABLE `carros` (
  `id` int(11) NOT NULL,
  `carro` varchar(30) NOT NULL,
  `placa` varchar(10) NOT NULL,
  `usuario` varchar(30) NOT NULL,
  `cpf` int(15) NOT NULL,
  `horario` datetime NOT NULL,
  `horasalugadas` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `carros`
--

INSERT INTO `carros` (`id`, `carro`, `placa`, `usuario`, `cpf`, `horario`, `horasalugadas`) VALUES
(1, 'Uno', 'HRJ198', '', 0, '2019-11-19 00:00:00', 0),
(2, 'Onix', 'SGR158', '', 0, '2019-11-19 00:00:00', 0),
(3, 'Gol', 'ASV156', '', 0, '2019-11-19 00:00:00', 0),
(4, 'Hilux', 'FEF954', '', 0, '2019-11-19 00:00:00', 0),
(5, 'Mobi', 'FDS958', '', 0, '2019-11-19 00:00:00', 0),
(6, 'Palio', 'FAF915', '', 0, '2019-11-19 00:00:00', 0),
(7, 'Sandero', 'GAD916', '', 0, '2019-11-19 00:00:00', 0),
(8, 'Corolla', 'FDS985', '', 0, '2019-11-19 00:00:00', 0),
(9, 'Civic', 'FED599', '', 0, '2019-11-19 00:00:00', 0),
(10, 'Fit', 'FSD556', '', 0, '2019-11-19 00:00:00', 0),
(11, 'HB20', 'SGR954', '', 0, '2019-11-19 00:00:00', 0);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `carros`
--
ALTER TABLE `carros`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `carros`
--
ALTER TABLE `carros`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

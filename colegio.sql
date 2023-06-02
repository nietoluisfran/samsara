-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema colegio
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema colegio
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `colegio` DEFAULT CHARACTER SET utf8mb4 ;
USE `colegio` ;

-- -----------------------------------------------------
-- Table `colegio`.`comuna`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `colegio`.`comuna` (
  `id_comuna` INT(11) NOT NULL AUTO_INCREMENT,
  `nombre_comuna` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id_comuna`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `colegio`.`colegio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `colegio`.`colegio` (
  `id_colegio` INT(11) NOT NULL,
  `id_comuna` INT(11) NOT NULL,
  `nombre_cole` VARCHAR(45) NULL DEFAULT NULL,
  `direccion_cole` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id_colegio`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `colegio`.`alumnos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `colegio`.`alumnos` (
  `id_alumnos` INT(11) NOT NULL AUTO_INCREMENT,
  `id_colegio` INT(11) NOT NULL,
  `nombre` VARCHAR(20) NULL DEFAULT NULL,
  `apellido` VARCHAR(20) NULL DEFAULT NULL,
  PRIMARY KEY (`id_alumnos`))
ENGINE = InnoDB
AUTO_INCREMENT = 17
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `colegio`.`cursos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `colegio`.`cursos` (
  `id_cursos` INT(11) NOT NULL AUTO_INCREMENT,
  `id_colegio` INT(11) NOT NULL,
  `nombre_curso` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id_cursos`))
ENGINE = InnoDB
AUTO_INCREMENT = 9
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `colegio`.`profesores`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `colegio`.`profesores` (
  `id_profesor` INT(11) NOT NULL AUTO_INCREMENT,
  `id_colegio` INT(11) NOT NULL,
  `nombre_profesor` VARCHAR(45) NULL DEFAULT NULL,
  `apellido_profesor` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id_profesor`))
ENGINE = InnoDB
AUTO_INCREMENT = 9
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `colegio`.`alumnos_relacion_cursos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `colegio`.`alumnos_relacion_cursos` (
  `alumnos_id_alumnos` INT(11) NOT NULL,
  `cursos_id_cursos` INT(11) NOT NULL,
  PRIMARY KEY (`alumnos_id_alumnos`, `cursos_id_cursos`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

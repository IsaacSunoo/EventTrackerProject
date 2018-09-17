-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema nutritiontracker
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `nutritiontracker` ;

-- -----------------------------------------------------
-- Schema nutritiontracker
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `nutritiontracker` DEFAULT CHARACTER SET utf8 ;
USE `nutritiontracker` ;

-- -----------------------------------------------------
-- Table `nutritional_values`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `nutritional_values` ;

CREATE TABLE IF NOT EXISTS `nutritional_values` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name_and_amount` VARCHAR(45) NOT NULL,
  `calories` INT(11) NOT NULL,
  `calories_from_fat` INT(11) NULL DEFAULT NULL,
  `total_fat` DECIMAL(6,2) NOT NULL,
  `saturated_fat` DECIMAL(6,2) NULL DEFAULT NULL,
  `trans_fat` DECIMAL(6,2) NULL DEFAULT NULL,
  `cholesterol` INT(11) NOT NULL,
  `sodium` INT(11) NOT NULL,
  `potassium` INT(11) NULL DEFAULT NULL,
  `total_carbohydrate` DECIMAL(6,2) NOT NULL,
  `dietary_fiber` DECIMAL(6,2) NULL DEFAULT NULL,
  `sugars` DECIMAL(6,2) NULL DEFAULT NULL,
  `protein` DECIMAL(6,2) NOT NULL,
  UNIQUE INDEX `id_UNIQUE` (`id` ASC))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8;

SET SQL_MODE = '';
DROP USER IF EXISTS nutritiontracker;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'nutritiontracker' IDENTIFIED BY 'nutritiontracker';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'nutritiontracker';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `nutritional_values`
-- -----------------------------------------------------
START TRANSACTION;
USE `nutritiontracker`;
INSERT INTO `nutritional_values` (`id`, `name_and_amount`, `calories`, `calories_from_fat`, `total_fat`, `saturated_fat`, `trans_fat`, `cholesterol`, `sodium`, `potassium`, `total_carbohydrate`, `dietary_fiber`, `sugars`, `protein`) VALUES (1, 'Egg (50g)', 78, 45, 5, 1.6, 0, 187, 63, 63, 0.6, 0, 0.6, 6);
INSERT INTO `nutritional_values` (`id`, `name_and_amount`, `calories`, `calories_from_fat`, `total_fat`, `saturated_fat`, `trans_fat`, `cholesterol`, `sodium`, `potassium`, `total_carbohydrate`, `dietary_fiber`, `sugars`, `protein`) VALUES (2, 'Snickers Bar (44g)', 215, 0, 11, 6, 0.2, 4, 83, 0, 28, 0.8, 20, 3);
INSERT INTO `nutritional_values` (`id`, `name_and_amount`, `calories`, `calories_from_fat`, `total_fat`, `saturated_fat`, `trans_fat`, `cholesterol`, `sodium`, `potassium`, `total_carbohydrate`, `dietary_fiber`, `sugars`, `protein`) VALUES (3, 'Brown Rice (195g)', 216, 0, 1.8, 0.4, 0, 0, 10, 84, 45, 3.5, 0.7, 5);
INSERT INTO `nutritional_values` (`id`, `name_and_amount`, `calories`, `calories_from_fat`, `total_fat`, `saturated_fat`, `trans_fat`, `cholesterol`, `sodium`, `potassium`, `total_carbohydrate`, `dietary_fiber`, `sugars`, `protein`) VALUES (4, 'Broccoli (148g)', 50, 0, 0.5, 0.1, 0, 0, 49, 468, 10, 3.8, 2.5, 4.2);

COMMIT;


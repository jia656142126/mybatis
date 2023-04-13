/*
Navicat MySQL Data Transfer

Source Server         : 192.168.1.112
Source Server Version : 50740
Source Host           : 192.168.1.112:3306
Source Database       : mydb

Target Server Type    : MYSQL
Target Server Version : 50740
File Encoding         : 65001

Date: 2023-04-13 11:04:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', 'wangzhenjia', '14');
INSERT INTO `student` VALUES ('3', 'wang', '13');

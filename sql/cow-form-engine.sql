/*
 Navicat Premium Data Transfer

 Source Server         : local_mysql
 Source Server Type    : MySQL
 Source Server Version : 50717
 Source Host           : localhost
 Source Database       : cow-form-engine

 Target Server Type    : MySQL
 Target Server Version : 50717
 File Encoding         : utf-8

 Date: 12/12/2018 22:49:49 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `biz_first`
-- ----------------------------
DROP TABLE IF EXISTS `biz_first`;
CREATE TABLE `biz_first` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(64) DEFAULT NULL,
  `a` varchar(64) DEFAULT NULL,
  `b` varchar(64) DEFAULT NULL,
  `c` varchar(64) DEFAULT NULL,
  `d` varchar(64) DEFAULT NULL,
  `e` varchar(64) DEFAULT NULL,
  `f` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `biz_first_meta`
-- ----------------------------
DROP TABLE IF EXISTS `biz_first_meta`;
CREATE TABLE `biz_first_meta` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(64) DEFAULT NULL,
  `parent_code` varchar(64) DEFAULT NULL,
  `c_name` varchar(64) DEFAULT NULL,
  `c_type` varchar(64) DEFAULT NULL,
  `length` int(8) DEFAULT NULL,
  `is_null` int(2) DEFAULT NULL,
  `is_enable` int(2) DEFAULT NULL,
  `is_query` int(2) DEFAULT NULL,
  `field_name` varchar(64) DEFAULT NULL,
  `field_type` varchar(64) DEFAULT NULL,
  `field_cn_name` varchar(64) DEFAULT NULL,
  `source_type` int(2) DEFAULT NULL,
  `source_value` varchar(64) DEFAULT NULL,
  `view_json` varchar(256) DEFAULT NULL,
  `valid_rule` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `biz_first_meta`
-- ----------------------------
BEGIN;
INSERT INTO `biz_first_meta` VALUES ('1', '123', '', 'a', 'varchar', '32', '0', '1', '1', 'field_a', 'String', '字段a', '0', null, null, null), ('2', '234', null, 'b', 'varchar', '32', '0', '1', '1', 'field_b', 'String', '字段b', '0', null, null, null), ('3', '345', null, 'c', 'varchar', '32', '0', '1', '1', 'field_c', 'String', '字段c', '0', null, null, null);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;

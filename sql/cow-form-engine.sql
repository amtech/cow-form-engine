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

 Date: 12/12/2018 21:50:24 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `order`
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_no` varchar(32) NOT NULL COMMENT '订单号',
  `order_amount` double(16,2) NOT NULL COMMENT '订单金额',
  `order_address` varchar(64) NOT NULL COMMENT '订单地址',
  `commodity_no` varchar(32) NOT NULL COMMENT '商品编号',
  `commoditf_quantity` int(8) NOT NULL COMMENT '商品数量',
  `order_date` datetime NOT NULL COMMENT '订单日期',
  `order_payer` varchar(32) NOT NULL COMMENT '订单付款人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `order_meta`
-- ----------------------------
DROP TABLE IF EXISTS `order_meta`;
CREATE TABLE `order_meta` (
  `column_name` varchar(64) NOT NULL COMMENT '数据表列名',
  `column_type` varchar(32) NOT NULL COMMENT '表字段类型',
  `column_length` int(8) NOT NULL COMMENT '表字段长度',
  `column_null` int(2) NOT NULL COMMENT '表字段是否可以为空。0：可以为空；1：不可以为空',
  `column_enable` int(2) NOT NULL COMMENT '表字段是否启用。0：不启用；1：启用。',
  `field_zh_cn_name` varchar(32) NOT NULL COMMENT '字段中文名',
  `field_en_us_name` varchar(32) NOT NULL COMMENT '字段英文名',
  `column_query_enable` int(2) NOT NULL COMMENT '表字段是否是查询条件s'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;

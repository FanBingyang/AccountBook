/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50527
 Source Host           : localhost:3306
 Source Schema         : bill

 Target Server Type    : MySQL
 Target Server Version : 50527
 File Encoding         : 65001

 Date: 05/08/2021 19:06:59
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for expense
-- ----------------------------
DROP TABLE IF EXISTS `expense`;
CREATE TABLE `expense`  (
  `expense_id` int(255) NOT NULL AUTO_INCREMENT,
  `open_id` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `expense_title` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '消费标题',
  `expense_category` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '消费类型',
  `expense_money` float(255, 2) NOT NULL DEFAULT 0.00 COMMENT '消费金额',
  `expense_explain` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '消费备注',
  `expense_time` varchar(200) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL COMMENT '消费时间 年-月-日 时:分:秒',
  PRIMARY KEY (`expense_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 91 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of expense
-- ----------------------------
INSERT INTO `expense` VALUES (2, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', NULL, '零食', 10.01, NULL, '2019-09-18 22:20:46');
INSERT INTO `expense` VALUES (3, '789', NULL, '交通', 20.11, NULL, '2019-07-27 22:20:47');
INSERT INTO `expense` VALUES (4, '789', NULL, '住宿', 30.20, NULL, '2019-08-27 22:20:47');
INSERT INTO `expense` VALUES (5, '789', NULL, '餐饮', 40.00, NULL, '2019-08-27 22:20:47');
INSERT INTO `expense` VALUES (6, '789', NULL, '娱乐', 50.00, NULL, '2019-08-27 22:20:47');
INSERT INTO `expense` VALUES (7, '789', NULL, '服装', 60.00, NULL, '2019-08-27 22:20:47');
INSERT INTO `expense` VALUES (8, '789', NULL, '日常', 70.00, NULL, '2019-08-27 22:20:47');
INSERT INTO `expense` VALUES (9, '789', NULL, '其他', 80.00, NULL, '2019-08-27 22:20:47');
INSERT INTO `expense` VALUES (10, '789', NULL, '零食', 10.00, NULL, '2019-08-27 22:21:03');
INSERT INTO `expense` VALUES (11, '789', NULL, '交通', 20.00, NULL, '2019-08-27 22:21:03');
INSERT INTO `expense` VALUES (12, '789', NULL, '住宿', 30.00, NULL, '2019-08-27 22:21:03');
INSERT INTO `expense` VALUES (13, '789', NULL, '餐饮', 40.00, NULL, '2019-08-27 22:21:03');
INSERT INTO `expense` VALUES (14, '789', NULL, '娱乐', 50.00, NULL, '2019-08-27 22:21:03');
INSERT INTO `expense` VALUES (15, '789', NULL, '服装', 60.00, NULL, '2019-08-27 22:21:03');
INSERT INTO `expense` VALUES (16, '789', NULL, '日常', 70.00, NULL, '2019-08-27 22:21:03');
INSERT INTO `expense` VALUES (17, '789', NULL, '其他', 80.00, NULL, '2019-08-27 22:21:03');
INSERT INTO `expense` VALUES (18, '789', NULL, '零食', 10.00, NULL, '2019-08-27 22:23:08');
INSERT INTO `expense` VALUES (19, '789', NULL, '交通', 20.00, NULL, '2019-08-27 22:23:08');
INSERT INTO `expense` VALUES (20, '789', NULL, '住宿', 30.00, NULL, '2019-08-27 22:23:08');
INSERT INTO `expense` VALUES (21, '789', NULL, '餐饮', 40.00, NULL, '2019-08-27 22:23:08');
INSERT INTO `expense` VALUES (22, '789', NULL, '娱乐', 50.00, NULL, '2019-08-27 22:23:08');
INSERT INTO `expense` VALUES (23, '789', NULL, '服装', 60.00, NULL, '2019-08-27 22:23:08');
INSERT INTO `expense` VALUES (24, '789', NULL, '日常', 70.00, NULL, '2019-08-27 22:23:08');
INSERT INTO `expense` VALUES (25, '789', NULL, '其他', 80.00, NULL, '2019-08-27 22:23:08');
INSERT INTO `expense` VALUES (26, '456', '2019-08-27 22:26:58', '零食', 20.00, NULL, '2019-08-27 22:26:08');
INSERT INTO `expense` VALUES (28, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '测试2', '交通', 10.50, '坐车咯', '2019-09-20 17:16:50');
INSERT INTO `expense` VALUES (29, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '测试3', '其他', 25.20, 'emmmmmmm', '2019-09-20 17:36:12');
INSERT INTO `expense` VALUES (30, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '测试5', '零食', 22.00, 'asfdbfn', '2019-09-20 17:42:29');
INSERT INTO `expense` VALUES (31, '', '2019-09-20 18:00:12', '零食', 100.00, NULL, '2019-09-20 18:00:12');
INSERT INTO `expense` VALUES (32, '', '2019-09-20 18:00:12', '住宿', 400.00, NULL, '2019-09-20 18:00:12');
INSERT INTO `expense` VALUES (33, '', '2019-09-20 18:00:12', '其他', 20.00, NULL, '2019-09-20 18:00:12');
INSERT INTO `expense` VALUES (34, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '2019-09-20 18:03:17', '交通', 200.00, NULL, '2019-09-20 18:03:17');
INSERT INTO `expense` VALUES (35, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '2019-09-20 18:03:17', '住宿', 400.00, NULL, '2019-09-20 18:03:17');
INSERT INTO `expense` VALUES (36, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '2019-09-20 18:03:17', '餐饮', 300.00, NULL, '2019-09-20 18:03:17');
INSERT INTO `expense` VALUES (37, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '2019-09-20 18:03:17', '其他', 20.00, NULL, '2019-09-20 18:03:17');
INSERT INTO `expense` VALUES (38, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '2019-09-20 18:13:12', '零食', 20.00, NULL, '2019-09-20 18:13:12');
INSERT INTO `expense` VALUES (39, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '2019-09-20 18:13:12', '交通', 50.00, NULL, '2019-09-20 18:13:12');
INSERT INTO `expense` VALUES (40, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '2019-09-20 18:13:12', '住宿', 215.00, NULL, '2019-09-20 18:13:12');
INSERT INTO `expense` VALUES (41, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '2019-09-20 18:32:20', '其他', 0.30, NULL, '2019-09-20 18:32:20');
INSERT INTO `expense` VALUES (42, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '2019-09-20 18:32:38', '其他', 12.00, NULL, '2019-09-20 18:32:38');
INSERT INTO `expense` VALUES (43, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '2019-09-20 18:38:36', '其他', 5.00, NULL, '2019-09-20 18:38:36');
INSERT INTO `expense` VALUES (44, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '2019-09-20 18:39:05', '其他', 50.00, NULL, '2019-09-20 18:39:05');
INSERT INTO `expense` VALUES (45, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '2019-09-20 18:40:41', '其他', 55.00, NULL, '2019-09-20 18:40:41');
INSERT INTO `expense` VALUES (46, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '嗯呢', '其他', 20.00, '哈哈你哈奥不会是地方积极暗示办公室阿萨哈顺丰单号是', '2019-09-23 17:37:38');
INSERT INTO `expense` VALUES (47, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '啊士大', '其他', 50.00, '无', '2019-09-23 17:37:59');
INSERT INTO `expense` VALUES (48, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '2019-09-23 17:39:07', '其他', 20.85, '无', '2019-09-23 17:39:07');
INSERT INTO `expense` VALUES (49, '456', '2019-09-28 11:29:40', '其他', 100.00, NULL, '2019-09-28 11:29:40');
INSERT INTO `expense` VALUES (50, '456', '2019-09-28 11:31:55', '零食', 100.00, NULL, '2019-09-28 11:31:55');
INSERT INTO `expense` VALUES (51, '456', '2019-09-28 11:35:13', '交通', 2.00, NULL, '2019-09-28 11:35:13');
INSERT INTO `expense` VALUES (52, '456', '2019-09-28 11:39:23', '其他', 1.00, NULL, '2019-09-28 11:39:23');
INSERT INTO `expense` VALUES (53, '456', '2019-09-28 11:44:06', '其他', 1.00, NULL, '2019-09-28 11:44:06');
INSERT INTO `expense` VALUES (54, '456', '2019-09-28 11:44:36', '其他', 1.00, NULL, '2019-09-28 11:44:36');
INSERT INTO `expense` VALUES (55, '456', '2019-09-28 11:48:40', '其他', 1.00, NULL, '2019-09-28 11:48:40');
INSERT INTO `expense` VALUES (56, '456', '2019-09-28 11:51:51', '日常', 1.00, NULL, '2019-09-28 11:51:51');
INSERT INTO `expense` VALUES (57, '456', '2019-09-28 11:52:02', '娱乐', 1.00, NULL, '2019-09-28 11:52:02');
INSERT INTO `expense` VALUES (58, '456', '2019-09-28 11:52:02', '服装', 1.00, NULL, '2019-09-28 11:52:02');
INSERT INTO `expense` VALUES (59, '456', '2019-09-28 11:52:02', '日常', 1.00, NULL, '2019-09-28 11:52:02');
INSERT INTO `expense` VALUES (60, '456', '2019-09-28 14:12:23', '其他', 20.00, NULL, '2019-09-28 14:12:23');
INSERT INTO `expense` VALUES (61, '456', '2019-09-28 14:42:54', '其他', 200.00, NULL, '2019-09-28 14:42:54');
INSERT INTO `expense` VALUES (62, '456', '2019-09-28 14:54:00', '住宿', 50.00, NULL, '2019-09-28 14:54:00');
INSERT INTO `expense` VALUES (63, '456', '2019-09-28 14:57:59', '交通', 60.00, NULL, '2019-09-28 14:57:59');
INSERT INTO `expense` VALUES (64, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '2019-09-28 15:12:38', '娱乐', 12.00, NULL, '2019-09-28 15:12:38');
INSERT INTO `expense` VALUES (65, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '2019-09-28 15:12:38', '服装', 12.00, NULL, '2019-09-28 15:12:38');
INSERT INTO `expense` VALUES (66, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', NULL, '住宿', 100.00, NULL, '2019-09-28 15:22:08');
INSERT INTO `expense` VALUES (67, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '', '餐饮', 50.00, '', '2019-09-28 15:25:09');
INSERT INTO `expense` VALUES (68, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', NULL, '零食', 20.00, NULL, '2019-09-28 15:32:34');
INSERT INTO `expense` VALUES (69, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '2019-09-28', '其他', 10.00, '无', '2019-09-28 15:33:24');
INSERT INTO `expense` VALUES (70, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '2019-09-28', '零食', 10.00, '无', '2019-09-28 15:35:38');
INSERT INTO `expense` VALUES (71, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '2019-09-28', '零食', 50.00, '无', '2019-09-28 15:37:01');
INSERT INTO `expense` VALUES (72, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', NULL, '服装', 20.00, NULL, '2019-09-28 15:37:39');
INSERT INTO `expense` VALUES (73, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', 'asd', '餐饮', 20.00, '', '2019-09-28 15:39:42');
INSERT INTO `expense` VALUES (74, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '2019-09-28', '娱乐', 10.00, '无', '2019-09-28 15:42:33');
INSERT INTO `expense` VALUES (75, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '2019-09-28', '日常', 15.00, '无', '2019-09-28 15:44:36');
INSERT INTO `expense` VALUES (76, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '2019-09-28', '交通', 50.00, '无', '2019-09-28 15:45:32');
INSERT INTO `expense` VALUES (77, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', 'lalal', '交通', 50.00, '无', '2019-09-28 15:58:24');
INSERT INTO `expense` VALUES (78, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', 'cehsi', '其他', 20.00, '测试添加时返回数据', '2019-09-28 16:13:07');
INSERT INTO `expense` VALUES (79, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '测试9', '其他', 20.00, '测试返回数据', '2019-09-28 16:13:55');
INSERT INTO `expense` VALUES (82, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '2019-09-28', '住宿', 50.00, '测试1的消费', '2019-09-28 16:16:38');
INSERT INTO `expense` VALUES (83, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '2019-09-28', '其他', 10.00, '测试1的消费', '2019-09-28 16:16:38');
INSERT INTO `expense` VALUES (84, 'null', '2019-10-03', '其他', 0.00, '无', '2019-10-03 14:44:10');
INSERT INTO `expense` VALUES (85, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '2019-10-05 21:27:07', '零食', 20.00, '无的消费', '2019-10-05 21:27:07');
INSERT INTO `expense` VALUES (86, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '2019-10-05 21:27:07', '其他', 30.00, '无的消费', '2019-10-05 21:27:07');
INSERT INTO `expense` VALUES (87, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '2019-10-06', '娱乐', 20.00, '无标题测试', '2019-10-06 12:35:12');
INSERT INTO `expense` VALUES (88, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '2019-10-06', '交通', 20.00, '无的消费', '2019-10-06 12:37:22');
INSERT INTO `expense` VALUES (89, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '2019-10-06', '服装', 100.00, '无的消费', '2019-10-06 12:37:22');
INSERT INTO `expense` VALUES (90, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '2019-10-06', '零食', 50.00, '测试创建账单备注的写入的消费', '2019-10-06 12:40:48');

-- ----------------------------
-- Table structure for monthly_bill
-- ----------------------------
DROP TABLE IF EXISTS `monthly_bill`;
CREATE TABLE `monthly_bill`  (
  `monthly_id` int(255) NOT NULL AUTO_INCREMENT COMMENT '账单id',
  `open_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `monthly_snacks` float(255, 2) NULL DEFAULT 0.00 COMMENT '零食',
  `monthly_fare` float(255, 2) NULL DEFAULT 0.00 COMMENT '出行',
  `monthly_stay` float(255, 2) NULL DEFAULT 0.00 COMMENT '住宿',
  `monthly_repast` float(255, 2) NULL DEFAULT 0.00 COMMENT '餐饮',
  `monthly_recreation` float(255, 2) NULL DEFAULT 0.00 COMMENT '娱乐',
  `monthly_clothing` float(255, 2) NULL DEFAULT 0.00 COMMENT '服装',
  `monthly_daily` float(255, 2) NULL DEFAULT 0.00 COMMENT '日常',
  `monthly_other` float(255, 2) NULL DEFAULT 0.00 COMMENT '其他',
  `monthly_total` float(255, 2) NOT NULL DEFAULT 0.00 COMMENT '账单总金额',
  `monthly_time` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '账单时间。年-月',
  PRIMARY KEY (`monthly_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of monthly_bill
-- ----------------------------
INSERT INTO `monthly_bill` VALUES (1, '123', 10.00, 20.00, 30.00, 40.00, 50.00, 60.00, 70.00, 80.00, 360.00, '2019-08');
INSERT INTO `monthly_bill` VALUES (10, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', 30.00, 60.00, 90.00, 120.00, 150.00, 180.00, 210.00, 240.00, 1080.00, '2018-07');
INSERT INTO `monthly_bill` VALUES (11, '789', 10.00, 20.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 30.00, '2019-07');
INSERT INTO `monthly_bill` VALUES (12, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', 20.00, 80.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 112.00, '2019-08');

-- ----------------------------
-- Table structure for scene
-- ----------------------------
DROP TABLE IF EXISTS `scene`;
CREATE TABLE `scene`  (
  `scene_id` int(255) NOT NULL AUTO_INCREMENT,
  `open_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `scene_title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '情景账单名称',
  `scene_snacks` float(255, 2) NULL DEFAULT 0.00 COMMENT '零食',
  `scene_fare` float(255, 2) NULL DEFAULT 0.00 COMMENT '交通',
  `scene_stay` float(255, 2) NULL DEFAULT 0.00 COMMENT '住宿',
  `scene_repast` float(255, 2) NULL DEFAULT 0.00 COMMENT '餐饮',
  `scene_recreation` float(255, 2) NULL DEFAULT 0.00 COMMENT '娱乐',
  `scene_clothing` float(255, 2) NULL DEFAULT 0.00 COMMENT '服装',
  `scene_daily` float(255, 2) NULL DEFAULT 0.00 COMMENT '日常',
  `scene_other` float(255, 2) NULL DEFAULT 0.00 COMMENT '其他',
  `scene_total` float(255, 2) NULL DEFAULT 0.00 COMMENT '账单总金额',
  `scene_explain` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '账单备注',
  `scene_time` varchar(200) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL COMMENT '账单创建时间 年-月-日 时:分:秒',
  PRIMARY KEY (`scene_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 19 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of scene
-- ----------------------------
INSERT INTO `scene` VALUES (1, '123', '第一次测试', 10.00, 20.00, 30.00, 40.00, 50.00, 0.00, 70.00, 80.00, 300.00, 'lallala', '2019-07-27 16:51:30');
INSERT INTO `scene` VALUES (2, '123', '第2次测试', 10.00, 0.00, 30.00, 40.00, 50.00, 60.00, 70.00, 80.00, 340.00, NULL, '2019-08-27 16:52:40');
INSERT INTO `scene` VALUES (3, '456', '第3次测试', 10.00, 20.00, 0.00, 40.00, 50.00, 60.00, 70.00, 80.00, 330.00, '哈哈', '2019-08-27 16:53:31');
INSERT INTO `scene` VALUES (4, '456', 'aa', 0.00, 2.00, 3.00, 4.00, 5.00, 6.00, 7.00, 8.00, 35.00, 'll', '2019-08-27');
INSERT INTO `scene` VALUES (5, '456', '第4次测试', 110.00, 82.00, 80.00, 40.00, 51.00, 61.00, 72.00, 404.00, 900.00, '测试', '2019-08-27 17:08:24');
INSERT INTO `scene` VALUES (6, '456', '第5次测试', 40.00, 20.00, 60.00, 80.00, 100.00, 120.00, 140.00, 160.00, 1420.00, NULL, '2019-08-27 17:09:13');
INSERT INTO `scene` VALUES (7, '789', '第7次测试', 10.00, 20.00, 30.00, 40.00, 50.00, 60.00, 70.00, 80.00, 710.00, '哈哈', '2019-08-27 18:46:38');
INSERT INTO `scene` VALUES (8, '789', '第8次测试', 10.00, 20.00, 30.00, 40.00, 50.00, 60.00, 70.00, 80.00, 360.00, 'emmmm', '2019-08-27 22:23:08');
INSERT INTO `scene` VALUES (9, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '2019-09-20 18:1', 20.00, 50.00, 215.00, 0.00, 0.00, 0.00, 0.00, 0.00, 285.00, '无', '2019-09-20 18:13:12');
INSERT INTO `scene` VALUES (11, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '2019-09-20 18:3', 20.00, 50.00, 0.00, 0.00, 12.00, 12.00, 0.00, 12.00, 106.00, '无', '2019-09-20 18:32:38');
INSERT INTO `scene` VALUES (12, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '2019-09-20 18:3', 0.00, 0.00, 100.00, 20.00, 10.00, 20.00, 15.00, 5.00, 170.00, '无', '2019-09-20 18:38:36');
INSERT INTO `scene` VALUES (13, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '2019-09-20 18:3', 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 50.00, 50.00, '无', '2019-09-20 18:39:05');
INSERT INTO `scene` VALUES (14, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '2019-09-20 18:4', 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 55.00, 55.00, '无', '2019-09-20 18:40:41');
INSERT INTO `scene` VALUES (15, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '测试1', 30.00, 10.00, 50.00, 0.00, 0.00, 0.00, 0.00, 10.00, 100.00, '无', '2019-09-28 16:16:38');
INSERT INTO `scene` VALUES (16, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '第二次测试', 20.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 30.00, 50.00, '无', '2019-10-05 21:27:07');
INSERT INTO `scene` VALUES (17, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '第三次测试', 0.00, 20.00, 0.00, 0.00, 0.00, 100.00, 0.00, 0.00, 120.00, '无', '2019-10-06 12:37:22');
INSERT INTO `scene` VALUES (18, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '第三次测试', 50.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 50.00, '测试创建账单备注的写入', '2019-10-06 12:40:48');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `custom_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '开发者给用户自定义的id',
  `open_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `nick_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `gender` int(20) NOT NULL COMMENT '0:未知;1:男性;2:女性;',
  `avatarUrl` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户头像',
  `address` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户地区',
  `user_time` datetime NULL DEFAULT NULL,
  `login_status` int(20) NULL DEFAULT 1 COMMENT '1:登录;2:未登录',
  PRIMARY KEY (`custom_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (2, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', '无名', 1, 'https://wx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTIumVBWFYf7anbalxNFy6C8aSzz61jibaPY7mzO49iacTBBTziaPErh7iad1CvBsgrv3DNEFvAubibicg7w/132', 'China/Henan/Zhengzhou', '2019-10-04 18:03:28', 1);

-- ----------------------------
-- Table structure for yearly_bill
-- ----------------------------
DROP TABLE IF EXISTS `yearly_bill`;
CREATE TABLE `yearly_bill`  (
  `yearly_id` int(255) NOT NULL AUTO_INCREMENT COMMENT '账单id',
  `open_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `yearly_snacks` float(255, 2) NULL DEFAULT 0.00 COMMENT '零食',
  `yearly_fare` float(255, 2) NULL DEFAULT 0.00 COMMENT '出行',
  `yearly_stay` float(255, 2) NULL DEFAULT 0.00 COMMENT '住宿',
  `yearly_repast` float(255, 2) NULL DEFAULT 0.00 COMMENT '餐饮',
  `yearly_recreation` float(255, 2) NULL DEFAULT 0.00 COMMENT '娱乐',
  `yearly_clothing` float(255, 2) NULL DEFAULT 0.00 COMMENT '服装',
  `yearly_daily` float(255, 2) NULL DEFAULT 0.00 COMMENT '日常',
  `yearly_other` float(255, 2) NULL DEFAULT 0.00 COMMENT '其他',
  `yearly_total` float(255, 2) NOT NULL DEFAULT 0.00 COMMENT '账单总金额',
  `yearly_time` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '账单时间。年',
  PRIMARY KEY (`yearly_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of yearly_bill
-- ----------------------------
INSERT INTO `yearly_bill` VALUES (1, 'oTOo346itIOj1Z8Jk2kATZMQh4Tc', 30.00, 61.00, 90.00, 120.00, 150.00, 180.00, 209.00, 240.00, 1080.00, '2018');

SET FOREIGN_KEY_CHECKS = 1;

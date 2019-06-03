/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2019-06-03 18:27:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `essay`
-- ----------------------------
DROP TABLE IF EXISTS `essay`;
CREATE TABLE `essay` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` text NOT NULL,
  `username` varchar(255) NOT NULL,
  `viewCount` int(11) NOT NULL,
  `remarkCount` int(11) NOT NULL,
  `collectCount` int(11) NOT NULL,
  `titleid` int(11) NOT NULL,
  `date` date NOT NULL,
  PRIMARY KEY (`id`),
  KEY `username` (`username`),
  CONSTRAINT `essay_ibfk_1` FOREIGN KEY (`username`) REFERENCES `users` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=85 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of essay
-- ----------------------------
INSERT INTO `essay` VALUES ('53', 'admin的测试文章10', 'admin', '550058', '816899', '346382', '754376', '2018-07-23');
INSERT INTO `essay` VALUES ('54', '测试文章', 'admin', '148321', '897897', '574804', '243557', '2018-07-23');
INSERT INTO `essay` VALUES ('55', 'fsdfds', 'admin', '194468', '576879', '328477', '737659', '2018-07-24');
INSERT INTO `essay` VALUES ('56', '测试文章1', 'admin', '2534', '234', '234', '2344', '2019-03-13');
INSERT INTO `essay` VALUES ('57', '测试文章2', 'admin', '532785', '386711', '431354', '346017', '2019-03-11');
INSERT INTO `essay` VALUES ('58', '测试文章3', 'admin', '627834', '461728', '484450', '719142', '2019-03-11');
INSERT INTO `essay` VALUES ('59', '测试文章4', 'admin', '386743', '87774', '405078', '848899', '2019-03-11');
INSERT INTO `essay` VALUES ('60', '测试文章5', 'admin', '110899', '67332', '194195', '565058', '2019-03-11');
INSERT INTO `essay` VALUES ('61', '测试文章6', 'admin', '296636', '462102', '244169', '506906', '2019-03-11');
INSERT INTO `essay` VALUES ('62', '测试文章7', 'admin', '237103', '579724', '146425', '376707', '2019-03-11');
INSERT INTO `essay` VALUES ('63', '测试文章8', 'admin', '533320', '183285', '976825', '782375', '2019-03-11');
INSERT INTO `essay` VALUES ('64', '测试文章9', 'admin', '871632', '529606', '928531', '212055', '2019-03-11');
INSERT INTO `essay` VALUES ('65', '测试文章10', 'admin', '38922', '81541', '229357', '784901', '2019-03-11');
INSERT INTO `essay` VALUES ('66', '测试文章11', 'admin', '979445', '834229', '448804', '778908', '2019-03-11');
INSERT INTO `essay` VALUES ('67', '测试文章12', 'admin', '690439', '80435', '669459', '381759', '2019-03-11');
INSERT INTO `essay` VALUES ('68', '测试文章13', 'admin', '8082', '973192', '698820', '251877', '2019-03-11');
INSERT INTO `essay` VALUES ('69', '测试文章14', 'admin', '282600', '471802', '464091', '179127', '2019-03-11');
INSERT INTO `essay` VALUES ('70', '测试文章15', 'admin', '193318', '489190', '584784', '776104', '2019-03-11');
INSERT INTO `essay` VALUES ('71', '测试文章16', 'admin', '885422', '390782', '423284', '444136', '2019-03-11');
INSERT INTO `essay` VALUES ('72', '我的文章3', 'meng', '5345', '3453', '5343', '12123', '2019-03-06');
INSERT INTO `essay` VALUES ('73', '我的文章12', 'meng', '432324', '123', '12343', '124', '2019-03-04');
INSERT INTO `essay` VALUES ('74', '我的文章11', 'meng', '23423', '532', '52', '253', '2019-03-04');
INSERT INTO `essay` VALUES ('75', '我的文章10', 'meng', '12312', '4234', '5454', '234', '2019-03-05');
INSERT INTO `essay` VALUES ('76', '我的文章9', 'meng', '12343', '532', '235', '235', '2019-03-05');
INSERT INTO `essay` VALUES ('77', '我的文章8', 'meng', '324', '543', '345', '53421', '2019-03-05');
INSERT INTO `essay` VALUES ('78', '我的文章7', 'meng', '432', '23454', '432', '234', '2019-03-05');
INSERT INTO `essay` VALUES ('79', '我的文章6', 'meng', '5433', '114', '4234', '5322', '2019-03-05');
INSERT INTO `essay` VALUES ('80', '我的文章5', 'meng', '325', '23542', '1212', '4533', '2019-03-04');
INSERT INTO `essay` VALUES ('81', '我的文章4', 'meng', '534', '345', '65', '54311', '2019-03-04');
INSERT INTO `essay` VALUES ('82', '我的文章3', 'meng', '534', '112', '1244', '232', '2019-03-05');
INSERT INTO `essay` VALUES ('83', '我的文章2', 'meng', '4333', '1122', '442', '4212', '2019-03-05');
INSERT INTO `essay` VALUES ('84', '我的文章1', 'meng', '423', '221', '111', '222', '2019-03-05');

-- ----------------------------
-- Table structure for `heart`
-- ----------------------------
DROP TABLE IF EXISTS `heart`;
CREATE TABLE `heart` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` text NOT NULL,
  `username` varchar(255) NOT NULL,
  `viewCount` int(11) NOT NULL,
  `remarkCount` int(11) NOT NULL,
  `collectCount` int(11) NOT NULL,
  `titleid` int(11) NOT NULL,
  `date` date NOT NULL,
  PRIMARY KEY (`id`),
  KEY `username` (`username`),
  CONSTRAINT `heart_ibfk_1` FOREIGN KEY (`username`) REFERENCES `users_information` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of heart
-- ----------------------------
INSERT INTO `heart` VALUES ('6', '12312', 'admin', '123', '123', '123', '123', '2018-07-27');
INSERT INTO `heart` VALUES ('9', '我的心得2', 'test2', '1235', '3457', '4356', '3453', '2018-07-22');
INSERT INTO `heart` VALUES ('10', '我的心得3', 'test3', '1254', '223', '553', '6456', '2018-07-20');
INSERT INTO `heart` VALUES ('11', '我的心得4', 'test4', '543', '4325', '4355', '23464', '2018-07-19');
INSERT INTO `heart` VALUES ('13', '我的心得6', 'test6', '2344', '3245', '5435', '2344', '2018-07-27');
INSERT INTO `heart` VALUES ('14', '我的心得7', 'test7', '666', '444', '333', '2222', '2018-07-27');
INSERT INTO `heart` VALUES ('15', '8我的心得', 'test8', '441', '111', '222', '333', '2018-08-25');
INSERT INTO `heart` VALUES ('16', '我的心得9', 'test9', '423', '544', '2223', '43246', '2018-07-19');
INSERT INTO `heart` VALUES ('18', '你你你你你你你你你', 'admin', '261186', '340982', '869133', '474972', '2018-07-21');
INSERT INTO `heart` VALUES ('19', 'admin的心得1', 'admin', '203689', '575851', '336741', '835177', '2018-07-23');
INSERT INTO `heart` VALUES ('20', 'admin的心得2', 'admin', '42837', '454775', '427376', '412490', '2018-07-23');
INSERT INTO `heart` VALUES ('21', 'admin的心得3', 'admin', '886104', '952860', '99537', '446416', '2018-07-23');
INSERT INTO `heart` VALUES ('23', 'admin的心得5', 'admin', '743409', '55624', '373525', '393327', '2018-07-23');
INSERT INTO `heart` VALUES ('24', 'admin的心得6', 'admin', '473828', '714046', '511125', '810181', '2018-07-23');
INSERT INTO `heart` VALUES ('25', 'admin的心得7', 'admin', '781427', '205730', '882083', '943176', '2018-07-23');
INSERT INTO `heart` VALUES ('26', 'admin的心得8', 'admin', '833217', '792761', '948868', '692745', '2018-07-23');
INSERT INTO `heart` VALUES ('27', 'admin的心得9', 'admin', '230189', '794615', '849399', '71503', '2018-07-23');
INSERT INTO `heart` VALUES ('28', '测试心得111', 'admin', '102440', '646560', '516228', '800118', '2018-07-23');
INSERT INTO `heart` VALUES ('29', '难受呀啊啊啊啊', 'meng', '123', '123', '43', '32423', '2019-03-20');
INSERT INTO `heart` VALUES ('30', '心得14', 'meng', '43242', '23424', '2342', '23432', '2019-03-20');
INSERT INTO `heart` VALUES ('31', '心得13', 'meng', '53543', '234', '234', '5235', '2019-04-19');
INSERT INTO `heart` VALUES ('32', '心得12', 'meng', '213', '433', '32', '32', '2019-03-12');
INSERT INTO `heart` VALUES ('33', '心得11', 'meng', '5345', '34534', '323432', '3123', '2019-03-13');
INSERT INTO `heart` VALUES ('34', '心得10', 'meng', '534', '345', '456456', '456452', '2019-03-05');
INSERT INTO `heart` VALUES ('35', '心得9', 'meng', '4234', '6565', '87867', '765', '2019-02-05');
INSERT INTO `heart` VALUES ('36', '心得8', 'meng', '12321', '54543', '453', '2342', '2019-03-06');
INSERT INTO `heart` VALUES ('39', '心得7', 'meng', '23', '32', '42', '11', '2019-03-11');
INSERT INTO `heart` VALUES ('40', '心得6', 'meng', '543', '765765', '45645', '4565', '2019-03-05');
INSERT INTO `heart` VALUES ('41', '心得5', 'meng', '5434', '34234', '23234', '5756', '2019-03-20');
INSERT INTO `heart` VALUES ('42', '心得4', 'meng', '543', '23', '12', '235', '2019-03-13');
INSERT INTO `heart` VALUES ('43', '心得3', 'meng', '6545', '4645', '45645', '544', '2019-02-14');
INSERT INTO `heart` VALUES ('44', '心得2', 'meng', '435', '432', '123', '2133', '2019-03-06');
INSERT INTO `heart` VALUES ('45', '心得1', 'meng', '435', '534', '345', '34522', '2019-03-05');

-- ----------------------------
-- Table structure for `mygroup`
-- ----------------------------
DROP TABLE IF EXISTS `mygroup`;
CREATE TABLE `mygroup` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `myname` varchar(255) NOT NULL,
  `hisname` varchar(255) NOT NULL,
  `relationship` varchar(255) NOT NULL COMMENT '有同事，同学，学生，老师4种关系',
  PRIMARY KEY (`id`),
  KEY `myname` (`myname`),
  KEY `hisname` (`hisname`),
  CONSTRAINT `mygroup_ibfk_1` FOREIGN KEY (`myname`) REFERENCES `users_information` (`username`),
  CONSTRAINT `mygroup_ibfk_2` FOREIGN KEY (`hisname`) REFERENCES `users_information` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of mygroup
-- ----------------------------
INSERT INTO `mygroup` VALUES ('15', 'admin', 'test2', '学生');
INSERT INTO `mygroup` VALUES ('16', 'test3', 'admin', '老师');
INSERT INTO `mygroup` VALUES ('17', 'admin', 'test3', '学生');
INSERT INTO `mygroup` VALUES ('18', 'test4', 'admin', '老师');
INSERT INTO `mygroup` VALUES ('19', 'admin', 'test4', '学生');
INSERT INTO `mygroup` VALUES ('20', 'admin', 'lin', '学生');
INSERT INTO `mygroup` VALUES ('21', 'admin', 'long', '学生');
INSERT INTO `mygroup` VALUES ('25', 'admin', 'yong', '学生');
INSERT INTO `mygroup` VALUES ('27', 'meng', 'admin', '同事');
INSERT INTO `mygroup` VALUES ('28', 'admin', 'meng', '同事');
INSERT INTO `mygroup` VALUES ('29', 'meng', 'long', '同学');
INSERT INTO `mygroup` VALUES ('30', 'meng', 'lin', '同学');
INSERT INTO `mygroup` VALUES ('32', 'meng', 'yong', '同学');
INSERT INTO `mygroup` VALUES ('33', 'meng', 'yu', '同学');
INSERT INTO `mygroup` VALUES ('34', 'meng', 'wei', '同学');

-- ----------------------------
-- Table structure for `td_message`
-- ----------------------------
DROP TABLE IF EXISTS `td_message`;
CREATE TABLE `td_message` (
  `td_id` int(11) NOT NULL AUTO_INCREMENT,
  `td_addresseeid` int(11) NOT NULL,
  `td_content` text NOT NULL,
  `delete_flag` int(11) NOT NULL,
  `td_sendid` int(11) NOT NULL,
  `time` date NOT NULL,
  PRIMARY KEY (`td_id`),
  KEY `td_addresseeid` (`td_addresseeid`),
  KEY `td_sendid` (`td_sendid`),
  CONSTRAINT `td_message_ibfk_1` FOREIGN KEY (`td_addresseeid`) REFERENCES `users_information` (`accountId`),
  CONSTRAINT `td_message_ibfk_2` FOREIGN KEY (`td_sendid`) REFERENCES `users_information` (`accountId`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of td_message
-- ----------------------------
INSERT INTO `td_message` VALUES ('22', '1004', '房贷首付士大夫士大夫士大夫士大夫士大夫士大夫', '0', '1001', '2018-07-18');
INSERT INTO `td_message` VALUES ('27', '1000', '你好test1', '0', '1001', '2018-07-21');
INSERT INTO `td_message` VALUES ('28', '1000', 'cczcz', '0', '1001', '2018-07-21');
INSERT INTO `td_message` VALUES ('31', '1000', '思念对方缴纳水电费士大夫大师傅和速度发 士大夫是思念对方缴纳水电思念对方缴纳水电费士大夫大师傅和速度发 士大夫是思念对方缴纳水电费士大夫大师傅和速度发 士大夫是思念对方缴纳水电费士大夫大师傅和速度发 士大夫是费士大夫大师傅和速度发 士大夫是', '0', '1004', '2018-07-22');
INSERT INTO `td_message` VALUES ('32', '1000', 'qwe 发 士大夫是思念对方缴纳水电思念对方缴纳水电费士大夫大师傅和速度发 士大夫是思念对方缴纳水电费士大夫大师傅和速度发 士大夫是思念对方缴纳水电费士大夫大师傅和速度发 士大夫是费士大夫大师傅和速度发 士大夫是', '0', '1004', '2018-07-22');
INSERT INTO `td_message` VALUES ('33', '1000', '据山东省气象台今晨6点发布的消息，山东今天继续发布台风蓝色预警信号：受第10号台风“安比”影响，今天白天至24日早晨，全省有明显降雨并伴有雷电，其中，临沂、日照、莱芜、潍坊、淄博、德州、滨州和东营有暴雨（50～100毫米），部分地区有大暴雨（100～250毫米），枣庄、济宁、泰安、济南、聊城和青岛有中到大雨（20～40毫米）局部暴雨，其他地区有小到中雨（5～15毫米）。', '0', '1003', '2018-07-23');
INSERT INTO `td_message` VALUES ('34', '1000', '据山东省气象台今晨6点发布的消息，山东今天继续发布台风蓝色预警信号：受第10号台风“安比”影响，今天白天至24日早晨，全省有明显降雨并伴有雷电，其中，临沂、日照、莱芜、潍坊、淄博、德州、滨州和东营有暴雨（50～100毫米），部分地区有大暴雨（100～250毫米），枣庄、济宁、泰安、济南、聊城和青岛有中到大雨（20～40毫米）局部暴雨，其他地区有小到中雨（5～15毫米）。', '0', '1004', '2018-07-23');
INSERT INTO `td_message` VALUES ('37', '1003', '阿斯顿发射点发射点第三方士大夫士大夫士大夫士大夫是的地方士大夫', '0', '1000', '2018-07-11');
INSERT INTO `td_message` VALUES ('38', '1000', 'asdasd', '0', '1001', '2018-07-24');
INSERT INTO `td_message` VALUES ('39', '1000', '打团不要瞎子，打团不要瞎子，打团不要瞎子，打团不要瞎子，打团不要瞎子，打团不要瞎子，打团不要瞎子，打团不要瞎子，打团不要瞎子，打团不要瞎子，打团不要瞎子，打团不要瞎子，打团不要瞎子，打团不要瞎子，打团不要瞎子，打团不要瞎子，', '0', '31981', '2019-03-11');
INSERT INTO `td_message` VALUES ('40', '1000', '打团不要剑皇,打团不要剑皇,打团不要剑皇,打团不要剑皇,打团不要剑皇,打团不要剑皇,打团不要剑皇,打团不要剑皇,打团不要剑皇,打团不要剑皇,打团不要剑皇,打团不要剑皇,打团不要剑皇,打团不要剑皇,打团不要剑皇,打团不要剑皇,打团不要剑皇,打团不要剑皇,打团不要剑皇,打团不要剑皇,打团不要剑皇,打团不要剑皇,打团不要剑皇,打团不要剑皇,打团不要剑皇,打团不要剑皇,打团不要剑皇,', '0', '28319', '2019-03-11');
INSERT INTO `td_message` VALUES ('41', '1000', '打团不要划水，打团不要划水，打团不要划水，打团不要划水，打团不要划水，打团不要划水，打团不要划水，打团不要划水，打团不要划水，打团不要划水，打团不要划水，打团不要划水，打团不要划水，打团不要划水，打团不要划水，打团不要划水，打团不要划水，打团不要划水，打团不要划水，打团不要划水，打团不要划水，打团不要划水，打团不要划水，打团不要划水，打团不要划水，打团不要划水，', '0', '80802', '2019-03-11');
INSERT INTO `td_message` VALUES ('45', '12231', '鼋头渚樱花节什么时候 2019年无锡樱花节时间\r\n2019-03-07  来源：天气网  【字体：大 中 小】\r\n现在是赏花的好时节，当然最引人关注的就是樱花了，那种沉浸在樱花海的画面想想就很浪漫，那就赶紧跟鼋头渚樱花来一场邂逅了，而且这里还会举办国际樱花节，那鼋头渚樱花节什么时候呢?樱花节已经在今天拉开了帷幕，3月1日-5月1日是活动时间，3.7日也就是今天举办的开幕式。\r\n\r\n鼋头渚樱花节什么时候 2019年无锡樱花节时间\r\n\r\n2019年无锡樱花节时间\r\n\r\n2019年无锡樱花节时间为：3月1日-5月1日，今天是樱花节的开幕式，3月1日-5月1日为日樱观赏时间，3月22-4月7日是夜樱观赏期间，它们并不是同时开放的，这个请游客朋友要提前了解清楚，而且这次樱花节规模非常大，而且活动也非常丰富，很多游客比较关注樱花节的王牌活动——万人齐跳樱花舞，这项活动将与漫天飘落的樱花雨一同进行，场面肯定非常壮观。\r\n\r\n鼋头渚樱花节什么时候 2019年无锡樱花节时间\r\n\r\n樱花节具体活动：\r\n\r\n3月1日—5月1日，樱花文创集市、樱花球幕影院、樱花邮局全天营业;\r\n\r\n3月7日，2019年太湖鼋头渚国际樱花节开幕式，万人齐跳樱花舞;\r\n\r\n3月7日—10日，吴越美人节，可以欣赏一年一度的樱花女神选拔大赛，跟着樱花女神去赏花;\r\n\r\n3月9日—4月8日，樱花美食小镇营业，含全球美食、地方特色小吃的美食小镇，将为游客提供便捷的美食餐饮;\r\n\r\n3月16日，樱花女神总决赛;\r\n\r\n3月20日—4月20日，樱花季抖音大赛;\r\n\r\n3月22日，夜赏樱花开园，樱光夜跑大赛;\r\n\r\n3月23日—24日，樱花动漫节活动;\r\n\r\n3月26日—27日，国际友人赏樱周活动;\r\n\r\n4月20日，樱花宝贝大赛\r\n\r\n鼋头渚樱花节什么时候 2019年无锡樱花节时间\r\n\r\n现在知道2019年无锡樱花节时间了，是不是心早就飞到无锡了呢?这么多丰富的活动注定今年这场樱花节肯定热闹非凡，还没订票的小伙伴不要犹豫了，赶紧去订票吧。', '0', '1000', '2019-03-21');
INSERT INTO `td_message` VALUES ('46', '1000', '薇热望热望薇热望热望薇热望热望薇热望热望薇热望热望薇热望热望薇热望热望薇热望热望薇热望热望薇热望热望薇热望热望薇热望热望薇热望热望薇热望热望薇热望热望薇热望热望薇热望热望薇热望热望薇热望热望薇热望热望薇热望热望薇热望热望薇热望热望薇热望热望薇热望热望薇热望热望薇热望热望薇热望热望薇热望热望薇热望热望薇热望热望薇热望热望薇热望热望薇热望热望薇热望热望薇热望热望薇热望热望薇热望热望薇热望热望', '0', '12231', '2019-03-11');
INSERT INTO `td_message` VALUES ('47', '1000', '你好呀呀奥运啊啊啊啊啊啊！', '0', '12231', '2019-03-11');
INSERT INTO `td_message` VALUES ('48', '1000', '祝华楷真tm丑', '0', '12231', '2019-03-14');
INSERT INTO `td_message` VALUES ('49', '1000', 'dfgdfgdfgdgdg', '0', '12231', '2019-03-14');

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('8', 'admin', '123456');
INSERT INTO `users` VALUES ('21', 'test1', '123456');
INSERT INTO `users` VALUES ('36', 'test2', '123456');
INSERT INTO `users` VALUES ('37', 'test3', '123456');
INSERT INTO `users` VALUES ('38', 'test4', '123456');
INSERT INTO `users` VALUES ('39', 'test5', '123456');
INSERT INTO `users` VALUES ('40', 'test6', '123456');
INSERT INTO `users` VALUES ('41', 'test7', '123456');
INSERT INTO `users` VALUES ('42', 'test8', '123435');
INSERT INTO `users` VALUES ('43', 'test9', '234234');
INSERT INTO `users` VALUES ('46', 'long', '123456');
INSERT INTO `users` VALUES ('47', 'lin', '123456');
INSERT INTO `users` VALUES ('48', 'kai', '123456');
INSERT INTO `users` VALUES ('49', 'yong', '123456');
INSERT INTO `users` VALUES ('51', 'bo', '123456');
INSERT INTO `users` VALUES ('52', 'yu', '123456');
INSERT INTO `users` VALUES ('53', 'wei', '123456');
INSERT INTO `users` VALUES ('54', 'wen', '123456');
INSERT INTO `users` VALUES ('55', 'meng', '123456');

-- ----------------------------
-- Table structure for `users_information`
-- ----------------------------
DROP TABLE IF EXISTS `users_information`;
CREATE TABLE `users_information` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(11) NOT NULL,
  `accountId` int(11) DEFAULT '1' COMMENT '1为男，0为女',
  `age` int(11) DEFAULT NULL,
  `sex` varchar(11) NOT NULL,
  `mail` varchar(255) DEFAULT NULL,
  `nickName` varchar(255) NOT NULL,
  `role` varchar(11) NOT NULL DEFAULT '0' COMMENT '0默认为普通用户,1为老师',
  PRIMARY KEY (`id`),
  KEY `username` (`username`),
  KEY `accountId` (`accountId`),
  KEY `accountId_2` (`accountId`),
  CONSTRAINT `username` FOREIGN KEY (`username`) REFERENCES `users` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users_information
-- ----------------------------
INSERT INTO `users_information` VALUES ('6', 'admin', '1000', '22', '男', '7827777@qq.com', '高级管理员', '老师');
INSERT INTO `users_information` VALUES ('25', 'test1', '1001', '23', '男', 'wre7777@qq.com', '们个个', '老师');
INSERT INTO `users_information` VALUES ('40', 'test2', '1002', '21', '男', '12213e', '测试2', '学生');
INSERT INTO `users_information` VALUES ('41', 'test3', '1003', '12', '男', '122132', '测试3', '学生');
INSERT INTO `users_information` VALUES ('42', 'test4', '1004', '22', '男', '1221323', '测试4', '学生');
INSERT INTO `users_information` VALUES ('43', 'test5', '1005', '23', '男', '12213432', '测试5', '学生');
INSERT INTO `users_information` VALUES ('44', 'test6', '59330', '23', '男', '7827777@qq.com', '士大夫服', '学生');
INSERT INTO `users_information` VALUES ('45', 'test7', '97820', '22', '男', '7827777@qq.com', '尴尬', '学生');
INSERT INTO `users_information` VALUES ('46', 'test8', '58896', '15', '男', '3234234', '规范化额外', '学生');
INSERT INTO `users_information` VALUES ('47', 'test9', '52865', '17', '男', '7377@qq.com', '规范微弱', '学生');
INSERT INTO `users_information` VALUES ('49', 'long', '80802', '26', '男', '12312377@qq.com', '王京龙', '老师');
INSERT INTO `users_information` VALUES ('50', 'lin', '28319', '27', '男', '12312312347@qq.com', '刘浩林', '学生');
INSERT INTO `users_information` VALUES ('51', 'kai', '31981', '28', '男', '123123537@qq.com', '祝华凯', '学生');
INSERT INTO `users_information` VALUES ('52', 'yong', '4688', '28', '男', '71231237@qq.com', '张勇', '老师');
INSERT INTO `users_information` VALUES ('54', 'bo', '47865', '29', '男', 'wre7777@qq.com', '邓庆博', '学生');
INSERT INTO `users_information` VALUES ('55', 'yu', '26646', '30', '男', '12312312347@qq.com', '甘雨', '老师');
INSERT INTO `users_information` VALUES ('56', 'wei', '53713', '31', '男', '345345345@qq.com', '陈建伟', '老师');
INSERT INTO `users_information` VALUES ('57', 'wen', '87142', '33', '男', '234234@qq.com', '羊聚文', '老师');
INSERT INTO `users_information` VALUES ('58', 'meng', '12231', '22', '男', '7827777@qq.com', '郑萌', '老师');

-- ----------------------------
-- Table structure for `writing`
-- ----------------------------
DROP TABLE IF EXISTS `writing`;
CREATE TABLE `writing` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` text NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `viewCount` int(11) NOT NULL,
  `remarkCount` int(11) NOT NULL,
  `collectCount` int(11) NOT NULL,
  `titleid` int(11) NOT NULL,
  `date` date NOT NULL,
  PRIMARY KEY (`id`),
  KEY `username` (`username`),
  CONSTRAINT `writing_ibfk_1` FOREIGN KEY (`username`) REFERENCES `users_information` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of writing
-- ----------------------------
INSERT INTO `writing` VALUES ('1', '阿斯顿飞', 'admin', '132', '123', '23', '23', '2018-07-15');
INSERT INTO `writing` VALUES ('3', '你的书法真丑呀', 'test2', '123', '43', '342', '12353', '2018-07-10');
INSERT INTO `writing` VALUES ('5', '十几万微弱', 'test3', '23423', '234', '123', '12364', '2018-07-10');
INSERT INTO `writing` VALUES ('7', '的广泛豆腐干热', 'test3', '4324', '123', '434', '6453', '2018-07-04');
INSERT INTO `writing` VALUES ('9', '北京大使馆', 'test5', '123', '532', '542', '53445', '2018-07-18');
INSERT INTO `writing` VALUES ('14', '书法好看1', 'test7', '432', '543', '345', '345', '2018-07-19');
INSERT INTO `writing` VALUES ('15', '书法好看1654', 'test8', '234', '654', '765', '676', '2018-07-19');
INSERT INTO `writing` VALUES ('16', '书法好看16765', 'test9', '234', '654', '456', '546', '2018-07-19');
INSERT INTO `writing` VALUES ('18', '看看看看看看看看看看', 'admin', '184099', '707459', '536956', '345442', '2018-07-21');
INSERT INTO `writing` VALUES ('19', 'admin的书法1', 'admin', '385725', '290347', '150830', '212230', '2018-07-23');
INSERT INTO `writing` VALUES ('20', 'admin的书法2', 'admin', '354671', '412757', '385597', '954066', '2018-07-23');
INSERT INTO `writing` VALUES ('21', 'admin的书法3', 'admin', '279200', '856721', '431405', '621138', '2018-07-23');
INSERT INTO `writing` VALUES ('22', 'admin的书法4', 'admin', '560257', '102273', '639844', '747313', '2018-07-23');
INSERT INTO `writing` VALUES ('23', 'admin的书法5', 'admin', '500428', '493246', '763076', '289636', '2018-07-23');
INSERT INTO `writing` VALUES ('24', 'admin的书法6', 'admin', '468356', '293239', '868249', '503509', '2018-07-23');
INSERT INTO `writing` VALUES ('25', 'admin的书法7', 'admin', '384364', '343998', '718239', '732809', '2018-07-23');
INSERT INTO `writing` VALUES ('26', 'admin的书法8', 'admin', '227515', '656973', '360277', '380907', '2018-07-23');
INSERT INTO `writing` VALUES ('27', 'admin的书法9', 'admin', '958246', '773322', '60206', '595550', '2018-07-23');
INSERT INTO `writing` VALUES ('28', '测试啊啊啊啊啊', 'lin', '1242', '231', '123', '12323', '2019-03-13');
INSERT INTO `writing` VALUES ('29', '测试啊啊啊啊啊1', 'lin', '234', '234', '54', '345', '2019-03-12');
INSERT INTO `writing` VALUES ('30', '测试啊啊啊啊啊2', 'lin', '453', '345', '345', '45', '2019-03-05');
INSERT INTO `writing` VALUES ('31', '测试啊啊啊啊啊3', 'lin', '34535', '567567', '567567', '567567', '2019-03-19');
INSERT INTO `writing` VALUES ('32', '测试啊啊啊啊啊4', 'lin', '234234', '534543', '354345', '345', '2019-03-13');
INSERT INTO `writing` VALUES ('33', '测试啊啊啊啊啊5', 'lin', '23423', '23234', '3454', '234234', '2019-03-26');
INSERT INTO `writing` VALUES ('34', '测试啊啊啊啊啊23423', 'admin', '435', '345', '345', '345', '2019-04-03');
INSERT INTO `writing` VALUES ('35', '我的书法13', 'meng', '112', '21321', '54435', '3451', '2019-03-05');
INSERT INTO `writing` VALUES ('36', '我的书法12', 'meng', '4234', '243', '234', '55435', '2019-02-15');
INSERT INTO `writing` VALUES ('37', '我的书法11', 'meng', '123', '53435', '34534', '13213', '2019-03-06');
INSERT INTO `writing` VALUES ('38', '我的书法10', 'meng', '646', '45654', '2342', '1231', '2019-03-06');
INSERT INTO `writing` VALUES ('39', '我的书法9', 'meng', '54353', '123', '123', '12343', '2019-03-12');
INSERT INTO `writing` VALUES ('40', '我的书法8', 'meng', '5453', '23432', '123', '665', '2019-02-27');
INSERT INTO `writing` VALUES ('41', '我的书法7', 'meng', '12354', '12353', '231', '7777', '2019-02-26');
INSERT INTO `writing` VALUES ('42', '我的书法6', 'meng', '215', '3423', '123', '321', '2019-01-10');
INSERT INTO `writing` VALUES ('43', '我的书法5', 'meng', '234', '54', '456', '2345', '2019-03-06');
INSERT INTO `writing` VALUES ('44', '我的书法4', 'meng', '54', '456', '234', '2311', '2019-03-13');
INSERT INTO `writing` VALUES ('45', '我的书法3', 'meng', '2435', '43423', '2123', '12314', '2019-02-06');
INSERT INTO `writing` VALUES ('46', '我的书法2', 'meng', '645', '2345', '2242', '64446', '2019-03-06');
INSERT INTO `writing` VALUES ('47', '我的书法1', 'meng', '13123', '534', '643', '76766767', '2019-02-21');

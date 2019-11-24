CREATE TABLE `user` (
  `id` int(20) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

INSERT INTO `user` (`id`, `username`, `password`) VALUES (00000000000000000001, '张三帅', '123');
INSERT INTO `user` (`id`, `username`, `password`) VALUES (00000000000000000002, '李四丑', '321');

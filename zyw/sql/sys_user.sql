CREATE TABLE `sys_user` (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '对应id',
  `account` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '账号',
  `password` varchar(35) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '密码(经过处理加密之后的密码)',
  `salt` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '盐(密码加密需要的)',
  `token` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT 'tokne值(从新登陆做修改)',
  `login_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '登陆时间,最近一次操作该表的时间',
  `login_ip` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '登陆的ip地址',
  `login_phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '登录人的手机号码(可作为唯一键表示，当账号跟这个同样时候)',
  `status` int(2) DEFAULT NULL COMMENT '状态(0停用  1在用)',
  `data_version` int(11) DEFAULT NULL COMMENT '版本号',
  `remark` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
  `is_delete` int(2) DEFAULT '0' COMMENT '是否删除(逻辑删除控制的字段 0是在用 1.删除)',
  `gmt_create` timestamp NULL DEFAULT NULL COMMENT '新增时间',
  `gmt_modify` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `create_user_id` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '新增人',
  `modify_user_id` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '修改人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';


INSERT INTO `sys_user` (`id`, `account`, `password`, `salt`, `token`, `login_time`, `login_ip`, `login_phone`, `status`, `data_version`, `remark`, `is_delete`, `gmt_create`, `gmt_modify`, `create_user_id`, `modify_user_id`) VALUES ('11e945a550094a6fa2af9f4cc06ea7df', 'ZYW1', '123456', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_user` (`id`, `account`, `password`, `salt`, `token`, `login_time`, `login_ip`, `login_phone`, `status`, `data_version`, `remark`, `is_delete`, `gmt_create`, `gmt_modify`, `create_user_id`, `modify_user_id`) VALUES ('2135326c95b8471f8c2c5ef17eb560e9', 'ZYW2', '123456', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_user` (`id`, `account`, `password`, `salt`, `token`, `login_time`, `login_ip`, `login_phone`, `status`, `data_version`, `remark`, `is_delete`, `gmt_create`, `gmt_modify`, `create_user_id`, `modify_user_id`) VALUES ('2d6b7b0cbae143589350c54132e83127', '13575705499', '2976af73a18b07bf1a741f4878885a1f', 'orzjkb', 'V1ZSYWJVNVhWVFZPZWtrMVRWUk9iRTVIVlhoTlIwcHRXVmROUFE9PQ==', '2019-10-29 15:51:48', NULL, '13575705488', 0, 16, NULL, 0, '2019-10-29 11:17:27', '2019-10-29 15:51:48', '13575705488', '99556290dafc49ee9bc58ea66152a0a2');
INSERT INTO `sys_user` (`id`, `account`, `password`, `salt`, `token`, `login_time`, `login_ip`, `login_phone`, `status`, `data_version`, `remark`, `is_delete`, `gmt_create`, `gmt_modify`, `create_user_id`, `modify_user_id`) VALUES ('5f52f0a438624562a670bedda5979c9f', '17858947599', 'd9fe2e7a9b42a5af986a378c82af1a0e', 'oizhlr', 'VGxSc2JVMVVhRzFOYWxFd1RtMVpNRTVFVFhoYWJVVjVXVEpSUFE9PQ==', '2019-10-29 18:07:53', NULL, '17858947531', 0, 43, NULL, 0, '2019-10-29 10:30:00', '2019-10-31 11:31:48', '17858947531', '99556290dafc49ee9bc58ea66152a0a2');
INSERT INTO `sys_user` (`id`, `account`, `password`, `salt`, `token`, `login_time`, `login_ip`, `login_phone`, `status`, `data_version`, `remark`, `is_delete`, `gmt_create`, `gmt_modify`, `create_user_id`, `modify_user_id`) VALUES ('7f65bc8bc6f146e0a763a73665548ddb', '15839888399', '69250cea91b8809d9bd575cfce58e267', 'eueqar', 'V1cxYWJWbHRVWGxPYWtacVRrUm9iVTVIVFRGTmJVWnJUV3ByUFE9PQ==', '2019-10-31 14:53:44', NULL, '15839888387', 0, 24, NULL, 0, '2019-10-30 15:41:50', '2019-10-31 14:53:44', '15839888387', '99556290dafc49ee9bc58ea66152a0a2');
INSERT INTO `sys_user` (`id`, `account`, `password`, `salt`, `token`, `login_time`, `login_ip`, `login_phone`, `status`, `data_version`, `remark`, `is_delete`, `gmt_create`, `gmt_modify`, `create_user_id`, `modify_user_id`) VALUES ('860493ee06c2489eb6a81ab4fc7d46ff', 'ZYW', '123456', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_user` (`id`, `account`, `password`, `salt`, `token`, `login_time`, `login_ip`, `login_phone`, `status`, `data_version`, `remark`, `is_delete`, `gmt_create`, `gmt_modify`, `create_user_id`, `modify_user_id`) VALUES ('a39f547befec472ebe6f6ab868a40508', '13476551699', '0c2c174afa57c058498e76665f825203', 'syngpi', 'VFcxSk5WcHFTVFZQVkZreFdYcEJORTVFV1hkTmVtY3lUbGRSUFE9PQ==', '2019-10-30 19:09:31', NULL, '13476551627', 0, 122, NULL, 0, '2019-10-29 10:24:13', '2019-10-31 11:30:40', '13476551627', '99556290dafc49ee9bc58ea66152a0a2');

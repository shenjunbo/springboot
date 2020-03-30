DROP TABLE IF EXISTS `user_auth_0`;
CREATE TABLE `user_auth_0` (
  `user_id` bigint(20) NOT NULL,
  `add_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `email` varchar(16) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone` varchar(16) DEFAULT NULL,
  `remark` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `USER_AUTH_PHONE` (`phone`),
  UNIQUE KEY `USER_AUTH_EMAIL` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
 
 
DROP TABLE IF EXISTS `user_auth_1`;
CREATE TABLE `user_auth_1` (
  `user_id` bigint(20) NOT NULL,
  `add_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `email` varchar(16) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone` varchar(16) DEFAULT NULL,
  `remark` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `USER_AUTH_PHONE` (`phone`),
  UNIQUE KEY `USER_AUTH_EMAIL` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
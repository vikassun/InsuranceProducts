	Schema
DROP TABLE IF EXISTS `insurance`.`product_info`;
CREATE TABLE  `insurance`.`product_info` (
  `PRODUCT_ID` decimal(10,0) NOT NULL,
  `PRODUCT_NAME` varchar(100) DEFAULT NULL,
  `PRODUCT_DESCRIPTION` varchar(200) DEFAULT NULL,
  `PREMIUM` decimal(10,0) NOT NULL,
  `STATUS` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

	Row Values
1, 'Bima Gold', 'Bima Gold is a participating non-linked plan which offers a combination of protection and savings.', 10000, 'open'
2, 'JeevanSanyog', 'JeevanSanyog is a participating non-linked plan which offers a combination of protection and savings', 20000, 'open'
3, 'Jeevan Rakshak', 'Jeevan Rakshak is a participating non-linked plan which offers a combination of protection and savings', 10000, 'open'
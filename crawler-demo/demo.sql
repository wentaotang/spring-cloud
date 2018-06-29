CREATE TABLE `info` (
  `id` varchar(100) DEFAULT NULL
  `title` varchar(100) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `source` varchar(100) DEFAULT NULL,
  `scrapy_source` varchar(100) DEFAULT NULL,
  `url` varchar(100) DEFAULT NULL,
  `image_url` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
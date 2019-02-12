create table prefecture (
  prefecture_cd char(2) comment '都道府県コード'
  ,prefecture_name varchar(191) comment '都道府県名'
  ,primary key (prefecture_cd)
) engine=innodb charset=utf8mb4 comment='都道府県';

load data local infile "/docker-entrypoint-initdb.d/prefecture.csv" into table prefecture character set 'utf8' fields terminated by ',' enclosed by '"' lines terminated by '\n' ignore 1 lines;

create table address (
  prefecture_cd char(2) comment '都道府県コード'
  ,prefecture_name varchar(191) comment '都道府県名'
  ,city_cd char(5) comment '市区町村コード'
  ,city_name varchar(191) comment '市区町村名'
  ,town_street_cd char(12) comment '大字町丁目コード'
  ,town_street_name varchar(191) comment '大字町丁目名'
  ,latitude double comment '緯度'
  ,longitude double comment '経度'
  ,origin_doc_cd char(1) comment '原典資料コード'
  ,town_street_kbn_cd char(1) comment '大字・字・丁目区分コード'
  ,primary key (prefecture_cd, city_cd, town_street_cd)
  ,foreign key(prefecture_cd) references prefecture(prefecture_cd)
  ,key idx1(latitude, longitude)
) engine=innodb charset=utf8mb4 comment='住所';

load data local infile "/docker-entrypoint-initdb.d/tokyo.csv" into table address character set 'utf8' fields terminated by ',' enclosed by '"' lines terminated by '\n' ignore 1 lines;
load data local infile "/docker-entrypoint-initdb.d/kanagawa.csv" into table address character set 'utf8' fields terminated by ',' enclosed by '"' lines terminated by '\n' ignore 1 lines;

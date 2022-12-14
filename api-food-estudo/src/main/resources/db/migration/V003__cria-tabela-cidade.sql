CREATE TABLE cidade (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  data_atualizacao datetime DEFAULT NULL,
  data_criacao datetime DEFAULT NULL,
  nome varchar(255) CHARACTER SET latin1 DEFAULT NULL,
  estado_id bigint(20) NOT NULL,
  PRIMARY KEY (id),
  KEY FKkworrwk40xj58kevvh3evi500 (estado_id),
  CONSTRAINT FKkworrwk40xj58kevvh3evi500 FOREIGN KEY (estado_id) REFERENCES estado (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE estado (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  data_atualizacao datetime DEFAULT NULL,
  data_criacao datetime DEFAULT NULL,
  nome varchar(255) CHARACTER SET latin1 DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
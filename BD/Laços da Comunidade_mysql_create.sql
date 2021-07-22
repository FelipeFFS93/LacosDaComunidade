CREATE TABLE `tb_postagem` (
	`Id` bigint NOT NULL AUTO_INCREMENT,
	`nome_evento` varchar(255) NOT NULL,
	`tipo_evento` varchar(255) NOT NULL,
	`site` varchar(255) NOT NULL,
	`descrição_evento` varchar(255) NOT NULL,
	`tema_id` bigint NOT NULL,
	`usuario_id` bigint NOT NULL,
	PRIMARY KEY (`Id`)
);

CREATE TABLE `tb_tema` (
	`Id` bigint NOT NULL,
	`tema_evento` varchar(255) NOT NULL,
	`local_evento` varchar(255) NOT NULL,
	`data_horario` varchar(255) NOT NULL,
	`quant_pessoas` varchar(255) NOT NULL,
	PRIMARY KEY (`Id`)
);

CREATE TABLE `tb_usuário` (
	`Id` bigint NOT NULL AUTO_INCREMENT,
	`nome` varchar(255) NOT NULL,
	`e-mail` varchar(255) NOT NULL,
	`senha` varchar(255) NOT NULL,
	`Ongs` BOOLEAN(255) NOT NULL,
	PRIMARY KEY (`Id`)
);

ALTER TABLE `tb_postagem` ADD CONSTRAINT `tb_postagem_fk0` FOREIGN KEY (`tema_id`) REFERENCES `tb_tema`(`Id`);

ALTER TABLE `tb_postagem` ADD CONSTRAINT `tb_postagem_fk1` FOREIGN KEY (`usuario_id`) REFERENCES `tb_usuário`(`Id`);





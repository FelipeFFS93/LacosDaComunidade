CREATE TABLE `tb_postagem` (
	`Id` bigint NOT NULL AUTO_INCREMENT,
	`nome_evento` varchar(255) NOT NULL,
	`tipo_evento` varchar(255) NOT NULL,
	`site` varchar(255) NOT NULL,
	`descricao_evento` varchar(255) NOT NULL,
	`tema_id` bigint NOT NULL,
	`usuario_id` bigint NOT NULL,
	PRIMARY KEY (`Id`)
);

CREATE TABLE `tb_tema` (
	`Id` bigint NOT NULL,
	`tema_evento` varchar(255) NOT NULL,
	`local_evento` varchar(255) NOT NULL,
	`data_horario` DATETIME(255) NOT NULL,
	`quant_pessoas` bigint(255) NOT NULL,
	PRIMARY KEY (`Id`)
);

CREATE TABLE `tb_usuário` (
	`Id` bigint NOT NULL AUTO_INCREMENT,
	`nome` varchar(255) NOT NULL,
	`e-mail` varchar(255) NOT NULL,
	`senha` varchar(255) NOT NULL,
	`Ongs` BOOLEAN(255) NOT NULL,
	`Genero` char(255) NOT NULL,
	`CPF` varchar(255) NOT NULL,
	`CNPJ` varchar(255) NOT NULL,
	`data_nascimento` DATE(255) NOT NULL,
	PRIMARY KEY (`Id`)
);

ALTER TABLE `tb_postagem` ADD CONSTRAINT `tb_postagem_fk0` FOREIGN KEY (`tema_id`) REFERENCES `tb_tema`(`Id`);

ALTER TABLE `tb_postagem` ADD CONSTRAINT `tb_postagem_fk1` FOREIGN KEY (`usuario_id`) REFERENCES `tb_usuário`(`Id`);





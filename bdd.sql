CREATE TABLE `qcm`.`users` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  `role` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `qcm`.`qcm` (
  `idqcm` BIGINT NOT NULL AUTO_INCREMENT,
  `intitule` VARCHAR(45) NULL,
  `niveau` VARCHAR(45) NULL,
  `nbQuestions` INT NULL,
  PRIMARY KEY (`idqcm`));
ALTER TABLE `qcm`.`questions` 
CHANGE COLUMN `idquestions` `idquestions` BIGINT NOT NULL AUTO_INCREMENT ;

CREATE TABLE `qcm`.`questions` (
  `idquestions` BIGINT NOT NULL,
  `questions` VARCHAR(255) NULL,
  `idqcm` BIGINT NULL,
  PRIMARY KEY (`idquestions`),
  INDEX `qcm_foreignKey_idx` (`idqcm` ASC) VISIBLE,
  CONSTRAINT `id`
    FOREIGN KEY (`idqcm`)
    REFERENCES `qcm`.`qcm` (`idqcm`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


CREATE TABLE `qcm`.`reponses` (
  `idreponses` BIGINT NOT NULL AUTO_INCREMENT,
  `reponses` VARCHAR(255) NULL,
  `idquestions` BIGINT NULL,
`vraiReponse` VARCHAR(5) DEFAULT `false`,
  PRIMARY KEY (`idreponses`),
  INDEX `reponsesquestions_idx` (`idquestions` ASC) VISIBLE,
  CONSTRAINT `reponsesquestions`
    FOREIGN KEY (`idquestions`)
    REFERENCES `qcm`.`questions` (`idquestions`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

insert into qcm.user(password,role,username)('12345','stagiaire','toto');
insert into qcm.user(password,role,username)('12345','stagiaire','Jean');
insert into qcm.user(password,role,username)('12345','stagiaire','Awaleh');
insert into qcm.user(password,role,username)('12345','stagiaire','Edna');
Select * from qcm.user;

insert into qcm.qcm(intitule,niveau,nbQuestions) values('Test Logique 1', 'Débutant', 3);
insert into qcm.qcm(intitule,niveau,nbQuestions) values('Test Logique 2', 'Confirmé', 3);
insert into qcm.qcm(intitule,niveau,nbQuestions) values('Test Logique 3', 'Expert', 3);
Select * From qcm.qcm;



DELETE FROM qcm.questions;
insert into qcm.questions(questions,idqcm) values('Quelle est la capitale de la France ?', 1);
insert into qcm.questions(questions,idqcm) values('Quel est le résultat de 3+5×2 ?', 1);
insert into qcm.questions(questions,idqcm) values('Quelle planète est la plus proche du soleil ?', 1);

insert into qcm.questions(questions,idqcm) values('Quel est l''organe principal du système respiratoire chez l''humain ?', 2);
insert into qcm.questions(questions,idqcm) values('Qui a peint la Joconde ?', 2);
insert into qcm.questions(questions,idqcm) values('Quelle est la capitale de l''Espagne ?', 2);

insert into qcm.questions(questions,idqcm) values('Si tous les chats ont des oreilles et que Félix est un chat, alors ?',3);
insert into qcm.questions(questions,idqcm) values('Quel est le prochain nombre dans la séquence suivante : 2, 4, 6, 8, ... ?',3);
insert into qcm.questions(questions,idqcm) values('Si certains oiseaux sont des perroquets et que tous les perroquets peuvent parler, alors :',3);

Select * from qcm.questions;


SELECT * FROM qcm.reponses;
DELETE FROM qcm.reponses;

insert into qcm.reponses(reponses,idquestions) values('Berlin',1);
insert into qcm.reponses(reponses,idquestions) values('Londre',1);
insert into qcm.reponses(reponses,idquestions,vraiReponse) values('Paris',1,'true');
insert into qcm.reponses(reponses,idquestions) values('Madrid',1);

insert into qcm.reponses(reponses,idquestions) values('9',2);
insert into qcm.reponses(reponses,idquestions) values('11',2);
insert into qcm.reponses(reponses,idquestions,vraiReponse) values('13',2,'true');
insert into qcm.reponses(reponses,idquestions) values('14',2);

insert into qcm.reponses(reponses,idquestions) values('Mars',3);
insert into qcm.reponses(reponses,idquestions) values('Vénus',3);
insert into qcm.reponses(reponses,idquestions) values('Jupiter',3);
insert into qcm.reponses(reponses,idquestions,vraiReponse) values('Mercure',3,'true');


insert into qcm.reponses(reponses,idquestions) values('Le cerveau',4);
insert into qcm.reponses(reponses,idquestions) values('Le foie',4);
insert into qcm.reponses(reponses,idquestions,vraiReponse) values('Les poumons',4,'true');
insert into qcm.reponses(reponses,idquestions) values('Le cœur',4);

insert into qcm.reponses(reponses,idquestions) values('Vincent van Gogh',5);
insert into qcm.reponses(reponses,idquestions,vraiReponse) values('Leonardo da Vinci',5,'true');
insert into qcm.reponses(reponses,idquestions) values('Pablo Picasso',5);
insert into qcm.reponses(reponses,idquestions) values('Michel-Ange',5);

insert into qcm.reponses(reponses,idquestions) values('Lisbonne',6);
insert into qcm.reponses(reponses,idquestions) values('Rome',6);
insert into qcm.reponses(reponses,idquestions,vraiReponse) values('Madrid.',6,'true');
insert into qcm.reponses(reponses,idquestions) values('Athènes',6);

insert into qcm.reponses(reponses,idquestions) values('Félix n''a pas d''oreilles.',7);
insert into qcm.reponses(reponses,idquestions,vraiReponse) values('Félix a des oreilles.',7,'true');
insert into qcm.reponses(reponses,idquestions) values('Tous les chats ont des yeux.',7);
insert into qcm.reponses(reponses,idquestions) values('Les chiens ont des oreilles.',7);

insert into qcm.reponses(reponses,idquestions) values('9',8);
insert into qcm.reponses(reponses,idquestions) values('10',8);
insert into qcm.reponses(reponses,idquestions) values('12',8);
insert into qcm.reponses(reponses,idquestions,vraiReponse) values('14',8,'true');

insert into qcm.reponses(reponses,idquestions) values('Tous les oiseaux sont des perroquets.',9);
insert into qcm.reponses(reponses,idquestions,vraiReponse) values('Certains oiseaux peuvent parler.',9,'true');
insert into qcm.reponses(reponses,idquestions) values('Aucun oiseau ne peut parler..',9);
insert into qcm.reponses(reponses,idquestions) values('Certains perroquets ne sont pas des oiseaux.',9);

Select * From qcm.reponses;

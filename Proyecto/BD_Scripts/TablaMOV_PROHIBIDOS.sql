create table MOV_PROHIBIDOS (
	idmov int not null,
    fk_partido int not null,
	nombre_mov varchar(100),
	cant_mov int,
    fk_moveq int,
	constraint pk_idmov primary key (idmov),
    foreign key (fk_partido) references PARTIDO(codigo),
    foreign key (fk_moveq) references EQUIPO(idequipo)
);

INSERT INTO MOV_PROHIBIDOS VALUES (1,2,'Golpe intencional',2,5),
(2,4,'Obstruccion de camino',1,4),
(3,8,'Agarrar escoba contraria',1,7),
(4,15,'Intimidacion',1,5),
(5,20,'Abandono intencional',1,4),
(6,27,'Uso de hechizos',1,8);
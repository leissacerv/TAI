create table EQUIPO (
    idequipo int not null,
    nombre varchar(100) not null,
    camp_mund varchar(100),
    jugada_esp varchar(100),
    copas_win int,
    num_jugadores int,
    constraint pk_idequipo primary key (idequipo)
);
INSERT INTO EQUIPO VALUES (1,'Dragones de Fuego',1,'Vuelo de Dragon',0,7);
INSERT INTO EQUIPO VALUES (2,'Centauros Voladores',0,'Arremetida del Centauro',0,7);
INSERT INTO EQUIPO VALUES (3,'Griffindors Salvajes',3,'Desvío de la Esfinge',2,7);
INSERT INTO EQUIPO VALUES (4,'Espectros de la Tormenta',1,'Remolino de Sirenas',1,7);
INSERT INTO EQUIPO VALUES (5,'Basiliscos Alados',2,'Maldicion del Basilisco',1,7);
INSERT INTO EQUIPO VALUES (6,'Hipogrifos Dorados',0,'Salto de Hipogrifo',0,7);
INSERT INTO EQUIPO VALUES (7,'Serpientes de Plata',2,'Embate Fulgurante',1,7);
INSERT INTO EQUIPO VALUES (8,'Valquirias del Viento',3,'Lazo de las Hidras',2,7);
create table PAIS (
    idpais int not null,
    nombre varchar(100),
    continente varchar(100),
    cant_clubs int
	constraint pk_idpais primary key (idpais),
);

create table EQUIPO (
    idequipo int not null,
    camp_mund varchar(100),
    jugada_esp varchar(100),
    copas_win int,
    num_jugadores int
	constraint pk_idequipo primary key(idequipo),
);

create table PARTICIPANTE (
    curp int not null,
    nombre_comp varchar(100),
    nacionalidad varchar(100) not null,
	estado varchar(100) not null,
    edad int,
    altura int,
    peso int
	constraint pk_curp primary key (curp),
);

create table JUGADOR (
    equipo varchar(100) not null,
    posicion varchar(100),
    nivel int
);

create table ARBITRO (
    direccion varchar(100),
    num_tel int
);

create table HOTEL (
    rfc int not null,
    num_tel int,
    direccion varchar(100),
    fecha_aloj varchar(100),
	constraint pk_rfc primary key (rfc),
);

create table ESTADIO (
	qhotel varchar(100) not null,
    capacidad int
);

create table PARTIDO (
    codigo int not null,
    equipo_win varchar(100) not null
);

create table MOV_PROHIBIDOS (
	idmov int not null,
	nombre_mov varchar(100),
	cant_mov int
	constraint pk_idmov primary key (idmov),
);
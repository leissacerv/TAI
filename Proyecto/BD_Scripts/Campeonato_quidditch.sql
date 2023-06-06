-- Database: Campeonato_Quidditch2

-- DROP DATABASE IF EXISTS "Campeonato_Quidditch2";

CREATE DATABASE "Campeonato_Quidditch2"
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Spanish_Mexico.1252'
    LC_CTYPE = 'Spanish_Mexico.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;
	
	
	create table PARTICIPANTE (
    curp int not null,
    nombre_comp varchar(100),
    nacionalidad varchar(100),
    edad int,
    altura int,
    peso int,
    constraint pk_curp primary key (curp)
);

create table JUGADOR (
    equipo varchar(100),
    posicion varchar(100),
    nivel int
);

create table ARBITRO (
    direccion varchar(100),
    nul_tel int
);

create table HOTEL(
    rfc int not null,
    num_tel int,
    direccion varchar(100),
    fecha_aloj varchar(100),
    constraint pk_rfc primary key (rfc)
);

create table ESTADIO (
	qhotel varchar(100),
    capacidad int
);

create table PARTIDO (
    codigo int not null,
    equipo_win varchar(100),
    constraint pk_codigo primary key (codigo) 
);

create table MOV_PROHIBIDOS (
	idmov int not null,
	nombre_mov varchar(100),
	cant_mov int,
	constraint pk_idmov primary key (idmov)
);
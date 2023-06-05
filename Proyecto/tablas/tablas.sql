CREATE TABLE PAIS (
    ID INT PRIMARY KEY,
    nombre VARCHAR(100),
    continente VARCHAR(100),
    cant_clubs INT
);

CREATE TABLE EQUIPO (
    ID INT PRIMARY KEY,
    camp_mund VARCHAR(100),
    jugada_esp VARCHAR(100),
    copas_win INT,
    num_jugadores INT
);

CREATE TABLE PARTICIPANTE (
    CURP INT PRIMARY KEY,
    nombre_comp VARCHAR(100),
    nacionalidad VARCHAR(100),
    edad INT,
    altura INT,
    peso INT
);

CREATE TABLE JUGADOR (
    equipo VARCHAR(100),
    posicion: VARCHAR(100),
    nivel INT
);

CREATE TABLE ARBITRO (
    direccion VARCHAR(100),
    nul_tel INT
);

CREATE TABLE HOTEL (
    RFC INT PRIMARY KEY,
    num_tel INT,
    direccion VARCHAR(100),
    fecha_aloj: VARCHAR(100)
);

CREATE TABLE ESTADIO (
    capacidad INT
);

CREATE TABLE PARTIDO (
    codigo INT PRIMARY KEY,
    equipo_win VARCHAR(100)
);

CREATE TABLE MOV_PROHIBIDOS (
	ID INT PRIMARY KEY,
	nombre_mov VARCHAR(100),
	cant_mov INT
);
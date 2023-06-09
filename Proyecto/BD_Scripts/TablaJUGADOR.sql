create table JUGADOR (
    fk_equipo int not null,
    posicion varchar(100),
    nivel int,
    foreign key (fk_equipo) references EQUIPO(idequipo)
)
    INHERITS (PARTICIPANTE);
INSERT INTO JUGADOR  VALUES ('A1234', 'Alistair Blackthorn', 1, 19, 1.67, 60, 1,'Habilitado', 1,'Guardian',2),
('B5678', 'Gwendolyn Fairchild', 1, 21, 1.57, 56, 1,'Habilitado', 1,'Buscador',2),
('C9012', 'Ron Hawthorne', 1, 18, 1.75, 76, 1,'Habilitado', 1,'Golpeador',3),
('D3456', 'Evangeline Moonshadow', 1, 22, 1.59, 65, 1,'Habilitado', 1,'Golpeador',1),
('E7890', 'Orion Nightshade', 1, 19, 1.80, 85, 1,'Habilitado', 1,'Cazador',2),
('F2345', 'Seraphina Evergreen', 1, 21, 1.62, 55, 1,'Habilitado', 1,'Cazador',2),
('G6789', 'Caspian Thornfield', 1, 20, 1.76, 81, 1,'Habilitado', 1,'Cazador',1),
('H0123', 'Arabella Ravenswood', 2, 18, 1.62, 58, 1,'Habilitado', 2,'Guardian',3),
('I4567', 'Maximus Ironwood', 2, 22, 1.82, 86, 1,'Habilitado', 2,'Buscador',1),
('J8901', 'Ophelia Starling', 2, 19, 1.49, 45, 1,'Habilitado', 2,'Golpeador',2),
('K2345', 'Phineas Stargazer', 2, 19, 1.78, 80, 1,'Habilitado', 2,'Golpeador',1),
('L6789', 'Isadora Flintwood', 2, 20, 1.59, 63, 1,'Habilitado', 2,'Cazador',3),
('M0123', 'Lucius Ravenscroft', 2, 22, 1.83, 79, 1,'Habilitado', 2,'Cazador',3),
('N4567', 'Rosalind Holloway', 2, 19, 1.75, 50, 1,'Habilitado', 2,'Cazador',1),
('O8901', 'Ambrose Pendragon', 3, 20, 1.56, 55, 1,'Habilitado', 3,'Guardian',2),
('P2345', 'Rowena Whitewood', 3, 19, 1.59, 49, 1,'Habilitado', 3,'Buscador',3),
('Q6789', 'Ignatius Blackwood', 3, 22, 1.85, 89, 1,'Habilitado', 3,'Golpeador',2),
('R0123', 'Imogen Heartwood', 3, 18, 1.56, 55, 1,'Habilitado', 3,'Golpeador',2),
('S4567', 'Augustus Ravenscar', 3, 20, 1.78, 80, 1,'Habilitado', 3,'Cazador',1),
('T8901', 'Felicity Ashborne', 3, 19, 1.59, 55, 1,'Habilitado', 3,'Cazador',2),
('U2345', 'Benedict Lightfoot', 3, 22, 1.79, 87, 1,'Habilitado', 3,'Cazador',1),
('V6789', 'Seraphina Blackthorne', 4, 21, 1.56, 62, 1,'Habilitado', 4,'Guardian',3),
('W0123', 'Atticus Gryffindor', 4, 22, 1.79, 84, 1,'Habilitado', 4,'Buscador',1),
('X4567', 'Lavinia Nightshade', 4, 19, 1.62, 71, 1,'Habilitado', 4,'Golpeador',2),
('Y8901', 'Octavius Winterbourne', 4, 20, 1.86, 89, 1,'Habilitado', 4,'Golpeador',2),
('Z2345', 'Marigold Thistlebrook', 4, 21, 1.62, 58, 1,'Habilitado', 4,'Cazador',3),
('1234A', 'Alaric Stormrider', 4, 22, 1.89, 95, 1,'Habilitado', 4,'Cazador',1),
('5678B', 'Evangeline Moonstone', 4, 19, 1.65, 60, 1,'Habilitado', 4,'Cazador',2),
('9012C', 'Orion Ravensdale', 5, 20, 1.87, 93, 2,'Habilitado', 5,'Guardian',2),
('3456D', 'Arabella Hawthorne', 5, 21, 1.56, 62, 2,'Habilitado', 5,'Buscador',2),
('7890E', 'Tristan Wilde', 5, 22, 1.79, 83, 2,'Habilitado', 5,'Golpeador',3),
('2345F', 'Aurora Stargazer', 5, 18, 1.49, 45, 2,'Habilitado', 5,'Golpeador',1),
('6789G', 'Cedric Thorne', 5, 22, 1.79, 73, 2,'Habilitado', 5,'Cazador',2),
('0123H', 'Ophelia Everhart', 5, 19, 1.66, 79, 2,'Habilitado', 5,'Cazador',2),
('4567I', 'Casimir Ravenshadow', 5, 18, 1.87, 92, 2,'Habilitado', 5,'Cazador',1),
('8901J', 'Rosalind Thistledown', 6, 22, 1.65, 56, 2,'Habilitado', 6,'Guardian',3),
('2345K', 'Lucinda Moonlight', 6, 19, 1.53, 43, 2,'Habilitado', 6,'Buscador',3),
('6789L', 'Jasper Whitewood', 6, 21, 1.78, 86, 2,'Habilitado', 6,'Golpeador',2),
('0123M', 'Penelope Ashthorn', 6, 19, 1.58, 65, 2,'Habilitado', 6,'Golpeador',1),
('4567N', 'Magnus Nightshade', 6, 21, 1.79, 68, 2,'Habilitado', 6,'Cazador',3),
('8901O', 'Evangeline Winterbourne', 6, 18, 1.64, 70, 2,'Habilitado', 6,'Cazador',1),
('2345P', 'Phineas Blackthorn', 6, 22, 1.83, 76, 2,'Habilitado', 6,'Cazador',2),
('6789Q', 'Cordelia Ravenswood', 7, 18, 1.58, 53, 2,'Habilitado', 7,'Guardian',3),
('0123R', 'Silas Ironwood', 7, 21, 1.60, 67, 2,'Habilitado', 7,'Buscador',2),
('4567S', 'Isolde Thornfield', 7, 18, 1.72, 75, 2,'Habilitado', 7,'Golpeador',2),
('8901T', 'Caspar Hartwood', 7, 22, 1.85, 93, 2,'Habilitado', 7,'Golpeador',2),
('2345U', 'Vivienne Ravenscar', 7, 19, 1.60, 54, 2,'Habilitado', 7,'Cazador',2),
('6789V', 'Lysander Ashborne', 7, 20, 1.84, 91, 2,'Habilitado', 7,'Cazador',3),
('0123W', 'Seraphina Lightfoot', 7, 18, 1.59, 65, 2,'Habilitado', 7,'Cazador',1),
('4567X', 'Percival Moonshadow', 8, 20, 1.76, 87, 2,'Habilitado', 8,'Guardian',2),
('8901Y', 'Imogen Holloway', 8, 19, 1.61, 57, 2,'Habilitado', 8,'Buscador',2),
('2345Z', 'Alaric Pendragon', 8, 22, 1.69, 75, 2,'Habilitado', 8,'Golpeador',2),
('A5678', 'Rowena Ashthorn', 8, 21, 1.48, 45, 2,'Habilitado', 8,'Golpeador',3),
('B9012', 'Thaddeus Blackwood', 8, 18, 1.75, 87, 2,'Habilitado', 8,'Cazador',2),
('C3456', 'Beatrix Ravensdale', 8, 20, 1.64, 60, 2,'Habilitado', 8,'Cazador',3),
('D7890', 'Orion Flintwood', 8, 19, 1.74, 69, 2,'Habilitado', 8,'Cazador',1);

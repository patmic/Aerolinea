-- Active: 1677234517062@@127.0.0.1@3306

-- todo lo que permite crear su tablas

.version.database.show.tables
CREATE TABLE
    VUELOS(
        ID_VUELO INTEGER PRIMARY KEY AUTOINCREMENT,
        ESTADO VARCHAR(1) DEFAULT('S'),
        TIPO_VUELO INTEGER,
        LUGAR_PARTIDA VARCHAR(30),
        LUGAR_DESTINO VARCHAR(30),
        PRECIO_POR_PERSONA FLOAT,
        RECOMENDACION VARCHAR(1),
        CLASE_VUELO VARCHAR(15),
        LATAM_PASS VARCHAR(1),
        CLASE_PRECIO INTEGER,
        FECHA_SALIDA VARCHAR(25),
        FECHA_VUELTA VARCHAR(25),
        TIEMPO_SALIDA VARCHAR(25),
        TIEMPO_LLEGADA VARCHAR(25)
    );

DROP TABLE VUELOS;

DESCRIBE TABLE VUELOS;

INSERT INTO
    VUELOS (
        ESTADO,
        TIPO_VUELO,
        LUGAR_PARTIDA,
        LUGAR_DESTINO,
        PRECIO_POR_PERSONA,
        RECOMENDACION,
        CLASE_VUELO,
        LATAM_PASS,
        CLASE_PRECIO,
        FECHA_SALIDA,
        FECHA_VUELTA,
        TIEMPO_SALIDA,
        TIEMPO_LLEGADA
    )
VALUES (
        'S',
        2,
        "Guayaquil, GYE - Ecuador",
        "Quito, UIO - Ecuador",
        85.52,
        'S',
        "Directo",
        'S',
        2,
        "28/02/2023",
        "07/03/2023",
        "06:00",
        "06:50"
    ), (
        'S',
        2,
        "Guayaquil, GYE - Ecuador",
        "Quito, UIO - Ecuador",
        50.80,
        'N',
        "Directo",
        'S',
        1,
        "28/02/2023",
        "03/03/2023",
        "07:05",
        "07:55"
    );

SELECT * FROM VUELOS;
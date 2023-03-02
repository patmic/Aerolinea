/* Copyright (C) 2K23, pat_mic
------------------------------
Creacion de la tabla Localidad con datos
30.ene.2k23
Version 1.0
*/

DROP TABLE IF EXISTS CLIENTE;
CREATE TABLE IF NOT EXISTS CLIENTE
(    ID_CLIENTE         INTEGER PRIMARY KEY AUTOINCREMENT
    ,CLIENTE            VARCHAR(50) NOT NULL
    ,TIPOCLIENTE        VARCHAR(50) NOT NULL
    ,CORREO             VARCHAR(50) NOT NULL
);
------------------------------------------------------------------------
INSERT INTO CLIENTE   (ID_CLIENTE, CLIENTE, TIPOCLIENTE ,CORREO )
            VALUES      (1, 'Carlos', 'Premium','carlos.villareal@epn.edu.ec'); 
INSERT INTO CLIENTE   (ID_CLIENTE, CLIENTE, TIPOCLIENTE ,CORREO )
            VALUES      (2, 'Damaris', 'Estandar' ,'damaris.suquillo@epn.edu.ec'); 
INSERT INTO CLIENTE   (ID_CLIENTE, CLIENTE, TIPOCLIENTE ,CORREO )
            VALUES      (3, 'Francis', 'Premium' ,'francis.velastegui@epn.edu.ec'); 
INSERT INTO CLIENTE   (ID_CLIENTE, CLIENTE, TIPOCLIENTE ,CORREO )
            VALUES      (4, 'Stalin', 'Estandar' ,'stalin.yungan@epn.edu.ec');
INSERT INTO CLIENTE   (ID_CLIENTE, CLIENTE, TIPOCLIENTE ,CORREO )
            VALUES      (5, 'Alexa', 'Premium','mercedes.martinez@epn.edu.ec');
------------------------------------------------------------------------
SELECT * FROM CLIENTE;

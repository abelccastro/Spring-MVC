/*
Created: 6/5/2017
Modified: 6/6/2017
Model: PostgreSQL 9.4
Database: PostgreSQL 9.4
*/


-- Create tables section -------------------------------------------------

-- Table persona

CREATE TABLE "persona"(
 "id" Serial NOT NULL,
 "codigo" Character varying(5) NOT NULL,
 "dni" Character varying(8) NOT NULL,
 "nombre" Character varying(20) NOT NULL,
 "apellidos" Character varying(20) NOT NULL,
 "direccion" Character varying(50),
 "fecha_nacimiento" Date NOT NULL,
 "estado" Character varying(1),
 "fecha_registro" Timestamp,
 "usuario" Integer,
 "terminal" Character varying(12)
)
;
COMMENT ON COLUMN "persona"."id" IS 'id de la persona'
;
COMMENT ON COLUMN "persona"."codigo" IS 'codigo de identificacion'
;
COMMENT ON COLUMN "persona"."dni" IS 'dni'
;
COMMENT ON COLUMN "persona"."nombre" IS 'nombres '
;
COMMENT ON COLUMN "persona"."apellidos" IS 'apellidos'
;
COMMENT ON COLUMN "persona"."direccion" IS 'direccion de domicilio'
;
COMMENT ON COLUMN "persona"."estado" IS 'A= activo, E= eliminado'
;
COMMENT ON COLUMN "persona"."fecha_registro" IS 'fecha que se realizo el registro'
;
COMMENT ON COLUMN "persona"."usuario" IS 'usuario quien realizo el registro'
;
COMMENT ON COLUMN "persona"."terminal" IS 'terminal'
;

-- Add keys for table persona

ALTER TABLE "persona" ADD CONSTRAINT "Key1" PRIMARY KEY ("id")
;

-- Table banco

CREATE TABLE "banco"(
 "id" Serial NOT NULL,
 "nombre" Character varying(20),
 "estado" Character varying(20),
 "fecha_registro" Timestamp,
 "usuario" Integer,
 "terminal" Character varying(12)
)
;

-- Add keys for table banco

ALTER TABLE "banco" ADD CONSTRAINT "Key2" PRIMARY KEY ("id")
;

-- Table trabajador

CREATE TABLE "trabajador"(
 "id" Serial NOT NULL,
 "cuspp" Character varying(6),
 "tipo_pension" Character varying(1),
 "carga_familiar" Boolean,
 "cargo" Character varying(20),
 "fecha_ingreso_planilla" Date,
 "sueldo_bruto" Numeric(5,2),
 "nro_cuenta_haberes" Character varying(12),
 "estado" Character varying(1),
 "fecha_registro" Timestamp,
 "usuario" Integer,
 "terminal" Character varying(12),
 "banco_id" Integer,
 "persona_id" Integer
)
;
COMMENT ON COLUMN "trabajador"."id" IS 'id del trabajador'
;
COMMENT ON COLUMN "trabajador"."tipo_pension" IS 'A= AFP  O=ONP'
;
COMMENT ON COLUMN "trabajador"."estado" IS 'A=activo E=cesado'
;

-- Create indexes for table trabajador

CREATE INDEX "IX_Relationship1" ON "trabajador" ("banco_id")
;

CREATE INDEX "IX_Relationship2" ON "trabajador" ("persona_id")
;

-- Add keys for table trabajador

ALTER TABLE "trabajador" ADD CONSTRAINT "Key3" PRIMARY KEY ("id")
;

-- Table horas_trabajador

CREATE TABLE "horas_trabajador"(
 "id" Serial NOT NULL,
 "total_horas" Smallint NOT NULL,
 "horas_extra" Smallint,
 "descuento_canasta" Numeric(5,2),
 "retencion_judicial" Numeric(5,2),
 "adelanto" Numeric(5,2),
 "estado" Character varying(1),
 "fecha_registro" Timestamp,
 "usuario" Integer,
 "terminal" Character varying(12),
 "trabajador_id" Integer
)
;

-- Create indexes for table horas_trabajador

CREATE INDEX "IX_Relationship3" ON "horas_trabajador" ("trabajador_id")
;

-- Add keys for table horas_trabajador

ALTER TABLE "horas_trabajador" ADD CONSTRAINT "Key4" PRIMARY KEY ("id")
;

-- Table planilla

CREATE TABLE "planilla"(
 "id" Serial NOT NULL,
 "gratificacion" Numeric(10,4),
 "cts" Numeric(10,4),
 "remuneracion" Numeric(10,4),
 "descuentos" Numeric(10,4),
 "saldo_pagado" Numeric(10,4),
 "aportes" Numeric(10,4),
 "estado" Character varying(20),
 "fecha_registro" Timestamp,
 "usuario" Integer,
 "terminal" Character varying(12),
 "trabajador_id" Integer,
 "boleta" Boolean
)
;

-- Create indexes for table planilla

CREATE INDEX "IX_Relationship4" ON "planilla" ("trabajador_id")
;

-- Add keys for table planilla

ALTER TABLE "planilla" ADD CONSTRAINT "Key5" PRIMARY KEY ("id")
;

-- Table roles

CREATE TABLE "roles"(
 "id" Serial NOT NULL,
 "nombre" Character varying(20)
)
;

-- Add keys for table roles

ALTER TABLE "roles" ADD CONSTRAINT "Key6" PRIMARY KEY ("id")
;

-- Create relationships section ------------------------------------------------- 

ALTER TABLE "trabajador" ADD CONSTRAINT "Relationship1" FOREIGN KEY ("banco_id") REFERENCES "banco" ("id") ON DELETE NO ACTION ON UPDATE NO ACTION
;

ALTER TABLE "trabajador" ADD CONSTRAINT "Relationship2" FOREIGN KEY ("persona_id") REFERENCES "persona" ("id") ON DELETE NO ACTION ON UPDATE NO ACTION
;

ALTER TABLE "horas_trabajador" ADD CONSTRAINT "Relationship3" FOREIGN KEY ("trabajador_id") REFERENCES "trabajador" ("id") ON DELETE NO ACTION ON UPDATE NO ACTION
;

ALTER TABLE "planilla" ADD CONSTRAINT "Relationship4" FOREIGN KEY ("trabajador_id") REFERENCES "trabajador" ("id") ON DELETE NO ACTION ON UPDATE NO ACTION
;






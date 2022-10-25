CREATE DATABASE contactdb;

CREATE TABLE public.contact
(
    contact_id serial NOT NULL,
    name character varying(45) NOT NULL,
    email character varying(45) NOT NULL,
    address character varying(45) NOT NULL,
    telephone character varying(45) NOT NULL,
    PRIMARY KEY (contact_id)
);

ALTER TABLE IF EXISTS public.contact
    OWNER to postgres;
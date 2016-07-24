CREATE TABLE lang (
  id         SERIAL    NOT NULL PRIMARY KEY,
  name       CHAR(255) NOT NULL,
  short_name CHAR(3)   NOT NULL
);


CREATE TABLE retail (
  id   SERIAL    NOT NULL PRIMARY KEY,
  name CHAR(255) NOT NULL
);

CREATE TABLE retail_unit (
  id         SERIAL NOT NULL PRIMARY KEY,
  retail     SERIAL REFERENCES retail (id),
  retailUnit SERIAL REFERENCES retail_unit (id)
);


CREATE TABLE doc (
  id          SERIAL    NOT NULL,
  retail_unit INT       NOT NULL REFERENCES retail_unit (id),
  lang        INT       NOT NULL REFERENCES lang (id),
  value       CHAR(255) NOT NULL,
  UNIQUE (retail_unit, lang),
  PRIMARY KEY (id)
);

CREATE TABLE category (
  id            SERIAL NOT NULL PRIMARY KEY,
  sub_category  SERIAL REFERENCES category (id),
  retail_unit   SERIAL REFERENCES retail_unit (id),
  category_name INT REFERENCES doc (id)
);

CREATE TABLE product (
  id           SERIAL NOT NULL PRIMARY KEY,
  product_name INT    NOT NULL REFERENCES doc (id),
  retail_unit  INT    NOT NULL REFERENCES retail_unit (id),
  weight       FLOAT,
  time         INT,
  available    INT    NOT NULL DEFAULT 1,
  price        FLOAT  NOT NULL,
  category     INT    NOT NULL REFERENCES category (id)
);

CREATE TABLE booking (
  id          SERIAL NOT NULL PRIMARY KEY,
  retail      SERIAL NOT NULL REFERENCES retail (id),
  product     SERIAL NOT NULL REFERENCES product (id),
  tableNumber INT    NOT NULL,
  count       INT    NOT NULL DEFAULT 1,
  complete    INT    NOT NULL DEFAULT 0
);
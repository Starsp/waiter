CREATE TABLE cafe (
    id			      SERIAL	 	NOT NULL PRIMARY KEY,
    name 		      CHAR(255)	NOT NULL
);

CREATE TABLE unit (
    id		    	  SERIAL	 	NOT NULL PRIMARY KEY,
    name 		      CHAR(255)	NOT NULL
);

CREATE TABLE category (
    id			      SERIAL	 	NOT NULL PRIMARY KEY,
    parentID		  SERIAL   		       REFERENCES category(id),
    name 		      CHAR(255)	NOT NULL
);

CREATE TABLE product (
   id			        SERIAL		NOT NULL PRIMARY KEY,
   name			      CHAR		  NOT NULL,
   unitID		      SERIAL		NOT NULL REFERENCES unit(id),
   output		      SERIAL		NOT NULL,
   composition		CHAR		  NOT NULL,
   time			      INT,
   available	  	INT		    NOT NULL DEFAULT 1,
   price		      INT		    NOT NULL,
   categoryID		  SERIAL		NOT NULL REFERENCES category(id)
);

CREATE TABLE booking (
 id 			        SERIAL		NOT NULL PRIMARY KEY,
 cafeID			      SERIAL		NOT NULL REFERENCES cafe(id),
 productID		    SERIAL		NOT NULL REFERENCES product(id),
 tableNumber		  INT		    NOT NULL,
 count		      	INT		    NOT NULL DEFAULT 1,
 complete		      INT	    	NOT NULL DEFAULT 0
);
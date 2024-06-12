CREATE TABLE IF NOT EXISTS Taco_Order (
    id identity,
    delivery_Name varchar(50) NOT NULL,
    delivery_Street varchar(50) NOT NULL,
    delivery_City varchar(50) NOT NULL,
    delivery_State varchar(50) NOT NULL,
    delivery_Zip varchar(50) NOT NULL,
    cc_number varchar(16) NOT NULL,
    cc_expiration varchar(5) NOT NULL,
    cc_cvv varchar(3) NOT NULL,
    placed_at timestamp NOT NULL
);

CREATE TABLE IF NOT EXISTS Taco (
    id identity,
    name varchar(50) NOT NULL,
    taco_order bigint NOT NULL,
    taco_order_key bigint NOT NULL,
    created_at timestamp NOT NULL
);

CREATE TABLE IF NOT EXISTS Ingredient_Ref (
    ingredient varchar(4) NOT NULL,
    taco bigint NOT NULL,
    taco_key bigint NOT NULL
);

CREATE TABLE IF NOT EXISTS Ingredient (
    id varchar(4) NOT NULL PRIMARY KEY,
    name varchar(25) NOT NULL,
    type varchar(10) NOT NULL
);

ALTER TABLE Taco
    ADD FOREIGN KEY (taco_order) REFERENCES Taco_Order(id);
ALTER TABLE Ingredient_Ref
    ADD FOREIGN KEY (ingredient) REFERENCES Ingredient(id);
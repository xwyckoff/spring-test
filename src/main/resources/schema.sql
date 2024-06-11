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
    ) 
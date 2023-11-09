CREATE TABLE IF NOT EXISTS transaction (
    id SERIAL primary key,
    type int,
    date date,
    value decimal,
    cpf bigint,
    card varchar(255),
    hour time,
    owner_shop varchar(255),
    shop_name varchar(155)
);
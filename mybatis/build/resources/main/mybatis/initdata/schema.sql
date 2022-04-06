DROP TABLE IF EXISTS award;

CREATE TABLE award
(
    id     INT GENERATED ALWAYS AS IDENTITY,
    name   VARCHAR(255)    NOT NULL,
    year   INT             NOT NULL
);


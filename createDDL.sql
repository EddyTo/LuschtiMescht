CREATE TABLE USER (ID BIGINT NOT NULL, EMAIL VARCHAR(255), GAMELIST LONGBLOB, PASSWORD VARCHAR(255), SCORE INTEGER, USERNAME VARCHAR(255), PRIMARY KEY (ID))
CREATE TABLE SEQUENCE (SEQ_NAME VARCHAR(50) NOT NULL, SEQ_COUNT DECIMAL(38), PRIMARY KEY (SEQ_NAME))
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('SEQ_GEN', 0)

create table STORE(
    stNo varchar2(5) PRIMARY key,
    stNm varchar2(50) not null,
    stAddr varchar2(100) not null
);

insert into store values ('1001','yeouido','서울특별시 영등포구 국제금융로2길 32');
insert into store values ('2001','suwon','경기도 수원시 팔달구 중부대로 100');
insert into store values ('2002','yongin','서울특별시 영등포구 국제금융로2길 32');
SELECT * FROM store;
create table PAYMENT (
    payNo char(1) PRIMARY key,
    payNm varchar2(50) not null
);

insert into payment values ('1','cash');
insert into payment values ('2','debit card');
insert into payment values ('3','credit card');
insert into payment values ('4','mobile voucher');
SELECT * FROM payment;
create table ORDTYPE (
    typeNo char(1) PRIMARY key,
    typeNm varchar2(50) not null
);

insert into ordtype values ('1','online-takeout');
insert into ordtype values ('2','online-deliver');
insert into ordtype values ('3','offline-takeout');
insert into ordtype values ('4','offline-forhere');
SELECT * FROM ORDTYPE ;
create table ACCOUNT (
    id varchar2(20) PRIMARY key,
    password varchar2(20) not null,
    stNo varchar2(5) not null references store(stNo)
);

insert into account values ('yeouido1001','1234','1001');
insert into account values ('suwon2001','1234','2001');
insert into account values ('yongin2002','1234','2002');
SELECT * FROM ACCOUNT ;
CREATE TABLE CATEGORY
(CATNO VARCHAR2(5) NOT NULL,
CATNM VARCHAR2(30),
PRIMARY KEY (CATNO));

insert into category values ('CAF','커피');
insert into category values ('BCF','브루드 커피');
insert into category values ('ADE','에이드');
insert into category values ('BTD','착즙주스(병음료)');
insert into category values ('TEA','티');
insert into category values ('BBT','버블티');
insert into category values ('SHK','쉐이크');
insert into category values ('SMT','스무디');
insert into category values ('CAK','케이크');
insert into category values ('MUF','머핀');
insert into category values ('MCR','마카롱');
insert into category values ('COK','쿠키');
SELECT * FROM CATEGORY ;
CREATE TABLE GOODS
(GDNO VARCHAR2(10) NOT NULL,
GDNM VARCHAR2(50) NOT NULL,
PRICE NUMBER NOT NULL,
CATNO VARCHAR2(5) NOT NULL,
PRIMARY KEY (GDNO));
SELECT * FROM goods;
alter table category add foreign key (catno) references category(catno);

insert into goods values('CAF01','아메리카노',3000,'CAF');
insert into goods values('CAF02','카페 라떼',3500,'CAF');
insert into goods values('CAF03','바닐라 라떼',4000,'CAF');
insert into goods values('CAF04','카페 모카',4000,'CAF');
insert into goods values('CAF05','토피넛 라떼',4000,'CAF');
insert into goods values('CAF06','카라멜 마키아또',4500,'CAF');
insert into goods values('BCF01','콜드브루 아메리카노',3500,'BCF');
insert into goods values('BCF02','콜드브루 라떼',4000,'BCF');
insert into goods values('BCF03','더치 아메리카노',3500,'BCF');
insert into goods values('BCF04','더치 라떼',4000,'BCF');
insert into goods values('ADE01','레몬 에이드',5500,'ADE');
insert into goods values('ADE02','자몽 에이드',5500,'ADE');
insert into goods values('ADE03','유자 에이드',5500,'ADE');
insert into goods values('BTD01','오렌지 주스',6000,'BTD');
insert into goods values('BTD02','포도 주스',6000,'BTD');
insert into goods values('BTD03','수박 주스',6000,'BTD');
insert into goods values('BTD04','토마토 주스',6500,'BTD');
insert into goods values('BTD05','당근 주스',6500,'BTD');
insert into goods values('TEA01','그린티',6200,'TEA');
insert into goods values('TEA02','케모마일',6800,'TEA');
insert into goods values('TEA03','히비스커스',6800,'TEA');
insert into goods values('BBT01','흑당 버블티',7000,'BBT');
insert into goods values('BBT02','타로 버블티',7000,'BBT');
insert into goods values('SHK01','바닐라 쉐이크',6500,'SHK');
insert into goods values('SHK02','쿠앤크 쉐이크',6800,'SHK');
insert into goods values('SHK03','밀크 쉐이크',6300,'SHK');
insert into goods values('SHK04','딸기 쉐이크',6500,'SHK');
insert into goods values('SMT01','망고 스무디',7300,'SMT');
insert into goods values('SMT02','블루베리 스무디',7300,'SMT');
insert into goods values('SMT03','딸기 스무디',7300,'SMT');
insert into goods values('SMT04','요거트 스무디',7300,'SMT');
insert into goods values('CAK01','고구마 케이크',32000,'CAK');
insert into goods values('CAK02','당근 케이크',37000,'CAK');
insert into goods values('CAK03','스트로베리 초콜릿 생크림 케이크',33000,'CAK');
insert into goods values('CAK04','치즈 케이크',35000,'CAK');
insert into goods values('CAK05','레드벨벳 케이크',34000,'CAK');
insert into goods values('CAK06','티라미슈 케이크',35000,'CAK');
insert into goods values('MUF01','초코 머핀',3600,'MUF');
insert into goods values('MUF02','치즈 머핀',3600,'MUF');
insert into goods values('MUF03','레드벨벳 머핀',3800,'MUF');
insert into goods values('MCR01','초코 마카롱',3500,'MCR');
insert into goods values('MCR02','바닐라빈 마카롱',3500,'MCR');
insert into goods values('MCR03','쿠앤크 마카롱',4000,'MCR');
insert into goods values('MCR04','로투스 마카롱',4000,'MCR');
insert into goods values('COK01','레이즌 오트밀',1300,'COK');
insert into goods values('COK02','더블 초코 쿠키',1300,'COK');
insert into goods values('COK03','마카다미아 쿠키',1500,'COK');
insert into goods values('COK04','스모어스 쿠키',1500,'COK');

CREATE TABLE mgoal
(GOALYM VARCHAR2(10) NOT NULL,
MONTHGOALSALES LONG DEFAULT 0 NOT NULL,
STNO VARCHAR2(5) NOT NULL,
constraint mgoal_PK primary key(goalYm,stno));
SELECT * FROM mgoal;
alter table mgoal add foreign key (stno) references store(stno);

CREATE TABLE ygoal
(GOALYy VARCHAR2(10) NOT NULL,
yearGOALSALES LONG DEFAULT 0 NOT NULL,
STNO VARCHAR2(5) NOT NULL,
constraint ygoal_PK primary key(goalYy,stno));
SELECT * FROM YGOAL ;
alter table mgoal add foreign key (stno) references store(stno);

SELECT * FROM tabs;

CREATE TABLE ORD
(
    ordNo     INT            NOT NULL, 
    stNo      VARCHAR2(5)    NOT NULL, 
    ordDt     DATE           NOT NULL, 
    typeNo    CHAR(1)        NOT NULL, 
    payNo     CHAR(1)        NOT NULL, 
     PRIMARY KEY (ordNo)
);

CREATE SEQUENCE ORD_SEQ
START WITH 1
INCREMENT BY 1;

CREATE OR REPLACE TRIGGER ORD_AI_TRG
BEFORE INSERT ON ORD 
REFERENCING NEW AS NEW FOR EACH ROW 
BEGIN 
    SELECT ORD_SEQ.NEXTVAL
    INTO :NEW.ordNo
    FROM DUAL;
END;

ALTER TABLE ORD
    ADD CONSTRAINT FK_ORD_stNo_STORE_stNo FOREIGN KEY (stNo)
        REFERENCES STORE (stNo);

       ALTER TABLE ORD
    ADD CONSTRAINT FK_ORD_typeNo_ORDTYPE_typeNo FOREIGN KEY (typeNo)
        REFERENCES ORDTYPE (typeNo);

       ALTER TABLE ORD
    ADD CONSTRAINT FK_ORD_payNo_PAYMENT_payNo FOREIGN KEY (payNo)
        REFERENCES PAYMENT (payNo);

CREATE TABLE DETAIL
(
    detailNo    INT             NOT NULL, 
    ordNo       INT             NOT NULL, 
    gdNo        VARCHAR2(10)    NOT NULL, 
    ordQn       INT             NOT NULL, 
    totPrice    INT             NOT NULL, 
     PRIMARY KEY (detailNo)
);

CREATE SEQUENCE DETAIL_SEQ
START WITH 1
INCREMENT BY 1;

CREATE OR REPLACE TRIGGER DETAIL_AI_TRG
BEFORE INSERT ON DETAIL 
REFERENCING NEW AS NEW FOR EACH ROW 
BEGIN 
    SELECT DETAIL_SEQ.NEXTVAL
    INTO :NEW.detailNo
    FROM DUAL;
END;

ALTER TABLE DETAIL
    ADD CONSTRAINT FK_DETAIL_ordNo_ORD_ordNo FOREIGN KEY (ordNo)
        REFERENCES ORD (ordNo);

       ALTER TABLE DETAIL
    ADD CONSTRAINT FK_DETAIL_gdNo_GOODS_gdNo FOREIGN KEY (gdNo)
        REFERENCES GOODS (gdNo);

SELECT * FROM ord;

SELECT * FROM detail;

COMMIT;
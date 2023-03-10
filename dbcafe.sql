create table store(
    stNo varchar2(5) primary key not NULL,
    stNm varchar2(50) not null,
    stAddr varchar2(100) not NULL
);
insert into store values('1001', '여의도', '서울');
update store set stNm = '여의도' where stNo='1001';
insert into store values('2001', '수원', '경기도');

select * from store;

drop table account;
create table account(
    id varchar2(20) primary key,
    stNo varchar2(5) not null,
    password varchar2(20) not null
);

alter table account
add CONSTRAINT stNo foreign key (stNo) references store(stNo);

insert into account values('yeouido1001','1001','qwer1234');
insert into account values('suwon2001','2001','qwer5678');

SELECT s.*  FROM ACCOUNT a, STORE s WHERE a.STNO =s.STNO AND a.ID ='yeouido1001';
SELECT id, password, stNo FROM ACCOUNT a WHERE id='yeouido1001';

select * from account;
select * from store;
select * from goods;
select * from category;

insert into goods values('CAF01',3000,'CAF','아메리카노');
insert into goods values('CAF02',3500,'CAF','카페 라떼');
insert into goods values('CAF03',3500,'CAF','바닐라 라떼');
insert into goods values('CAF04',3500,'CAF','카페 모카');
insert into goods values('CAF05',3500,'CAF','토피넛 라떼');
insert into goods values('CAF06',3500,'CAF','카라멜 마키아또');
insert into goods values('BCF01',3500,'BCF','콜드브루 아메리카노');
insert into goods values('BCF02',4000,'BCF','콜드브루 라떼');
insert into goods values('BCF03',3500,'BCF','더치 아메리카노');
insert into goods values('BCF04',4000,'BCF','더치 라떼');

create table goods(
    gdNo varchar2(10) primary key,
    price int not null,
    catNo varchar2(50) NOT NULL,
    gdNm varchar2(100) NOT NULL
);
alter table goods add CONSTRAINT catNo foreign key (catNo) references category(catNo);
select * from goods;
create table category(
    catNo varchar2(50) primary key,
    catNm varchar2(100) NOT NULL
);

insert into category values('CAF','커피');
insert into category values('BCF','브루드 커피');

create table menuYn(
    gdYn char(1) not null,
    gdNo varchar2(10) not null,
    stNo varchar2(5) not null
);
drop table menuYn;
alter table menuYn add constraint fk_stNo foreign key (stNo) references store (stNo);
alter table menuYn add constraint gdNo foreign key (gdNo) references goods (gdNO);

alter table menuYn add constraint pk_menuYn primary key(stNo, gdNo);
select * from menuYn;

select * from menuYn;

INSERT INTO menuyn values('Y','CAF01','1001');
INSERT INTO menuyn values('Y','CAF02','1001');
INSERT INTO menuyn values('Y','CAF03','1001');
INSERT INTO menuyn values('Y','CAF04','1001');
INSERT INTO menuyn values('Y','CAF05','1001');
INSERT INTO menuyn values('N','CAF06','1001');
INSERT INTO menuyn values('Y','BCF01','1001');
INSERT INTO menuyn values('Y','BCF02','1001');
INSERT INTO menuyn values('N','BCF03','1001');
INSERT INTO menuyn values('N','BCF04','1001');

INSERT INTO menuyn values('N','CAF01','2001');
INSERT INTO menuyn values('N','CAF02','2001');
INSERT INTO menuyn values('Y','CAF03','2001');
INSERT INTO menuyn values('Y','CAF04','2001');
INSERT INTO menuyn values('Y','CAF05','2001');
INSERT INTO menuyn values('N','CAF06','2001');
INSERT INTO menuyn values('Y','BCF01','2001');
INSERT INTO menuyn values('Y','BCF02','2001');
INSERT INTO menuyn values('N','BCF03','2001');
INSERT INTO menuyn values('N','BCF04','2001');

INSERT INTO menuyn values('Y','ADE01','1001');
INSERT INTO menuyn values('Y','ADE02','1001');
INSERT INTO menuyn values('Y','ADE03','1001');
INSERT INTO menuyn values('Y','BTD01','1001');
INSERT INTO menuyn values('Y','BTD02','1001');
INSERT INTO menuyn values('N','BTD03','1001');
INSERT INTO menuyn values('N','BTD04','1001');
INSERT INTO menuyn values('N','BTD05','1001');
INSERT INTO menuyn values('N','TEA01','1001');
INSERT INTO menuyn values('Y','TEA02','1001');
INSERT INTO menuyn values('Y','TEA03','1001');
INSERT INTO menuyn values('N','BBT01','1001');
INSERT INTO menuyn values('N','BBT02','1001');
INSERT INTO menuyn values('Y','SHK01','1001');
INSERT INTO menuyn values('Y','SHK02','1001');
INSERT INTO menuyn values('Y','SHK03','1001');
INSERT INTO menuyn values('Y','SHK04','1001');
INSERT INTO menuyn values('N','SMT01','1001');
INSERT INTO menuyn values('N','SMT02','1001');
INSERT INTO menuyn values('Y','SMT03','1001');
INSERT INTO menuyn values('Y','SMT04','1001');
INSERT INTO menuyn values('N','CAK01','1001');
INSERT INTO menuyn values('Y','CAK02','1001');
INSERT INTO menuyn values('N','CAK03','1001');
INSERT INTO menuyn values('N','CAK04','1001');
INSERT INTO menuyn values('Y','CAK05','1001');
INSERT INTO menuyn values('Y','CAK06','1001');
INSERT INTO menuyn values('Y','MUF01','1001');
INSERT INTO menuyn values('Y','MUF02','1001');
INSERT INTO menuyn values('Y','MUF03','1001');
INSERT INTO menuyn values('N','MCR01','1001');
INSERT INTO menuyn values('N','MCR02','1001');
INSERT INTO menuyn values('N','MCR03','1001');
INSERT INTO menuyn values('N','MCR04','1001');
INSERT INTO menuyn values('Y','COK01','1001');
INSERT INTO menuyn values('N','COK02','1001');
INSERT INTO menuyn values('N','COK03','1001');
INSERT INTO menuyn values('Y','COK04','1001');

commit;
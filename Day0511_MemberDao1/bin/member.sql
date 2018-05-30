Member table 작성하기 
num: number(10) 기본키 , 회원번호
id: varchar2(30) null허용X, 중복허용 X , 아이디
pw: varchar2(50) null허용X   비밀번호
name: varchar2(20) null허용X 이름
email: varchar2(30) null 허용X, 중복허용 X 이메일
regDate: date    기본값 sysdate    회원가입일

create table member(
	num number(10) primary key,
	id varchar2(30) not null unique,
	pw varchar2(50) not null,
	name varchar2(20) not null,
	email varchar2(30) not null unique,
	regDate date default sysdate
);

create sequence member_seq 
 start with 1 increment by 1 maxvalue 999999 cycle;








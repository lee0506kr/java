SQL(Structed Query Language)
:DBMS를 통해서 데이터 베이스에 데이터를 조회하거나, 수정, 삭제, 변경을 하기위한 언어


sqlplus / as sysdba : 관리자 권한 접속

유저생성


conn 아이디/비밀번호 ;

CREATE USER lee5656kr IDENTIFIED by "qwer4512";

유저권한주기
모든권한주기
GRANT connect,dba,resource to lee5656kr; 

CREATE TABLE[테이블명](
	[컬럼명] [자료형] [옵션..],
	[컬럼명] [자료형] [옵션..],
	[컬럼명] [자료형] [옵션..]
	
);

자료형 : 문자, 숫자, 날짜, 이진데이터
	varchar2, number, date, blob
	
학생정보를 저장하는 테이블을 만들어 봅시다.
(학생번호 - 숫자 , 이름 - 문자열, 학년 -숫자)

CREATE TABLE student_ex(
	snum number(7),
	sname varchar2(20),
	sgrade number
);

만들어진 테이블 정보확인
desc student_ex;

테이블 삭제
DROP TABLE 테이블명;
drop table 테이블명;

테이블에 데이터를 활용해서 할 수 있는 일 : 조회,삭제,수정 추가
CRUD
Create,Read,Update,Delete

테이블에 데이터 넣어주기
삽입(insert)
insert into 테이블명 values([칼럼명1], [칼렴명2]);

insert into student_ex values(1, '홍길동', 3);

조회(select)
테이블에 저장되어 있는 데이터를 조회

select [칼럼명],[칼럼명],[칼럼명]
	from[테이블명]
------------------------------
	where[조건] 특정 ROW를 조회하고자 할 때 사용
	
	ex) select snum,sname,sgrade
			from student_ex;
			
 모든 칼럼을 조회할 때는 칼럼명을 쓰지 않고, *을 대신 사용해도 된다.
 select * from student_ex;
 
 현제 계정의 테이블 목록을 보여줌
 seledct * from tab;
 
 
 삭제(delete) (테이터베이스 오브젝트(테이블, 유저 , 뷰, 프로시져 등등) 삭제는 drop, 데이터 삭제는 delete)
 삭제는 로우 전체를 삭제해야 한다. >>특정 칼럼을 지칭할 필요 없다.
 wher 절이 없으면 모든 row사용
 특정한  row만 지울떄 사용
 
 
 delete frome student_ex where sname = '홍길동';
 
 delete frome student_Ex where snum = 1;
 
 수정(update)
 존재하는 로우의 테이터 를 변경하기 위해 사용
 
 update [테이블명]
 	set =[칼럼명] == {값};
 
 	update student_ex
 	set sgrade = 1
 	where sname ='강감찬';
 

sqlplus 명령어 몇가지...
칼럼길이 조절
col 칼럼이름 for a10 : 칼럼길이를 문자열 10개로 표시
col 칼럼이름 for 999 : 칼럼길이를 뒤쪽 숫자의 길이만큼 표시

set linesize 400;
set pagesize 2; 
 	
PreparedStatement;
 sql을 좀더 쉽게 작성할 수 있게 만들어 놓은 statment
 
ex) insert into student
	values (?,?,?,);


	
 	
 	

Join
두 개 이상의 테이블에서 데이터를 조회할 때 사용

select *
  from emp,dept

emp : 12줄
dept: 4줄

동등조인 (INNER JOIN)
	쓸데없는 데이터가 포함되어 있기 때문에 조건을 주어야 한다. 
	  : 가장많이 사용하는 조인 방법
	 양쪽 테이블 모두에 데이터가 존재할 경우에 조회
	select *
	  from emp e ,dept d
	 where e.deptno = d.deptno
	  order by ename;
	 
	emp테이블과 dept 테이블에서 
	모든직원의 이름과 부서번호,부서이름,근무지 를 조회하시오. 
	칼럼이름이 중복되는 경우에 테이블 이름을 명시 해주어야 한다.
	>>Alias 사용권장
	select e.ename,d.dname,d.loc,e.deptno
	 from emp e,dept d
	where e.deptno = d.deptno
	
	select ename,dname,loc,emp.deptno
	 from emp,dept
	 where emp.deptno = dept.deptno
	
	self join
	자기 자신과 join
	모든 사원의 이름, 업무, 매니저의 번호, 매니저의 이름 을 조회
	select e1.ename, e1.job, e1.mgr,e2.ename 
	  from emp e1, emp e2
	 where e1.mgr = e2.empno

	 동등조인의 다른 문법 1	 
	 select *
	   from emp e join dept d
	     on e.deptno = d.deptno 
	 동등조인의 다른 문법 2	  
	  select *
	    from emp e join dept d
	   using (deptno)
     
OUTER JOIN
 조인하려는 테이블에 양쪽에 데이터가 동등하게 있지 않아도 출력할 때 사용   
 
 select e1.ename, e1.job, e1.mgr, e2.ename
   from emp e1 left outer join emp e2
     on e1.mgr = e2.empno
 
  OUTER JOIN oracle
  INNER JOIN 에 없어도 출력하고자 하는 조건문 뒤에 (+) 붙여 주면 됩니다.
  select e1.ename, e1.job, e1.mgr, e2.ename
    from emp e1, emp e2
   where e1.mgr = e2.empno(+)  <<left outer join
  
  
  ---3개 이상의 테이블 조인---
  select e1.ename, 
         e1.job, 
         e1.mgr,
         e2.ename,
         e1.deptno,
         d.dname,
         d.loc
    from emp e1, emp e2, dept d
   where e1.mgr = e2.empno(+)
     and e1.deptno = d.deptno
   
   select e1.ename, 
          e1.job, 
          e1.mgr,
          e2.ename,
          d.dname,
          d.loc
	  from emp e1 left outer join emp e2
	    on e1.mgr = e2.empno
      join dept d
        on e1.deptno = d.deptno
     
---------------------------------------------------
	조인의 조건이 항상 '=' 만 이용하는건 아니다...
	조인의 조건을 범위로도 지정할 수 있다. 
	ex) 직원의 급여에 따른 급여 등급 조회하기 이름, 급여, 급여 등급 조회 
	select e.ename, e.sal, s.grade
	  from emp e, salgrade s
	 where e.sal between s.losal and s.hisal
 1.emp, salgrade, dept 테이블에서  
  직원의 급여에 따른 급여 등급 조회하기 이름, 급여, 급여 등급,부서번호,부서이름
   select e.ename 이름, 
          e.sal 급여, 
          s.grade 급여등급, 
          d.dname 부서, 
          d.loc 부서위치,
          d.deptno 부서번호
     from emp e, salgrade s, dept d
    where e.deptno = d.deptno
      and e.sal between s.losal and s.hisal   
  
 2. emp,dept 사원 이름과 그 사원이 소속된 부서 이름과 지역명
   select e.ename 사원이름, d.dname 소속부서, d.loc 지역
	  from emp e, dept d
	 where e.deptno = d.deptno 
 
 
 3. emp,dept 10번 부서에서 담당하는 모든 업무와 지역명
 select e.job 담당업무, d.loc 지역   
	  from emp e, dept d
	 where e.deptno = 10 
	   and e.deptno = d.deptno
 
 *4. emp,dept 사원의 이름,업무지역,매니저 이름,매니저 업무지역 조회
	 select e1.ename, d1.loc, e2.ename, d2.loc
	   from emp e1,emp e2, dept d1,dept d2
	  where e1.mgr = e2.empno(+)
	    and e1.deptno = d1.deptno
	    and e2.deptno = d2.deptno(+)
 
 5. 'SMITH' 와 동일한 부서에서 근무하는 사원의 이름 조회 
   select e1.ename 사원, e1.deptno 부서번호, e2.ename 부서원
     from emp e1, emp e2
    where e1.deptno = e2.deptno
      and e1.ename = 'SMITH'
 
 6. 'KING' 보다 늦게 입사한 사원의 이름과 입사일 조회
 
	select e2.ename, e2.hiredate
	  from emp e1, emp e2
	 where e1.ename = 'KING'
	   and e1.hiredate < e2.hiredate

 7. 자신의 관리자보다 먼저 입사한 모든 사원의 이름, 입사일, 
    부서이름, 관리자이름, 관리자 입사일	 
	select e1.ename 이름, e1.hiredate, d.dname, e2.ename, e2.hiredate
      from emp e1, emp e2, dept d
     where e1.mgr = e2.empno
       and e1.deptno = d.deptno
       and e1.hiredate < e2.hiredate  
        
        
        
        
     
 
     
     
     
     
     
 
 
 
	   
	   
	   
 
  
  
  
  
  
  



 
 
 
  
  
  
  
  
  
  
  
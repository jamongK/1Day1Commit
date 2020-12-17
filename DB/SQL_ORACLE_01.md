# SQL

### **DDL  Data Definition Language  데이터 정의어**

- 데이터 베이스 객체에 대해 **CREATE, ALTER, DROP**

    주로 DDL은 아래와 같이 사용된다 

    - 테이블 생성 → **CREATE**
    - 테이블 수정 → **ALTER**
    - 테이블 삭제 → **DROP**

&nbsp;

### DML  **Data Manipulation Language  데이터 조작어**

- 테이블 객체의 행에 대해서 **SELECT, INSERT, UPDATE, DELETE**

&nbsp;

### DCL  **Data Control Language  데이터 제어어**

- user, role에 대해서 권한 **GRANT**(부여), **REVOKE**(회수)

&nbsp;

---

&nbsp;

### DQL1

테이블의 데이터를 검색하기 위한 명령어

명령어의 조회결과를 **ResultSet**(결과집합)이라고 함.

**ResultSet**은 0개 이상의 행으로 구성됨.

특정 컬럼, 특정 햄을 조회 가능, 정렬 지원

&nbsp;

### DQL1 문법 (5-1-2-3-4-6)

- **select** 검색하고자 하는 컬럼 나열 (컬럼명들 나열 or * 활용)
- **from** 조회대상 테이블
- **where** 특정 행 선택할 기준 조건절 (true 결과집합 포함, false 결과집합 미포함)
- **group by** 그룹핑 조건
- **having**
- **order by** 정렬기준

&nbsp;


```sql
--여러 컬럼 추출
select emp_name, phone
from employee;

--모든 컬럼 추출
select *
from employee;

--dept_code = 'D9'에 해당하는 모든 컬럼 추출
select *
from employee
where dept_code = 'D9';

--salary >= 3000000에 해당하는 모든 컬럼 추출
select *
from employee
where salary >= 3000000;

--모든 컬럼을 emp_name기준 내림차순으로 추출
select *
From Employee
Order By emp_name desc; -- desc : 역순(내림차순)

--조건+정렬조건+모든컬럼
select *
From Employee
where DEPT_CODE = 'D9'
Order By emp_name desc; -- desc : 역순(내림차순)

--null처리 함수 : nvl(column, null일때 value)
--ex. nvl(bonus, 0)
--bonus가 있다면 bonus값을 추출, bonus가 null이라면 0값으로 추출
select emp_name, salary, bonus, 
        nvl(bonus, 0), salary + (salary * nvl(bonus, 0))
from employee;
```

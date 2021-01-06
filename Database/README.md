# :pushpin: Notes

## JDBC
### 1
```java
// 잘못된 코드
String sql = "select * from member where member_name like '%?%'";
/*...*/
pstmt.setString(1, name);
```
String sql 값은 % ? %가 아닌 아예 ? 만 써야한다. 여기서 % 연산자를 쓰는 것 X 

PreparedStatement pstmt을 **setString()** 할 때 % 연산자를 써야 한다. 

그러므로, setString()에 name만 쓰면 안되고 ```"%" + name + "%"``` 처럼 써야 한다.

```java
// 수정한 코드 
String sql = "select * from member where member_name like ?";
/*...*/
pstmt.setString(1,"%"+name+"%");
```

# boolean contains(CharSequence s)

문자열 포함 여부 확인 메소드

```java
String str = "my java test";
		  
System.out.println(str.contains("java")); // true
System.out.println(str.contains(" my")); // false, 띄어쓰기 무시하지 않음
System.out.println(str.contains("JAVA")); // false, 대소문자 구분
System.out.println(str.contains("java test")); // true
```

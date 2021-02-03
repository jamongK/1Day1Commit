# Servlet 이해

복습: No
작성일시: 2021년 2월 3일 오후 7:16

# 1

```html
<form name="personFrm" action="/web/testPerson2.do" method="POST">
```

보통, 자료 URL 쓸때 디렉터리 주소 풀로 다 쓰잖음?

근데

```html
action="/web/testPerson2.do"
```

이 부분을 보면 원래

```html
action="/web/com/kh/servlet/testPerson2.do"
```

이래야 하는데 그렇지 않다는 걸 볼 수 있음.

&nbsp;

## 왜 그런가?

web.xml에서 해당 서블릿에 대한 url-pattern을 지정해줬기 때문.

com.kh.servlet.TestPersonServlet2 클래스(자바파일, 서블릿)를 선언하고

(서블릿과 해당 서블릿에 대한 이름 지어줌.),

아래에 매핑하려는 서블릿 이름을 적어주고(위, 아래 servlet-name이 같은 이유가 그것.)

그 서블릿의 url-pattern을 지정한다.

구조

```html
<servlet>
	<servlet-name>(이름)</servlet-name>
	<servlet-class>(해당 서블릿 클래스명(패키지명까지 포함해서))</servlet-class>
</servlet>
<servlet-mapping>
	<servlet-name>(이름)</servlet-name>
	<url-pattern>/(쓰고자하는 url 패턴)</url-pattern>
</servlet-mapping>
```

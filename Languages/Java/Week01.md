# :sunny: Week 01(281020 ~ 301020)

## 주석
: JVM (Java Virtual Machine)에 의해서 **해석되지 않는** 라인. 

(프로그래밍적으로 해석되지 않는다.)

&nbsp;

### 주석 종류
```
// 행단위 주석

/*
 * 블럭단위 주석 : 여러 줄 작성시 용이
 */
 
/**
 * 문서화 주석
 * : 문서에 포함할 내용을 작성함
 * 클래스, 인터페이스 그리고 멤버 당 하나씩 가질 수 있고, 선언 바로 전에 작성
 */
 
 // 이클립스 상에서 /** 를 치고 ctrl + space를 누르면 자동으로 문서화 주석이 완성된다.
```
```
/**
* (클래스 레벨)
* The AddNum program implements an application that (클래스(프로그램) 설명)
* simply adds two given integer numbers and Prints
* the output on the screen.
*
* @author  Zara Ali (제작자 표기)
*
* (기타)
* @version 1.0
* @since   2014-03-31
*/
```
```
/**
   * (메소드 레벨)
   * This is the main method which makes use of addNum method. (메소드 설명, 정의)
   * @param args Unused. (변수 설명, 정의)
   * 
   * (기타)
   * @return Nothing. 
   * @exception IOException On input error.
   * @see IOException
   */
```

&nbsp;

- - -

&nbsp;

## 패키지
: 패키지는 비슷한 성격의 자바 클래스들을 모아 넣는 자바의 디렉토리이다.

(다른 패키지 내에 있다면 같은 클래스명이어도 상관없다는 점에서) 패키지는 클래스를 고유하게 하기 위해서 작성하는 것이다.

&nbsp;

```
package jamongK.run;
// 클래스 명 : Hello
```
이클립스 Navigator(또는 Window 탐색기)로 보면 jamongK라는 상위폴더 아래 하위 폴더로 run이 있는 구조로 이뤄져있다.

&nbsp;

**다른 패키지의 클래스**를 사용하려면, 다음과 같이 (클래스 선언 위에) **import 문**을 반드시 작성해야 한다.

(같은 패키지 내 클래스를 사용할 땐 import문으로 호출 할 필요 X)
```
import jamongK.run.Hello;
```
패키지는 **소문자**로 시작하고, 클래스는 **대문자**로 시작해야 한다.

그러므로, jamongK.run까지는 **패키지명(패키지 구조)**를 뜻하고, Hello라는 **클래스**가 해당 패키지내에 위치해있음을 알 수 있다. 

&nbsp;

(예시)

jdk가 제공하는 Date라는 클래스 가져다 쓰기 위한 import문과 today라는 이름으로 Date 클래스 객체화, KST 기준 요일, 월, 일, 시각, 연도 출력 코드
```
import java.util.Date;
...
Date today = new Date();
System.out.println(today);
```

&nbsp;

* java.lang 패키지는 import 없이 쓸 수 있는 유일한 패키지

&nbsp;

- - -

&nbsp;

## 객체
```
클래스명 이름 = new 클래스명();
```
클래스를 하나의 객체로 만들어주는 문법

(예시)
```
Hello h = new Hello();
```

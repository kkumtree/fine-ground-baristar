# 따로 공부하기 [21.02.28. - 21.02.99.]

> 참고 링크
- https://kils-log-of-develop.tistory.com/349
- https://catch-me-java.tistory.com/34?category=438116
- http://www.hansung.ac.kr/web/javaprogramming/4 (6장)
- https://javagoal.com/switch-statement-java/

## 목표
- 선택문 (switch/case문)
- 반복문

## 정리내용
1. 선택문 (switch/case문)
	- 다중 if문 대체 -> 다중 if문은 실행속도가 느림(보통 5개 부터)
	- switch함수의 매개변수에 들어오는 값에 따라 코드를 실행.
	- 조건에 기초한 다수의 블록 중 '**한 블록의 명령문**'을 실행.
	- `switch()`안에는 wrapper 객체를 허용, `case 값:`에는 허용하지 않는다.
2. 반복문

	1. for문: for (초기화[1]; 조건[2]; 증감[4]) { 수행문[3] }
		- 이때, 순서는 1->2->3->4->2->3->4->2... 이렇게 간다
	2. while문(입력 제어 루프): 생략
	3. do-while문(exit control loop): 적어도 한번은 반복문을 돈다.
	```java
	do {
		//body of loop
	} while (true);
	//만약 무한루프 사용시 당연히 탈출 조건 생성해야 한다.
	```
	4. labeled for문: 다중 for문에서 특정 for문을 탈출하게 하는 것.
	```java
	/*
	** 탈출을 원하는 for문 앞에 pointa: 라고 라벨링을 했다.
	** 이거 어셈블리 라벨링인데? 여튼 break 두번 칠 필요없이, 한번에 된다.
	*/

	public class lablename {
		public static void main(String args[]) {
			pointa:for (int a = 0; a < 6; a++) {
				System.out.print("a:" + a);
				for (int b = 0; b < 10; b++) {
					System.out.print(" b:" + b);
					if (b == 8) {
						break pointa;
					}
				}
			System.out.println();
			}
		}
	}
	```
	5. [J2SE 5.0~]for each: for문 이용하돼 조건식 부분이 다르다.
		- 반복횟수를 명시하는 것이 불가능하다.
		- 1스텝씩 순차적으로 반복될 때만, 사용가능.
		- 대상 객체
			1. 루프를 돌릴 수 있는 형태인 Array 혹은 Collections
			2. Iterable<E>를 상속받은 객체도 가능
	```java
	for (변수타입 변수명 : 루프를 돌릴 객체) {
    // 실행 코드
	}
	// 아래는 예시
	String[] temp = { "귤", "감", "토마토" };
	for (String e : temp) {
		System.out.println(e);
	}
	// 아래는 기존 for 문
	for (int i = 0; i < temp .length; i++) {
    	System.out.println(temp[i]);
	}
	```

## 뱀다리
1. wrapper?: 자바의 기본 타입을 객체 형식으로 다루기위한 것이다.
	- wrapper라는 클래스는 존재하지 않지만, 통칭하여 사용한다함.

	| 기본 데이터 타입 | wrapper 타입 |
	|---:|:---|
	| byte|Byte|
	| short|Short|
	| int|Integer|
	| long|Long|
	| char|Character|
	| float|Float|
	| double|Double|
	| boolean|Boolean|
	- 대체 왜 쓰나? (한성대학교 자료 참조)
	-> wrapper 객체로부터 기본 데이터 타입알아내기
	-> 문자열과 기본 데이터 타입 간의 변환
2. [Iterator vs. Iterable] Iterable<E>
	- ?? 아직 이해가 잘 안가는 부분이다. 나중에 좀 봐야될 것 같다.
	- https://devlog-wjdrbs96.tistory.com/84
	- https://hidiki.github.io/java/iterator-iterable-diff.html
3. [Java] forEach와 for each의 차이점은? ~ 나중에 읽으려고;
	- https://namocom.tistory.com/754

## 과제
> 과제 0. JUnit 5 학습하세요.
- 인텔리J, 이클립스, VS Code에서 JUnit 5로 테스트 코드 작성하는 방법에 익숙해 질 것.
> 과제 1. live-study 대시 보드를 만드는 코드를 작성하세요.
- 깃헙 이슈 1번부터 18번까지 댓글을 순회하며 댓글을 남긴 사용자를 체크 할 것.
- 참여율을 계산하세요. 총 18회에 중에 몇 %를 참여했는지 소숫점 두자리가지 보여줄 것.
- Github 자바 라이브러리를 사용하면 편리합니다.
깃헙 API를 익명으로 호출하는데 제한이 있기 때문에 본인의 깃헙 프로젝트에 이슈를 만들고 테스트를 하시면 더 자주 테스트할 수 있습니다.
> 과제 2. LinkedList를 구현하세요.
- LinkedList에 대해 공부하세요.
- 정수를 저장하는 ListNode 클래스를 구현하세요.
- ListNode add(ListNode head, ListNode nodeToAdd, int po  sition)를 구현하세요.
- ListNode remove(ListNode head, int positionToRemove)를 구현하세요.
- boolean contains(ListNode head, ListNode nodeTocheck)를 구현하세요.
> 과제 3. Stack을 구현하세요.
- int 배열을 사용해서 정수를 저장하는 Stack을 구현하세요.
- void push(int data)를 구현하세요.
- int pop()을 구현하세요.
> 과제 4. 앞서 만든 ListNode를 사용해서 Stack을 구현하세요.
- ListNode head를 가지고 있는 ListNodeStack 클래스를 구현하세요.
- void push(int data)를 구현하세요.
- int pop()을 구현하세요.
> 과제 5. Queue를 구현하세요.
- 배열을 사용해서 한번
- ListNode를 사용해서 한번.

## 과제 풀이

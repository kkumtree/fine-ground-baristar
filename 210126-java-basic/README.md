# 따로 공부하기 [21.01.26. - 21.02.07.]
> 여러가지 준비로 기한을 질질 끌다가 이제서야 작성완료

## 목표
> 자바가 제공하는 다양한 연산자를 학습
- 산술 연산자
- 비트 연산자
- 관계 연산자
- 논리 연산자
- instanceof
- assignment(=) operator
- 화살표(->) 연산자
- 3항 연산자
- 연산자 우선 순위
- (optional) Java 13. switch 연산자

## 정리내용
1. 산술 연산자: 기본적이라서 생략
	- 정수를 0으로 나누려 한다면 런타임 에러 (참조: [**ArithmeticException**](https://docs.oracle.com/javase/8/docs/api/?java/lang/ArithmeticException.html))
	- 실수를 0으로 나누면, String타입의 문자열 출력 [디버깅이 어려우므로 예외처리 필요]
2. 비트연산자, 쉬프트 연산자
	- '~': 비트 보수 연산자, 단일 연산은 수의 비트를 반대로 잡아준다. 여기서 별다른 작업을 하지 않으면 8바이트로 변경되는데, [~b & 0xFF]를 사용하면 1바이트(8bit)로 단순하게 표현이 가능하다.
	- '&' / '|': 비트 AND / OR 연산자, 이거의 설명은 생략.
	- '^': 비트 XOR 연산, 배타적 논리합. 두 비트가 다를때 1을 반환한다.
	- '<<' / '>>': Left / Right 쉬프트 연산. 2^n만큼 증 / 감.
	- '>>>' : Unsigned Right 쉬프트 연산. 음수를 보장하지 않음.
	```java
	/*
	**	쉬프트로 밀어버린 부분을 0으로 채워주는 것.
	**	(어떠한 정수에 부호를 신경쓰지 않기에 가능하다)
	*/

	long b = -2147483648;

	b = 1000 0000 0000 0000 0000 0000 0000 0000
	(b>>>1) = 0100 0000 0000 0000 0000 0000 0000 0000 //음수보장 안됨
	(b>>>30) = 10
	```
3. 관계 연산자: '==' / '!=' / '<' / '>'
4. 논리 연산자: Boolean(불, 부울) '&' / '|' / '^' 만 알아보자
	- '&': 앞 피연산이 False여도 뒤의 피연산을 진행한다. 다만 NPE(NullPointerException)을 발생시킨다. 이러면 문제가 있는거 아닌가?
	- '|': &와 같이 모두 연산을 진행한다고 함.
	- '^':(XOR)같지 않을 때, True를 반환. 배타적 논리합이니 당연한 이야기.
5. instanceof 연산자 [객체를 먼저 알아야한다는데, 일단 끄적여보자]
	> A instance of B (ex. i instance of ObjectMint)
	- A: 객체(Object) 또는 배열 값(value)가 필요하다.
	- B: 레퍼런스 타입, 단 primitive type은 연산이 불가(에러)하다.
	```java
	if ("Str" instanceof String) {} //True
	if ("" instanceof Object) {} //False
	if (null instanceof Integer) {} //False
	// Null 값은, 무조건 False로 반환.

	Object o = new int[] {2, 21, 4};
	if (o instanceof int[]) {} //True
	// int[] 배열로 선언한 Object 이기 때문에 가능
	if (o instanceof byte[]) {} //False
	// int array이기 때문에 byte 배열과 비교하면 false
	if (o instanceof Object) {} //True
	// 모든 객체 배열은 Object에 해당한다.
	```
	- instanceof는 타입 변경이 잘 되었는지, 확인하기 위한 문법
6. 대입 연산자(Assignment Operators) : 오른쪽부터 처리된다.
	- 여기서 lvalue, rvalue가 나온다. 아 이제야 좀 intelligence에 뜨던게 뭔가 했는데 이제 깨달음;;
7. [람다] 화살표 연산자(->): class, interface 개념을 알아야 한다고 한다.
	[1] 람다 이전의 자바(?): 나중에 다시 되짚어보면 알지 않을까?
	- (함수형)interface: 말그대로 껍데기. 인터페이스를 사용하며, 보통 메소드 이름과 파라미터의 타입만 정의된다고 한다.(interface의 역할만)
	- 물론, static과 default 키워드를 사용하면 인터페이스 안에서도 메소드 구현이 가능하다고 하는데, 여기서는 생략.
	```java
	@FunctionalInterface // 어노테이션에 이렇게 붙이면 인터페이스에 추상 메소드 '하나'만 정의할 수 있다.
	public interface Foo {
		void printInt(int x);
		//하나의 메소드만 추상화시킬 수 있는 함수형 인터페이스
	}
	```
	- 정의된 printInt를 사용할 수 없는데, 구현을 하지않고, 추상 메소드만 정의했기 때문이다.

	[2] 추상 메소드 사용하기(구현체 만들기): class vs 내부 익명 클래스 vs 람다
	```java
	/*
	**	class로 구현체 만들기
	*/
	public class JavaStudy implements Foo{
		@override //오버라이드
		public void printInt(int x) { // 클래스 내에 Foo를 implements로 받아와서 사용하기
			System.out.println(x); // 구현
		}
		public static void main(String[] args) {
			JavaStudy js = new JavaStudy(); // JavaStudy 클래스 인스턴스 생성
			int y = 3;
			js.printInt(y); // (인스턴스).메소드 호출
		}
	}

	/*
	**	메소드 내에서 구현체 만들기 (내부 익명 클래스)
	*/
	public static void main(String[] args) {
		int y = 3;
		Foo foo = new Foo() { // 내부 익명 클래스 구현 (Anonymous inner Class)
			@Override // Foo 인터페이스 받아와서 구현
			public void printInt(int x) {
				System.out.println(x); // 실제 구현
			}
		}
		foo.printInt(y); //Foo 인스턴스 foo를 받아와서 사용
	}

	/*
	**	람다를 이용한 구현체 만들기 [제일 간단?/Java8 이후]
	*/
	public static void main(String[] args) {
		Foo foo = (x) -> System.out.println(x);
	}
	```
8. 삼항 연산자: 포맷만 익힌다 '(조건문) ? True : False'
	- '?'는 우선순위가 제일 낮게 잡혀 있어서 괄호는 굳이 쓸 필요는 없지만, 가독성을 위해서
9. 연산자 우선순위...
	- 뱀다리 마지막에 메모...
10. (Java13) switch 연산: 람다를 써서 간단하게 할 수 있다.

	[1] Java 12까지의 switch 'case'

	```java
	/*
	** 장황하고, 디버깅이 어렵고, 'Missing Break'
	*/
	switch (day) {
		case "MON":
		case "FRI":
			System.out.println(6);
		case "TUE":
		case "SAT":
			System.out.println(7);
		default:
			throw new IllegalStateException("Wrong: " + day);
	}

	```
	[2] Java 12에서의 switch '연산'
	- 다만 이때는 'case (조건):' 혼용 불가!
	```java
	switch (day) {
		case "MON", "FRI" -> System.out.println(6);
		// Jave 12 이후로는 위와 같이 multi case 라벨이 가능
		case "NOT" -> System.out.println("not");
		//case "TUE": 혼용 불가능
		default -> System.out.println("default");
	}

	// 아래와 같은 리턴값 반환도 가능하다. (Jave 12부터)

	var result = switch (day) { // var 대신 int로 해도 된다.
		case "MON" -> 2;
		case "FRI" -> 3;
		case "NOT" -> 404;
		default -> throw new IllegalStateException("Wrong: "+ day);
	}
	```
	[3] Java 13 이후?: yield를 사용하여 변수에 값을 넣을 수 있다고 한다.
	```java
		var result = switch (day) {
		case "MON":
			yield 2;
		case "FRI":
			System.out.println("Hi");
			yield 3;
		case "NOT":
			yield 404;
		default:
			yield -1;
	}
	```

## 뱀다리
> 문자열 파싱
1. str.substring(): 문자열 중에서 원하는 문자를 제거
2. Integer.parseInt(str): 문자를 정수로 캐스팅(파싱에 가깝다)
	- '+' 가 String에서 append하게 붙는 것과 대응.
> 하나의 메소드 때문에 interface를 만들어야 하나?
- 자바에서 기본적으로 지원하는 인터페이스를 사용하면 문제없이 사용가능.
```java
public static void main(String[] args) {
	Funtion<T, R>

	BiFuncion<T, U, R>

	Consumer<T>

	Supplier<T>

	Predicate<T>

	UnaryOperator<T>

	BinaryOperator<T>
}
```
> 연산자 우선순위

| 순서 | 연산방향 | 연산자 | 피연산자 타입 | 수행 |
|:---:|:---:|:---:|:---|:---|
|1|좌측부터|.|객체, 필드(멤버)|객체 멤버 접근|
|||[ ]|배열, int|Array 원소 접근|
|||(args)|메소드, arglist|메소드 호출|
|||++, --|변수 variable|전위 증감|
|2|우측부터|++, --|변수 variable|후위 증감|
|||+, -|숫자 ex) -3, +3|단항 +, 단항 -|
|||~|integer|비트 조건연산자|
|||!|boolean|논리 not연산|
|3|우측부터|new|class, arglist|객체 생성|
|||(type)|type, any|타입 캐스팅|
|4|좌측부터|*,/,%|숫자(계산)|곱,나누기,나머지|
|5|좌측부터|+,-|숫자(계산)|더하기, 빼기|
|||+|String + (any)|스트링에 문자열 더하기|
|6|좌측부터|<<|integer 간|shift|
|||>>|integer 간|shift (밀린 비트는 1)|
|||>>>|integer 간|shift(밀린 비트는 0)|
|7|좌측부터|<,<=,>,>=|number 간|비교|
|||instanceof|reference, type|타입비교|
|8|좌측부터|==,!=|primitive 간|비교|
|||==,!=|refernce 간|비교|
|9|좌측부터|&|integer 간|비트 AND|
|||&|booleanrks|논리 AND|
|10|좌측부터|^|integer 간|비트 XOR|
|||^|boolean 간|논리 XOR|
|11|좌측부터|\||integer 간|비트 OR|
|||\||boolean 간|논리 OR|
|12|좌측부터|&&|boolean 간|조건부 AND|
|13|좌측부터|\|\||boolean 간|조건부 OR|
|14|우측부터|?:|boolean, any|조건부 (3항) 연산|
|15|우측부터|=|variable, any|대입|
|||복합 대입 연산자|variable, any|대입 + 연산|
|16|우측부터|->|arglist, method body|람다|

# 따로 공부하기 [21.01.18. - 21.01.19.]

> 참고자료
- 단축키(psvm): http://jaeunsw.blogspot.com/2017/09/java-intellij.html
- 복기자료: https://catch-me-java.tistory.com/14?category=438116
- java static: https://kamang-it.tistory.com/89
- 고정소수점, 부동소수점: https://hoodymong.tistory.com/50
- 람다에서 var사용하기: https://www.youtube.com/watch?v=tjj-XLk4CSA

## 목표
> 자바의 프리미티브 타입, 변수 그리고 배열을 사용하는 방법.
- 프리미티브 타입 종류와 값의 범위 그리고 기본 값
- 프리미티브 타입과 레퍼런스 타입
- 리터럴
- 변수 선언 및 초기화하는 방법
- 변수의 스코프와 라이프타임
- 타입 변환, 캐스팅 그리고 타입 프로모션
- 1차 및 2차 배열 선언하기
- 타입 추론, var

## 정리 내용
1. 자바 기본? 원시? 타입 (primitive): 정수 / 실수 / 논리
	> 정수 타입
	- byte (-2^7 ~ 2^7-1): 가장 쉽게 오버플로 언더플로 확인 가능
	- char: 2바이트. 0 ~ 127(기본ASCII), 44032 ~ 55203(한글)
	- (short: 똑같이 2바이트. 임베디드 코드 혹은 low레벨 작업을 위해 사용한다고함)
	- int: 4바이트 (-2^31 ~ 2^31-1), 정수를 기본적으로 인식하는 타입
	- long: 4~8바이트. 이거 C에서는 운영체제별로 크기가 달라서 long long 썼던거 같은데;
	[자바할 때도 long long 쓰려고 한다. 너무 힘들었거든.]
	값(숫자, 숫자도 상수 풀에 들어었다)을 넣을 때는 L(리터럴상수)를 뒤에 붙여야한다.
	(리터럴문자 integer 범위를 초과하면, 에러가 난다)
	> 실수 타입
	(부동소수점. 고정소수점도 학습시키는데, 나도 여기까진 c++로 했다.)
	- 부동소수점 개념: 부호 / 지수부 / 가수부 (IEEE754 관련 그림 참조)
	- float: 4바이트
	- double: 8바이트, 실수를 기본적으로 인식하는 타입. (리터럴상수: f)
	- 리터럴상수: F, f 둘 중 하나. 보통은 소문자를 넣는다고 한다.
	> 논리 타입: boolean ~ true/false
	- 사실 c에서도 원래 없었듯이, enum 타입마냥 java에서 정의한거라고 한다.
	- 할렐루야!
2. 레퍼런스 타입과 리터럴
	```java
	public static void main(String[] args) {
		int i = 2000; //primitive(원시) 타입
		int j = 1004;

		Integer var1 = 2000; //레퍼런스 타입
		Integer var2 = 1004;
	}
	```
	> 사실 그냥 강의 들을 때는 '임의로 정의한 타입인갑다' 하고 넘어간 부분이 없잖아 있다.

	| 타입 | 변수 이름 | 값 |
	|:---:|:---:|:---:|
	| int | i | 2000 |
	| Interger | var1 | 1(임의의 주소) |
	- 대충 이런 느낌을 가지게 되는데
	- Primitive Type > 스택 영역에 값을 바로 저장
	- Reference Type > 해당 값을 가지고 있는 힙 영역의 주소값을 가져옴. 예를 들면 1이라는 힙 영역 주소에 2000 값이 있다는 것.
	> 메모리 개념은 바이블로 추천 받은 https://goodgid.github.io/Memory-Structure/ 참조

	- 이때 더 재밌는 것이 있다고 하는데, == 비교에 관한 것이다. primitive type은 값을 비교하고, reference type은 참조주소를 비교한다는 것이다. 아니 위에서 값을 저렇게 테이블로 정리하면 여기까진 당연한 것이리라.
	- 대신에 두 다른 타입끼리 비교를 시킨다면? 참조주소 말고 데이터 값만을 비교한다고 한다. 거참. 연산자 들어갈 때 다시 보면 될 것 같다.
	- 리터럴: 변하지 않는 변수라고 보기 보다는 '데이터'에 가깝다. 물론 상수풀 안에 있어서 소스코드 상에서 '고정'되어 있지만.
3. 변수 선언, 초기화
	> 아 솔직히 이 부분은 넘어가고 싶다.
	- 하지만 한번은 짚고가야지. 명명 규칙(java 컨벤션) 정도로 짚고 가자
	- 첫 번째 글자는 '소문자'가 권장되고, 특문은 '$'와 '_'만 허용된다. 근데 엥간해선 특문 잘 안쓰지 않나 자바에서는?
	- 그리고 대소문자 구분되고, 길이 제한 없으니 상세히 쓰고(그래서 그렇게 길었구나..), 예약어 사용이 당연히 안된다.
	- 솔직히 알고리즘 학습할때도 max, min이 예약어라서 mymax, mymin이라고 쓰는 판에 ^^7
	> 아까 맨처음에 넘어가고 싶었다는거 취소. 초기화 가끔씩 헷갈린다. (상수)
	- 변수 초기화: 명시적 초기화와 블록 초기화가 있다.
	```java
	public class InitVarStudy {
		int foo;	// '멤버변수' 초기화: 0으로 초기화
		void localVarTest() {
			int bar; // '지역변수'는 초기화 되지 않는다.
			bar = 21; // 이렇게 명시적 초기화를 해준다.
		}
		int block;
		{
			block = 24;	// 일반적인 초기화 블록이라고 한다.
		}
		static {
			block = 31; // 이건 정적 초기화 블록
		}
	}
	```
	> java에서의 static변수는 같은 클래스 내에서 공유가 가능해서, 클래스변수라고 한다. 음 이렇게 쓰고나니 더 이해가 된다.
4. 타입변환, 형변환(둘 다 똑같은 의미인거.. 아시죠?)
	> 충격적이게도 java에서는 boolean타입은 0, 1로 표현이 안된다고 한다. 보통 c/cpp에서는 false는 0, true는 1과 그외 값으로 하는데... 크흠.
	```java
	int myInt = (myBoolean) ? 1 : 0; // 와 이건 좀...
	```
	- 묵시적 형변환(Implicit/Widening Conversion, 프로모션): 말 그대로 원래 타입보다 더 큰 타입으로 변경을 할 때, 프로모션 변경이 진행되는데, 데이터 유실이 일어나지 않는 것이 보장되기 때문이다.
	> 명시적 형변환이라고 쓰긴 좀 그런데... 뭔가 켕긴다 대충 비슷하다.
	- 명시적 형변환(Explicit/Narrow Conversion, 캐스팅): 개발자가 확신을 갖고... 아니 데이터 유실 가능성을 인지하고 캐스팅을 진행하는 것이다. 여타 다른 언어와 다르지 않다.
5. 변수의 스코프, 라이프타임(생명주기)
	> 이거 스코프 만큼은 건너뛰어도 되겠다. 전역/지역 구분만 하면된다.
	```java
	public class LifetimeStudy {
		int foo; // 인스턴스 변수, 필드, 전역변수
		static int bar; // 클래스 변수, 정적 변수
		void func1(int lorem) { // foobar는 매개변수, parameter
			int ipsum = 100; // 지역변수
		}
	}
	```
	- 인스턴스 변수: 객체가 생성될 때, 같이 생성. static main 메소드나 다른 클래스에서 인스턴스 생성시 생성이 된다. 인스턴스의 참조가 없을때, 가비지 컬렉터가 객체를 지워버리는데, 이때 당연히 인스턴스 변수도 소멸된다.
	- 매개변수: func1의 메소드가 호출될 때 생성되고, func1 메소드 종료시점에 같이 소멸된다.
	- 지역변수: 뭐 당연한 이야기를...
	- 정적변수: 클래스가 처음 호출되면서 생성이 되고, 자바 어플리케이션이 종료되는 시점에 같이 소멸된다. 이는 아래에서 좀 더 참조하자.
	> java static: https://kamang-it.tistory.com/89

	> 초기화블럭: https://kamang-it.tistory.com/entry/Java-14초기화와-초기화블럭Initialize-Block
6. 타입추론(type inference): var
	> (JDK) javaSE 10부터 지원되는 것. 근데 타입 구분도 잘 안하면 JS랑 뭔 차이가 있는거지? 게다가 불안하기까지 하다.
	- 주의사항을 열거해보자
		1. 초기화 값이 있는 지역변수로만 선언이 가능하다.
		2. 무조건 선언할 때 초기화 값이 있어야한다. 중요해서 2번...
		3. 멤버변수, 메소드의 파라미터, 리턴 타입으로 사용이 불가능! 와 진짜 쓰고 싶지 않게 생겼다.
		4. var는 키워드가 아니다. 즉, 예약어가 아니기에 이렇게 쓸수 있다.
		```java
		public static void main(string[] args) {
			int var = 3;
			var i = 6;
			/* 컴파일 후 바이트 코드를 보면, var타입이 int로 된다. */
		}
		```
		5. 런타임 오버헤드가 없다. 뭔소리인고 하니, 컴파일 시점에 이미 추론이 완료되서 명시적으로 타입이 정해져있기 때문에 타입변수를 읽을 때마다 타입추론을 위한 연산을 하지 않는다는 것이다. 즉, 중간에 타입이 절대 변경되지 않는다는 것.
		> 여기서부터는 잘못된 사용법을 방지하는 내용
		6. 초기화 값으로 null 쓰면 안된다.
		7. Lambda Expression에서는 명시적 타입을 지원해줘야한다.
		```java
		var p = (String S) -> System.out.println("s = " + s);
		/* 이게 안된다는 이야기! */
		```
		8. 배열 선언시, var 대신 타입을 명시해줘야 한다.
		```java
		var arr = {1, 2, 3};
		/* 이거도 안된다는 이야기 */
		```
	- 그럼 어디에 갖다 쓰나...?
	> 람다에서 var를 사용하고, 키워드 앞에서만 쓰는 어노테이션을 쓸 수 있다고 한다. 아직 감흥이 없다. ('람다에서 var 사용하기' 영상 참조)
	```java
	/* 람다 예시 */
	Consumer<String> testFoo = s -> System.out.println("s = " + s);
	/* 변수 앞에 var를 넣어보자, 당연히 가독성 일단 떨어진다 */
	Consumer<String> testFoo = (var s) -> System.out.println("s = " + s);
	/* 키워드 앞에만 사용가능한 어노테이션 사용 */
	Consumer<String> testFoo = (@Nonnull var s) -> System.out.println("s = " + s);
	```
7. 배열 (C/C++에서의 트랜지션이 쉬워보이긴 한다)
	> 기본적으로 'Object'를 상속 받고, 'Cloneable'과 ' Serializable' 인터페이스를 implements
	```java
	public static void main(String[] args) {
		String[] loremIpsum; // arrayOfStrings
		loremIpsum = new string[]{"hello", "goodbye", "and", "hello"};
		int[][] loremIpsumInt = new int[0][0]; // arrayOfArrayOfInt
		Object[] oa = loremIpsum;
		Comparable[] cd = loremIpsum;
		Comparable[] ca = loremIpsum;
		Object[] oa2 = loremIpsumInt;
		Object o = loremIpsum;
		Cloneable c = loremIpsumInt;
	}
	```
	- 배열은 참조타입. 그래서 배열은 클래스의 인스턴스와 같이 객체이다.
	- 클래스와 다르게 간단히 원소 타입 뒤에 대괄호 붙이면 끝.
	- But! 배열의 인스턴스들은 클래스가 아닌 '객체'다.
	> 배열은 'java.lang.Objects'에 상속 받는다. 따라서 배열은 'Cloneable interface'를 implement 받는다. ('객체 자신의 메모리를 복사하는 Object의 인터페이스' 라고 한다.)
	- CloneNotSupportedException을 따로 throw로 예외처리를 해주지않고도 완벽하게 보장하는 clone()메소드를 오버라이딩할 수 있다고 한다.
	- 배열의 직렬화... 어떤 배열이든 직렬화가 가능하다고 한다.
	> Serializable: 자바의 직렬화, 자바 시스템 내부에서 사용되는 Object , Data를 외부에서 사용할 수 있게 바이트 형태로 변환하는 기술, 즉 JVM에서 데이터를 저장하는 스택, 힙에 쌓여있는 데이터를 바이트 형태로 변환.
	- C언어와의 호환성: 변수 뒤에도 대괄호를 붙일 수 있다. 이러한 선언방식은 메소드, 파라미터, 필드, 지역변수에서도 활용할 수 있다.
	- 배열 생성은 객체 생성과 마찬가지로 'new'키워드를 사용하여야 한다.
	- 배열은 생성자가 없다.
	- 대신에 배열의 크기를 선언하면 (ex. int[10]) 자동적으로 초기화 해준다.

## 해당 내용이 헷갈릴 때 찾아봐야하는 문서
- Cloneable 인터페이스(깊은복사, 얕은복사): https://marshallslee.tistory.com/entry/자바-Cloneable-인터페이스-그리고-deep-copy-vs-shallow-copy
- java static: https://kamang-it.tistory.com/89
- 초기화블럭: https://kamang-it.tistory.com/entry/Java-14초기화와-초기화블럭Initialize-Block











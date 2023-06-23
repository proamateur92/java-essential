# 자바의 정석 내용 정리

## Index

> 1. 자바
> 6. 객체지향언어 (클래스와 객체)
> 7. 상속
> 8. 오버라이딩
> 10.제어자
> 11. 다형성
> 12. 추상클래스
> 13. 인터페이스
> 17. 컬렉션 프레임워크
> 19. 쓰레드

### 1. 자바

### 1-1. 자바란?

- 프로그래밍 언어
- 컴퓨터 프로그램(애플리케이션)을 만드는데 사용
- 실행환경 (JRE) + 개발도구 (JDK) + 라이브러리 (API)
- 쉽고 빠르게 애플리케이션 개발 가능

>

### 1-2. 자바가 쓰이는 곳

- pc application
- web application
- mobile application
- big data 하둡 등
- game (minecraft), 과학, 소형기기 등

>

### 1-3. 왜 자바인가?

- 객체지향 + 함수형
>

### 1-4. 자바의 특징

- 객체지향 언어 (프로그래밍 언어 + 객체지향 개념) 
- 자동 메모리 관리 (가비지컬렉터 GC)
- 멀티 쓰레드 지원 (하나의 프로그램에서 여러개 동작 가능, 채팅하며 파일 전송 기능 등)
- 라이브러리 지원 => 쉽게 개발 가능하다
- 운영체제에 독립적

>

### 1-5. 자바 가상 머신 (JVM)

- 여러 운영체제에서 사용 가능하도록 한다.
- 소프트웨어로 만들어진 가상 컴퓨터.


>하나의 자바 app은 JVM으로 구동되는 경우 모든 운영체제 위해서 사용될 수 있다.
JAVA application <-> JVM <-> OS <-> 하드웨어

>일반적인 application은 특정 운영체제에서 사용 가능하도록 만들어진다.
window application의 경우 window 환경에서 사용 가능하며 메킨토시 또는 리눅스 
운영체제에서 사용되기 위해서는 해당 app을 운영체제에 맞게 수정하여야 한다.


### 1-6. 자바 api 문서 사용법  

> Java API란?
Java로 프로그램을 만드는데 필요한 주요 기능을 미리 만들어서 제공
> https://docs.oracle.com/en/java/javase/11/docs/api/

### 1-7. 자바 프로그램 작성, 실행 해보기

> 자바 프로그램 작성 (.java) -> 컴파일 javac.exe(자바 컴파일러) -> class 파일 생성 (JVM이 이해할 수 있다.) -> java.exe (자바 인터프리터)로 자바 프로그램 실행 

1. 해당 파일이 위치한 디렉토리로 이동
2. javac 파일명 (Hello.java) 명령어를 통해 javac.exe (자바 컴파일러)로 컴파일
3. jdk1.8 > javac.exe 위치를 지정해주여야 함
3-1. 일일이 javac 의 경로를 명령어에 사용하지 않고 환경변수에 지정해주도록 한다.
3-2. 환경변수 > path에 경로를 추가하면 파일의 경로를 찾지 못하면 path에 등록된 환경변수의
가장 위부터 찾게 된다.
4. 3을 거쳐 컴퓨터가 이해할 수 있는 class 파일 = 바이너리 파일, 이진 파일 생성
4-1. type Hello.class 
4-2. type Hello.java (텍스트 파일명) - 사람이 이해할 수 있는 코드
5. 자바 파일 실행 java Hello(class파일명) - 이때에는 확장자를 쓰지 않는다.
5-1. java.exe (인터프리터)는 자바 프로그램(class파일)을 실행한다.

  
  
- 클래스 - 자바 프로그램의 단위. 자바 프로그램은 클래스들로 구성된다.

```
 class 클래스 이름 {
	/* 모든 문장은 클래스의 {} 안에 있어야 한다. */
 }
```

<br>

- main 메서드 - 자바 프로그램의 시작점. 이 메서드 없이 실행 불가 

```
class 클래스 이름 {
	public void main (String[] args) { 
		/* 실행한 문장을 넣는다. */
	}
 }
```

<br>
 
  
## 6장 객체지향 언어 OOP

> 빠른 변화로 인한 소프트웨어의 위기의 해결책으로 절차적 언어에서 객체지향으로 변경
> 코드 재사용성이 높다. 유지보수 용이. 중복 코드 제거
> 객체지향언어란 프로그래밍언어와 객체지향개념을 더한 것

<br>

- 캡슐화
- 상속
- 추상화
- 다형성

### 6-2. 클래스와 객체

- 클래스란? 객체를 정의해 놓은 것. 객체를 생성하는데 사용한다.
- 객체란? 실제로 존재하는 것으로 사물 또는 개념. 객체가 가지고 있는 기능과 속성에 따라 다르다.

- 클래스 
	- 제품 설계도
	- TV 설계도
	- 붕어빵 기계

- 객체
	- 제품
	- TV
	- 붕어빵

### 6-3. 객체의 구성요소 - 속성(변수)과 기능(메서드)

> TV의 속성. 크기, 길이, 높이, 색상, 볼륨, 채널 등
> TV의 기능. 전원 on / off, 볼륨 높이기, 낮추기 채널 변경하기 등

<br>

```
class Tv {
	String color;
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUp() { channel++; }
	void channelDown() { channel--; }
}
```

### 6-4 객체와 인스턴스

- 객체: 모든 인스턴스를 대표하는 일반적 용어
- 인스턴스: 특정 클래스로부터 생성된 객체 (ex: Tv인스턴스)
	
<br>
	
> 클래스를 인스턴스화(생성)하여 인스턴스(객체)를 만든다.
> 클래스는 객체를 생성하기 위해 필요하다. 객체를 사용하려면 객체가 있어야 하고 속성과 기능을 가져야 한다.

### 6-5 하나의 소스 파일에 여러 클래스 작성

> public class가 있는 경우 소스파일의 이름과 public class 명이 일치해야 한다.
> public class가 없는 경우. 소스파일의 이름은 class 명과 일치하면 된다.
>
> class 명이 소스파일 명과 일치하지 않는 경우 에러가 발생하지 않지만 해당 소스 파일이 실행되지 않는다.
>
> 하나의 소스 파일에는 하나의 클래스만 작성하는 것이 바람직하다.

### 6-6 객체의 생성과 사용

#### 1. 객체의 생성

```
// 클래스명 변수명;		클래스의 객체를 참조하기 위한 참조변수를 선언.
// 변수명 = new 클래스명();	클래스의 객체를 생성하고 객체의 주소를 참조변수에 저장.

Tv t;				// Tv 클래스 타입의 참조변수 t를 선언. 참조변수는 리모컨과 같다.
t = new Tv();			// Tv 인스턴스를 생성한 후, 생성된 Tv인스턴스의 주소를 t에 저장. 리모컨과 객체를 연결한다는 의미.
```

<br>

#### 2. 객체의 사용 (변수와 메서드)

```
t.channel = 7;
t.cannelDown();
System.out.println("현재 채널은 " + t.channel + " 입니다.");
```

> 객체를 사용하기 위한 순서
> 클래스 작성 -> 객체 생성 -> 객체 사용 

### 6-7 객체의 생성과 사용 예제

```
Tv t1 = new Tv();
Tv t2 = new Tv();

t2 = t1;
```

<br>

> 1. 최초 생성된 인스턴스 t1은 0x100 객체 주소를 가진다.
> 2. 두번째 생성된 인스턴스 t2는 0x200 객체 주소를 가진다.
> 3. t2에 t1의 주소값을 재할당해주어 인스턴스 t2가 가진 객체 값들은 더 이상 사용할 수 없게 된다.
> 4. 가비지 컬렉터로부터 사용 불가능한 0x200주소를 가진 객체는 불필요한 메모리를 낭비하므로 삭제되어진다.
> 5. 가비지 컬렉터 (GC)는 주기적으로 메모리 낭비를 체크한다. 따라서, 일일이 개발자가 적용하지 않더라도 불필요한 객체를 삭제해준다.
> ** GC에 대해 더 깊이 공부해보기

<br>

### 6-8 클래스의 다른 정의

##### 1. 데이터와 함수의 결합

- 변수 - 하나의 데이터를 저장할 수 있는 공간
- 배열 - 동일한 타입에 여러 데이터를 저장할 수 있는 공간
- 구조체 - 타입에 관계없이 서로 관련된 데이터를 저장할 수 있는 공간
- 클래스 (구조체 + 함수) 데이터와 함수의 결합

##### 2. 클래스 - 사용자 정의 타입
- 개발자가 직접 새로운 타입을 정의할 수 있다.
- 서로 관련된 값을 묶어 하나의 타입으로 정의한다.

```
class Time {
	int hour;
	int minute;
	int second;
}

// ==========================================================

int hour;
int minute;
int second;

// int 타입 hour, minute, secound 변수를 가진 클래스의 인스턴스
Time t = new Time();

// ==========================================================

int hour1, hour2, hour3;
int minute1, minute2, minute3;
int second1, second2, second3;

// int 타입 hour, minute, secound 변수를 가진 클래스의 인스턴스 
Time t1 = new Time();
Time t2 = new Time();
Time t3 = new Time();

// ======================================================

int[] hour = new int[3];
int[] minute = new int[3];
int[] second = new int[3];

// int 타입 hour, minute, secound 변수를 가진 클래스의 배열 인스턴스
Time[] t = new Time[3];

t[0] = new Time();
t[1] = new Time();
t[2] = new Time();
```

<br>

### 6.9 변수와 메서드

1. 선언위치에 따른 변수의 종류

- 변수의 선언위치가 변수의 종류와 범위를 결정한다.


```
{
	// 클래스 영역
	int iv;			// 인스턴스 변수
	static int cv;	// 클래스 변수 (static 변수, 공유 변수)
	
	void method() {
		// 메서드 영역
		int lv = 0;	// 지역변수
	}
}

```

- 클래스 변수(클래스 영역): 클래스가 메모리에 올라갈 때 생성
	- 같은 클래스이 모든 인스턴스들이 공유하는 변수
	- 인스턴스 생성없이 클래스이름.클래스변수명으로 접근
	- 클래스가 로딩될 때 생성, 프로그램 종료시 소멸
	
- 인스턴스 변수 (클래스 영역): 인스턴스 생성시 생성
	- 각 인스턴스의 개별적인 저장공간. 인스턴스마다 다른 값 저장 가능
	- 인스턴스 생성 후 참조변수.인스턴스변수명으로 접근
	- 인스턴스 생성시 생성되며 참조변수가 없으면 가비지컬렉터에 의해 자동삭제됨

- 지역변수 (메서드 영역): 변수 선언문 수행시 생성
	- 메서드 내 선언, 메서드 종료시 소멸
	- 조건문, 반복문의 블럭 내에 선언된 지역변수는 블럭을 벗어나면 소멸

```	
// 카드 클래스
// 무늬, 숫자, 폭, 높이 총 4개의 속성을 갖는다.
// 기능...

class Card {
	// 4개의 멤버 변수를 갖는다.
	String kind;
	int number;
	
	// 폭과 높이는 고정된 값
	static int width = 100;
	static int height = 250;
}
```

<br>

2. JVM 메모리 구조

- Method Area - 클래스 정보와 클래스 변수가 저장되는 곳

- Call Stack 
	- 메서드의 작업공간. 메서드 호출시 메서드 수행에 필요한 메모리공간 할당받음
	- 메서드가 종료되면 사용하던 메모리 반환

> 메서드가 호출되면 수행에 필요한 메모리를 스택에 할당받는다.
> 메서드가 수행을 마치면 사용했던 메모리 반환한다.
> 호출 스택 제일 위 메서드가 현재 실행 중인 메서드이다.
> 아래에 있는 메서드가 바로 위의 메서드를 호출한 메서드이다.

<br>

```
class CallStackTest {
	public static void main (String[] args) {
		firstMethod();
	}
	
	static void firstMethod() {
		secondMethod();
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()");
	}
}

// println
// secondMethod
// firstMethod
// main
```

<br>

- Heap

> 인스턴스가 생성되는 공간
> new 연산자에 의해 생성되는 배열과 객체는 모두 여기에 생성

### 6.10 클래스메서드(static)와 인스턴스메서드

- 인스턴스메서드
	- 인스턴스 생성 후, 참조변수.메서드이름()으로 호출
	- 인스턴스변수나 인스턴스메서드와 관련된 작업을 하는 메서드
	- 메서드 내에서 인스턴스변수 사용가능
	
- 클래스메서드 (static메서드)
	- 객체생성없이 클래스이름.메서드이름()으로 호출
	- 인스턴스변수, 인스턴스메서드와 관련없는 작업을 하는 메서드
	- 메서드 내에서 인스턴스메서드, 인스턴스 변수 사용불가
	- 메서드 내에서 인스턴스변수를 사용하지 않으면 static붙이기

### 6.11 오버로딩

- 메서드 명과 리턴타입이 같을 때, 매개변수의 갯수 및 타입이 다른 경우 선언 가능
- 대표적인 예는 print 메서드

### 6.12 클래스메서드(static)와 인스턴스메서드

- 인스턴스메서드
	- 인스턴스 생성 후, 참조변수.메서드이름()으로 호출
	- 인스턴스변수나 인스턴스메서드와 관련된 작업을 하는 메서드
	- 메서드 내에서 인스턴스변수 사용가능
	
- 클래스메서드 (static메서드)
	- 객체생성없이 클래스이름.메서드이름()으로 호출
	- 인스턴스변수, 인스턴스메서드와 관련없는 작업을 하는 메서드
	- 메서드 내에서 인스턴스메서드, 인스턴스 변수 사용불가
	- 메서드 내에서 인스턴스변수를 사용하지 않으면 static붙이기
	
### 6.13 생성자

- 인스턴스가 생성될 때마다 호출되는 인스턴스 초기화 메서드.
- 인스턴스 변수의 초기화 또는 인스턴스 생성시 수행할 작업에 사용.
- 몇가지 조건을 제외하면 메서드와 같다.
- 모든 클래스에는 반드시 하나 이상의 생성자가 있어야 한다.

** 인스턴스 초기화 - 인스턴스 변수에 적절한 값을 저장하는 것.

```
Card c = new Card();

// 1. 연산자 new에 의해 메모리(heap)에 Card클래스의 인스턴스 생성
// 2. 생성자 Card()가 호출되어 수행된다.
// 3. 연산자 new의 결과로 생성된 Card 인스턴스의 주소가 반환되어 참조변수 c에 저장된다.
```

<br>
 
#### 1. 생성자의 조건 
	- 생성자의 이름은 클래스의 이름과 동일해야 한다.
	- 생성자는 리턴값이 없다. (void는 쓰지 않는다.)
	
```
class Card {
	
	Card() {	// 매개변수가 없는 생성자
		// 인스턴스 초기화 작성
	}
	
	Card(String kind, int number) {	// 매개변수가 있는 생성자
		// 인스턴스 초기화 작성
	}
}
```

<br>
 
#### 2. 기본 생성자
	- 매개변수가 없는 생성자
	- 클래스에 생성자가 하나도 없으면 컴파일러가 기본 생성자를 추가한다.
	(생성자가 하나라도 있으면 컴파일러는 기본 생성자를 추가하지 않는다.)
	- 모든 클래스에는 반드시 하나 이상의 생성자가 있어야 한다.

<br>
	
#### 3. 생성자 this()
	- 생성자, 같은 클래스의 다른 생성자를 호출할 때 사용.
	- 다른 생성자 호출은 생성자의 첫 문장에서만 가능.
	
<br>
	
```
class Candy {
	String name;
	int weight;
	int sugars;
	
	Candy() {
		this("basic", 5, 5);
	}
	
	Candy(String n, int w, int s) {
		name = n;
		weight = w;
		sugars = s;
	}
}
```

<br>

#### 4. 참조변수 this

- 인스턴스 자신을 가리키는 참조변수. 인스턴스의 주소가 저장되어 있다.
- 모든 인스턴스 메서드에 지역변수로 숨겨진 채로 존재한다.

<br>

```
class Candy {
	String name;
	int weight;
	int sugars;
	
	Candy() {
		this("basic", 5, 5);
	}
	
	Candy(String name, int weight, int sugars) {
		this.name = name;
		this.weight = weight;
		this.sugars = sugars;
	}
}
```

<br>

#### 5. 생성자를 이용한 인스턴스 복사
- 인스턴스간의 차이는 인스턴스변수의 값 뿐 나머지는 동일하다.
- 생성자에서 참조변수를 매개변수로 받아 인스턴스변수들의 값을 복사한다.
- 똑같은 속성 값을 갖는 독립적인 인스턴스가 하나 더 만들어진다.

```
class Candy {
	String name;
	int weight;
	int sugars;
	
	Candy() {
		this("basic", 5, 5);
	}
	
	Candy(String name, int weight, int sugars) {
		this.name = name;
		this.weight = weight;
		this.sugars = sugars;
	}
	
	Candy(Candy c) {
		// this(c.name, c.weight, c.sugars);
		
		this.name = c.name;
		this.weight = c.weight;
		this.sugars = c.sugars;
	}
}

class Test {
	public static void main(String[] args) {
		Candy c1 = new Candy();
		Candy c2 = new Candy(c1);
	}
}

```

### 6.14 변수의 초기화
- 변수를 선언하고 처음으로 값을 저장하는 것.
- 멤버변수(인스턴스변수, 클래스변수)와 배열은 각 타입의 기본값으로 자동 초기화된다.
- 지역변수는 사용 전에 꼭 초기화 해주어야 한다.

> boolean false
>
> char '\u0000'
>
> byte 0
>
> short 0
>
> int 0
>
> long 0L
>
> float 0.0f
>
> double 0.0d or 0.0
>
> 참조형 변수 null

<br>

```
class InitTest {
	int x;		// 인스턴스 변수
	int y = x;	// 인스턴스 변수
	
	void method() {
		int i;		// 지역변수
		int j = i;	// 컴파일에러 발생. 지역변수를 초기화하지 않고 사용함.
	}
}
```

#### 1. 멤버변수(클래스 내에 선언된 변수)의 초기화

```
class Car {
	int door = 4;				// 기본형 변수의 초기화
	Engine e = new Engine();	// 참조형 변수의 초기화
	
	// ...
}
```

#### 2. 생성자의 초기화

```
Car(String color, String getType, int door) {
	this.color = color;
	this.getType = getType;
	this.door = door;
}
```

#### 3. 초기화 블럭
- 클래스 초기화 블럭: static {}
	- 클래스변수의 복잡한 초기화에 사용되며 클래스가 로딩될 때 실행된다.
	
- 인스턴스 초기화 블럭: {}
	- 생성자에서 공통적으로 수행되는 작업에 사용되며 인스턴스가 생성될 때 마다 (생성자보다 먼저) 실행된다.
	
<br>

```
class InitBlock {
	static { /* 클래스 초기화 블럭 */ }
	
	{ /* 인스턴스 초기화 블럭 */ }
	
	// ...
}
```

<br>

#### 4. 멤버변수의 초기화 시기와 순서
	- 클래스변수 초기화 시점: 클래스가 처음 로딩될 때 단 한번
	- 인스턴스변수 초기화 시점: 인스턴스가 생성될 때 마다

```
class InitTest {
	// 초기화 순서
	// cv = 0
	// cv = 1
	// cv = 2, iv = 0
	// cv = 2, iv = 1
	// cv = 2, iv = 2
	// cv = 2, iv = 3

	static int cv = 1;	// 명시적 초기화
	int iv = 1;			// 명시적 초기화
	
	static {
		cv = 2;	// 클래스 초기화 블럭
	}
	
	{
		iv = 2;	// 인스턴스 초기화 블럭
	}
	
	InitTest() {	// 생성자
		iv = 3;
	}
}
```

<br>

### 7. 상속

- 기존의 클래스를 재사용해서 새로운 클래스를 작성하는 것.
- 두 클래스를 조상과 자손으로 관계를 맺어주는 것.
- 자손은 조상의 모든 멤버를 상속받는다. (생성자, 초기화블럭 제외)
- 자손의 멤버개수는 조상보다 적을 수 없다. (같거나 많음)

<br>

```
class Point {
	int x;
	int y;
}

class Point3D extends Point {
	int z;
}
```

#### 1. 클래스간의 관계 - 상속관계
- 공통부분은 조상에서 관리하고 개별부분은 자손에서 관리한다.
- 조상의 변경은 바손에 영향을 미치지만, 자손의 변경은 조상에 아무런 영향을 미치지 않는다.

#### 2. 클래스간의 관계 - 포함관계

> 포함
> - 한 클래스의 멤버변수로 다른 클래스를 선언하는 것
> - 작은 단위의 클래스를 먼저 만들고, 이를 조합해서 하나의 커다란 클래스를 만든다.

<br>

```
class Circle {
	int x;	// 원점의 x좌표
	int y;	// 원점의 y좌표
	int z;	// 반지름
}
```

```
// 포함관계
class Point {
	int x;
	int y;
}

class Circle {
	Point c = new Point();	// 원점
	int r;	// 반지름
}
```

#### 3. 클래스간의 관계결정하기 - 상속 vs 포함
- 가능한 한 많은 관계를 맺어주어 재사용성을 높인다.

> 상속관계 - '~은 ~이다.(is-a)'
> 포함관계 - '~은 ~을 가지고 있다. (has-a)'

<br>

```
class Point {
	int x;
	int y;
}

class Circle {
	Point c = new Point();
	int r;
}
```

```
class Point {
	int x;
	int y;
}

class Circle extends Point {
	int r;
}
```

#### 4. 클래스간의 관계결정하기 - 예제설명
- 원은 도형이다. (상속 is-a)
- 원은 점을가지고 있다. (포함 has-a)

<br>

```
class Shape {
	String color = "blue";
	void draw() {
		// 도형 그리기 
	}
}

class Point {
	int x;
	int y;
	
	Point() {
		this(0, 0);
	}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Circle extends Shape {
	Point center;
	int r;
	
	Circle() {
		this(new Point(0, 0), 100);
	}
	
	Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}
}

class Triangle extends Shape {
	Point[] p;
	
	Triangle(Point[] p) {
		this.p = p;
	}
	
	Triangle(Point p1, Point p2, Point p3) {
		p = new Point[]{p1, p2, p3};
	}
}
```

```
Circle c1 = new Circle();
Circle c2 = new Circle(new Point(150, 150), 50);

Point[] p = { new Point(100, 100), new Point(140, 50), new Point(200, 100)};

Triangle t1 = new Triangle(p);
```

#### 5. 단일 상속

- 자바는 단일 상속만을 허용한다.

<br>

```
class TVCR extends TV, VCR {	// 이와 같은 표현은 허용하지 않는다.
	// ...
}
```

<br>

- 비중이 높은 클래스 하나만 상속관계로, 나머지는 포함관계로 한다.

<br>

- Tv class

```
class Tv {
	boolean power;	// 전원상태 (on/off)
	int channel;	// 채널
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }	
}

```

<br>

- VCR class

```
class VCR {
	boolean power;
	int counter = 0;
	void power() { power = !power; }
	void play() { //... }
	void stop() { //... }
	void rew() { //... }
	void ff() { //... }
}
```

<br>

- TVCR class

```
class TVCR extends Tv{
	VCR vcr = new VCR();
	
	void play() {
		vcr.play();
	}
	
	void stop() {
		vcr.stop();
	}
	
	void rew() {
		vcr.rew();
	}
	
	void ff() {
		vcr.ff();
	}
}
```

<br>

#### 6. Object 클래스 - 모든 클래스의 최고조상
- 조상이 없는 클래스는 자동적으로 Object클래스를 상속받게 된다.
- 상속계층도의 최상위에는 Object클래스가 위치한다.
- 모든 클래스는 Object클래스에 정의된 11개의 메서드를 상속받는다.

> toString(), equals(Object obj), hashCode(), ...

```
class Tv { // extends Object
	// ...
}

class CaptionTv extends Tv {
	// ...
}
```

### 8. 오버라이딩

- 조상클래스로부터 상속받은 메서드의 내용을 상속받는 클래스에 맞게 변경하는 것

```
class Animal {
	int name;
	
	void growl() {
		System.out.println("으르르릉");
	}
}

class Cat {
	void growl() {
		System.out.println("미애옹");
	}
}
```

#### 1. 오버라이딩의 조건

1. 선언부가 같아야 한다. (이름, 매개변수, 리턴타입)
2. 접근제어자를 좁은 범위로 변경할 수 없다.
	- 조상의 메서드가 protected라면, 범위가 같거나 넓은 protected나 public으로만 변경 가능하다.
3. 조상클래스의 메서드보다 많은 수의 예외를 선언할 수 없다.	

#### 2. 오버로딩 vs. 오버라이딩

- 오버로딩 - 기존에 없는 새로운 메서드를 만드는 것
- 오버라이딩 - 상속받은 메서드 내용을 변경하는 것으로

```
class Parent {
	void parentMethod() {}
}

class Child extends Parent {
	void parentMethod() {}		// 오버라이딩
	void parentMethod(int i) {} // 오버로딩
	
	void childMethod() {}
	void childMethod(int i) {}	// 오버로딩
	void childMethod() {}		// 에러! 클래스명 중복
}
```

#### 3. super - 참조변수

> this - 인스턴스 자신을 가르키는 참조변수. 인스턴스의 주소가 저장되어 있음.
>		 모든 인스턴스 메서드에 지역변수로 숨겨진 채로 존재
> super - this와 같음. 조상의 멤버와 자신의 멤버를 구별하는 데 사용.

```
class Parent {
	int x = 10;
}

class Child extends Parent {
	int x = 20;

	// Child 클래스의 멤버변수 x값
	// Child 클래스의 x값이 없으면 상속받은 클래스의 x값을 가져온다.
	System.out.println("x: " + x);
	System.out.println("this.x: " + this.x);
	
	// 상속받는 조상 클래스 멤버변수 x값
	System.out.println("super.x: " + super.x);
}
```

#### 4. super() - 조상의 생성자

- 자손클래스의 인스턴스를 생성하면, 자손의 멤버와 조상의 멤버가 합쳐진 하나의 인스턴스가 생성된다.
- 조상의 멤버들도 초기화되어야 하기 때문에 자손의 생성자의 첫 문장에서 조상의 생성자를 호출해야 한다.

> Object 클래스를 제외한 모든 클래스의 생성자 첫 줄에는 생성자(같은 클래스의 다른 생성자 또는 조상의 생성자)를 호출해야 한다.
> 그렇지 않으면 컴파일러가 자동적으로 'super();'를 생성자의 첫 줄에 삽입한다.

<br>

```
class Point { // extends Object
	int x;
	int y;
	
	Point() {
		this(0, 0);
	}
	
	Point(int x, int y) {
		// super(); Object();
		this.x = x;
		this.y = y;
	}
}
```

<br>

### 10. 제어자

- 클래스, 변수, 메서드의 선언부에 사용되어 부가적인 의미를 부여한다.
- 제어자는 크게 접근 제어자와 그 외의 제어자로 나뉜다.
- 하나의 대상에 여러 개의 제어자를 조합해서 사용할 수 있지만 접근제어자는 단 하나만 사용 가능하다.

> 접근 제어자 - public, protected, default, private
> 그 외 - static, final, abstract, native, transient
> 		, synchronized, volatile, strictfp

#### 1. static - 클래스의, 공통적인

> static이 사용될 수 있는 곳 - 멤버 변수, 메서드, 초기화 블럭

- static 멤버 변수
	- 모든 인스턴스에 공통적으로 사용되는 클래스 변수가 된다.
	- 클래스 변수는 인스턴스를 생성하지 않고 사용 가능하다.
	- 클래스가 메모리에 로드될 때 생성한다.

- static 메서드
	- 인스턴스를 생성하지 않고도 호출 가능한 static 메서드가 된다.
	- static 메서드 내에서는 인스턴스 멤버들을 직접 사용할 수 없다.

<br>
	
```
class staticTest {
	static int width = 200;
	static int height = 120;
	
	static {	// 클래스 초기화 블럭
		// static 변수의 복잡한 초기화 수행
	}
	
	static int max(int a, int b) {
		return a > b ? a : b;
	}
}
```

<br>
	
#### 2. final - 마지막의, 변경될 수 없는

> final이 사용될 수 있는 곳 - 클래스, 메서드, 멤버변수, 지역변수

- final 클래스 
	- 변경될 수 없는 클래스, 확장할 수 없는 클래스가 된다.
	- final로 지정된 클래스는 다른 클래스의 조상이 될 수 없다.

- final 메서드
	- 변경될 수 없는 메서드, final로 지정된 메서드는 오버라이딩을 통해 재정의될 수 없다.

- final 멤버변수, 지역변수 
	- 변수 앞에 final이 붙으면 값을 변경할 수 없는 상수가 된다.

<br>

```
final class FinalTest {
	final int MAX_SIZE = 10;
	
	final void getMaxSize() {
		final int LV = MAX_SIZE;
		return MAX_SIZE;
	}
}

class Child extends FinalTest {	// 에러. final 클래스는 조상이 될 수 없다.
	void getMaxSize() {}	// 에러. 오버리이딩 불가
}
```

<br>

** 대표적인 final 클래스로는 String, Math가 있다.

<br>

#### 3. 생성자를 이용한 finla 멤버변수 초기화

- final이 붙은 변수는 상수이므로 보통은 선언과 초기화를 동시에 하지만,
인스턴스마다 고정값을 갖는 인스턴스 변수의 경우 생성자에서 초기화된다.
(카드의 무늬와 숫자가 한번 결정되면 바뀌지 않아야 하는 경우)

<br>

- Card class

```
class Card {
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	Card() {
		this(5, "Diamond");
	}
	
	Card(int num, String kind) {
		NUMBER = num;
		KIND = kind;
	}
	
	public String toString() {
		return "" + KIND + " " + NUMBER;
	}
}
```

<br>

- Main class 

```
public static void main(String[] args) {
	Card c = new Card(3, "HEART");
	// c.NUMBER = 10; 에러 발생 (상수이므로)
	System.out.println(c.KIND);
	System.out.println(c.NUMBER);
}
```

<br>

#### 4. abstract - 추상의, 미완성의

> abstact가 사용될 수 있는 곳 - 클래스, 메서드

- abstract 클래스 
	- 클래스 내에 추상메서드가 선언되어 있음을 의미한다.

- abstract 메서드
	- 선언부만 작성하고 구현부는 작성하지 않은 추상메서드임을 알린다.

<br>

```
abstract class AbstractTest {	// 추상 클래스
	abstract void move();		// 추상 메서드
}
```

<br>

#### 5. 접근 제어자

- 멤버 또는 클래스에 사용되어 외부로부터 접근을 제어한다.

> private - 같은 클래스 내에서만 접근 가능하다.
> default - 같은 패키지 내에서만 접근 가능하다.
> protected - 같은 패키지 내, 그리고 다른 패키지의 자손클래스에서 접근 가능하다.
> public - 접근 제한이 없다.

#### 6. 접근 제어자를 이용한 캡슐화

> 접근 제어자를 사용하는 이유
> 외부로부터 데이터를 보호하기 위해

#### 7. 제어자의 조합

> 클래스 - public, default, final, abstract
>
> 메서드 - 모든 접근 제어자, final, abstract, static
>
> 멤버변수 - 모든 접근 제어자, final, static
>
> 지역변수 - final

1. 메서드에 static과 abstract를 함께 사용할 수 없다.
	- static 메서드는 몸통(구현부)이 있는 메서드에만 사용할 수 있기 때문이다.
	
2.  클래스에 abstract와 final을 동시에 사용할 수 없다.
	- 클래스에 사용되는 final은 클래스를 확장할 수 없음을 의미한다.
	- abstarct는 상속을 통해 완성되어야 하는 의미로 서로 모순된다.

3. abstract메서드의 접근제어자가 private일 수 없다.
	- abstract메서드는 자손클래스에서 구현해주어야 하는데 접근 제어자가 private이면,
	- 자손클래스에서 접근할 수 없다.

4. 메서드 private와 final을 같이 사용할 수 없다.
	- 접근제어자가 private인 메서드는 오버라이딩될 수 없다. 
	- 접근제어자 둘 중 하나만 사용해도 의미가 충분하다.

### 11. 다형성

- 여러 가지 형태를 가질 수 있는 능력
- 하나의 참조변수로 여러 타입의 객체를 잠조할 수 있는 것
- 조상타입의 참조변수로 자손타입의 객체를 다룰 수 있는 것

<br>

```
class Tv {
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

class CaptionTv extends Tv {
	String text;
	void caption() {}
}
```

<br>

> CaptionTv c = new CaptionTv();	(O)
> Tv t = new CaptionTv();			(O)
> CaptionTv t = new Tv();			(X)

<br>

> ※ 클래스의 객체를 참조하기 위한 참조변수 선언
> 참조변수 선언시 클래스의 범위가 객체를 할당해주는 클래스의 범위와 같거나 작다.
>
> = 조상타입의 참조변수로 자손타입의 인스턴스를 참조할 수 있지만
> 반대로 자손타입의 참조변수로 조상타입의 인스턴스를 참조할 수 없다.
 
<br>

#### 1. 참조변수의 형변환

- 서로 상속관계에 있는 타입간의 형변환만 가능하다.
- 자손 타입에서 조상타입으로 형변환하는 경우, 형변환 생략가능

> 자손타입 -> 조상타입 (Up-casting)   : 형변환 생략가능
> 자손타입 <- 조상타입 (Down-casting) : 형변환 생략불가 (해금 개념)

<br>

```
class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrrrr~");
	}
	
	void stop() {
		System.out.println("stop!!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water!!!!");
	}
}

class Ambulance extends Car {
	void siren() {
		System.out.println("siren~~~~");
	}
}
```

<br>


```
FireEngine f;
Ambulance a;

a = (Ambulance)f;
f = (FireEngine)a;
```

<br>

#### 2. intanceof 연산자

- 참조변수가 참조하는 인스턴스의 실제 타입을 체크하는데 사용.
- 이항연산자이며 피연산자는 참조형 변수와 타입. 연산결과는 true, false.
- instanceof의 연산결과가 true이면, 해당 타입으로 형 변환이 가능하다.

```
FireEngine fe = new FireEngine();

// 참조변수 fe는 FireEngine의 인스턴스이다.
// 동시에 Car, Object의 인스턴스이다.

```

<br>

#### 3. 참조변수와 인스턴스의 연결

> 멤버변수가 중복정의된 경우, 
> 참조변수의 타입에 따라 연결되는 멤버변수가 달라진다. (참조변수타입에 영향 받음)
>
> 메서드가 중복정의된 경우, 
> 참조변수의 타입에 관계없이 항상 실제 인스턴스 타입에 정의된 메서드가 호출된다. (참조변수타입에 영향 받지 않음)

> 즉, 멤버변수가 중복되면 참조 타입 객체를 따르고,
> 메서드가 중복되면 인스턴스 타입 객체를 따른다.

<br>

#### 4. 매개변수의 다형성

- 참조형 매개변수는 메서드 호출시, 자신과 같은 타입 또는 자손타입의 인스턴스를 넘겨줄 수 있다.

#### 5. 여러 타입의 객체를 하나의 배열로 다루기

- 조상타입의 배열에 자손들의 객체를 담을 수 있다.

<br>

```
Product p1 = new Tv();
Product p2 = new Computer();
Product p3 = new Audio();

Product p[] = new Product[3];
p[0]= new Tv();
p[1]= new Computer();
p[2]= new Audio();
```

```
class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	Product[] cart = new Product[10];
	
	int i = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		
		this.moeny -= p.price;
		this.bonusPoint -= p.bonusPoint;
		cart[i++] = p;
	}
}
```

<br>

### 12. 추상클래스

- 클래스가 설계도라면 추상클래스는 미완성 설계도라고 할 수 있다.
- 추상메서드(미완성 메서드)를 포함하고 있는 클래스.

** 추상메서드: 선언부만 존재하고 구현부(몸통, body)는 없는 메서드

<br>

```
abstract class Player {
	int currentPos;				// 현재 play되고 있는 위치를 저장하기 위한 변수
	
	Player() {					// 추상클래스도 생성자가 있어야 한다.
		this.currentPos = 0;
	}
	
	abstract void play(int pos);	// 추상메서드
	abstract void stop();			// 추상메서드
	
	void play() {
		play(currentPos);			// 추상메서드를 사용할 수 있다.
	}
}
```

<br>

- 일반 메서드가 추상 메서드를 호출할 수 있다.
- 완성된 설계도가 아니므로 인스턴스를 생성할 수 없다.
- 다른 클래스를 작성하는 데 도움을 줄 목적으로 작성한다.

<br>

#### 1. 추상메서드

- 선언부만 있고 구현부가 없는 메서드

```
// 주석을 통해 어떤 기능을 수행할 목적으로 작성하였는지 설명한다.
// abstract 리턴타입 메서드이름();

abstract void play(int pos);
```

<br>

- 꼭 필요하지만 자손마다 다르게 구현될 것으로 예상되는 경우 사용한다.
- 추상클래스를 상속받는 자손클래스에서 추상메서드의 구현부를 완성해야 한다.

<br>

#### 2. 추상클래스의 작성

> 여러 클래스에 공통적으로 사용될 수 있는 추상클래스를 바로 작성하거나 
> 기존클래스의 공통 부분을 뽑아서 추상클래스를 만든다.

<br>

### 13. 인터페이스

- 일종의 추상클래스. 추상클래스보다 추상화 정도가 높다.
- 실제 구현된 것이 없는 기본 설계도.
- 추상메서드와 상수만을 멤버로 가질 수 있다.
- 인스턴스를 생성할 수 없고, 클래스 작성에 도움을 준다.
- 미리 정해진 규칙에 맞게 구현하도록 표준을 제시하는 데 사용된다.

<br>

#### 1. 인터페이스의 작성

```
/*
interface 인터페이스 이름 {
	public static final 타입 상수명 = 값;
	public abstract 메서드명(매개변수);
}
*/
```

<br>

- 구성요소(멤버)는 추상메서드와 상수만 가능하다.

- 모든 멤버변수는 public static final 이어야 하며, 이를 생략할 수 있다.
- 모든 메서드는 public abstract 이어야 하며, 이를 생략할 수 있다.

<br>

```
interface PlayingCard {
	public static final int SPADE = 4;
	final int DIAMOND = 3;	// public static final int DIAMOND = 3;
	static int HEART = 2;	// public static final int HEART = 2;
	int CLOVER = 1;			// public static final int CLOVER = 1;

	public abstract String getCardNumber();
	String getCardNumber();	// public abstract String getCardNumber();
}
```

<br>

#### 2. 인터페이스의 상속

- 인터페이스도 클래스처럼 상속이 가능하다. (다중상속 허용)
- 인터페이스는 Object 클래스와 같은 최고 조상이 없다.

```
interface Movable {
	void move(int x, int y);
}

interface Attackable {
	void attack(Unit u);
}

interface Fightable extends Movable, Attackable {}
```

<br>

#### 3. 인터페이스의 구현

- 인터페이스를 구현하는 것은 클래스를 상속받는 것과 같다.

<br>

```
// class 클래스이름 implements 인터페이스명 {
	// 인터페이스에 정의된 추상 메서드를 구현
}
```

<br>

- 인터페이스에 정의된 추상메서드를 완성해야 한다.

<br>

```
class Fighter implements Fightable {
	void move(int x, int y) {};
	void attack(Unit u) {}
}


```

<br>

- 상속과 구현이 동시에 가능하다.

<br>

```
class Fighter extends Unit implements Fightable {
	public void move(int x, int y) {};
	public void attack(Unit u) {};
}
```

<br>

#### 4. 인터페이스를 이용한 다형성

- 인터페이스 타입의 변수로 인터페이스를 구현한 클래스의 인스턴스를 참조할 수 있다.

<br>

```
class Fighter extends Unit implements Fightable {
	public void move(int x, int y) {};
	public void attack(Unit u) {};
}

Fighter f1 = new Fighter();
Fightable f2 = new Fightable();
```

<br>

- 인터페이스를 메서드의 매개변수 타입으로 지정할 수 있다.

<br>

```
void attack(Fightable f) {
	// ...
}
```

<br>

- 인터페이스를 메서드의 리턴타입으로 지정할 수 있다.

<br>

```
Fightable method() {
	// ...
	return new Fighter();
}
```

<br>

#### 5. 인터페이스의 장점

1. 개발시간을 단축시킬 수 있다.
2. 표준화가 가능하다.
3. 서로 관계없는 클래스들에게 관계를 맺어 줄 수 있다.
4. 독립적인 프로그래밍이 가능하다.

<br>

#### 6. 인터페이스의 이해

- 두 대상(객체)를 이어주는 중간 역할을 한다.
- 선언(설계)와 구현을 분리시큰ㄴ 것을 가능하게 한다.

<br>

- 인터페이스를 이해하려면 두 가지를 기억하자.
	- 클래스를 사용하는 쪽(User)과 클래스를 제공하는 쪽(Provider)이 있다.
	- 메서드를 사용(호출)하는 쪽(User)에서는 사용하려는 메서드(Provider)의 선언부만 알면 된다.

<br>

- 직접적인 관계의 두 클래스(A-B)

<br>

```
class A {
	public void method(B b) {
		b.methodB();
	}	
}

class B {
	public void methodB() {
		System.out.println("methodB()");
	}
}

class InterfaceTest {
	pubic static void main(String[] args) {
		A a = new A();
		a.method(new B());
	}
}
```

<br>

- 간접적인 관계의 두 클래스(A-I-B)

<br>

```
class A {
	public void methodA(I i) {
		i.methodB();
	}
}

interface I { void methodB(); }

classB implements I {
	public void methodB() {
		System.out.println("methodB());
	}
}

class C implements I {
	public void methodB() {
		System.out.println("methodB() in C);
	}
}
```

<br>

#### 7. 인터페이스의 이해 - 예제

- 인터페이스 미적용 코드

<br>

```
class Time {
	int hour;
	int minute;
	int second;
	
	public int getHour() { return hour; }
	public void setHour(int hour) {
		// 예외처리
		this.hour = hour;
	}
	
	public int getMinute() { return minute; }
	public void setMinute(int minute) {
		// 예외처리
		this.minute = minute;
	}
	
	public int getSecond() { return second; }
	public void setSecond(int secound) {
		// 예외처리
		this.second = secound;
	}
}
```

<br>

- 인터페이스 적용 코드

<br>

```
public interface TimeIntF {
	public int getHour();
	public void setHour(int hour);

	public int getMinute();
	public void setMinute(int minute);

	public int getSecond();
	public void setSecond(int second);	
}
```

<br>

#### 8. 디폴트 메서드 - JDK1.8

> 인터페이스에 새로운 메서드(추상 메서드)를 추가하면, 
이 인터페이스를 구현한 기존의 모든 클래스가 이 메서드를 구현해야 한다.

> 디폴트 메서드는 추상 메서드의 기본 구현을 제공한다. 그래서 구현부{}를 가지며 항상 public이다. (생략 가능)

<br>

```
// 디폴트 메서드 미적용 코드
interface MyInterface {
	void method();
	void newMethod();	// 추상 메서드
}

// 디폴트 메서드 적용 코드
interface MyIntergace {
	void method();
	default void newMethod();
}
```

<br>

1. 여러 인터페이스의 디폴트 메서드 간의 충돌
	- 인터페이스를 구현한 클래스에서 디폴트 메서드를 오버라이딩해야 한다.
2. 디폴트 메서드와 조상 클래스의 메서드 간의 충돌
	- 조상 클래스의 메서드가 상속되고, 디폴트 메서드는 무시된다.

<br>

### 17. 컬렉션 프레임워크

- 컬렉션: 여러 객체(데이터)를 모아 놓은 것을 의미
- 프레임워크: 표준화, 정형화된 체계적인 프로그래밍 방식
- 컬렉션 프레임워크
	- 컬렉션(여러 객체)를 다루기 위한 표준화된 프로그래밍 방식
	- 컬렉션을 쉽고 편리하게 다룰 수 있는 다양한 클래스 제공
	- java.util 패키지에 포함
- 컬렉션 클래스: 다수의 데이터를 저장할 수 있는 클래스 (ex, Vector, ArrayList, HashSet)

#### 1. 컬렉션 프레임워크의 핵심 인터페이스

List
Set
Map

> List
> 순서를 유지하는 데이터의 집합. 중복을 허용한다. 
> ex) 대기자 명단
> 구현 클래스: ArrayList, LinkedList, Stack, Vector 등

<br>

> Set
> 순서를 유지하지 않는 데이터 집합. 데이터 중복을 허용하지 않는다.
> ex) 양의 정수집합, 소수의 집합
> 구현 클래스: HashSet, TreeSet 등

<br>

> Map
> 키와 쌍으로 이루어진 데이터의 집합
> 순서를 유지하지 않고, 값의 중복만 허용한다.
> ex) 우편번호, 지역번호
> 구현 클래스: HashMap, TreeMap, HashTable, Properties 등

<br>

#### 2. Collection 인터페이스의 메서드

add, remove, isEmpty, contains, iterator, size

<br>

#### 3. List 인터페이스

- ArrayList
- LinkedList

- add, get, indexOf, remove, set(지정된 위치에 객체 저장), sort, subList

<br>

#### 4. Set 인터페이스

- HashSet
- TreeSet

* 집합과 관련된 메서드(Collection의 변화가 있으면 true, 없으면 false)
	- boolean addAll. 합집합
	- boolean containsAll. 부분집합
	- boolean removeAll. 차집합
	- boolean retainAll. 교집합

<br>

#### 5. Map 인터페이스

- HashMap
- TreeMap

- put, get, remove, entrySet, keySet, values

<br>

#### 6. ArrayList

> Vector: 옛날 버전. 동기화되어 있다.
> ArrayList: Vector를 개선한 것으로 동기화되어 있지 않다.
> 데이터 저장 공간으로 배열을 사용한다.

<br>

```
// Vector 클래스
public class Vector extends AbstractList
	implements List, RandomAccess, Cloneable, java.io.Serializable
{
	...
	protected Object[] elementData;	// 모든 종류의 객체를 담기 위한 배열
	...
}
```

<br>

#### 8. LinkedList

	1) 크기 변경 가능
	2) 추가, 삭제 시간 단축
	3) 다음 노드의 참조 변수 값, 데이터 값을 가지고 있다.
	4) 데이터 삭제 - 한번의 참조 변경으로 가능하다.
	5) 데이터 삽입 - 한번의 node 객체 생성. 두번의 참조 변수 수정으로 가능하다.
	6) 접근성이 나쁘다.
	7) 이중 연결리스트: 접근성이 향상되었다. 이전 요소에 접근할 수 있다.
	8) 이중 원형 연결리스트: 처음과 끝 노드를 이어주는 방식.
	
<br>

#### 9. 스택과 큐

- 스택: LIFO구조. 마지막에 저장된 것을 가장 먼저 추출한다. (push, pop)

<br>

> boolean empty()
> Object peek()
> Object pop()
> Object push(Object item)
> int search (object o)

<br>

- 큐: FIFO구조. 제일 먼저 저장한 것을 가장 먼저 추출한다. (offer, poll)

에러 발생

> boolean add(Object o)
> Object remove()
> Object element 

함수 실행 실패 시 false 혹은 null을 반환

> boolean offer(Object o)
> Object poll()
> Object peek()

<br>

#### 10. Iterator, ListIterator, Enumeration

- 컬렉션에 저장된 데이터를 접근하는데 사용되는 인터페이스
- 컬렉션에 저장된 요소를 읽어오는 방법을 표준화한 것
- Enumeration는 Iterator의 구버전
- ListIterator는 Iterator의 접근성을 향상시킨 것 (단방향 -> 양방향)
- 주요 메서드 
	- boolean hasNext()
	- Object next();

<br>

- Map에는 iterator()가 없다.
- 메서드를 사용한다. 
	- keySet() 
	- entrySet()
	- values()

<br>

```
Map map = new HashMap();

Iterator it = map.entrySet().iterator();
```

<br>

### 19. 쓰레드

#### 1. 쓰레드란? 

- 프로세스
	- 실행 중인 프로그램, 자원과 쓰레드로 구성
	
- 쓰레드
	- 프로세스 내에서 실제 작업을 수행.
	- 프로세스는 모두 최소 하나의 쓰레드를 가지고 있다.
	
프로세스 : 쓰레드 = 공장 : 일꾼

- 싱글 쓰레드 프로세스: 자원 + 쓰레드
- 멀티 쓰레드 프로세스: 자원 + n개의 쓰레드

PID: 프로세스ID

- 하나의 새로운 프로세스를 생성하는 것보다 하나의 새로운 쓰레드를 추가하는 것이 더 효율적이다.

#### 2. 멀티쓰레드의 장단점

장점
	
	- 시스템 자원을 보다 효율적으로 사용할 수 있다.
	- 사용자에 대한 응답성이 향상된다.
	- 작업이 분리되어 코드가 간결해진다.
	
단점 

	- 동기화에 주의해야 한다.
	- 교착상태가 발생하지 않도록 주의해야 한다.
	- 각 쓰레드가 효율적으로 균등히 실행될 수 있도록 해야 한다.

<br>

####. 3. 쓰레드의 구현과 실행

- 1. Thread 클래스를 상속

```
class myThread extends Thread {
	public void run() {	// Thread run 오버라이딩
		// 작업 내용
	}
}

// ...

MyThread t1 = new MyThread();
t1.run();
```

<br>

- 2. Runnable 인터페이스를 구현

```
class MyThread2 implements Runnable {
	public void run() {	// Runnable 인터페이스의 추상메서드 run() 구현
		// 작업 내용
	}
}

// ...

Runnable r = new MyThread2();
Thread t2 = new Thread(r);

t2.start();
```

<br>

- 메인메서드 호출

```
public static void main(String[] args) {
	ThreadTest1 t1 = new ThreadTest1();
	
	Runnable r = new ThreadTest2();
	Thread t2 = new Thread(r);
	
	t1.start();
	t2.start();
}
```

<br>

- 쓰레드 구현 클래스

```
class ThreadTest1 extends Thread {
	public void run() {
		System.out.println("class called");
		
		for(int i = 0; i < 500; i++) {
//			System.out.println(getName());	// this.getName()
			System.out.print(0);	// this.getName()
		}
	}
}

class ThreadTest2 implements Runnable {

	@Override
	public void run() {
		System.out.println("interface called");
		
		for(int i = 0; i < 500; i++) {
			// Thread.currentHead 현재 실행중인 Thread를 반환한다.
//			System.out.println(Thread.currentThread().getName());
			System.out.print(1);
		}
	}
	
}
```

- 쓰레드가 엉켜서 작업 하는 것을 확인할 수 있다.

#### 4. 쓰레드의 실행 - start()

- 쓰레드를 생성한 후에 start()를 호출해야 쓰레드 작업이 시작된다.

```
ThreadTest1 t1 = new ThreadTest1();
ThreadTest1 t2 = new ThreadTest1();

t1.start(); // 쓰레드 t1을 실행한다.
t2.start(); // 쓰레드 t2를 실행한다.
```

<br>

어떤 쓰레드가 먼저 실행될지 알 수 없다. (OS스케줄러가 실행순서를 결정)
 - start()는 시작 상태가 되는 것일 뿐 바로 실행되는 것이 아니기 때문이다.

<br>

#### 5. start()와 run()

```
class MyThread extends Thread {
	public void run() { //... }
}

public class ThreadTest {
	public static void main(String[] args) {
		ThreadTest1 t1 = new ThreadTest1();
		t1.start();
	}
}
```

<br>

```
1. CallStack			2. CallStack			3.Callstack				4.CallStack

start()				start 새 쓰레드생성		start() run 호출 후 종료		
main()				main()				main()		run()			main()		run()
```

<br>

#### 5. main 쓰레드

- main 메서드의 코드를 수행하는 쓰레드
- 쓰레드에는 사용자 쓰레드와 데몬 쓰레드 두 종류가 있다.
	- main thread - 사용자 쓰레드
	- 보조 thread - 데몬 쓰레드
- 실행 중인 사용자 쓰레드가 하나도 없을 때 프로그램은 종료된다.
	- 멀티쓰레드의 경우 새 쓰레드 작업이 시작되므로 main 쓰레드가 종료되어도 프로그램은 종료되지 않는다.

<br>

- main 쓰레드는 t1, t2가 종료될 때까지 대기한다.
- join 메서드를 지우면 main메서드는 바로 종료되지만 타 쓰레드가 실행 중이므로 프로그램은 종료되지 않는다.
- 쓰레드의 join메서드는 호출한 쓰레드가 종료될 때까지 대기하게 만든다.

```
public class ThreadTest {
	static long startTime = 0;
	
	public static void main(String[] args) {
		ThreadEX5_1 t1 = new ThreadEX5_1();
		ThreadEX5_2 t2 = new ThreadEX5_2();
		
		t1.start();
		t2.start();

		startTime = System.currentTimeMillis();
		
		try {
			t1.join();	// main 쓰레드가 t1의 작업이 끝날 때까지 기다린다.
			t2.join();	// main 쓰레드가 t2의 작업이 끝날 때까지 기다린다.
		} catch(InterruptedException e) {}
		
		System.out.println("소요시간: " + (System.currentTimeMillis() - startTime));
	}

}

class ThreadEX5_1 extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("-");
		}
	}
}

class ThreadEX5_2 extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("|");
		}
	}
}
```

<br>

#### 6. 싱글쓰레드와 멀티쓰레드

- 두개의 작업이 있다고 가정했을 때,
- 싱글 쓰레드의 경우 두개의 작업이 있을 때 절대로 겹치지 않는다.
- 멀티 쓰레드의 경우 두개의 각 쓰레드의 작업은 뒤섞여 실행된다.
- 시작이나 호출되는 순서는 OS스케줄러의 판단이므로 (그때의 자원과 상태 등을 고려) 사용자가 개입할 수 없다.
- context switching은 멀티쓰레드일 때, 특정 쓰레드의 작업이 다른 쓰레드로 옮겨지는 것을 의미한다. 싱글쓰레드 보다 시간이 지연된다.
- 멀티쓰레드가 싱글쓰레드에 비해 작업 시간이 더 걸림에도 불구하고 여러 작업을 할 수 있다는 장점을 가지고 있다.

<br>

#### 7. 쓰레드의 I/O 블락킹

- blocking 부분이 존재할 때 싱글쓰레드는 사용자 입력을 기다리므로 아무런 작업을 할 수 없다.
- 반면, 멀티쓰레드는 대기 시간에도 다른 작업이 진행된다.

<br>

- 싱글쓰레드 - I/O 블락킹에 의해 모든 작업이 진행되지 않는다.

```
public static void main(String[] args)  {
	System.out.println("아무 값이나 입력하세요.");
	
	Scanner sc = new Scanner(System.in);
	String input = sc.nextLine();
	
	System.out.println("입력하신 값은 " + input + "입니다.");
	
	for(int i = 10; i > 0; i--) {
		System.out.println(i);
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {}
	}
}
```

<br>

- 멀티쓰레드 - I/O 블로킹에도 타 쓰레드가 작업한다.

```
// ThreadTest main()

ThreadTest7 t1 = new ThreadTest7();
t1.start();

System.out.println("아무 값이나 입력하세요.");

Scanner sc = new Scanner(System.in);
String input = sc.nextLine();

System.out.println("입력하신 값은 " + input + "입니다.");

// ThreadTest7 class		
public void run () {
	for(int i = 10; i > 0; i--) {
		System.out.println(i);
		
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
```

#### 8. 쓰레드의 우선 순위

- 작업의 중요도에 따라 쓰레드의 우선 순위를 지정하여 특정 쓰레드가 더 많이 작업할 수 있도록 할 수 있다.
- OS 스케줄러는 모든 프로세스와 스레드를 고려하므로 우선 순위를 무조건적으로 반영하지는 않는다.

```
// void setPriority(int newPriority) 쓰레드의 우선 순위를 지정한 값으로 변경한다.
// int getPriority() 쓰레드의 우선 순위를 반환한다.

public static final int MAX_PRIORITY = 10 // 최대 우선 순위
public static final int MIN_PRIORITY = 1  // 최소 우선 순위
public static final int NORM_PRIORITY = 5 // 보통 우선 순위
```

#### 9. 쓰레드 그룹

- 서로 관련된 쓰레드를 그룹으로 묶어서 다루기 위한 것
- 모든 쓰레드는 반드시 하나의 쓰레드 그룹에 속해야 한다.
- 쓰레드 그룹으로 지정하지 않고 생성한 쓰레드는 'main쓰레드 그룹'에 속한다.
- 자신을 생성한 쓰레드(부모 쓰레드)의 그룹과 우선순위를 상속받는다.

<br>

```
Thread(ThreadGroup group. String name)
Thread(ThreadGroup group. Runnable target)
Thread(ThreadGroup group. Runnable target, String name)
Thread(ThreadGroup group. Runnable target, String name, long stackSize)
```

<br>

```
// 쓰레드 자신이 속한 쓰레드 그룹 반환
ThreadGroup getThreadGroup()

// 처리되지 않은 예외에 의해 쓰레드 그룹의 쓰레드 실행이 종료되면, JVM에 의해 이 메서드가 자동 호출된다.
void uncaughtException(Thread t, Throwable e)
```

<br>

#### 10. 데몬 쓰레드

- 일반 쓰레드의 작업을 돕는 보조적인 역할을 수행
- 일반 쓰레드가 모두 종료되면 자동적으로 종료된다.
- 가비지 컬렉터(쓰지 않는 메모리 정리), 자동저장, 화면 자동갱신 등에 사용된다.
- 무한루프와 조건문을 이용해서 실행 후 대기핟가ㅏ 특정 조건이 만족되면
  작업을 수행하고 다시 대기한다.
  
<br>

```
// 일반 쓰레드가 종료되면 자동 종료되므로 무한루프로 구현
public void run() {
	while(true) {
		try {
			Thread.sleep(3 * 1000);	// 3초 마다
		} catch(InterruptedException e) {}
	
		// autoSave값이 true면 autoSave() 메서드 호출
		if(autoSave) {
			autoSave();
		}
	}
}
```

<br>

- boolean isDaemon() - 쓰레드가 데몬 쓰레드인지 확인하는 메서드
- void setDaemon(boolean on) - 쓰레드를 데몬 쓰레드 혹은 사용자 쓰레드로 변경.
							 매개변수 on을 true로 지정하면 데몬 쓰레드가 된다.

** setDaemon(boolean on)은 반드시 start()를 호출하기 전에 실행되어야 한다.
   그렇지 않으면 IllegalThreadStateException이 발생한다.

<br>

```
public class Ex19_10 implements Runnable {
	static boolean autoSave = false;
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Ex19_10()); // Runnable r
		
		// 데몬 쓰레드가 아니라면 프로그램은 종료되지 않고 계속해서 3초마다 저장된다.
		t1.setDaemon(true);
		t1.start();
		
		for(int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("main= " + i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(i == 5) {
				autoSave = true;
			}
		}
		
		System.out.println("프로그램이 종료됩니다.");
	}

	@Override
	public void run() {
		while(true) { // 무한루프
			try {
				Thread.sleep(3 * 1000);
			} catch (InterruptedException e) {
			}
			
			if(autoSave) autoSave();
		}
	}

	void autoSave() {
		System.out.println("파일을 저장했습니다.");
	}
}
```

<br>

#### 12. 쓰레드의 상태

- NEW				쓰레드가 생성되고 아직 start()가 호출되지 않은 상태
- RUNNABLE			실행 중 또는 실행 가능한 상태
- BLCOKED			동기화 블럭에 의해 일시정지된 상태(lock이 풀릴 때까지 기다리는 상태)
- WATING			쓰레드의 작업이 종료되지 않았지만 실행 가능하지 않은 일시정지 상태 
- TIMED_WAITING		WAITING과 같지만 일시정지시간이 지정된 경우를 의미
- TERMINATED 		쓰레드의 작업이 종료된 상태

쓰레드의 생성 NEW
쓰레드의 실행대기 또는 실행 RUNNABLE: 줄서기
할당된 작업 시간이 지나면 다시 줄을 선다.
stop혹은 소멸되지 않는 한 다시 줄을 선다.

만나면 대기(waiting, blocked)
suspend()	일시정지	<->		resume()	재개
sleep()		잠자기	<->		interrupt()	깨우기
wait()		대기		<->		notify
join()		기다리기			time-out	시간종료
I/O block	입출력대기

#### 13. 쓰레드의 실행제어

- 쓰레드의 실행을 제어할 수 있는 메서드가 제공된다.

** static은 thread 자기 자신에게 호출 가능

- static void sleep(long millis)
- void join()			
- void inerrupt() 		sleep() or join()을 깨움
- void stop 			쓰레드 즉시 종료
- void suspend()		일시정지
- void resume()			재개
- static void yield()

<br>

#### 14. sleep()

- static 함수이므로 자기 자신만 대상이 된다.
- 현재 쓰레드를 지정된 시간동안 멈추게 한다.

<br>

```
static void sleep(long millis)
```

<br>

- 예외처리 해야한다.(InterruptedException이 발생하면 깨어남)

<br>

```
try {
	Thread.sleep(1 * 3000);
} catch (InterruptedException e) {} // Exception의 자손이므로 필수 예외처리 필요
```

<br>

#### 15. interrupt()

- 대기상태(WAITING)인 쓰레드를 실행대기 상태(RUNNABLE)로 만든다.

```
void interrupt()		// 쓰레드의 interrupted를 false에서 true로 변경
boolena isInterrupted()		// 쓰레드의 interrupted 상태를 반환
static boolean interrupted()	// 현재 쓰레드의 interrupted 상태를 알려주고, false로 초기화
```
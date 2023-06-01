# 자바의 정석 내용 정리

## Index

1. 자바
6. 객체지향언어 (클래스와 객체)
7. 상속
8. 오버라이딩
10. 제어자
11. 다형성

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
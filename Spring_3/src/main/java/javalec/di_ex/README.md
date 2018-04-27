# Depdency Injection

## 왜 사용할까?

- 스프링을 이용한 객체의 사용과 조립에 이용된다.
- 여러가지 방식으로 객체를 생성할 수 있다.
- 잘만 활용한다면 java파일을 수정하지 않고 xml 파일만 수정해도 다른 결과값을 만들 수도 있다.

### <beans></beans>

- xml 파일을 생성하게 된다면 아웃라인이 beans 안에 있게 된다.

### <bean></bean>
- xml에서 사용되는데 만들어지는 객체라고 생각하자 이를 통해서 객체를 만들고 메인 함수 혹은 불리는 함수에서 사용이 가능하다.
- 기본적으로 `id` attribute 를 통해서 객체의 이름을 설정하고 , `class` attribute를 이용해서 가져오고자 하는 클래스를 설정할 수 있다.
- 빈으로 객체를 만드는 두가지 방법 
    1. 생성자를 이용한 방법
    1. setter를 이용한 방법

### <bean> 그리고 생성자를 이용한 방법
```java

<bean id="student1" class="com.javalec.Student">
    <constructor-arg>
        <value>이름</value>
    </constructor-arg>
    <constructor value="이름2"/>
</bean>
// 보이는 것처럼 2가지 방식으로 나타낼 수 있다.
```

- setter와 다르게 어떤 멤버변수에 어떤 값을 넣을건지 지정해주지 않는다.
    - `Class에 있는 멤버 변수 순서대로` 값이 들어간다 따라서 유의해야 한다.
- Class 에 constructor 부분에 있는 멤버변수를 기준으로 한다.

### <bean> 그리고 setter를 이용한 방법
```java

<bean id="student2" class="com.javalec.Student">
    <property name="memberName" value="이름3"/>
</bean>
// 보이는 것처럼 name을 통해서 멤버 변수가 무엇인지 설정해 줘야 한다.
```
- 특징은 SetMemberName이라는 `setter가 없으면 사용이 불가능` 하다는 점이다.

#### 결국 두가지를 다 사용하기도 한다.

### 또한 다른 클래스를 상속 받을수도 있다.

```java

<bean id="hello" class="test.Obj1"/>

<bean id="test_" class="test.Obj2">
    <ref bean="hello"></ref>
</bean>
```
- 만약 Obj1이 Obj2 의 클래스를 사용한다고 했을때 상단과 같이 코드를 작성할 수 있다.

## Main file

여러가지 함수들이 사용되는데 그중에서 중요한 함수 몇가지만 적어보자면

#### XML 사용 
- AbstractApplicationContext ctx = new GenericXmlApplicationContext(Path);
    - 이때 Path는 string 값이다.
        - 예시를 들자면 Path = "classpath:AppCTX.xml"; 형식으로 들어간다.
        - 이때 classpath 는 resource 폴더를 기준으로 한다.
    - Path 에 있는 xml 파일을 가져와서 bean을 만들때 사용한다
    - `ctx.getBean("idValue" , Object.class);` 를 통해서 가져올 수 있는데, 이때 Object.class 와 bean으로 가져오는 클래스는 동일해야 한다.

#### Config.java 사용 
- AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
    - ApplicationConfig.class 파일에는 `@Configuration` 그리고 `@Bean` 어노테이션이 사용된다.
    - java 파일 안에서 설정을 해준뒤 가져온다.

### 마지막에는 ctx.close() 로 사용하지 않는 ctx 리소스를 제거해야 한다.
# Course_1 알고리즘과 입출력

#### A+B && A+B-2 는 동일한 소스

### A_Plus_B_6
- 먼저 간단하게 아래와 같이 처리할 수 있음.
```
Scanner sc = new Scanner(System.in);
    int how_many = sc.nextInt();
    for(int k=0;k<how_many;k++){
        StringTokenizer tokens = new StringTokenizer(sc.next() , ",");
        System.out.println(Integer.parseInt(tokens.nextToken()) + Integer.parseInt(tokens.nextToken()));
    }
```

- 한번 nextLine 으로 시도를 해봄 how_many는 동일
```
for(int k=0;k<how_many;k++){
        StringTokenizer tokens = new StringTokenizer(sc.nextLine() , ",");
        System.out.println(Integer.parseInt(tokens.nextToken()) + Integer.parseInt(tokens.nextToken()));
    }
``` 

- 위의 코드에서 에러가 발생 이유는 ```next()``` 와 ```nextLine()```의 차이 그리고 버퍼에 남아있는 개행문자 때문이였다. 
- ```next()```는 단어 하나를 입력받기 위해서 사용된다. 그리고 개행문자를 무시하는데 이는 버퍼에 그대로 남아있다.
- ```nextLine()```은 개행문자를 만날때까지 한 줄을 그대로 받는다.
- 문제는 how_many 쪽에서 nextInt()를 사용할 때 숫자를 입력받았지만 버퍼에는 개행문자가 그대로 남아있다. 
즉 nextLine으로 값을 받으려고 한 결과 개행문자를 바로 만나서 아무 값도 들어오지 않았기 때문에 에러가 발생했다.

따라서 현재 코드와 같이 how_many 또한 ```nextLine()```으로 받아 개행문자까지 처리를 한 뒤에 정상적으로 작동되는 것을 볼 수 있었다.

##### reference 
- about next() and nextLine()  ==> [Bing9 Blog](http://bing9blog.com/java-scanner-next-nextline%EC%B0%A8%EC%9D%B4%EC%99%80-%EC%9E%85%EB%A0%A5%EB%AC%B8%EC%A0%9C-%ED%95%B4%EA%B2%B0%EB%B2%95/)

### Print_itactly

- isEmpty 를 이용해서 빈줄이 들어왔을 때 실행을 종료한다. 
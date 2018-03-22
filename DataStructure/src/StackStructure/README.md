# DataStructure - Stack

- LIFO(Last In First Out) 리스트 라고도 한다. 
    - 마지막에 들어간 원소가 제일 먼저 나온다.

## Stack Interface

- 기본으로 스택에 있어야 할 메서드들을 interface 형식으로 만들었다.
    - array의 형태는 자바에서 표현할 수 있는 모든 타입을 넣을 수 있도록 Object로 만들었다.
- push(element x) : 스택에 element를 삽입한다.
- pop() : 스택에 제일 나중에 들어간 원소를 확인 후 제거한다.
- peek() : 스택에 제일 나중에 들어간 원소를 확인한다.
- isEmpty() : 스택이 비었는지 안 비었는지 확인한다.

## Basic Stack

- top 을 -1 으로 초기화 한다.
    - 따라서 top은 size가 아니다. 최 상단의 index값이다.
    - 원소의 갯수를 표현할 때에는 array.length로 표현한다.
- isEmpty를 통해서 항상 체크를 해줘야 한다.
- push를 할 때 스택이 Full일 경우
    - increment를 지정할 수도 있고 안할 수도 있다.
    - 예를 들어서 stack이 full 이 된 경우에는 size만큼 늘려 줄 수도 있다.
    - 여기에서는 기본적으로 increment까지 받았을 때의 stack 구조를 만들었다.

## Linked Stack

- 스택의 크기가 불확실하고 여러 개의 스택을 동시에 사용해야 하는 경우에 LinkedStack을 사용하는 것이 편하다.
    - 스택이 k개 있을 경우 stackTop[k]로 관리한다.
    - 예를 들어 하나의 스택에서는 isEmpty() 형식이지만 k개의 stack이라고 가정한다면 isEmpty(int i) 를 통해서 메서드를 호출한다.
- ListNode 클래스를 하나 만들어 data와 link를 관리한다.
    - top 또한 이 ListNode 이고 top이 null 인 경우 스택이 빈것이다.
    
    
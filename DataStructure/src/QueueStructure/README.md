# DataStructure - Queue

- FIFO(First In First Out) 리스트 라고도 한다.
    - 처음에 들어간 원소가 제일 먼저 나온다. 
- 순차적 표현과 순환 큐 두가지 방식을 설명한다.

## Queue Interface

- 기본으로 큐에 있어야 할 메서드들을 interface 형식으로 만들었다.
    - array의 형태는 자바에서 표현할 수 있는 모든 타입을 넣을 수 있도록 Object로 만들었다.
- enQueue(element x) : 큐에 element x 를 삽입한다.
- deQueue() : 큐에서 front에 있는 원소를 확인 후 제거한다.
- peek() : 큐에서 front에 있는 원소를 확인한다.
- isEmpty() : 큐가 비었는지 안 비었는지 확인한다.

## Basic Queue ( 순차적 표현)

- top과 front를 -1 으로 초기화 한다.
    - enqueue 는 rear를 하나 증가시키고 원소를 삽입
    - dequeue 는 front를 하나 증가시키고 원소를 삽입
    - 원소의 갯수를 표현할 때에는 array.length가 아닌 (rear - front)로 확인한다.
- push를 할 때 큐가 Full일 경우
    - increment를 지정할 수도 있고 안할 수도 있다.
    - 예를 들어서 stack이 full 이 된 경우에는 size만큼 늘려 줄 수도 있다.
    - 여기에서는 기본적으로 increment까지 받았을 때의 queue 구조를 만들었다.
- peek를 확인할 때 temparary 변수를 하나 지정해주자

## Circular Queue
 
 - top과 front를 0 으로 초기화 한다.
 - count 를 통해서 queue의 원소 수를 저장한다.
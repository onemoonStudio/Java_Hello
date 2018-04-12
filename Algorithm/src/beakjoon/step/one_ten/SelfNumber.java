package beakjoon.step.one_ten;

public class SelfNumber {
    public static void main(String[] args) {
        int resultArr[] = new int[10001];   // result
        int numberArr[];       // 자리수 arr
        int subResult;


        for(int i=1;i<10001;i++){
            // 최대 5자리
            subResult = i;

            numberArr = new int[]{ i/10000 , (i/1000)%10 ,(i/100)%10,(i/10)%10, i%10 };
            for(int el:numberArr){
                subResult += el;
            }
            if(subResult < 10001 && resultArr[subResult] == 0){
                resultArr[subResult] = 1;
            }
        }

        for(int k=1;k<10001;k++){
            if(resultArr[k] == 0){
                System.out.println(k);
            }

        }
    }
}

// 자신 + 자신의 자릿수 를 더해서 만들수 없는 수를 셀프 넘버라고 한다
// 33  => 33 + 3+ 3 -> 39 따라서 39는 셀프 넘버가 아니다.
// 101 과 같은 경우에는 91 , 100 같이 2개의 생성자가 있다. 따라서 셀프 넘버가 아니다.
// selfnumber 의 예로써는 1, 3, 5, 7, 9, 20, 31, 42, 53, 64, 75, 86, 97 등이 있다.
// 10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

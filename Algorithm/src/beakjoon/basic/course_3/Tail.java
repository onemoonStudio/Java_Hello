package beakjoon.basic.course_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tail {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputNum = Integer.parseInt(br.readLine());
        int result[] = new int[31];
        //int result[] = new int[inputNum+1];
        result[0] = 1;
        result[1] = 0;
        result[2] = 3;
        result[3] = 0;
        if(inputNum>=4){
            for(int i=4;i<inputNum+1;i++){
                if(i%2 == 1) {result[i] = 0;}
                else{
                    result[i] = result[i-2]*3;
                    for(int j=i-4;j>=0;j-=2){
                        result[i] += 2*result[j];
                    }
                }
            }
        }
        System.out.println(result[inputNum]);
    }
}

// 런타임 에러
// 왜? result[3] 을 생각해보자 input이 3보다 작을 때 인덱스의 범위를 벗어난다.
// 따라서 문제의 입력이 30보다 적다고 말했기 때문에 31개의 배열을 만들어 주는 것으로 해결했다.

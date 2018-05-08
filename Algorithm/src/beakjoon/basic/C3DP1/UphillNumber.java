// 오르막 수를 구하시오
// 수의 자리가 오름차순을 이루는 수를 말한다.
// 인접한 수가 동일해도 오르막 수로 인정한다.
// 0으로 시작할 수 있다.
// 00122 , 00000 은 가능하지만 ,000121 은 불가능 하다.

// version 1
// 각 수(0~9) 마다 케이스를 나눠서 계산을 해본다.
// 각 수의 자리마다 결과값은 array의 합이다.

package beakjoon.basic.C3DP1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UphillNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<UphillNumber> caseArray = new ArrayList<>();
        int temp[] = new int[10];
        int tempMinusArray[] = new int[10];
        Arrays.fill(temp,1);

        UphillNumber tempObj = new UphillNumber(temp);
        caseArray.add(tempObj);
        for(int k=0 ;k<10;k++){
            temp[k] = 10-k;
        }
        tempObj = new UphillNumber(temp);
        caseArray.add(tempObj);
        // 2자리 수 까지 만들어 놓았다.

        int inNum = Integer.parseInt(sc.nextLine());
        int tempMinus;
        int tempResult;

        for( int i=2 ; i<inNum ; i++){
            tempResult = caseArray.get(i-1).subResult;
//            tempMinusArray = caseArray.get(i-1).subArray; // 1자리수 차이지만 인덱스때문에 -2
//            이렇게 하려고 했으나 객체의 주소 접근이 꼬여서 제대로 된 결과가 나오지 않음 call by reference를 생각하자
            // 따라서 call by value 방식으로 값을 복사해준 뒤 문제를 풀어나감
            for (int l=0 ;l<10;l++ ){
                tempMinusArray[l] = caseArray.get(i-1).subArray[l];
            }

            tempMinus = 0;

            for(int p=0;p<10;p++) {
                if(p>0){
                    tempMinus += tempMinusArray[p-1];
                }
                temp[p] = (tempResult - tempMinus)%10007;
            }
            System.out.println(Arrays.toString(temp));
            tempObj = new UphillNumber(temp);
            caseArray.add(tempObj);
        }

        System.out.println(caseArray.get(inNum-1).subResult);

    }

    private int subResult;
    private int[] subArray;

    public UphillNumber(int[] array){
        subArray = array;
        subResult = this.calculateResult(array);
    }

    public int calculateResult(int[] array){
        int temp = 0;
        for(int i : array){
            temp += i;
        }
        return temp;
    }

}

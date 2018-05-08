package beakjoon.basic.C2DataStructure1;

import java.util.ArrayList;
import java.util.Scanner;

public class SteelStick {
    public static void main(String[] args) {
        SteelStick _this = new SteelStick();
        Scanner sc = new Scanner(System.in);

        boolean readyForLazor = false;
        ArrayList<Integer> stickArr = new ArrayList<Integer>();
        int totalStick = 0;

        String mashString = sc.nextLine();

        for(int i=0;i< mashString.length() ; i++){

            String checkLR = _this.checkLeftRight(mashString.charAt(i));

            if(readyForLazor){
                if(checkLR.equals("Left") ){
                    stickArr.add(1);
                }else{
                    //RIGHT
                    _this.shootLazor(stickArr);
                    readyForLazor = false;
                }
            }else{ // readyForLazor == false
                if(checkLR.equals("Left") ){
                    readyForLazor = true;
                }else{
                    //RIGHT
                totalStick += _this.removeTopStick(stickArr,totalStick);
                }
            }

        }

        System.out.println(totalStick);

    }

    public String checkLeftRight(char checkThis){
        if((int)checkThis == 40){
            return "Left";
        }else {
            return "Right";
        }
    }

    public void shootLazor(ArrayList<Integer> stickArr){
        // 모든 stick Arr 에 1씩 더함
        int howManyStick = stickArr.size();
        for(int i=0;i<howManyStick;i++){
            stickArr.set(i , stickArr.get(i)+1 );
        }
    }

    public int removeTopStick(ArrayList<Integer> stickArr,int totalStick){
        // 상단의 스틱 제거 , 전체 갯수 +
        int howManyStick = stickArr.size();
        int result = stickArr.get(howManyStick-1);
        stickArr.remove(howManyStick-1);
        return result;
        // 여기서 실수한점 지역변수인데 여기서 더해놓고 전역 변수가 변하길 원했음... 지역변수 전역변수 개념 다시한번 상기할것
    }
}

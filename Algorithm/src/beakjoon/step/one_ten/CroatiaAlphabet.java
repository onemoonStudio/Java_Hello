package beakjoon.step.one_ten;
// c= c- dz= d- lj  nj s= z= 는 크로아티아 문자로 한개의 수로 본다.

import java.util.Scanner;

public class CroatiaAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char charArr[] = sc.nextLine().toCharArray();
        int count = 0;
        boolean wait = false;

        for(int k=0;k<charArr.length;k++){
            if(!wait){
                int check = checkCroa(charArr[k]);
                if(check == 0){
                    count++;
                }else{
                    wait = true;
                }
            }else{

                if(charArr[k] == '=' || charArr[k] == '-' && charArr[k-1] == 'c'){
                    count++;
                }else if(charArr[k] == 'z' && charArr[k-1] == 'd'){
                    if(k+1 < charArr.length && charArr[k+1] == '=' ){
                        count++;
                    }
                }else if(charArr[k] == 'j' && charArr[k-1] == 'l'){
                    count++;
                }else if(charArr[k] == 'j' && charArr[k-1] == 'n'){
                    count++;
                }else if(charArr[k] == '=' && charArr[k-1] == 's' || charArr[k-1] == 'z'){
                    count++;
                }else if(charArr[k] == '-' && charArr[k-1] == 'd'){
                    count++;
                }

                wait = false;

            }

        }
        System.out.println(count);

    }

    public static int checkCroa(char el){
        if(el == 'c' ) return 1;
        if(el == 'd' ) return 2;
        if(el == 'l' ) return 3;
        if(el == 'n' ) return 4;
        if(el == 's' ) return 5;
        if(el == 'z' ) return 6;
        return 0;
    }

}

// https://www.acmicpc.net/problem/2941


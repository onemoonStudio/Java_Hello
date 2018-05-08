package beakjoon.basic.C2DataStructure1;

import java.util.Scanner;

public class Bracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int check_vps = 0;
        boolean flag = true;
        int how_many = Integer.parseInt(sc.nextLine());

        for(int i=0; i<how_many;i++) {

            String input_str = sc.nextLine();

            for(int k=0;k<input_str.length();k++) {
                if ((int) input_str.charAt(k) == 40) {
                    check_vps++;

                } else {
                    check_vps--;
                    // exception!!
                    if (check_vps < 0) {
                        flag = false;
                        break;
                    }
                }
            }

            if(check_vps == 0 && flag){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

            flag = true;
            check_vps = 0;
        }

    }

    public Bracket(){

    }

}

// stack 을 쓸 필요도 없다!
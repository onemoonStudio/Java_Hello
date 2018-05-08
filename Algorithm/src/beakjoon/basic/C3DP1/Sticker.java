package beakjoon.basic.C3DP1;
// 이 문제풀이의 핵심은 아무것도 선택하지 않는 경우의 수를 생각한다.
// 그리고 이것을 새로운 배열로 만들어서 비교해 주는것
// 예를들어 어떤 줄에서 ( 세로 ) 위 스티커 선택한경우 , 아래 스티커 선택한경우 , 아무것도 선택하지 않은경우 를 생각한다
// 그 다음 위 스티커 선택한경우 , 아래 스티커 선택한경우 , 아무것도 선택하지 않은경우 의 최대값을 구한다.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sticker {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int howMany = Integer.parseInt(br.readLine());
        for(int i=0;i<howMany;i++){
            // start
            int stickerLength = Integer.parseInt(br.readLine());
            int maxStickerArr[][] = new int[stickerLength][3];
            int resultArr[] = new int[stickerLength];
            String topSticker[] = br.readLine().split(" ");
            String bottomSticker[] = br.readLine().split(" ");


            maxStickerArr[0][0] = Integer.parseInt(topSticker[0]);
            maxStickerArr[0][1] = Integer.parseInt(bottomSticker[0]);
            // maxStickerArr[0][2] 은 어차피 0
            resultArr[0] = findMax(maxStickerArr[0][0],maxStickerArr[0][1]);

            for(int s=1;s<stickerLength;s++){
                // top
                maxStickerArr[s][0] = findMax(maxStickerArr[s-1][1]+Integer.parseInt(topSticker[s]) , maxStickerArr[s-1][2]+Integer.parseInt(topSticker[s]) );
                // bottom
                maxStickerArr[s][1] = findMax(maxStickerArr[s-1][0]+Integer.parseInt(bottomSticker[s]) , maxStickerArr[s-1][2]+Integer.parseInt(bottomSticker[s]) );
                // none
                maxStickerArr[s][2] = findMax(maxStickerArr[s-1][0],maxStickerArr[s-1][1]);
                resultArr[s] = findMax(maxStickerArr[s][0],maxStickerArr[s][1],maxStickerArr[s][2]);
            }

            System.out.println(resultArr[stickerLength-1]);


        }
    }

    public static int findMax(int a, int b){
        if(a>=b){
            return a;
        }else{
            return b;
        }
    }
    public static int findMax(int a, int b,int c){
        if(a>=b && a>=c){
            return a;
        }else if(b>=a&&b>=c){
            return b;
        }else{
            return c;
        }
    }
}

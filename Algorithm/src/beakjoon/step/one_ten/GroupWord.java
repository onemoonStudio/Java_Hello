package beakjoon.step.one_ten;

// 그룹단어
// 연속해서 나타나면 count가 되지만 떨어져 있으면 count 가 되지 않는다
// abc = > 3 , abcabc => 0 , aabcbc = > 1 , kin => 3

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GroupWord {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int howMany = Integer.parseInt(br.readLine());
        int mainResult = 0;

        for(int i=0;i<howMany;i++){
            boolean tempFlag = true;
            int result[] = new int[26];
            char inputArr[] = br.readLine().toCharArray();

            result[inputArr[0]-'a'] = 1;
            for(int k =1;k<inputArr.length;k++){
                int tempIdx = inputArr[k]-'a';

                if(tempIdx == (inputArr[k-1]-'a')){
                    result[tempIdx] = 1;
                }else{
                    if(result[tempIdx] == 1){
                        tempFlag = false;
                    }else{
                        result[tempIdx] = 1;
                    }
                }
            }

            if(tempFlag) mainResult++;

        }
        System.out.println(mainResult);

    }
}

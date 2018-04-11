package beakjoon.basic.course_3;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// 다음 수 보다 작은 것들만 고려한다.

public class LongestUpSequence {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sequenceLength = Integer.parseInt(br.readLine());
        String sequnceStr[] = br.readLine().split(" ");
        int sequence[] = new int[sequenceLength];
        int maxSequence[] = new int[sequenceLength];
        int tempMaxSequence[] = new int[sequenceLength];
        Arrays.fill(tempMaxSequence,1);

        for(int i=0;i<sequenceLength;i++){
            sequence[i] = Integer.parseInt(sequnceStr[i]);
        }

        maxSequence[0] = 1;
        int tempMax = 0;

        for(int k=1;k<sequenceLength;k++){

            for(int j=0;j<k;j++){
                Arrays.fill(tempMaxSequence,1);
                if(sequence[k] > sequence[j]){
                    tempMaxSequence[j] = maxSequence[j]+1;
                }

                if(tempMax < tempMaxSequence[j]){
                    tempMax = tempMaxSequence[j];
                }
            }
            maxSequence[k] = tempMax;

            for(int el : maxSequence){
                System.out.print(el+" ");
            }
            System.out.println(" ");

            tempMax = 0;
            // 10 20 10 30 20 50 11 12 13 14
        }

        System.out.println(findMax(maxSequence));

    }

    public static int findMax(int arr[]){
        int temp =0;
        for(int el : arr){
            if(el > temp){
                temp = el;
            }
        }
        return temp;
    }

}


// version2
// 객체를 계속해서 생성한다.
//    public static void main(String[] args) throws Exception{
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int sequenceLength = Integer.parseInt(br.readLine());
//
//        String[] sequenceStr = br.readLine().split(" ");
//        int[] sequence = new int[sequenceLength];
//        for(int k =0; k<sequenceLength;k++){
//            sequence[k] = Integer.parseInt(sequenceStr[k]);
//        }
//
//        int result = 0 ;
//        ArrayList<LongestUpSequence> resultList = new ArrayList<>();
//
//        resultList.add(new LongestUpSequence(sequence[0]));
//        // 시작
//        for (int i=1;i<sequenceLength;i++){
//            // 수열 순회
//            boolean newflag = true;
//            boolean startflag = true;
//            int min = 0;
//
//            // 객체의 여러개 생성을 막기 위해서 flag 사용
//            for(int j=0;j<resultList.size();j++){
//                // resultList max 들과 sequence 비교
//                if(resultList.get(j).nowMax < sequence[i]){
//                    resultList.get(j).nowMax = sequence[i];
//                    resultList.get(j).nowLength++;
//                }else if(resultList.get(j).nowMax > sequence[i]){
//                    if(resultList.get(j).startNum >= sequence[i] && newflag){
//                        LongestUpSequence temp = new LongestUpSequence(sequence[i]);
//                        resultList.add(temp);
//                        newflag = !newflag;
//                    }
//
//                }else{
//
//                }
//            }
//
//        }
//
//
//        for(LongestUpSequence subObj : resultList){
//            if(subObj.nowLength >= result)
//                result = subObj.nowLength;
//            System.out.println("start " + subObj.startNum + " nowMax "+subObj.nowMax + " Length " + subObj.nowLength);
//        }
//
//        System.out.println(result);
//
//    }
//
//    public int nowLength;
//    public int nowMax;
//    public int startNum;
//
//    public LongestUpSequence(int val) {
//        nowLength = 1;
//        startNum = val;
//        nowMax = val;
//    }
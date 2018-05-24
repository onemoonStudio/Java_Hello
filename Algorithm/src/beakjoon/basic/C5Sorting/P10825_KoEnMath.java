package beakjoon.basic.C5Sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class P10825_KoEnMath {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int howMany = Integer.parseInt(br.readLine());
        ArrayList<String[]> list = new ArrayList<>();
        for(int i=0;i<howMany;i++){
            String input[] = br.readLine().split(" ");
            list.add(new String[]{input[0],input[1],input[2],input[3]});
        }

        Collections.sort(list, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                int ko1 = Integer.parseInt(o1[1]); int ko2 = Integer.parseInt(o2[1]);
                int en1 = Integer.parseInt(o1[2]); int en2 = Integer.parseInt(o2[2]);
                int ma1 = Integer.parseInt(o1[3]); int ma2 = Integer.parseInt(o2[3]);
                if(ko1 == ko2){
                    if(en1 == en2){
                        if(ma1 == ma2){
                            if(o1[0].compareTo(o2[0]) > 0) return 1;
                            else if (o1[0].compareTo(o2[0]) ==  0) return 0;
                            else return -1;
                        }else if (ma1 > ma2 ) return -1;
                        else return 1;
                    }else if (en1 > en2) return 1;
                    else return -1;
                }else if (ko1 > ko2) return -1;
                else return 1;
            }
        });

        for(int i=0;i<howMany;i++)
            writer.write(list.get(i)[0]+"\n");
        writer.flush();
    }
}

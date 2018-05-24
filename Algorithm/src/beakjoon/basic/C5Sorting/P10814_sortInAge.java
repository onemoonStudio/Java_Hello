package beakjoon.basic.C5Sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class P10814_sortInAge {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int howMany = Integer.parseInt(br.readLine());
        ArrayList<String[]> list = new ArrayList<>();
        String arr[][] = new String[howMany][3];
        for(int i=0;i<howMany;i++){
            String input[] = br.readLine().split(" ");
            list.add(new String[]{input[0] , input[1] , String.valueOf(i)});
        }

        Collections.sort(list, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                int age1 = Integer.parseInt(o1[0]);
                int age2 = Integer.parseInt(o2[0]);

                if(age1 > age2) return 1;

                else if(age1 == age2) {
                    int order1 = Integer.parseInt(o1[2]);
                    int order2 = Integer.parseInt(o2[2]);

                    if(order1 > order2) return 1;
                    else if (order1 == order2) return 0;
                    else return -1;
                }

                else return -1;
            }
        });

        for(int i=0;i<howMany;i++)
            writer.write(list.get(i)[0]+" "+list.get(i)[1]+"\n");
        writer.flush();
    }


}

import java.util.ArrayList;
import java.util.Scanner;

public class MultiAL {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();

        //initialization
        for (int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }

        // add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                list.get(i).add(in.nextInt());
            }

        }
        System.out.println(list);
    }
}

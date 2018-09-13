package AC.JD;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int group = sc.nextInt();
        for (int i = 0; i < group; i++) {
            int pointCount = sc.nextInt();
            int edgeCount = sc.nextInt();
            int[] array = new int[pointCount];

            for (int j = 0; j < edgeCount; j++) {
                int x = sc.nextInt()-1;
                int y = sc.nextInt()-1;
                array[x]++;
                array[y]++;
            }


            //设定一个flag，观察有没有已经打印结果
            int flag =0;
            for (int j = 0; j < pointCount; j++) {
                if (array[j] == pointCount-1){
                    flag=1;
                    System.out.println("Yes");
                    break;
                }
                if (array[j] == 0){
                    flag=1;
                    System.out.println("No");
                    break;
                }
            }
            if (flag==1) {
                continue;
            }else {
                System.out.println("No");
            }
        }
    }
}

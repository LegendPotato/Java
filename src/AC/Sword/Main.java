package AC.Sword;

import java.util.Arrays;

public class Main {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        //先排序
        for (int i = 1; i < length; i++) {
            int temp = numbers[i];
            int j = i;
            for (; j >0 && temp< numbers[j-1]; j--) {
                numbers[j]=numbers[j-1];
            }
            numbers[j] = temp;
        }
        for (int i = 0; i < length-1; i++) {
            if (numbers[i]==numbers[i+1]){
                duplication[0] = numbers[i];
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Main main = new Main();
        int[] array = {2,3,1,0,2,5,3};
        int[] result = new int[array.length];
        System.out.println(main.duplicate(array,array.length,result));
    }
}
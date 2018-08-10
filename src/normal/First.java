package normal;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] temp = input.split(" ");
        System.out.println(temp[temp.length-1].length());
    }
}

package AC.HUAWEI;

import java.util.Scanner;

public class Practice001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
//        int max = 0;
        char[] inputChar = input.toCharArray();
        int[] dp = new int[inputChar.length];
        int pre = 0;
        int res = 0;
        for (int i = 1; i < inputChar.length; i++) {
            if (inputChar[i] == ')') {
                pre = i - dp[i - 1] - 1;
                if (pre >= 0 && inputChar[pre] == '(') {
                    dp[i] = dp[i - 1] + 2 + (pre > 0 ? dp[pre - 1] : 0);
                }
            }
            res = Math.max(res, dp[i]);
        }
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < inputChar.length; i++) {
//            stack.push(inputChar[i]);
//        }
//        while (!stack.isEmpty()){
//            if (stack.peek() == '('){
//                stack.pop();
//                continue;
//            }else if (stack.peek() == ')'){
//                char temp = stack.pop();
//                char temp2 = stack.pop();
//                if (temp2 == '('){
//                    count+=2;
//                }
//            }
//        }
//        System.out.println(max);
        System.out.println(res);
    }
}

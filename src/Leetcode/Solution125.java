package Leetcode;

public class Solution125 {
    public boolean isPalindrome(String s) {
        //这种方法主要用到Character类的几个方法来做字符做处理
//        char[] array = s.toCharArray();
//        int i =0;
//        int j = array.length-1;
//        while (i < j){
//            if (!Character.isLetterOrDigit(array[i])){
//                i++;
//            }else if(!Character.isLetterOrDigit(array[j])){
//                j--;
//            }else {
//                if (Character.toLowerCase(array[i]) == Character.toLowerCase(array[j])){
//                    i++;
//                    j--;
//                }else {
//                    return false;
//                }
//            }
//        }
//        return true;
        //这个方法利用了String里的正则方法对输入字符串先做一个预处理,比较省事
        String regex = "[^0-9a-zA-Z]";
        s = s.replaceAll(regex,"").toLowerCase();
        int len = s.length();
        for (int i = 0; i < len/2; i++) {
            if (s.charAt(i) != s.charAt(len-i-1)){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Solution125 s = new Solution125();
        System.out.println(s.isPalindrome("race a car"));
    }
}

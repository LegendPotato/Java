package practice.HUAWEI;

public class Practice002 {

    public static String maxRepat(String input) {
        if (input == null || input.length() == 0) {
            return null;
        }
        int max = 0;
        int first = 0;
        int k = 0;
        for (int i = 1; i < input.length(); i++) {
            for (int j = 0; j < input.length() - i; j++) {
                if (input.charAt(j) == input.charAt(i + j)) {
                    k++;
                } else {
                    k = 0;
                }
                if (k > max) {
                    max = k;
                    first = j - k + 1;
                }
            }
        }
        if (max > 0) {
            return input.substring(first, first + max);
        }
        return null;
    }

    public static void main(String[] args) {
        String str1 = "AGCTAGCT";
        String result = Practice002.maxRepat(str1);
        if (result == null) {
            System.out.println(" " + 0);
        } else {
            System.out.println(result + " " + result.length());
        }
    }
}
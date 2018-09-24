package AC.bytecode;

        import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String[] strings = new String[count];
        for (int i = 0; i < count; i++) {
            strings[i] = sc.next();
        }
        for (int i = 0; i < count; i++) {
            System.out.println(method(strings,i));
        }
    }
    public static String method(String[] strings,int index){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings[index].length(); i++) {
            char target = strings[index].charAt(i);
            for (int j = 0; j < strings.length && i < strings[j].length(); j++) {
                if (j==i){
                    continue;
                }else {
                    if (target == strings[j].charAt(i)){
                        sb.append(target);
                    }
                }
            }

        }
        return sb.toString();
    }

}
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author zhangshuai_sx
 * @date 2019/12/13 0:08
 */

public class Java8 {
    public static void main(String[] args) {
        String[] players = new String[]{"312", "321"};
        Arrays.sort(players, (s1, s2) -> (s1.compareTo(s2)));
    }
}

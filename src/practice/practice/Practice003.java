package practice.practice;

/**
 * 3.对于一个有序数组，我们通常采用二分查找的方式来定位某一元素，请编写二分查找的算法，在数组中查找指定元素。
 * 给定一个整数数组A及它的大小n，同时给定要查找的元素val，请返回它在数组中的位置(从0开始)，若不存在该元素，返回-1。若该元素出现多次，请返回第一次出现的位置。
 * 分析：重点在返回第一次出现的位置。
 * 链接：https://blog.csdn.net/hqm12345qw/article/details/52154249
 */
public class Practice003 {

    public static int getPos(int[] A, int n,int val){
        if (n==0 || A ==null){
            return -1;
        }
        int low = 0;
        int high = n-1;
        while (low<=high){
            //防止溢出
            int mid = low + (high-low)/2;
            if (A[mid] ==val){
                //取第一次出现的位置返回
                for (int i =low;i<=mid;i++){
                    if (A[i]==val){
                        return i;
                    }
                }
            }else if(A[mid] < val){
                low = mid + 1;
                continue;
            }else {
                high = mid - 1;
                continue;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int A[] = { 2, 4, 5, 6, 9, 10 };
        int val = 6;
        int n = A.length;
        int result = getPos(A, n, val);
        System.out.println(result);
    }

}

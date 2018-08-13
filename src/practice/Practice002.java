package practice;
/**
 *   2.给定一个排好序的链表，删除链表中重复的结点，返回链表头指针。
    分析：
    (1)链表中重复的结点不需要保留一个，要全部删除。
    (2)因为相同的结点全部要删除，所以我们设定三个指针，node指向当前节点,prev指向前驱，还有一个指向后继结点。一旦遇到node和后继结点相等，就node++,知道没有重复的再移动prev.
    (3)注意：头结点也可能有重复，所以也可能被删除，所以需要定义一个root指向头结点。
 */

//链接：https://blog.csdn.net/hqm12345qw/article/details/52154249
public class Practice002 {
    static class ListNode{
        private int value;
        private ListNode next;
        public ListNode(){
        }

        public ListNode(int value){
            this.value= value;
        }

    }
    public static ListNode delete(ListNode head){

        if (head == null){
            return null;
        }
        if (head.next == null){
            return head;
        }

        //经过上面的判断，该链表至少一个两个结点
        while (head != null){
            ListNode forward = head.next;
            while (forward != null){
                if (forward.value == head.value){
                    head.next = forward.next;
                }
                    forward = forward.next;
            }
            head= head.next;
        }
        return head;
    }

    //传一个头结点，打印整个链表
    public static void echo(ListNode head){
        while (head!=null){
            System.out.println(head.value);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(1);
        ListNode listNode5 = new ListNode(2);
        ListNode listNode6 = new ListNode(5);
        ListNode listNode7 = new ListNode(10);
        ListNode listNode8 = new ListNode(9);

        listNode1.next= listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = listNode7;
        listNode7.next = listNode8;
        listNode8.next = null;

        echo(listNode1);
        ListNode result = delete (listNode1);
        echo(listNode1);
    }

}

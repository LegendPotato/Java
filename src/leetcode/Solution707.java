package leetcode;

/**
 * 定义一个单向链表，很考察基本功，非常好
 */

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */

public class Solution707 {
    public static void main(String[] args) {
        MyLinkedList obj = new Solution707().new MyLinkedList();
        obj.addAtHead(1);
        obj.addAtIndex(1, 2);
        System.out.println(obj.get(1));
        System.out.println(obj.get(0));
        System.out.println(obj.get(2));
    }

    class MyLinkedList {

        //初始的时候一定要定义一个头指针，最好再定义一个数量，count这个变量方便后面的方法实现
        Node head;
        int count;

        //链表的节点定义 内部类
        class Node {
            int value;
            Node next;

            public Node(int value) {
                this.value = value;
                this.next = null;
            }
        }

        /**
         * Initialize your data structure here.
         */

        public MyLinkedList() {
            //初始指针为空，数量为0
            this.head = null;
            this.count = 0;
        }

        /**
         * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
         */
        public int get(int index) {
            if (index < 0 || index >= count || this.head == null) return -1;
            Node temp = this.head;
            int counter = 0;
            while (counter != index) {
                temp = temp.next;
                counter++;
            }
            return temp.value;
        }

        /**
         * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
         */
        public void addAtHead(int val) {
            Node node = new Node(val);
            if (head == null) {
                this.head = node;
                this.count++;
            } else {
                node.next = this.head;
                this.head = node;
                this.count++;
            }
        }

        /**
         * Append a node of value val to the last element of the linked list.
         */
        public void addAtTail(int val) {
            if (head == null) {
                this.addAtHead(val);
            } else {
                Node node = new Node(val);
                Node temp = this.head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = node;
                this.count++;
            }
        }

        /**
         * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
         */
        public void addAtIndex(int index, int val) {
            //添加的话需要找到前驱节点和当前节点
            if (index < 0 || index > this.count) return;
            if (index == this.count) {
                this.addAtTail(val);
                return;
            }
            Node newNode = new Node(val);
            int counter = 0;
            Node pre = null;
            Node temp = this.head;
            while (counter < index) {
                pre = temp;
                temp = temp.next;
                counter++;
            }
            pre.next = newNode;
            newNode.next = temp;
            this.count++;
        }

        /**
         * Delete the index-th node in the linked list, if the index is valid.
         */
        public void deleteAtIndex(int index) {
            //删除的话需要找到前驱节点，当前节点和后继节点
            if (index < 0 || index >= this.count) return;
            Node pre = null;
            Node next = null;
            Node temp = this.head;
            int counter = 0;
            while (counter != index) {
                pre = temp;
                temp = temp.next;
                next = temp.next;
                counter++;
            }
            pre.next = next;
            temp.next = null;
            this.count--;
        }
    }

}

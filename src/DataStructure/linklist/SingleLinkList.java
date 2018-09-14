package DataStructure.linklist;

//单向链表
public class SingleLinkList {

    private Node head;
    private int size;

    //定义链表节点
    private class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }
    }

    //初始化单向链表
    public SingleLinkList() {
        this.head = null;
        this.size = 0;
    }

    //头插
    public void addHead(Object obj) {
        Node node = new Node(obj);
        if (this.head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
        this.size++;
    }

    //尾插
    public void addLast(Object obj) {
        Node node = new Node(obj);
        if (head == null) {
            head = node;
            size++;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
            size++;
        }
    }

    //头删
    public Object deleteHead() {

        Node temp = head;
        head = head.next;
        this.size--;
        return temp.data;
    }

    //查找指定节点，找到返回节点，找不到返回null
    public Node find(Object obj) {
        Node temp = head;
        if (temp == null) {
            return null;
        }
        while (temp != null) {
            if (obj.equals(temp.data)) {
                return temp;
            } else {
                temp = temp.next;
            }
        }
        return null;
    }

    //判空
    public boolean isEmpty() {
        return size == 0;
    }

    //删除某个节点，成功返回值，没有这个值返回null

    public Object delete(Object obj) {
        Node temp = head;
        Node previous = head;
        //链表为空
        if (temp == null) {
            return null;
        }
        //链表不为空，但当前节点不等于obj，一路遍历下去
        while (!temp.data.equals(obj)) {
            if (temp.next != null) {
                previous = temp;
                temp = temp.next;
            } else {
                return null;
            }
        }
        previous.next = temp.next;
        size--;
        return temp.data;
    }

    //打印链表
    public void print() {
        Node temp = this.head;
        if (temp == null) {
            System.out.println("空链表");
        }
        while (temp.next != null) {
            System.out.print(temp.data + "--");
            temp = temp.next;
        }
        System.out.print(temp.data);
        System.out.println();
    }

    public int getSize() {
        return this.size;
    }

    public Node getHead() {
        return this.head;
    }
}

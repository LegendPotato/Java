package DataStructure;

//双向链表
public class DoubleLinkList {

    //表头
    private LNode mHead;

    //节点个数
    private int count;

    //双向链表节点定义
    private class LNode{
        public LNode prev;
        public LNode next;
        public int value;

        public LNode(int value,LNode prev,LNode next){
            this.prev = prev;
            this.next = next;
            this.value = value;
        }
    }

    //双向链表初始化
    public DoubleLinkList() {
        mHead = new LNode(0,null,null);
        mHead.prev = mHead.next = mHead;
        count = 0;
    }

    public int size(){
        return this.count;
    }

    public boolean isEmpty(){
        return this.count == 0;
    }

    //查
    public int get(int index){
        if (index<0 || index>= count){
            throw new IndexOutOfBoundsException();
        }
        //正向查找
        if (index< count/2){
            LNode node = mHead.next;
            for (int i = 0; i < index; i++) {
                node=node.next;
            }
            return node.value;
        }
        //反向查找
        LNode node = mHead.prev;
        int dest = count - index;
        for (int i = 0; i < dest; i++) {
            node = node.prev;
        }
        return node.value;
    }

    //增




}

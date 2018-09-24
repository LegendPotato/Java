package DataStructure.heap;

public class Heap {

    //节点定义
    class Node{
        public int data;
        public Node(int data){
            this.data = data;
        }

    }
    private Node[] heapArray;
    private int maxSize;
    private int currentSize;

    //初始化堆，申请足够大的数组
    public Heap(int maxSize){
        this.maxSize = maxSize;
        this.currentSize = 0;
        this.heapArray = new Node[maxSize];
    }

    public boolean isEmpty(){
        return this.currentSize ==0 ? true:false;
    }

    public boolean isFull(){
        return this.currentSize == this.maxSize ? true:false;
    }

    //增
    public boolean insert(int key){
        if (isFull()){
            return false;
        }
        Node newNode = new Node(key);
        heapArray[currentSize] = newNode;
        shiftUp(currentSize++);
        return true;
    }

    //向上调整
    //大根堆，根为最大值，新插入的要是比他的父节点大，上浮
    public void shiftUp(int index){
        //父节点索引
        int parent = (index-1)/2;
        //新加的节点,先保存一下，存在一个临时变量bottom中，供最后一步使用
        Node bottom = this.heapArray[index];
        //整个过程有点类似于插入排序，比父节点大，父节点后移，指针前移
        while (index>0 && heapArray[parent].data < bottom.data){
            heapArray[index] = heapArray[parent];
            index = parent;
            parent = (parent-1)/2;
        }
        //临时变量bottom保存在最后的位置
        heapArray[index] = bottom;
    }

    //删除一个最大值，然后调整
    public Node remove(){
        Node removeNode = heapArray[0];
        //把最后一个值赋到0的位置，然后调整0位置的元素
        heapArray[0] = heapArray[--this.currentSize];
        shiftDown(0);
        return removeNode;
    }

    //向下调整
    //用的不是交换，是插入排序的思路
    //当然也可以用冒泡排序里的交换的思路
    public void shiftDown(int index) {
        Node top = heapArray[index];
        int largeChildIndex;
        while(index < currentSize/2) { //while node has at least one child
            int leftChildIndex = 2 * index + 1;
            int rightChildIndex = leftChildIndex + 1;
            //两个孩子节点，找较大的一个和父节点比较、交换
            if(rightChildIndex < currentSize &&  //rightChild exists?，这一步很关键
                    heapArray[leftChildIndex].data < heapArray[rightChildIndex].data) {
                largeChildIndex = rightChildIndex;
            }
            else {
                largeChildIndex = leftChildIndex;
            }
            if(top.data >= heapArray[largeChildIndex].data) {
                break;
            }
            heapArray[index] = heapArray[largeChildIndex];
            index = largeChildIndex;
        }
        heapArray[index] = top;
    }

    //根据索引改变堆中某个数据
    //不是直接改变值那么简单，还需要根据值的情况作调整
    public boolean change(int index, int newValue) {
        if(index < 0 || index >= currentSize) {
            return false;
        }
        int oldValue = heapArray[index].data;
        heapArray[index].data = newValue;
        if(oldValue < newValue) {
            shiftUp(index);
        }
        else {
            shiftDown(index);
        }
        return true;
    }
    public void displayHeap() {
        System.out.println("heapArray(array format): ");
        for(int i = 0; i < currentSize; i++) {
            if(heapArray[i] != null) {
                System.out.print(heapArray[i].data + " ");
            }
            else {
                System.out.print("--");
            }
        }
    }

}

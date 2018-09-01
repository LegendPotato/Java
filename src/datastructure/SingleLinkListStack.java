package datastructure;

//用单项链表实现栈的功能
public class SingleLinkListStack {
    private SingleLinkList linkList;

    public SingleLinkListStack() {
        linkList = new SingleLinkList();
    }

    //pop
    public Object pop(){
        Object object = linkList.deleteHead();
        return object;
    }
    //push
    public void push(Object obj){
        linkList.addHead(obj);
    }

    //判空
    public boolean isEmpty(){
        return linkList.isEmpty();
    }

    //打印
    public void print(){
        linkList.print();
    }

}

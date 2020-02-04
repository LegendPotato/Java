package datastructure.linklist;

public class SingleLinkListTest {
    public static void main(String[] args) {
        SingleLinkList singleLinkList = new SingleLinkList();
        singleLinkList.addHead("a");
        singleLinkList.addHead("b");
        singleLinkList.addHead("c");
        singleLinkList.print();
        singleLinkList.deleteHead();
        singleLinkList.addHead("d");
        singleLinkList.print();
        System.out.println(singleLinkList.isEmpty());
        System.out.println(singleLinkList.getSize());
        System.out.println(singleLinkList.find("f"));
    }
}

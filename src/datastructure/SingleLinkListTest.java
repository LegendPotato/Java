package datastructure;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

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

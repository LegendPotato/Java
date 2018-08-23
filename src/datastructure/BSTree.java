package datastructure;

public class BSTree{

    //根节点
    private BSTNode node;

    //节点定义，通过一个内部类来定义
    public class BSTNode{

        //key值和左右孩子节点，和父节点
        int key;
        BSTNode left;
        BSTNode right;
        BSTNode parent;

        public BSTNode(int key, BSTNode left, BSTNode right, BSTNode parent){
            this.key = key;
            this.left = left;
            this.right = right;
            this.parent = parent;
        }

    }

    //前序遍历
    private void preOrder(BSTNode tree){

    }

}

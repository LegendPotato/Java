package DataStructure.tree;

//二叉搜索树
public class BSTree {

    //根节点
    private BSTNode root;

    //初始化一个以root为根的二叉搜索树
    public BSTree(BSTNode root) {
        this.root = root;
    }

    //节点定义，通过一个内部类来定义
    class BSTNode {
        //key值和左右孩子节点，和父节点
        int key;
        BSTNode left;
        BSTNode right;

        public BSTNode(int key, BSTNode left, BSTNode right) {
            this.key = key;
            this.left = left;
            this.right = right;
        }
    }

    //前序遍历
    public void preOrder(BSTNode root) {
        if (root != null) {
            System.out.println(root.key);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    //中序遍历
    public void midOrder(BSTNode root) {
        if (root != null) {
            midOrder(root.left);
            System.out.println(root.key);
            midOrder(root.right);
        }
    }

    //后序遍历
    public void postOrder(BSTNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.key);
        }
    }

    //插入一个元素到树中
    public void addLeaf(BSTNode root, BSTNode leaf) {
        if (leaf.key < root.key) {
            if (root.left == null) {
                root.left = leaf;
            } else {
                addLeaf(root.left, leaf);
            }
        } else {
            if (root.right == null) {
                root.right = leaf;
            } else {
                addLeaf(root.right, leaf);
            }
        }
    }

    //查找key值
    public BSTNode search(BSTNode root, int key) {
        if (root == null) return null;
        else {
            if (key == root.key) {
                return root;
            } else if (key < root.key) {
                return search(root.left, key);
            } else {
                return search(root.right, key);
            }
        }
    }

    public static void main(String[] args) {
        int a = 113;
        System.out.println(String.valueOf(a));
    }


}

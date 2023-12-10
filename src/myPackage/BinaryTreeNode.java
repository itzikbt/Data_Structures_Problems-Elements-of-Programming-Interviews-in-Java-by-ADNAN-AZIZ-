package myPackage;

public class BinaryTreeNode<T> {
    private T data;
    private BinaryTreeNode<T> right, left, parent;
    private int depth;
    private int size;

    public BinaryTreeNode(){
        this.data = null;
        this.right = null;
        this.left = null;
        this.parent = null;
        this.depth = 0;
        this.size = 1;
    }

    public BinaryTreeNode(T data){
        this.data = data;
        this.right = null;
        this.left = null;
        this.parent = null;
        this.depth = 0;
        this.size = 1;
    }

    public void addRight(BinaryTreeNode<T> node){
        int newNodeSize = this.right != null ? node.size - this.right.size : node.size;
        BinaryTreeNode<T> ancestor = this;
        while (ancestor != null){
            ancestor.size = ancestor.size + newNodeSize;
            ancestor = ancestor.parent;
        }

        this.right = node;
        node.parent = this;
        node.depth = this.depth +1;
    }

    public void addLeft(BinaryTreeNode<T> node){
        int newNodeSize = this.left != null ? node.size - this.left.size : node.size;
        BinaryTreeNode<T> ancestor = this;
        while (ancestor != null){
            ancestor.size = ancestor.size + newNodeSize;
            ancestor = ancestor.parent;
        }

        this.left = node;
        node.parent = this;
        node.depth = this.depth +1;
    }

    public T getData(){return data;}
    public void updateData(T newData){this.data = newData;}
    public BinaryTreeNode<T> getRight(){return this.right;}
    public BinaryTreeNode<T> getLeft(){return this.left;}
    public BinaryTreeNode<T> getParent(){return this.parent;}
    public int getDepth(){ return this.depth;}

    public int getSize(){return this.size;}


}

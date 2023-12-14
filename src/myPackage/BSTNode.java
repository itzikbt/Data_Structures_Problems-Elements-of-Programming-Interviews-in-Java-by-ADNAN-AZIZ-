package myPackage;
import java.util.*;

public class BSTNode extends BinaryTreeNode<Integer> {

    public BSTNode(int data){
        this.updateData(data);
        this.addRight(null);
        this.addLeft(null);
    }


    public void add(BSTNode node){
        if (node != null) {
            if (Integer.compare(this.getData(), node.getData()) > 0) {
                this.addLeft(node);
            }
            else
                this.addRight(node);
        }
    }

}

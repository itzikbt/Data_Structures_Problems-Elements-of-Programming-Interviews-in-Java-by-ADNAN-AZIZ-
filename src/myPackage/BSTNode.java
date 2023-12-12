package myPackage;
import java.util.*;

public class BSTNode extends BinaryTreeNode<Integer> {


    public void add(BSTNode node){
        if (Integer.compare(this.getData(), node.getData()) > 0)
            this.addLeft(node);
        else
            this.addRight(node);
    }

}

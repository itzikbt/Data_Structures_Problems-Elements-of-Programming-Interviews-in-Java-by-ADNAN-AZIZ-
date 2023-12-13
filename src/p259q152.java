import myPackage.BSTNode;
import java.util.*;

public class p259q152 {
    public static void main(String[] args) {

    }

    public static BSTNode firstGreaterThenKey(BSTNode tree, int key){
        BSTNode subTree = tree, firstGreater = null;

        while(subTree != null){
            if (subTree.getData() > key) {
                firstGreater = subTree;
                subTree = (BSTNode) subTree.getLeft();
            }
            else {
                subTree = (BSTNode) subTree.getRight();
            }
        }
        return firstGreater;
    }


}

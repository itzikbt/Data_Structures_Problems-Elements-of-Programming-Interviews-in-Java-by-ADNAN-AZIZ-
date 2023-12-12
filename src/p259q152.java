import myPackage.BSTNode;
import java.util.*;

public class p259q152 {
    public static void main(String[] args) {

    }


    private static enum Direction {LEFT, RIGHT};
    public static BSTNode firstGreaterThenKey(BSTNode tree, int key){
        BSTNode firstGreater = null;

        while(tree.getData() > key){
            tree = (BSTNode) tree.getRight();
        }

        Enum<Direction> direction = tree.getData() <= key ? Direction.RIGHT : Direction.LEFT;


        return firstGreater;
    }


}

import myPackage.BSTNode;
import java.util.*;
public class p260q153 {
    public static void main(String[] args) {

    }

    public static List<Integer> kLargestElementsDecreasing(BSTNode tree, int k){
        List<Integer> integerList = new ArrayList<>();
        findKLargestElementsHelper(tree,integerList , k);
        return integerList;

    }

    public static void findKLargestElementsHelper(BSTNode subtree, List<Integer> integerList, int k){

        if (subtree != null && integerList.size() < k) {
            findKLargestElementsHelper((BSTNode) subtree.getRight(), integerList, k);

            if (integerList.size() < k) {
                integerList.add(subtree.getData());

                findKLargestElementsHelper((BSTNode) subtree.getLeft(), integerList, k);
            }
        }
    }


}

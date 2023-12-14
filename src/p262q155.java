import myPackage.BSTNode;
import myPackage.BinaryTreeNode;

import java.util.*;

public class p262q155 {
    public static void main(String[] args) {
        List<Integer> preorder = Arrays.asList(8,2,6,5,1,3,4,7,9);

        BSTNode tree = reconstructBSTFromPreorderSequence(preorder);

        p165q1012.preorderWithoutRecursionPrint(tree);
    }

    public static BSTNode reconstructBSTFromPreorderSequence(List<Integer> sequence){
        if (sequence.isEmpty()){
            return null;
        }

        BSTNode curNode = new BSTNode(sequence.get(0));

        int count = 1;
        while (count < sequence.size() && sequence.get(count) < curNode.getData())
            count++;

        curNode.addLeft(reconstructBSTFromPreorderSequence(sequence.subList(1,count)));
        curNode.addRight(reconstructBSTFromPreorderSequence(sequence.subList(count,sequence.size())));

        return curNode;
    }


}

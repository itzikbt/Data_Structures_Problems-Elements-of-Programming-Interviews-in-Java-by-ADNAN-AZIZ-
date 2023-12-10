import myPackage.BinaryTreeNode;

public class p159q106 {
    public static void main(String[] args) {


    }

    public static <Integer> boolean RootToLeafWeightWithSpecifiedSum(BinaryTreeNode<Integer> root, int sum){
        return hasPathHelper(root, 0 , sum);
    }

    public static <Integer> boolean hasPathHelper(BinaryTreeNode<Integer> node, int partialSum, int sum){
        if (node == null)
            return false;

        partialSum += java.lang.Integer.parseInt(node.getData().toString());
        if (node.getLeft() == null && node.getRight() == null)
            return partialSum == sum;

        return hasPathHelper(node.getLeft(), partialSum, sum) || hasPathHelper(node.getRight(), partialSum, sum);
    }
}

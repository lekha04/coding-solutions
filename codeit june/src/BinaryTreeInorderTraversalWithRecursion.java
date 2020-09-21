import java.util.*;

public class BinaryTreeInorderTraversalWithRecursion {

    public static void inorderTraversalHelper(TreeNode root, List<Integer> list){
        if(root==null){
            return;
        }
        inorderTraversalHelper(root.left, list);
        list.add(root.val);
        inorderTraversalHelper(root.right, list);
        return;
    }

    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> list = new ArrayList<>();
        inorderTraversalHelper(root, list);
        return list;
    }
}

import java.util.*;

//Leetcode 94
public class BinaryTreeInorderWithoutRecursion {

    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> out = new ArrayList<>();

        while(root!=null || !stack.isEmpty()){
            while(root != null){
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            out.add(root.val);
            root = root.right;
        }
        return out;
    }
}

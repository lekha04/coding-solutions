import java.util.*;
public class BinaryTreeRightSideView {

    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> out = new ArrayList<>();

        if(root==null){
            return out;
        }

        Queue<TreeNode> q = new ArrayDeque<>();

        q.add(root);

        while(q.size()>0){
            int size = q.size();
            List<Integer> current = new ArrayList<>();
            while(size>0){
                TreeNode node = q.poll();
                current.add(node.val);
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }

                size--;
            }
            out.add(current.get(current.size()-1));
        }

        return out;
    }

}

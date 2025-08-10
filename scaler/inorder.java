
import java.util.ArrayList;

import javax.swing.tree.TreeNode;

public /**
 * Definition for binary tree class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode(int x) { val = x; left=null; right=null; } }
 */
public class Solution {

    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (A == null) {
            return ans;
        }
        ans.addAll(inorderTraversal(A.left));
        ans.add(A.val);
        ans.addAll(inorderTraversal(A.right));
        return ans;
    }
}
{
    
}

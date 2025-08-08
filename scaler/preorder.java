
import java.util.ArrayList;

import javax.swing.tree.TreeNode;

public /**
 * Definition for binary tree class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode(int x) { val = x; left=null; right=null; } }
 */
public class Solution {

    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (A == null) {
            return ans;
        }
        ans.add(A.val);
        ans.addAll(preorderTraversal(A.left));

        ans.addAll(preorderTraversal(A.right));
        return ans;
    }
}
{
    
}

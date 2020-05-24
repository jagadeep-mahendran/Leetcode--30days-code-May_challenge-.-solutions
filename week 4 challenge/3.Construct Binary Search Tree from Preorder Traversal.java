/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
         Stack<TreeNode> st=new Stack<>();
        TreeNode root=new TreeNode(preorder[0]);
        st.push(root);
        for(int i=1;i<preorder.length;i++)
        {
            TreeNode tp=null;
             while(!st.isEmpty()&&preorder[i]>st.peek().val){
                 tp= st.pop();
             }
          if(tp!=null)
            {
                tp.right= new  TreeNode(preorder[i]);
                st.push(tp.right);
            }
              else
              {
                  tp=st.peek();
                  tp.left=new  TreeNode(preorder[i]);
                  st.push(tp.left);
              }
           
        }
        return root;
    }
}

/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    int diameterOfBinaryTree(TreeNode* root) {
        int h=0;
        return diameter(root,h);
    }
    int diameter(TreeNode *root,int &h)
    {
        if(!root)
        {
            h=0;  // height
            return 0; // daimeter
        }
        int h1=0,h2=0;
        int d1=diameter(root->left,h1);
        int d2=diameter(root->right,h2);

        h = max(h1,h2)+1; // number of nodes on path
        return max({d1,d2,h1+h2});
    }
};
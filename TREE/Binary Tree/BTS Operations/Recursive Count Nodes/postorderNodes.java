/** Recursive method that computes the number of nodes in tree using a postorder traversal**/
public static int nNode( TreeNode node){
  if(node ==null) //base case
    return 0; 
  return nNodes(node.getLeft()) + nNodes(node.getRight()) + 1; //left subtree + right sub + root (1)
}
/**private helper method that prints the contents of a BST in alphabetical order**/
public static void showIt(){
  if(node == null ) 
    return; //base case
  show(node.getLeft());
  show(node.value + " ");
  show(node.getRight());
}

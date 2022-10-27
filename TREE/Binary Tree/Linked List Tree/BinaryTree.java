//abstract superclass 
//NOT generic 
public abstract class BinaryTree{
  //instance variable
  private TreeNode root;
  
  //constructor 
  public BinaryTree(){
    root = null;
  }
  
  //methods 
  public TreeNode getRoot(){
    return root;
  }
  
  public void setRoot(TreeNode newNode){
    root = newNode;
  }
  
  public boolean isEmpty(){
    return root==null;
  }
 
  public abstract void insert(Comparable item);
  public abstract TreeNode find(Comparable key);
}
    
    
  

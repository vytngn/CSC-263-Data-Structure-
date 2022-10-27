/**TreeNode class*/
public class TreeNode{
  private Object value;
  private TreeNode left, right;
  
  //constructor 
  public TreeNode(Object initValue){
    value = initValue;
    left = null;
    right = null;
  }
  public TreeNode(Object initValue, TreeNode initLeft, TreeNode initRight){
    value = initValue;
    left = initLeft;
    right = initRight;
  }
  
  //methods
  public Object getValue(){
    return value;
  }
  public TreeNode getLeft(){
    return left;
  }
  public TreeNode getRight(){
    return right;
  }
  public void setValue(Object newValue){
    value = newValue;
  }
  public void setLeft(TreeNode newLeft){
    left = newLeft;
  }
  public void setRight(TreeNode newRight){
    right = newRight;
  }
}

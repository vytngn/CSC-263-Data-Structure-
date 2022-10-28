//subclass of BinaryTree class 
//Algorithm: Use 2 TreeNode pointers, p and q, following each other to find the insertion point 
// q = front pointer, continues until it is null, at which point p points to the node at which the new data will be inserted
// comparison will tell whether the new node goes left or right 
public class BinarySearchTree extends BinaryTree{
  /**No constructor **/
  
  /**Methods **/
  
  //INSERT item in BST ---------------------------------------------------------------------------------------------------
  public void insert(Comparable item){
    if(getRoot() ==null)
      setRoot(new TreeNode(item));
    else{
      TreeNode p = null;
      q = getRoot();
      
      //this while loop determine what side to go to 
      while(q !=null){
         p = q;
        if(items.compareTo(p.getValue()) < 0)
          q = p.getLeft();
        else
          q = p.getRight();
      }
      
      //add the new node 
      if(item.compareTo(p.getValue())>0)
        p.setLeft(new TreeNode(item));
      else
        p.setRight(new TreeNode(item));
      }
  }
  
  //NON-RECURSIVE method call the recursive version of INSERT method ---------------------------------------------------------------------------------------------------
  public void insert(Comparable item){
    setRoot(recurInsert(getRoot(),item));
  }
  
  //private HELPER method 
  //find insertion point for new node and attaches it 
  // returns reference to TreeNode along insertion path 
  private TreeNode recurInsert(TreeNode t, Comparable item){
    //base case
    if (t==null) 
      return new TreeNode(item);
    //recursive cases
    else if(item.compareTo(t.getValue()) < 0)
      t.setLeft(recurInsert(t.getLeft(),item));
    else
      t.setRight(RecurInsert(t.getRight(),item));
    return t; //return  reference to TreeNode object 
  }
  
  //FIND a target element in a BTS ---------------------------------------------------------------------------------------------------
  //returns TreeNode with key
  //if key NOT in tree, returns null
  public TreeNode find(Comparable key){
    TreeNode p = getRoot();
    while(p! null && key.compareTo(p.getValue())) !=0){ //start compare root to key 
      if (key.compareTo(p.getValue()) < 0)   //key < p -> go left child  ; key > p -> go right child  -> compare p and key
        p = p.getLeft();
      else 
        p=p.getRight();
    }
    return p;
  }
      
   
  
  
}
  

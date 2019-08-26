// Binary Tree
// 26 March 2017
// Yaseen Hull

public class BinaryTreeNode<dataType>
{
   dataType data;
   dataType data2;
   BinaryTreeNode<dataType> left;
   BinaryTreeNode<dataType> right;
   int height;
   
   public BinaryTreeNode ( dataType d, dataType d2,  BinaryTreeNode<dataType> l, BinaryTreeNode<dataType> r )
   {
      data = d;
      data2 = d2;
      left = l;
      right = r;
      height = 0;
   }
   
   BinaryTreeNode<dataType> getLeft () { return left; }
   BinaryTreeNode<dataType> getRight () { return right; }
   public dataType getString() { return data2; }
}

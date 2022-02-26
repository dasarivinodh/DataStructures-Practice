public class BinarySearchTree {
    class Node{
        Node left,right;
        int data;
        Node (int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
        
       
    }
    Node root;
    
     Node addtoTree(Node nd,int data){
            
            if(nd==null){
               nd =new Node(data);
               return nd;
            }
            else if(data>nd.data){
                //go right side
                nd.right=addtoTree(nd.right,data);
                
            }
            else{
                //go left side
                 nd.left=addtoTree(nd.left,data);
            }
            
            return nd;
        }
        
     void insert(int data){
         if(root==null) root =new Node(data);
         else addtoTree(root,data);
     }
     
     void printTree(){
         printAllInorder(root);
     }
     
     void printAllInorder(Node root){
         
         if(root!=null){
             printAllInorder(root.left);
             System.out.print(root.data+"->");
             printAllInorder(root.right);

         }
     }
     
     public static void main(String []args){
         BinarySearchTree b=new BinarySearchTree();
         b.insert(5);
         b.insert(6);
         b.insert(4);
         b.printTree();
         
     }
    
}

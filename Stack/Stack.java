public class Stack{
    
    Node top;
    
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    
    void push(int data){
       
       if(top==null){
           top= new Node(data);
       }
       else{
        Node n=new Node(data);
        n.next=top;
        top=n;
       }
        
    }
    
    void peek(){
       
       if(top==null){
           System.out.println("No elements");
       }
       else{
         System.out.println("Top Of Stack : "+top.data);
       }
        
    }
    
    void pop(){
        if(top==null){
          System.out.println("No elements");
        }
        else{
            Node n= top;
            top=top.next;
            System.out.println("Removed element from stack : "+n.data);
        }
    }
    
    public static void main(String []args){
        Stack s=new Stack();
        s.push(1);
        s.push(16);
        s.push(5);
        s.peek();
        s.pop();
        s.peek();
    }
}

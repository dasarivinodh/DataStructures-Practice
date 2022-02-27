public class Queue{
    
    Node head;
    Node tail;
    
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    
    void add(int data){
       
       if(head==null){
           head= new Node(data);
           tail=head;
       }
       else{
        Node n=new Node(data);
        tail.next=n;
       }
        
    }
    
    void peek(){
       
       if(head==null){
           System.out.println("No elements");
       }
       else{
         System.out.println("Next Element in Queue : "+head.data);
       }
        
    }
    
    void remove(){
        if(head==null){
          System.out.println("No elements");
        }
        else{
            Node n= head;
            head=head.next;
            System.out.println("Removed element from Queue : "+n.data);
        }
    }
    
    public static void main(String []args){
        Queue q=new Queue();
        q.add(1);
        q.add(16);
        q.add(5);
        q.peek();
        q.remove();
        q.peek();
        
    }
}

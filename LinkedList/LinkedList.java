public class LinkedList {
    Node head;
    static class Node {
        Node next;
        int data;
        Node (int data){
            this.data=data;
            this.next=null;
        }
    }
    
    void printAll(){
        
        Node current=head;
        while(current!=null)
        {
            System.out.println(current.data);
            current=current.next;
        }
    }
    
    public static LinkedList add(LinkedList l,int data){
       
       Node new_node = new Node(data);
        if(l.head==null)
        {
            l.head=new_node;
        }
        else{
            
        Node current=l.head;
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=new_node;
        }
        return l;
    }
    
    public static void main(String []args){
        System.out.println("Linked List");
        LinkedList l=new LinkedList();
        add(l,1);
        add(l,2);
        add(l,3);
        l.printAll();
        

    }
}

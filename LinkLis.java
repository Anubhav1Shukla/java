class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

//length
class LinkList{
    
    Node head;
    //method
    public int getLength(){
        int cnt=0;
        Node curr=head;
        while(curr!=null){
            cnt++;
            curr=curr.next;
        }
    return cnt;
}
//method insert
    public void insert(int data){
        Node newNode=new Node(data);
        
        if(head==null){
            head=newNode;
            return;
        }
        
        
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        
        
        
        curr.next=newNode;
    }



}




public class LinkLis{
    public static void main(String[] args){
        LinkList list=new LinkList();
        
        list.insert(10);
        list.insert(20);
        list.insert(30);
        
        System.out.println("Length : "+list.getLength());
    }
}
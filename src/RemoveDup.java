public class RemoveDup{
    public ListNode head;

    public static class ListNode{
        public int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;

        }
    }

    public void push(int last){
        ListNode newNode=new ListNode(last);        //made an object
        if(head==null){                             //checking if the list is empty or not
            head=newNode;                           //assigning newNode value if it is empty
            return;
        }
        ListNode current=head;                      //if not empty creating a current with head for checking the last position of list
        while(current.next!=null){
            current=current.next;                   //if next of node != null means it is not the last node and then moving current further
        }
        current.next=newNode;                       //if last node found then simply assign the node's next(pointed by current), the value of newNode
    }
    public void print(){
        ListNode current=head;
        while(current!=null){
            System.out.println(current.data+"-->");
            current=current.next;
        }
        System.out.print("null");
    }



    //here we remove duplicate elements from sorted linked list
    public void dupRem(){
        ListNode current=head;

        while (current!= null && current.next != null){
            if(current.data== current.next.data){
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }
        }


    }

    public static void main(String[] args) {
        RemoveDup dup=new RemoveDup();
        dup.push(32);
        dup.push(33);
        dup.push(34);
        dup.push(33);
        dup.print();
        System.out.println("\n");

//
//        dup.dupRem();
//        dup.print();
    }
}

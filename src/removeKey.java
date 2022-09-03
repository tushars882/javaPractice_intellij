public class removeKey {
    public ListNode head;

    public static class ListNode{
        public int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;

        }
    }
    public void push(int last) {
        ListNode newNode = new ListNode(last);        //made an object
        if (head == null) {                             //checking if the list is empty or not
            head = newNode;                           //assigning newNode value if it is empty
            return;
        }
        ListNode current = head;                      //if not empty creating a current with head for checking the last position of list
        while (current.next != null) {
            current = current.next;                   //if next of node != null means it is not the last node and then moving current further
        }
        current.next = newNode;
    }


    public void display(){
        ListNode current=head;
        while(current != null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.print("null");
    }
    public void rmkey(int key){
        ListNode current=head;
        ListNode prev=head;



    }

    public static void main(String[] args) {
        removeKey rk=new removeKey();
        rk.head=new ListNode(3);
        ListNode second=new ListNode(5);
        ListNode third=new ListNode(5);
        ListNode fourth=new ListNode(5);
        ListNode fifth=new ListNode(5);

        rk.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=second;




    }
}

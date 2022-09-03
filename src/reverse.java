public class reverse{
    ListNode head;
    public static class ListNode{
        int data;
        ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void display(){
        ListNode current= head;
        while(current != null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.print("null");
    }

    public void rev(){
    ListNode current=head;
    ListNode prev=null;
    ListNode next=null;
    while(current != null){
        next=current.next;
        current.next=prev;
        prev=current;
        current=next;
    }
    head=prev;

    while(prev!=null){
//        System.out.print(prev.data+"-->");
        prev=prev.next;
    }
//        System.out.print("null \n");


    }

    public static void main(String[] args) {
        reverse sll=new reverse();
        sll.head=new ListNode(10);
        ListNode second=new ListNode(12);
        ListNode third=new ListNode(32);
        ListNode fourth=new ListNode(71);

        sll.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=null;
//        sll.display();

        sll.rev();

        sll.display();




    }
}



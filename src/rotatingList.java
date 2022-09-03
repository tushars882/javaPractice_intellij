public class rotatingList {
    public ListNode head;
    public  static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.next=null;
            this.data=data;
        }
    }

    public void display(){
        ListNode current = head;
        while(current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
    }

    public void rotate(int k) {
        while(k-- > 0){

            ListNode current = head;
            ListNode next = head.next;
            ListNode connector=head;
            while(next.next != null) {
                current= current.next;
                next = next.next;
            }
            if(next.next == null) {
                current.next = null;
                head = next;
                next.next = connector;
            }
        }
    }

    public static void main(String args[]){
        rotatingList rll = new rotatingList();
        rll.head = new ListNode(2);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(5);

        rll.head.next=second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;

        rll.display();
        rll.rotate(2);
        System.out.println();
        rll.display();




    }
}

import java.lang.Math;
import java.util.List;

public class MiddleNode {
     public ListNode head;
    public  static class ListNode{
        int data;
        ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void push(int value){
        ListNode newNode=new ListNode(value);
        if(head == null){
            head=newNode;
            return;
        }
        ListNode current=head;
        while (current.next != null){

                current=current.next;
        }
        current.next=newNode;
    }

    public void display(){
        ListNode current=head;
        while (current!= null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.print("null");
    }

    public void Middle(){
        ListNode current= head;
        int count=1;
        while(current != null){
            current=current.next;
            count++;
        }
        count=(count + 1) / 2;
        int point=1;
        ListNode prev=head;
        while(point != count){
            prev=prev.next;
            point++;
        }
        System.out.println(prev.data);
    }

    public void findAny(int pos){

        int count=1;
        ListNode prev=head;

        while(count != pos){
            prev=prev.next;
            count++;
        }
        System.out.print(prev.data);
    }

    public static void main(String[] args) {
        MiddleNode sll=new MiddleNode();
        sll.push(12);
        sll.push(25);
        sll.push(95);
        sll.push(44);
        sll.push(55);

//        sll.Middle();

//        sll.display();
        sll.findAny(1);


    }
}

/*
*
*                c
* a->b->c->d->e->f
*
* 5
* */
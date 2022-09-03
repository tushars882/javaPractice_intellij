public class recursionExample {
    public static void main(String args[]) {
        print(1);
    }
    static void  print(int n) {

        //Base condition where to stop recursion
        if(n == 5) {
            System.out.println(5);
            return;
        }

        //calling the function ,i.e., recursion
        System.out.println(n);
        print(n + 1);   //this will go back to line5 and call itself again and again
    }
}

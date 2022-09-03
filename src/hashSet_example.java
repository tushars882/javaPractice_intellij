import java.util.HashSet;

public class hashSet_example {

    static int countDistinct(int arr[] ) {
//        arr = new int[]{2, 4, 4, 5, 2, 7, 5, 1};
        HashSet<Integer> set = new HashSet<>();     //name of the set is set
        for (int element : arr) {
            set.add(element);
        }
        return set.size();
    }

    static int intersection(int a[] , int b[]) {
        HashSet <Integer> set  = new HashSet<>();
        int count = 0;
        int n = a.length;
        int c[] = new int[n];
        for(int x : a) {
            set.add(x);
        }
        for(int x : b) {
            if(set.contains(x)) {
                count++;
            }

        }return count;
    }

    public static void main(String args[]) {
        int arr[] = {2,2,1,4,2,5,6,4,2,1};
        int call = countDistinct(new int[]{2,3,5});
        System.out.println(call);


        int inter = intersection(new int[]{1,2,3,4,5,6,7} , new int[]{1,2,3,4} );
        System.out.println(inter);
    }



}

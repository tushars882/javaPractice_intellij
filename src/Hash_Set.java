import java.util.HashSet;

public class Hash_Set {
    public static void main(String args[]) {
        HashSet<Integer> s = new HashSet<>();
        s.add(25);
        s.add(43);
        s.add(77);
        s.add(56);
        s.add(22);
        s.add(33);
        s.add(33);
        s.add(33);
        s.add(65);

        System.out.println(s);

        if (s.contains(22)) {
            System.out.println("yes");
        }

        s.remove(33);
        System.out.println(s);



    }
}

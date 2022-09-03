public class revrseString {
    public static void main(String[] args) {
        String str1 = "Tushar sharma";
        String str2 = "";
        String str3 = "";
        char ch ;

        for(int i = 0 ; i < str1.length() ; i++) {
            ch = str1.charAt(i);
            str2 = ch + str2;
        }
        System.out.println(str2);
//        System.out.println(str1.split());
        char[] array = str1.toCharArray();
        System.out.println(array);
    }
}

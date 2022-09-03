public class lc_1518_waterBottles {
    static int numberOfBottles(int bottles , int exchange) {
        int rem = 0;
        int bot = bottles;

        if(bottles%exchange == 0 && bottles >= exchange) {
            while(bottles % exchange == 0 && bottles >= exchange) {
                bottles = bottles / exchange;
                bot = bottles + bot;
            }
        }
        if(bottles%exchange != 0 && bottles >= exchange){
            while(bottles >= exchange) {
               rem = bottles%exchange;
               bottles = bottles/exchange;
               bot = bottles + bot;
               bottles = rem + bottles;

            }
        }
        return bot;
    }
    public static void main(String args[]) {
        System.out.println(numberOfBottles(5,5));
    }
}

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverseInt(123));//3
        System.out.println(reverseInt(-123));
        System.out.println(reverseInt(120));//12*10+3=123 ; 12=1*10+2
        System.out.println(reverseInt(Integer.MAX_VALUE));
        System.out.println(reverseInt(Integer.MIN_VALUE));
    }

    private static int reverseInt(int x) {
        int mul = 1;
        if (x < 0) {
            x=-x;
            mul = -1;
        }
        int prev_reverse=0, reverse=0 ;
        while (x != 0) {
            int y = x % 10;
            reverse = reverse*10+y;
            if((reverse - y)/10 != prev_reverse)
                return 0;

            x = x / 10;


            prev_reverse = reverse;
        }
        return reverse*mul;
    }
}

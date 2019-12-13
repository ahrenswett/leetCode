package leetCode;

public class ReverseInt {
//    takes in the number you want to reverse
    public int reverse(int x) {
//        make a new int to hold the reverse of the input
        int rev = 0;
        while(x != 0){
//            see readme to understand blow stack precaution logic.
                if( rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && x%10 > 7))return 0;
                if( rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && x%10 < -7))return 0;
                rev = (rev*10) + (x%10);
                x = x/10;

//         example: while input > 0
//              input = 546;  rev = 0
//              rev = (rev*10=0) + (input%10=6); rev=6
//              input = 546/10; 54

//              input = 54;  rev = 6
//              rev = (rev*10=60) + (input%10=4); rev= 64
//              input = input/10; input = 5

//              input = 5 ; rev = 64
//            the problem is that if rev
        }
        return rev;
    }
}

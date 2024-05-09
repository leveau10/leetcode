//https://leetcode.com/problems/reverse-integer/
class Solution{ 
    public static int reverse(int x) {
        int m = x;
        int last = 0;
        long reversed = 0;
        boolean isPositive = true;
        if (x < 0) {
            m = m*-1;
            isPositive = false;
        }
        while (m > 0) {
            last = m%10;
            reversed = (reversed *10) + last;
            m = m/10;
        }
        if (reversed < -2147483648 || reversed > 2147483647) {
            return 0;
        }
        if (isPositive) {
            return (int) reversed;
            
        }else{
            return (int) (reversed * -1);
        }
    }
}

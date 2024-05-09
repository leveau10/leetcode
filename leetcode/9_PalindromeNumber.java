class Solution {    
    public static boolean isPalindrome(int x) {
       int m = x;
       int last, reversed = 0;
       while (m > 0) {
            last = m%10;
            reversed = (reversed *10) + last;
            m = m/10;
       }
        if (reversed == x) {
            return true;
       }
       return false;
    }

    public static boolean isPalindromeBad(int x) {
        int y = x;
        int right = 0;
        int left = 0;
        int mult = 10;
        int algarismCount = 0;
        if (x<0) {
            return false;
        }
        while (x != 0) {
            x = x/10;
            algarismCount++;
        
        }
        if (algarismCount == 0 || algarismCount == 1) {
            return true;
        }
        if (algarismCount %2 == 1) {
           mult = 100;
        }
        while (algarismCount != 0 || algarismCount != 1) {
            right = y%10;
            if (algarismCount == 2 || algarismCount == 3) {
                if (right == y/mult) {
                    return true;
                }else{
                    return false;
                }
            }else{
                left = (int) (y/(Math.pow(10,algarismCount-2+1)));
            }
            if (right != left) {
                return false;
            }else{
                y = (int) (y - (left*(Math.pow(10,algarismCount-1))));
                y = y/10;
                
            }
            algarismCount -= 2;
        }
        return true;
    }


}
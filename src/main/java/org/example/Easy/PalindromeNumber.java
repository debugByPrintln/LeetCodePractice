package org.example.Easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        else if (x <= 9) {
            return true;
        }

        else{
            long divisor = 10;
            int curNum = x;
            int curRes = 0;
            int digitPlace = 1;

            while (x/divisor >= 1){
                digitPlace++;
                divisor = divisor * 10;
            }

            divisor = divisor / 10;

            while (digitPlace > 0){
                int tmp = curNum % 10;
                curRes += (int) (tmp * Math.pow(10, digitPlace-1));
                curNum = curNum / 10;

                digitPlace--;
            }

            return (curRes == x);
        }
    }
}

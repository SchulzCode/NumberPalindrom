public class Palindrom {

    public boolean isPalindrome(int x) {

        int num = x;
        int reversedNum = 0;
        int remainder = 0;
        int originalNum = num;

        if(x < 0){
            return false;
        }

        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }
        if(reversedNum == originalNum){
            return true;
        }
        return false;
    }
}


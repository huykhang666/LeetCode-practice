class Solution {
    public boolean isPalindrome(int x) {
        if( x < 0 || x % 10 == 0 && x !=0) {
            return false;
        }

        int rehaft = 0;
        while( x > rehaft) {
            rehaft = rehaft * 10 + x % 10;
            x/=10;
        }

        return x == rehaft || x == rehaft/10;
    }
}

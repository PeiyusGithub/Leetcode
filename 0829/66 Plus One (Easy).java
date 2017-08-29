class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length -1; i >= 0; i--) {
            if (carry == 1) {
                int temp = digits[i];
                digits[i] = (digits[i] + carry) % 10;
                carry = (temp + carry) / 10;
            }
        }
        
        if (carry == 1) {
            int[] ans = new int[digits.length+1];
            ans[0] = 1;
            return ans;
        } else {
            return digits;
        }
    }
}
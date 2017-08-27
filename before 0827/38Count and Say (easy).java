class Solution {
    public String countAndSay(int n) {
        StringBuilder result = new StringBuilder("1");
        while (--n != 0) {
            StringBuilder temp =  new StringBuilder();
            int count = 1;
            int length = result.length();
            for (int i = 0; i < length; i++) {
                if (i + 1 < length && result.charAt(i) == result.charAt(i+1)) {
                    count++;
                } else {
                    temp = temp.append(count).append(result.charAt(i));
                    count = 1;
                }
            }        
            result = temp;            
        }
        return result.toString();
    }
}

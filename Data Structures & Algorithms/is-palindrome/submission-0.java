class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {return true;}
        String input = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int start = 0;
        int end = input.length() - 1;

        while (start < end) { 
            if(input.charAt(start) == input.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
            
        }
        return true;
    }
}

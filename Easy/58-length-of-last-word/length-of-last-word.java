class Solution {
    public int lengthOfLastWord(String s) {
        return s.trim().split("\\s+")[s.trim().split("\\s+").length - 1].length();
    }
}
class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int c = len - 1;

        if (digits[len - 1] != 9) {
            digits[len - 1]++;
        } else {
            while (c != 0) {
                digits[c] = 0;
                c--;

                if (digits[c] != 9) {
                    digits[c]++;
                    return digits;
                }
            }

            if (c == 0) {
                int[] arr = new int[len + 1];
                arr[0] = 1;
                return arr;
            }
        }

        return digits;
    }
}
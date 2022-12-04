public class SplitBalancedString {
    public int balancedStringSplit(String s) {
        int count = 0;
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                count++;
            }
            if (s.charAt(i) == 'R') {
                count--;
            }
            if (count == 0) {
                res++;
            }
        }
        return res;
    }
}

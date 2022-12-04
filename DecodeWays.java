public class DecodeWays {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int n = s.length();
        int[] result = new int[n + 1];
        result[0] = 1;
        result[1] = s.charAt(0) != '0' ? 1 : 0;
        for (int i = 2; i <= n; i++) {
            int first = Integer.valueOf(s.substring(i - 1, i));
            int second = Integer.valueOf(s.substring(i - 2, i));
            if (first >= 1 && first <= 9) {
                result[i] += result[i-1];
            }
            if (second >= 10 && second <= 26) {
                result[i] += result[i-2];
            }
        }
        return result[n];
    }
}

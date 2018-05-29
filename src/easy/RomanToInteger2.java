package easy;

public class RomanToInteger2 {
    int index = 0;
    int sum = 0;
    static final int[] NUMS = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000,};
    static final String[] STRS = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

    public int romanToInt(String s) {
        int length = s.length();
        int lengthStr = s.length() - 1;
        int last=STRS.length-1;
        while (index < length) {
            String s1 = s.substring(index, index + 1);
            String s2 = s1;
            if (index < lengthStr)
                s2 += s.charAt(index + 1);

            for (int i = last; i >= 0; i--) {
                if (s1.equals(STRS[i])) {
                    sum += NUMS[i];
                    index++;
                    last=i;
                    break;
                } else if (s2 != null && s2.equals(STRS[i])) {
                    sum += NUMS[i];
                    index += 2;
                    last=i;
                    break;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        RomanToInteger2 rti = new RomanToInteger2();
        System.out.println(rti.romanToInt("MDLXX"));
    }
}

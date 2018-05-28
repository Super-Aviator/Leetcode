package medium;

public class IntegerToRoman {
    static int[] nums = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000,};
    static String[] strs = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

    public static String method(int num, StringBuilder sb) {
        if (num == 0) return sb.toString();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (num - nums[i] >= 0)
                return method(num - nums[i], sb.append(strs[i]));
        }
        return "";
    }

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        return method(num, sb);
    }

    public static void main(String[] args) {
        IntegerToRoman itr = new IntegerToRoman();
        System.out.println(itr.intToRoman(0));
    }
}

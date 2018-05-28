package medium;

public class IntegerToRoman2 {
    static int[] nums = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000,};
    static String[] strs = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int last=nums.length-1;
        Lable:
        while (num > 0) {
            for (int i = last; i >= 0; i--) {
                if (num - nums[i] >= 0) {
                    last=i;
                    num -= nums[i];
                    sb.append(strs[i]);
                    continue Lable;
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        IntegerToRoman2 itr2 = new IntegerToRoman2();
        System.out.println(itr2.intToRoman(1994));
    }
}

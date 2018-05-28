package medium;

public class IntegerToRoman3 {
    static int[] nums = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000,};
    static String[] strs = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        for(int i=nums.length-1;i>=0;i--){
            int count=num/nums[i];
            while(count>0){
                sb.append(strs[i]);
                count--;
            }
            num%=nums[i];
            }
        return sb.toString();
    }

    public static void main(String[] args) {
        IntegerToRoman2 itr2 = new IntegerToRoman2();
        System.out.println(itr2.intToRoman(3));
    }
}

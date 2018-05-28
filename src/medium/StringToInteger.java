package medium;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringToInteger {
    /*public int myAtoi(String str) {
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < chars.length && check(chars, i, sb.length()); i++) {
            if (chars[i] == ' ') continue;
            sb.append(chars[i]);
        }
        String resultStr = sb.toString();
        if (resultStr.equals("") || resultStr.equals("+") || resultStr.equals("-")) return 0;

        int result;
        try {//转换可能会由于太大而抛异常
            result = Integer.parseInt(resultStr);
        } catch (Exception e) {
            return resultStr.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        return result;
    }

    public boolean check(char[] str, int index, int start) {
        char ch = str[index];
        if (Character.isDigit(ch)) return true;//是数字就返回
        if (start == 0 && (ch == '-' || ch == '+' || ch == ' ')) return true;//只有字符串的首字符可以是空格或符号
        return false;
    }
*/
    public int myAtoi(String str) {
        int i = 0, sign = 1, r = 0;
        int n = str.length();
        if (n == 0) return 0;

        while (i < n && str.charAt(i) == ' ')
            i++;


        if (str.charAt(i) == '+' || str.charAt(i) == '-') {
            sign = str.charAt(i) == '+' ? 1 : -1;
            i++;
        }

        while (i < n) {
            int num = str.charAt(i) - '0';
            if (num < 0 || num > 9) break;

            if (r > Integer.MAX_VALUE / 10 || Integer.MAX_VALUE / 10 == r && Integer.MAX_VALUE % 10 < num) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            r = 10 * r + num;
            i++;

        }
        return sign * r;
    }

    public static void main(String[] args) {
        StringToInteger sti = new StringToInteger();
        System.out.println(sti.myAtoi("20000000000000000000"));
    }
}
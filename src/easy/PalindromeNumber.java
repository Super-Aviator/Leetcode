package easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        if(x>=0&&x<=9)  return true;
        int rev=0,t=x;
        while(t>0){
            rev=rev*10+t%10;
            t/=10;
        }
        return rev==x?true:false;
    }

    public static void main(String[] args) {
        PalindromeNumber pn=new PalindromeNumber();
        System.out.println(pn.isPalindrome(-121));
    }
}

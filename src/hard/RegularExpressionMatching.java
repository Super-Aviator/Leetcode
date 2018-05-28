package hard;

public class RegularExpressionMatching {
    public boolean isMatch(String s,String p){
        return true;
    }

    public static void main(String[] args) {
        RegularExpressionMatching pem=new RegularExpressionMatching();
        System.out.println(pem.isMatch("bbbba",".*a*a"));
    }
}
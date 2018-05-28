package easy;

public class Demo {
    public static void f(boolean i){
        System.out.println(i);
    }

    public static int signum(long i) {
        // HD, Section 2-7
        return (int) ((i >> 63) | (-i >>> 63));
    }

    public static void main(String[] args) {
        /*double d = 1024d * 1024 * 1024 * 1024;
        long dw = 1024 * 1024 * 1024 * 1024 ;
        System.out.println(d);
        System.out.println(Long.toHexString(dw));*/

        /*int i=0;
        System.out.println(i>>63| i>>>63);
        System.out.println(signum(i));*/
    }
}

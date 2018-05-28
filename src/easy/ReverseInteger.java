package easy;

import java.util.Arrays;

public class ReverseInteger {
    public static int reverse(int x) {
        char[] nums=String.valueOf(x).toCharArray();
        int start=0,N=nums.length;
        if(Integer.signum(x)==-1)    {start+=1;N+=1;}
        int length=N/2;
        for(;start<length;start++){
            char t=nums[start];
            nums[start]=nums[N-start-1];
            nums[N-start-1]=t;
        }
        long result=Long.valueOf(String.valueOf(nums));
        if(result>Integer.MAX_VALUE||result<Integer.MIN_VALUE)  return 0;
        return (int)result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-12300));
    }
}

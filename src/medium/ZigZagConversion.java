package medium;

import java.util.Arrays;

public class ZigZagConversion {
    public static int[] createArray(int sum,int numRows){//创建状态数组
            int d=(sum-numRows+1)/(numRows-1);
            int[] result=new int[d+1];
            int t=2*numRows-2;
            for(int i=0;i<result.length;i++)
                result[i]=(i%2==0?t:0);
            return result;
        }

        public String convert(String s, int numRows) {
            if(s.equals(""))    return "";
            if(numRows==1||numRows>=s.length()) return s;
            int N=s.length(),first=0,start,temp;
            StringBuilder result=new StringBuilder();
            int[] interval=createArray(s.length(),numRows);//创建状态数组
            while(first<numRows){
                start=first++;
                result.append(s.charAt(start));
                for(int i=0;i<interval.length;i++) {
                    temp = interval[i];
                    interval[i]+=(i%2==0?-2:2);
                    if(start+temp>=N)    break;//!!!
                    if (temp == 0)      continue;
                    start+=temp;
                    result.append(s.charAt(start));
                }
            }
            return result.toString();
    }

    public static void main(String[] args) {
        ZigZagConversion zzc = new ZigZagConversion();
        System.out.println(zzc.convert("PAYPALISHIRING",
                4));
    }
}

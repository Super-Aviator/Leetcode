package medium;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        if (height.length < 2) return 0;
        int max = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            int temp = (right - left) * Math.min(height[left], height[right]);
            if(temp>max) max=temp;
            if (height[left] < height[right]) left++;
            else right--;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,1}));
    }
}

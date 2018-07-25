package medium;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<Integer> num = new ArrayList<>(nums.length);
        for (int i : nums)
            num.add(i);

        List<List<Integer>> result = new ArrayList<>();

        //int twoSum, remain, index;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                int twoSum = nums[i] + nums[j];
                //System.out.print(nums[i] + " " + nums[j]);
                int remain = 0 - twoSum;
                int index = num.lastIndexOf(remain);
                //System.out.println(" " + remain + " " + index + " " + num.contains(remain));
                if (index != -1 && index > j) {
                    List<Integer> resultNums = new LinkedList<>();
                    resultNums.add(nums[i]);
                    resultNums.add(nums[j]);
                    resultNums.add(nums[index]);
                    result.add(resultNums);
                }
            }
        }
        return result;
    }

    public List<List<Integer>> threeSum2(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        if (nums.length == 0) return new ArrayList<>(res);
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) res.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                else if (sum > 0) k--;
                else if (sum < 0) j++;
            }

        }
        System.out.println(res);
        return new ArrayList<>(res);

    }

    public static void main(String[] args) {
        ThreeSum ts = new ThreeSum();
        System.out.println(ts.threeSum2(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}

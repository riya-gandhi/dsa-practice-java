package leetcode;

// Arrays.sort(nums);
// return nums[0];

public class binary_search_in_rotated_arr {

    public static void main(String[] args) {
        int[] arr = { 11, 13, 15, 17 };
        int ans = findMin(arr);
        System.out.println(ans);
    }

    public static int findMin(int[] num) {

        int low = 0;
        int high = num.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (num[high] < num[mid]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return num[high];
    }

}

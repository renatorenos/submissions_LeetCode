public class EASY_SearchInsertPosition {
    public static void main(String[] args){
        int[] nums = {1, 3, 5, 6};
        int target = 5;

        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int current = (start + end) / 2;

            if (nums[current] == target) {
                return current;
            }

            if (nums[current] > target) {
                end = current - 1;
            } else {
                start = current + 1;
            }
        }
        return start;
    }
}

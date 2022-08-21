public class MaximumSumSubArray {
    public static void main(String[] args) {
//        Maximum sum subarray of size K, sliding window
//
//        Ex: Input: [2, 1, 5, 1, 3, 2], k=3
//        Output: 9

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k= 3;
        System.out.println(findMaximumSum(arr,k));

    }

    public static int findMaximumSum(int[] arr, int k){
        int right =0;
        int left =0;
        int max =0;
        int windowSum =0;
        while(right<arr.length){
            windowSum += arr[right];
            if(right>=k-1){
                max = Math.max(windowSum,max);
                windowSum -=arr[left];
                left++;
            }
            right++;
        }
        return max;
    }
}

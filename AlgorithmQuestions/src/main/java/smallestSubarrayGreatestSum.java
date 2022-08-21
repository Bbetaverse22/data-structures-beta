public class smallestSubarrayGreatestSum {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,3};
        System.out.println(findSmallestSub(arr, 5));;
    }


    public static int findSmallestSub(int[] arr, int k) {
        int windowSum = 0;
        int minLength = Integer.MAX_VALUE;
        int windowStart = 0;
        for(int windowEnd=0; windowEnd<arr.length; windowEnd++){
            windowSum += arr[windowEnd];
            while(windowSum>=k){
                minLength = Math.min(minLength, windowEnd - windowStart +1);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0:minLength;
    }
}

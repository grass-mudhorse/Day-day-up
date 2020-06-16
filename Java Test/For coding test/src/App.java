public class App {

    public static int findMaxSumSubArray(int k, int[] arr) {
        // get the sum of k number
        int maxSum = 0, windowSum = 0, start = 0;
        for (int i = 0; i <= k - 1; i++)
            windowSum += arr[i];

        // move forward from k
        for (int i = k; i < arr.length; i++) {
            maxSum = Math.max(maxSum, windowSum);
            windowSum -= arr[start];
            windowSum += arr[i];
            start++;
        }
        return maxSum;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Maximum sum of a subarray of size K: "
        + findMaxSumSubArray(3, new int[] { 2, 1, 5, 1, 3, 2 }));
    }
}

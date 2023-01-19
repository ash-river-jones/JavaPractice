public class MissingNumber {
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int i : arr) {
            actualSum += i;
        }
        return expectedSum - actualSum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        int missingNumber = findMissingNumber(arr);
        System.out.println("Missing number is: " + missingNumber);
    }
}

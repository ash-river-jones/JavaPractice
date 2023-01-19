public class MagicNumberChecker {
    public static boolean isMagicNumber(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num == 1;
    }
    public static void main(String[] args) {
        int testNum = 1234;
        boolean result = isMagicNumber(testNum);
        System.out.println("Is " + testNum + " a magic number? " + result);
    }
}

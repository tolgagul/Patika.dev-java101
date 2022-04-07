public class Main {
    static boolean isPalindrom(int num){
        int temp = num, reverseNum = 0, lastNum;
        while (temp != 0){
            lastNum = temp % 10;
            reverseNum = (reverseNum * 10) + lastNum;
            temp /= 10;
        }
        return num == reverseNum;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(4003));
    }
}

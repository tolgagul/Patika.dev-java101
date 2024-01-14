import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 321, 242, 324, 5325, 23, 24234, 242, 123, 7564, 3, 6, 8, 243, 4234, 7564, 8, 35232, 88, 423432, 4234123, 5, 6, 4};
        Arrays.sort(array);
        System.out.println("Dizi: " + Arrays.toString(array));
        System.out.print("Tekrar Eden Çift Sayılar: ");
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] == array[i - 1] && array[i] % 2 == 0 && array[i] != array[i + 1]) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
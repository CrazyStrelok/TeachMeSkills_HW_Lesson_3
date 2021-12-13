import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите размер массива ");
        int n;
        n = scanner.nextInt();
        if (n > 5 && n <= 10) {
            int[] array = new int[n];
            int evenNums = 0;
            for (int i = 0; i < n; i++) {
                array[i] = (int) (Math.random() * (n + 1));
                if (array[i] % 2 == 0) {
                    evenNums++;
                    System.out.println(array[i]);
                }
            }
                int[] array1 = new int[evenNums];
                int index = 0;
                for ( int i = 0; i < n; i++) {
                    if (array[i] % 2 == 0) {
                        array1[index] = array1[i];;
                        index++;
                    }
                }
            }
         else {
            System.out.println(" Повторите ввод ");
        }
    }
}

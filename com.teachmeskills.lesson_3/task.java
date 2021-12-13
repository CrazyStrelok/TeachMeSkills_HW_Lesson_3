import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число с клавиатуры");
        int a = scanner.nextInt();
        int[] arr = {1, 4, 7, 121, 323};
        for ( int i : arr) {
            if (a != arr[i]) {
                System.out.println(" Число не входит в массив ");
            }
                if (a == arr[i]) {
                    System.out.print(" Число  входит в массив ");
                    break;
                }
            }
        }
    }





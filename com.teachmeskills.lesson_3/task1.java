import java.util.Arrays;
import java.util.Scanner;

public class task1 {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите число с клавиатуры");
                int a = scanner.nextInt();
                int[] arr = {3, 1, 6, 5, 2, 8, 4};
                int[] newArr;
                    for (int i = 0; i < arr.length - 1; i++) {
                        if (arr[i] == a) {
                            newArr = new int[arr.length - 1];
                            for (int index = 0; index < i; index++) {
                                newArr[index] = arr[index];
                            }
                            for (int j = i; j < arr.length - 1; j++) {
                                newArr[j] = arr[j + 1];
                            }
                            System.out.println(Arrays.toString(newArr));
                            break;
                        }
                        else {
                            System.out.println(" Заданного числа нет ");
                        }
                        }
                }
            }


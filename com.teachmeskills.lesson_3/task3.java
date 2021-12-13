
public class task3 {
    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = new int[5];
        a[0] = (int) (Math.random() * 6);
        b[0] = (int) (Math.random() * 6);
        System.out.print(a[0]);
        System.out.print(b[0]);
        double c = 0;
        double d = 0;
        for (int i = 0; i < 5; i++) {
            c += a[i];
            d += b[i];
        }
        c /= 5;
        d /= 5;
        if (c > d) {
            System.out.println("Среднее арифметическое первого массива  больше среднего арифметического \n" +
                    "                    второго массива");
        } else if (c < d) {
            System.out.println("Среднее арифметическое первого массива  меньше среднего арифметического " +
                    "второго массива ");
        } else {
            System.out.println("Средние арифметические массивов равны ");
        }
    }
}
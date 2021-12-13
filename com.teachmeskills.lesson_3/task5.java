public class task5 {
    public static void main(String[] args) {
        double[] array = new double[(int)6];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
            System.out.print(array[i]);
        }
            for (int i = 0; i < array.length; i++) {
                if (i % 2 == 1) {
                    array[i] = 0;
                    System.out.print(array[i]);
                }
            }
        }
    }

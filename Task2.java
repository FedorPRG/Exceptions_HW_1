public class Task2 {
    public static void main(String[] args) {
        String[][] arr = { { "1", "2", "3", "4", "5" }, { "1", "2", "3", "4", "5" } };
        System.out.println( sum2d(arr));
    }
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}
/*
 * 1.Если в заданном массиве будут не только числа
 * (java.lang.NumberFormatException)
 * 2.Если количество столбцов будет меньше5
 * (java.lang.ArrayIndexOutOfBoundsException) 
 */

import java.util.Arrays;

public class Task3 {
    /*
     * Реализуйте метод, принимающий в качестве аргументов два целочисленных
     * массива, и возвращающий новый массив, каждый элемент которого равен частному
     * элементов двух входящих массивов в той же ячейке. Если длины массивов не
     * равны, необходимо как-то оповестить пользователя. Важно: При выполнении
     * метода единственное исключение, которое пользователь может увидеть -
     * RuntimeException, т.е. ваше
     */

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4 };
        int arr2[] = { 1, 2, 3 };
        int arrDiv[] = DivisionArr(arr1, arr2);
        System.out.println(Arrays.toString(arrDiv));
    }

    static int[] DivisionArr(int[] arr1, int[] arr2) {
        int arrDiv[] = new int[arr1.length];
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны");
        } else {
            for (int i = 0; i < arr1.length; i++) {
                arrDiv[i] = arr1[i] / arr2[i];
            }
            return arrDiv;
        }
    }
}
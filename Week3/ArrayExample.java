package Week3;

public class ArrayExample {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] newNumbers = new int[4];
        int[] newarr;

        System.out.println(numbers[2]);
        numbers[2] = 100;

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
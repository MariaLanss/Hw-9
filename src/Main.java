import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int [30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + ". Максимальная сумма трат за день составила " + max + " рублей");
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        var sum = 0;
        for (var i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        var result = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + result + " рублей");
    }

    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        reverseFullName[0] = 'I';
        reverseFullName[1] = 'v';
        reverseFullName[2] = 'a';
        reverseFullName[3] = 'n';
        reverseFullName[4] = 'o';
        reverseFullName[5] = 'v';
        reverseFullName[6] = ' ';
        reverseFullName[7] = 'I';
        reverseFullName[8] = 'v';
        reverseFullName[9] = 'a';
        reverseFullName[10] = 'n';
        System.out.println(reverseFullName);
    }

}
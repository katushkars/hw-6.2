public class Main {
    public static void main(String[] args) {
        // задание 1,2,3
        int[] arr = generateRandomArray();
        System.out.println(arr[0]);
        int sum = 0;
        double averageSum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            averageSum = sum / 30;
        }
        System.out.println("Сумма трат составила " + sum + " рублей!");
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей");
        int maxArr = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxArr) {
                maxArr = arr[i];
            }
        }
        int minArr = 200001;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minArr) {
                minArr = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxArr + " рублей!");
        System.out.println("Минимальная сумма трат за день составила " + minArr + " рублей!");


        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char name=0;
        for (int i =(reverseFullName.length-1) ; i > -1; i=i-1) {
            name=reverseFullName[i];
            System.out.print(name);
        }

        }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    }

public class Main {
    public static void main(String[] args) {
      int[] weights = new int[]{90, 91, 92,93,94,87, 88, 89,0,0,0,0 };
        weights[0] = 90;
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        System.out.println();
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }

        System.out.println();

        System.out.println("Домашняя работа");
        int[] numbers = new int[]{1,2,3};
        float[] decimals = new float[]{1.57f, 7.654f, 9.986f};
        int[] data = new int[3];
        data[0] = 78;
        data[1] = 52;
        data[2] = 14;

// Вывод массива numbers
        for (int i = 0; i < numbers.length; i++) {
            if (i != numbers.length - 1) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i]); // Без запятой в конце
            }
        }
        System.out.println();

// Вывод массива decimals
        for (int j = 0; j < decimals.length; j++) {
            if (j != decimals.length - 1) {
                System.out.print(decimals[j] + ", ");
            } else {
                System.out.print(decimals[j]); // Без запятой в конце
            }
        }
        System.out.println();

// Вывод массива data
        for (int k = 0; k < data.length; k++) {
            if (k != data.length - 1) {
                System.out.print(data[k] + ", ");
            } else {
                System.out.print(data[k]); // Без запятой в конце
            }
        }
        System.out.println();

// Вывод массива numbers в обратном порядке
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i]);
            }
        }
        System.out.println();

// Вывод массива decimals в обратном порядке
        for (int i = decimals.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(decimals[i] + ", ");
            } else {
                System.out.print(decimals[i]);
            }
        }
        System.out.println();

// Вывод массива data в обратном порядке
        for (int i = data.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(data[i] + ", ");
            } else {
                System.out.print(data[i]);
            }
        }
        System.out.println();


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] = numbers[i] + 1; // Если число нечётное — прибавляем 1
            }
            System.out.print(numbers[i]); // Печатаем элемент

            if (i != numbers.length - 1) {
                System.out.print(", "); // Запятая между числами, но не в конце
            }
        }

                                            }
                 }

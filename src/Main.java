public class Main {
    public static void main(String[] args) {
        System.out.println("Homework!");
        task1();
        task2();
        task3();
        task4();

    }
    public static void task1() {
        /**
         * С помощью цикла for выведите в консоль все числа от 1 до 10.
         */
        System.out.println("Задача 1");

        for(int i = 1; i <=10; i = i + 1){
            System.out.println("Итерация цикла " + i);
            {
            }System.out.println( );
        }
    }
    public static void task2() {
        /**
         * С помощью цикла for выведите в консоль все числа от 10 до 1.
         */
        System.out.println("Задача 2");

        for(int i = 10; i >= 1; i = i - 1){
            System.out.println("Итерация цикла " + i);
            {
            }System.out.println( );
        }
    }
    public static void task3() {
        /**
         *Выведите в консоль все четные числа от 0 до 17.
         */
        System.out.println("Задача 3");

        for(int i = 0; i <=17; i = i + 2){
            System.out.println("Итерация цикла " + i);
            {
            }System.out.println( );
        }
    }
    public static void task4() {
        /**
         *Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему.
         */
        System.out.println("Задача 4");

        for(int i = 10; i >= -10; i = i - 1){
            System.out.println("Итерация цикла " + i);
            {
            }System.out.println( );
        }
    }
}
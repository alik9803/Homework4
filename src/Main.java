import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1() {
        // Задача 1
        int age = 17;
        if (age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний " + " Задача 1");
        } else{
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать " + " Задача 1");
        }
    }
    // Задача 2
    public static void task2() {
        byte temp = 10;
        if (temp >= 5) {
            System.out.println(" На улице 10 градусов" + " можно идти без шапки " + " Задача 2");
        } else if (temp <= 5) {
            System.out.println(" На улице 5 градусов" + " нужно надеть шапку " + " Задача 2");
        }
    }
    //задача 3
    public static void task3() {
        char speed = 100;
        if (speed >= 60) {
            System.out.println("Если скорость больше 60 км/ч " + "придется заплатить штраф " + " Задача 3");
        } else if (speed <= 60) {
            System.out.println("Если скорость меньше 60 км/ч " + "можно ездить спокойно " + " Задача 3");
        }
    }
    // Задача 4
    public static void task4() {
        char human = 1;
        if (human >= 2) {
        } else {
            System.out.println("Если возраст человека " + " меньше 2 лет, то ему пора спать. " + " Задача 4");
        }
        int age = 5;
        if (age <= 2 && age == 6) {
        } else {
            System.out.println("Если возраст человека до 6 лет, " + "то ему нужно ходить в детский сад " + " Задача 4");
        }
        int r = 7;
        if (r >= 7 && r == 18) {
        } else {
            System.out.println("от 7-18 лет то ему нужно ходить в школу. " + " Задача 4");
        }
        byte y = 19;
        if (y <= 18 && y >= 24) {
        } else {
            System.out.println("Если возраст человека равен от 18 до 24 его место в университети " + " Задача 4");
        }
        short u = 25;
        if (u >= 24) {
        } else {
            System.out.println("Если возраст человека больше 24 то, ему пора на работу " + " Задача 4");
        }
        int i = 65;
        if (i >= 60) {
        } else {
            System.out.println("Возраст человека больше 60 лет " + " он может отдохнуть " + " Задача 4");
        }
    }
    //  Задача 5
    public static void task5() {
        byte o = 4;
        if (o >= 5 && o <= 14) {
        } else {
            System.out.println(" Он не сможет кататься! " + " Задача 5");
            System.out.println("Он сможет кататься ,без родителей " + " Задача 5");
        }
        int p = 10;
        if (p >= 5 || p > 14) {
        } else {
            System.out.println(" можно кататься в сопровождении взрослого " + " Задача 5");
        }
    }
   // Задание 6
    public static void task6() {
        int capacity = 102;
        int seatedCapacity = 60;
        int passengers = 80; //количество пассажиров
        if (passengers < seatedCapacity) {
            System.out.println("Есть свободные сидячие места в вагоне " + " Задача 6");
        } else if (passengers < capacity) {
            System.out.println("В вагоне есть свободные места только на стоянке " + " Задача 6");
        } else {
            System.out.println("В вагоне нет свободных мест " + " Задача 6");
        }
    }
  // Задание 7
    public static void task7() {
        int one = 1;
        int two = 2;
        int three = 3;
        if (one >= two && one >= three) {
            System.out.println("Наибольшее число: " + one + " Задача 7");
        } else if (two >= one && two >= three) {
            System.out.println("Наибольшее число: " + two + " Задача 7");
        } else {
            System.out.println("Наибольшее число: " + three + " Задача 7");
        }
    }
}
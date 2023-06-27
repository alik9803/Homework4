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
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний " + " Задача 1");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать " + " Задача 1");
        }
    }

    // Задача 2
    public static void task2() {
        byte temp = 5;
        if (temp >= 15) {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки " + " Задача 2");
        } else {
            System.out.println("На улице " + temp + " градусов,  нужно надеть шапку " + " Задача 2");
        }
    }

    //задача 3
    public static void task3() {
        int speed = 40;
        if (speed >= 60) {
            System.out.println("Если скорость больше " + speed + " придется заплатить штраф " + " Задача 3");
        } else if (speed <= 60) {
            System.out.println("Если скорость меньше " + speed + " можно ездить спокойно " + " Задача 3");
        }
    }
    // Задача 4
    public static void task4() {
        int human = 20;
        if (human <= 2) {
            System.out.println("Если возраст человека " + human + " то ему пора спать. " + " Задача 4");
        } else if (human >= 2 && human <= 6) {
            System.out.println("Если возраст человека " + human + " то ему нужно ходить в детский сад " + " Задача 4");
        } else if (human >= 7 && human <= 18) {
            System.out.println(" Если возраст человека " + human + " то ему нужно ходить в школу. " + " Задача 4");
        } else if (human >= 18 && human <= 24) {
            System.out.println("Если возраст человека " + human + " его место в университети " + " Задача 4");
        } else if (human >= 24 && human <= 60) {
            System.out.println("Если возраст человека " + human + " ему пора на работу " + " Задача 4");
        } else {
            System.out.println("Возраст человека " + human + " он может отдохнуть " + " Задача 4");
        }
    }

    // Задача 5
    public static void task5() {
        byte o = 20;
        if (o <= 5) {
            System.out.println("Он не сможет кататься! " + "  Задача 5");
        } else if (o >= 5 && o <= 14) {
            System.out.println("Можно кататься в сопровождении взрослого " + "  Задача 5");
        } else {
            System.out.println("Он сможет кататься ,без родителей "  + " Задача 5");
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
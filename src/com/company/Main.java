package com.company;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //task_1
        System.out.println("\nДомашнее задание №1:");
        showMainMenu();
    }

    private static void showMainMenu() {
        String cmd;
        while (true) {
            System.out.println();
            for (int i = 1; i <= 11; i++)
                System.out.println(i + " - Задача №" + i);
            System.out.println("12 - Завершение программы");
            System.out.print("\nВведите команду: ");
            cmd = in.next();
            if (cmd.equals("1")) {
                System.out.println("\nЗадача №1:");
                System.out.println("Обмен значений.");
                while (true) {
                    showTaskHint();
                    cmd = in.next();
                    if (cmd.equals("1")) {
                        task_1();
                    } else if (cmd.equals("2")) {
                        task_1((int) (Math.random() * 1000), (int) (Math.random() * 1000));
                    } else if (cmd.equals("3")) {
                        break;
                    } else
                        System.out.println("Неправильная команда!!!");
                }
            }
            else if (cmd.equals("2")) {
                System.out.println("\nЗадача №2:");
                System.out.println("\nВ некоторой школе занятия начинаются в 9:00. Продолжительность урока — 45 минут, \n" +
                        "после 1-го, 3-го, 5-го и т.д. уроков перемена 5 минут, а после 2-го, 4-го, 6-го и т.д. — 15 минут. \n" +
                        "Определите, когда заканчивается указанный урок.");
                while (true) {

                    showTaskHint();
                    cmd = in.next();
                    if (cmd.equals("1")) {
                        task_2();
                    } else if (cmd.equals("2")) {
                        task_2((int) (Math.random() * 9) + 1);
                    } else if (cmd.equals("3")) {
                        break;
                    } else
                        System.out.println("Неправильная команда!!!");
                }
            }
            else if (cmd.equals("3")) {
                System.out.println("\nЗадача №3:");
                System.out.println("Даны значения двух моментов времени, принадлежащих одним и тем же суткам: часы, минуты и секунды для каждого из моментов времени. \n" +
                        "Известно, что второй момент времени наступил не раньше первого. \n" +
                        "Определите, сколько секунд прошло между двумя моментами времени.");
                while (true) {
                    showTaskHint();
                    cmd = in.next();
                    if (cmd.equals("1")) {
                        task_3();
                    } else if (cmd.equals("2")) {
                        int hr1, mn1, sc1, hr2, mn2, sc2;
                        hr1 = (int) (Math.random() * 11);
                        mn1 = (int) (Math.random() * 60);
                        sc1 = (int) (Math.random() * 60);
                        hr2 = (int) (Math.random() * 11);
                        mn2 = (int) (Math.random() * 60);
                        sc2 = (int) (Math.random() * 60);
                        task_3(hr1, mn1, sc1, hr2, mn2, sc2);
                    } else if (cmd.equals("3")) {
                        break;
                    } else
                        System.out.println("Неправильная команда!!!");
                }
            }
            else if (cmd.equals("4")) {
                System.out.println("\nЗадача №4:");
                System.out.println("За день машина проезжает n километров. Сколько дней нужно, чтобы проехать маршрут длиной m километров?");
                while (true) {
                    showTaskHint();
                    cmd = in.next();
                    if (cmd.equals("1")) {
                        task_4();
                    } else if (cmd.equals("2")) {
                        int n, m;
                        n = (int) (Math.random() * 10000);
                        m = (int) (Math.random() * 10000);
                        task_4(n, m);
                    } else if (cmd.equals("3")) {
                        break;
                    } else
                        System.out.println("Неправильная команда!!!");
                }
            }
            else if (cmd.equals("5")) {
                System.out.println("\nЗадача №5:");
                System.out.println("Улитка ползёт по вертикальному шесту высотой h метров, \n" +
                        "поднимаясь за день на a метров, а за ночь спускаясь на b метров. На какой день улитка доползёт до вершины шеста?");
                while (true) {
                    showTaskHint();
                    cmd = in.next();
                    if (cmd.equals("1")) {
                        task_5();
                    } else if (cmd.equals("2")) {
                        int h, a, b;
                        h = (int) (Math.random() * 100);
                        a = (int) (Math.random() * (h - 1) + 1);
                        b = (int) (Math.random() * (a - 1));
                        task_5(h, a, b);
                    } else if (cmd.equals("3")) {
                        break;
                    } else
                        System.out.println("Неправильная команда!!!");
                }
            }
            else if (cmd.equals("6")) {
                System.out.println("\nЗадача №6:");
                System.out.println("Напишите программу, которая считывает два целых числа a и b и выводит наибольшее значение из них. Числа — целые от 1 до 1000.");
                while (true) {
                    showTaskHint();
                    cmd = in.next();
                    if (cmd.equals("1")) {
                        task_6();
                    } else if (cmd.equals("2")) {
                        int a, b;
                        a = (int) (Math.random() * 1000 + 1);
                        b = (int) (Math.random() * 1000 + 1);
                        task_6(a, b);
                    } else if (cmd.equals("3")) {
                        break;
                    } else
                        System.out.println("Неправильная команда!!!");
                }
            }
            else if (cmd.equals("7")) {
                System.out.println("\nЗадача №7:");
                System.out.println("Требуется определить, бьет ли ладья, стоящая на клетке с указанными координатами (номер строки и номер столбца), фигуру, стоящую на другой указанной клетке.");
                while (true) {
                    showTaskHint();
                    cmd = in.next();
                    if (cmd.equals("1")) {
                        task_7();
                    } else if (cmd.equals("2")) {
                        int xRook, yRook, xPawn, yPawn;
                        xRook = (int) (Math.random() * 10 + 1);
                        yRook = (int) (Math.random() * 10 + 1);
                        xPawn = (int) (Math.random() * 10 + 1);
                        yPawn = (int) (Math.random() * 10 + 1);
                        task_7(xRook, yRook, xPawn, yPawn);
                    } else if (cmd.equals("3")) {
                        break;
                    } else
                        System.out.println("Неправильная команда!!!");
                }
            }
            else if (cmd.equals("8")) {
                System.out.println("\nЗадача №8:");
                System.out.println("Входные данные: Даны три целых числа, записанных в отдельных строках. Определите, сколько среди них совпадающих.");
                while (true) {
                    showTaskHint();
                    cmd = in.next();
                    if (cmd.equals("1")) {
                        task_8();
                    } else if (cmd.equals("2")) {
                        int a, b, c;
                        a = (int) (Math.random() * 1000);
                        b = (int) (Math.random() * 1000);
                        c = (int) (Math.random() * 1000);
                        task_8(a, b, c);
                    } else if (cmd.equals("3")) {
                        break;
                    } else
                        System.out.println("Неправильная команда!!!");
                }
            }
            else if (cmd.equals("9")) {
                System.out.println("\nЗадача №9:");
                System.out.println("Дан массив, состоящий из целых чисел. Напишите программу, которая подсчитает количество элементов массива, больших предыдущего (элемента с предыдущим номером).");
                while (true) {
                    showTaskHint();
                    cmd = in.next();
                    if (cmd.equals("1")) {
                        task_9();
                    } else if (cmd.equals("2")) {
                        int n;
                        n= (int) (Math.random()*100+1);
                        String  array = "";
                        for (int i = 0; i < n; i++)
                            array += (int) (Math.random() * 100) + " ";
                        task_9(n, array);
                    } else if (cmd.equals("3")) {
                        break;
                    } else
                        System.out.println("Неправильная команда!!!");
                }
            }
            else if (cmd.equals("10")) {
                System.out.println("\nЗадача №10:");
                System.out.println("Дан массив, состоящий из целых чисел. \n" +
                        "Напишите программу, которая в данном массиве определит количество элементов, у которых два соседних и, при этом, оба соседних элемента меньше данного.");
                while (true) {
                    showTaskHint();
                    cmd = in.next();
                    if (cmd.equals("1")) {
                        task_10();
                    } else if (cmd.equals("2")) {
                        int n;
                        n= (int) (Math.random()*100+1);
                        String  array = "";
                        for (int i = 0; i < n; i++)
                            array += (int) (Math.random() * 100) + " ";
                        task_10(n, array);
                    } else if (cmd.equals("3")) {
                        break;
                    } else
                        System.out.println("Неправильная команда!!!");
                }
            }
            else if (cmd.equals("11")) {
                System.out.println("\nЗадача №11:");
                System.out.println("Напишите программу, которая переставляет соседние элементы массива (1-й элемент поменять с 2-м, 3-й с 4-м и т.д. \n" +
                        "Если элементов нечетное число, то последний элемент остается на своем месте).");
                while (true) {
                    showTaskHint();
                    cmd = in.next();
                    if (cmd.equals("1")) {
                        task_11();
                    } else if (cmd.equals("2")) {
                        int n;
                        n= (int) (Math.random()*100+1);
                        String  array = "";
                        for (int i = 0; i < n; i++)
                            array += (int) (Math.random() * 100) + " ";
                        task_11(n, array);
                    } else if (cmd.equals("3")) {
                        break;
                    } else
                        System.out.println("Неправильная команда!!!");
                }
            }
            else if (cmd.equals("12")) {
                System.out.println("\nЗавершение программы...");
                return;
            }
            else
                System.out.println("Неправильная команда!!!");
        }
    }

    private static void showTaskHint() {
        System.out.println("\n1 - Ввод из консоли");
        System.out.println("2 - Случайные значения");
        System.out.println("3 - Выбрать другую задачу");
        System.out.print("\nВведите команду: ");
    }

    static void task_1() {
        int a, b;
        System.out.print("\na = ");
        a = in.nextInt();
        System.out.print("b = ");
        b = in.nextInt();
        task_1(a, b);
    }

    static void task_1(int a, int b) {
        System.out.println("\nВходные данные: ");
        System.out.println("a = " + a + " b = " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("Ответ: ");
        System.out.println("a = " + a + " b = " + b);
    }

    static void task_2() {
        int n;
        System.out.print("\nn = ");
        n = in.nextInt();
        task_2(n);
    }

    static void task_2(int n) {
        System.out.println("\nВходные данные: ");
        System.out.println("n = " + n);
        int timeMn;
        timeMn = 540 + 45 * (n - 1) + 5 * (n / 2) + 15 * ((n - 1) / 2);
        int startHr, startMn, endHr, endMn;
        startHr = timeMn / 60;
        startMn = timeMn - startHr * 60;
        timeMn += 45;
        endHr = timeMn / 60;
        endMn = timeMn - endHr * 60;
        System.out.println("Ответ: ");
        System.out.println(startHr + ":" + startMn + " - " + endHr + ":" + endMn);
    }

    static void task_3() {
        int hr1, mn1, sc1, hr2, mn2, sc2;
        System.out.println("\nМомент времени 1: ");
        System.out.print("часы: ");
        hr1 = in.nextInt();
        System.out.print("минуты: ");
        mn1 = in.nextInt();
        System.out.print("секунды: ");
        sc1 = in.nextInt();
        System.out.println("Момент времени 2: ");
        System.out.print("часы: ");
        hr2 = in.nextInt();
        System.out.print("минуты: ");
        mn2 = in.nextInt();
        System.out.print("секунды: ");
        sc2 = in.nextInt();
        task_3(hr1, mn1, sc1, hr2, mn2, sc2);
    }

    static void task_3(int hr1, int mn1, int sc1, int hr2, int mn2, int sc2) {
        System.out.println("\nВходные данные: ");
        System.out.println("\nМомент времени 1: " + hr1 + ":" + mn1 + ":" + sc1);
        System.out.println("Момент времени 2: " + hr2 + ":" + mn2 + ":" + sc2);
        int timeSc1, timeSc2;
        timeSc1 = hr1 * 60 * 60 + mn1 * 60 + sc1;
        timeSc2 = hr2 * 60 * 60 + mn2 * 60 + sc2;
        if (timeSc2 < timeSc1) {
            System.out.println("Введены неверные данные! Момент времени 2 не может быть меньше Момента времени 1");
            return;
        }
        System.out.println("Ответ: ");
        System.out.println("Разница: " + (timeSc2 - timeSc1));
    }

    static void task_4() {
        int n, m;
        System.out.print("\nn = ");
        n = in.nextInt();
        System.out.print("m = ");
        m = in.nextInt();
        task_4(n, m);
    }

    static void task_4(int n, int m) {
        System.out.println("\nВходные данные: ");
        System.out.println("n = " + n + " m = " + m);
        int daysCount;
        daysCount = (int) Math.ceil((double) m / n);
        System.out.println("Ответ: ");
        System.out.println("Количество дней: " + daysCount);
    }

    static void task_5() {
        int h, a, b;
        System.out.print("\nh = ");
        h = in.nextInt();
        System.out.print("a = ");
        a = in.nextInt();
        System.out.print("b = ");
        b = in.nextInt();
        task_5(h, a, b);
    }

    static void task_5(int h, int a, int b) {
        System.out.println("\nВходные данные: ");
        System.out.println("h = " + h + " a = " + a + " b = " + b);
        int daysCount = (int) (Math.ceil((double) (h - a) / (a - b)) + 1);
        System.out.println("Ответ: ");
        System.out.println("Количество дней: " + daysCount);
    }

    static void task_6() {
        int a, b;
        System.out.print("\na = ");
        a = in.nextInt();
        System.out.print("b = ");
        b = in.nextInt();
        task_6(a, b);
    }

    static void task_6(int a, int b) {
        System.out.println("\nВходные данные: ");
        System.out.println("a = " + a + " b = " + b);
        int max = (int) ((a * b) / (a * ((a % b) / a) + b * ((b % a) / b) + a * Math.pow(0, (b % a) + (a % b))));
        System.out.println("Ответ: ");
        System.out.println("Максимальное: " + max);
    }

    static void task_7() {
        int xRook, yRook, xPawn, yPawn;
        System.out.println("\nКоординаты ладьи: ");
        System.out.print("x = ");
        xRook = in.nextInt();
        System.out.print("y = ");
        yRook = in.nextInt();
        System.out.println("Координаты пешки: ");
        System.out.print("x = ");
        xPawn = in.nextInt();
        System.out.print("y = ");
        yPawn = in.nextInt();
        task_7(xRook, yRook, xPawn, yPawn);
    }

    static void task_7(int xRook, int yRook, int xPawn, int yPawn) {
        System.out.println("\nВходные данные: ");
        System.out.print("Координаты ладьи: ");
        System.out.println("x = " + xRook + " y = " + yRook);
        System.out.print("Координаты пешки: ");
        System.out.println("x = " + xPawn + " y = " + yPawn);
        String answer = (xRook == xPawn || yRook == yPawn) ? "YES" : "NO";
        System.out.println("Ответ: " + answer);
    }

    static void task_8() {
        int a, b, c;
        System.out.print("\na = ");
        a = in.nextInt();
        System.out.print("b = ");
        b = in.nextInt();
        System.out.print("c = ");
        c = in.nextInt();
        task_8(a, b, c);
    }

    static void task_8(int a, int b, int c) {
        System.out.println("\nВходные данные: ");
        System.out.println("a = " + a + " b = " + b + " c = " + c);
        int count = 0;
        if (a == b && b == c) {
            count = 3;
        } else if (a == c || b == c || a == b) {
            count = 2;
        }
        System.out.println("Ответ: ");
        System.out.println("Количество равных из трех: " + count);
    }

    static void task_9() {
        int n;
        System.out.print("\nN = ");
        n = in.nextInt();
        String array = "";
        array = generateString(n);
        task_9(n, array);
    }

    private static String generateString(int n) {
        String array;
        System.out.println("Заполнить массив случайными элементами? 1 - да, 2 - нет ");
        array = in.next();
        System.out.println("Массив: ");
        if (array.equals("1")) {
            array = "";
            for (int i = 0; i < n; i++)
                array += (int) (Math.random() * 100) + " ";
        }
        else {
            array = "";
            for (int i = 0; i < n; i++) {
                System.out.print((i+1)+") ");
                array += in.next() + " ";
            }
        }
        return array;
    }

    static void task_9(int n, String array) {
        System.out.println("\nВходные данные: ");
        System.out.println("N = " + n);
        System.out.println("Массив: \n" + array);
        String num = "";
        int a = -1, b, count = 0;
        boolean first = true;
        for (char elem : array.toCharArray()) {
            if (first && elem == ' ') {
                first = false;
                a = Integer.parseInt(num);
                num = "";
            } else if (elem == ' ') {
                b = Integer.parseInt(num);
                if (b > a)
                    count++;
                a = b;
                num = "";
            } else {
                num += elem;
            }
        }
        System.out.println("Ответ: " + count);
    }

    static void task_10() {
        int n;
        System.out.print("\nN = ");
        n = in.nextInt();
        String array = "";
        array = generateString(n);
        task_10(n, array);
    }

    static void task_10(int n, String array) {
        System.out.println("\nВходные данные: ");
        System.out.println("N = " + n);
        System.out.println("Массив: \n" + array);
        String num = "";
        int[] numbers = new int[3];
        int count = 0;
        int canCheck = 0;
        for (char elem : array.toCharArray()) {
            if (canCheck<2 && elem == ' ') {
                numbers[canCheck++] = Integer.parseInt(num);
                num = "";
            } else if (elem == ' ') {
                numbers[2] = Integer.parseInt(num);
                if (numbers[1] > numbers[0] && numbers[1]>numbers[2])
                    count++;
                numbers[0]=numbers[1];
                numbers[1]=numbers[2];
                num = "";
            } else {
                num += elem;
            }
        }
        System.out.println("Ответ: " + count);
    }

    static void task_11() {
        int n;
        System.out.print("\nN = ");
        n = in.nextInt();
        String array = "";
        array = generateString(n);
        task_11(n, array);
    }

    static void task_11(int n, String array) {
        System.out.println("\nВходные данные: ");
        System.out.println("N = " + n);
        System.out.println("Массив: \n" + array);
        int[] numbers=generateNumbers(n, array);
        if (n%2!=0) n--;
        for (int i=0; i<n; i+=2){
            numbers[i]+=numbers[i+1];
            numbers[i+1]=numbers[i]-numbers[i+1];
            numbers[i]-=numbers[i+1];
        }
        System.out.println("Ответ: ");
        for (int elem: numbers) {
            System.out.print(elem+" ");
        }
        System.out.println();
    }

    private static int[] generateNumbers(int n, String array) {
        int[] numbers=new int[n];
        String num="";
        int ind=0;
        for (char elem : array.toCharArray()) {
            if (elem == ' ') {
                numbers[ind++]=Integer.parseInt(num);
                num="";
            } else {
                num += elem;
            }
        }
        return numbers;
    }
}

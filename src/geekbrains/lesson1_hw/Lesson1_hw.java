package geekbrains.lesson1_hw;

import java.util.Scanner;
        //1 задание
public class Lesson1_hw {
    private  static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //2 задание. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        System.out.println("Задание 2:Переменные пройденных типов");
        int i = 1;
        float f = 111.0f;
        double d = 123.123;
        short s = 123;
        long l = 111111L;
        boolean b = true;
        byte bt = 0;
        char c = 'x';

        System.out.println("Значение для типа int = " + i);
        System.out.println("Значение для типа float = " + f);
        System.out.println("Значение для типа double = " + d);
        System.out.println("Значение для типа short = " + s);
        System.out.println("Значение для типа long = " + l);
        System.out.println("Значение для типа boolean = " + b);
        System.out.println("Значение для типа byte = " + bt);
        System.out.println("Значение для типа char = [" + c + "]");
        System.out.println();


        //3 задание
        System.out.println("Задание 3 : Введите переменные для уравнения  a * (b + (c / d))");
        System.out.print("a = ");
            int numa = scanner.nextInt();
        System.out.print("b = ");
            int numb = scanner.nextInt();
        System.out.print("c = ");
            int numc = scanner.nextInt();
        System.out.print("d = ");
            int numd= scanner.nextInt();
        System.out.println(hwPart3(numa,numb,numc,numd));
        System.out.println();

        //4 задание
        System.out.println("Задание 4: сумма лежит в пределах от 10 до 20(включительно)?");
        System.out.println("Введите числа");
        System.out.print("Число 1 = ");
            int inta = scanner.nextInt();
        System.out.print("Число 2 = ");
            int intb = scanner.nextInt();
        System.out.println(hwPart4(inta,intb));
        System.out.println();

        //5 задание
        System.out.println("Задание 5: Положительное или отрицательное?");
        System.out.println("Введите число для проверки:");
            int number = scanner.nextInt();
        hwPart5(number);
        System.out.println();
        //6 задание
        System.out.println("Задание 6: Число отрицательное?");
        System.out.println("Введите число для проверки:");
            int num1 = scanner.nextInt();
        System.out.println(hwPart6(num1));
        System.out.println();

        //7 задание
        System.out.println("Задание 7: Давайте познакомимся! =)");
        System.out.println("Как Вас зовут?");
        String name = scanner.next();
        hwPart7(name);
        System.out.println();

        System.out.println("Задание 8: Является ли год високосным?");
        System.out.println("Введите год для определения:");
            int year=scanner.nextInt();
        hwPart8(year);
        scanner.close();
    }
    //Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
    public static double hwPart3(int a, double b, double c, double d){
        double res = a * (b + (c / d));
        return res;
    }
    //Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    public static boolean hwPart4(int a, int b){
        if(a + b <10 || a + b >20 ){
            return false;
        }
        return true;
    }
    //Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное;
    // Замечание: ноль считаем положительным числом.
    public static void hwPart5(int a){
        if(a<0){
            System.out.println("Число отрицательное.");
        }
        else {
            System.out.println("Число положительное.");
        }
    }

    //Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
    public static boolean hwPart6(int a){
        if(a<0){
            return true;
        } else {
            return false;
        }
    }
    //Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    public static void hwPart7(String s){
            System.out.println("Привет, "+ s +"!");
    }

    //Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

    public static void hwPart8(int i){
        if(i%4==0 && i%100 !=0 || i%400==0){
            System.out.println("Год високосный");
        }
        else {
            System.out.println("Год не високосный");
        }
    }
}

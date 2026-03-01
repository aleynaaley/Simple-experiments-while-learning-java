package class4;

import java.util.Scanner;

public class TypeTransform {
    public static void main(String[] args) {

        // kullanıcıdan veri alma
        //scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adınızı giriniz:");
        String name = scanner.nextLine();

        System.out.println("Soyadınızı giriniz:");
        String surname = scanner.nextLine();

        System.out.println("Ad: " + name + ", Soyad: " + surname);

        System.out.print("Yaşınızı giriniz:"); //print yazınca alt satıra geçmez
        int age = scanner.nextInt();

        System.out.println("Yaş: " + age);

        /* 
        nextInt() // int veri türünde veri alma
        nextDouble() // double veri türünde veri alma
        nextBoolean() // boolean veri türünde veri alma
        next() // String veri türünde tek kelime alma
        nextLine() // String veri türünde bir satır alma    
        nextFloat() // float veri türünde veri alma
        nextByte() // byte veri türünde veri alma
        nextShort() // short veri türünde veri alma
        */

        //-------------------------------------------
        // Implicit Type Casting (Widening)

        String str = "123";
        String str2 = "45.67";

        System.out.println(str+str2);  //aralarında boşluk olmadığı için "12345.67" olarak yazdırır

        Integer a = Integer.valueOf(str);

        System.out.println(a); // 123
        System.out.println(a+2); // 125

        int num1 = 100;
        double num2 = num1; // int to double
        System.out.println("Implicit Type Casting (int to double): " + num2); // 100.0

        // Explicit Type Casting (Narrowing)  java buna izin vermez çünkü veri kaybı olabilir biz zorla yaparız
        double num3 = 9.99;
        int num4 = (int) num3; // double to int
        System.out.println("Explicit Type Casting (double to int): " + num4); // 9

        // String to Integer
        String strNum = "123";
        int parsedNum = Integer.parseInt(strNum);
        String strNum2 = String.valueOf(num4);
        System.out.println("String to Integer: " + parsedNum); // 123
        System.out.println("Int to String: " + strNum2); // "9"

        // Integer to String
        int num5 = 456;
        String strNum5 = Integer.toString(num5);
        System.out.println("Integer to String: " + strNum5); // "456"

        int aA = 130;
        byte b = (byte) aA;
        System.out.println(b); // 130'un byte karşılığı -126'dır    
        
    }
}
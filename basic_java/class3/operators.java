
public class operators {
    public static void main(String[] args) {

        // Aritmetik Operatörler
        int a = 10;
        int b = 5;

        // Toplama
        int sum = a + b;
        System.out.println("Toplama: " + sum);

        // Çıkarma
        int difference = a - b;
        System.out.println("Çıkarma: " + difference);

        // Çarpma
        int product = a * b;
        System.out.println("Çarpma: " + product);

        // Bölme
        int quotient = a / b;
        System.out.println("Bölme: " + quotient);

        // Mod (kalan)
        int remainder = a % b;
        System.out.println("Modulo: " + remainder);

        // Artırma ve Azaltma
        a++; // a'yı 1 artırır
        System.out.println("a'nın artırılmış hali: " + a); // a'nın artırılmış hali: 11
        a--; // a'yı 1 azaltır
        System.out.println("a'nın azaltılmış hali: " + a);  // yeni a'nın azaltılmış hali: 10

        // Çoklu Atama Operatörleri
        int c = 20;
        c += 5; // c = c + 5
        System.out.println("c'nin artırılmış hali: " + c); // c'nin artırılmış hali: 25
        c -= 10; // c = c - 10
        System.out.println("c'nin azaltılmış hali: " + c); // c'nin azaltılmış hali: 15
        c *= 2; // c = c * 2
        System.out.println("c'nin çarpılmış hali: " + c); // c'nin çarpılmış hali: 30
        c /= 3; // c = c / 3
        System.out.println("c'nin bölünmüş hali: " + c); // c'nin bölünmüş hali: 10
        c %= 4; // c = c % 4
        System.out.println("c'nin mod alınmış hali: " + c); // c'nin mod alınmış hali: 2

        //------------------------------------------
        // Bitwise Operatörler
        int x = 6; // 0000 0110 in binary
        int y = 3; // 0000 0011 in binary         

        // Bitwise AND
        int andResult = x & y; // 0000 0010 in binary
        System.out.println("Bitwise AND: " + andResult);

        // Bitwise OR
        int orResult = x | y; // 0000 0111 in binary
        System.out.println("Bitwise OR: " + orResult);

        // Bitwise XOR
        int xorResult = x ^ y; // 0000 0101 in binary
        System.out.println("Bitwise XOR: " + xorResult);

        // Bitwise NOT
        int notResult = ~x; // 1111 1001 in binary
        System.out.println("Bitwise NOT: " + notResult);

        // Shift Operatörler
        int shiftLeft = x << 1; // 0000 1100 in binary
        System.out.println("Shift Left: " + shiftLeft); // 0001 1000 in binary = 24

        int shiftRight = x >> 1; // 0000 0011 in binary
        System.out.println("Shift Right: " + shiftRight); // 0000 0011 in binary = 3

        int unsignedShiftRight = x >>> 1; // 0000 0011 in binary
        System.out.println("Unsigned Shift Right: " + unsignedShiftRight);

        //-------------------------------------------
        // İlişkisel Operatörler
        int m = 10;
        int n = 20;
        int o = 10;

        // Eşitlik
        boolean isEqual = (m == o); // true
        System.out.println("Eşitlik: " + isEqual);

        // Eşitsizlik
        boolean isNotEqual = (m != n); // true
        System.out.println("Eşitsizlik: " + isNotEqual);

        // Büyüktür
        boolean isGreater = (n > m); // true
        System.out.println("Büyüktür: " + isGreater);

        // Küçüktür
        boolean isLess = (m < n); // true
        System.out.println("Küçüktür: " + isLess);

        // Büyük veya eşittir 
        boolean isGreaterOrEqual = (m >= o); // true
        System.out.println("Büyük veya eşittir: " + isGreaterOrEqual);


        //-------------------------------------------
        // Mantıksal Operatörler
        boolean p = true;
        boolean q = false;

        // Mantıksal AND
        boolean andLogical = p && q; // false
        System.out.println("Mantıksal AND: " + andLogical);

        // Mantıksal OR
        boolean orLogical = p || q; // true
        System.out.println("Mantıksal OR: " + orLogical);

        // Mantıksal NOT
        boolean notLogical = !p; // false
        System.out.println("Mantıksal NOT: " + notLogical);

        // Mantıksal XOR
        boolean xorLogical = p ^ q; // true
        System.out.println("Mantıksal XOR: " + xorLogical); 

        // Ternary Operatör
        int age = 18;
        String result = (age >= 18) ? "Reşitsiniz" : "Reşit değilsiniz";
        System.out.println("Ternary Operatör Sonucu: " + result);   


    

    }
}
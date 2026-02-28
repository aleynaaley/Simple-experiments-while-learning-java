
public class calismaOrtami {
    public static void main(String[] args) {

        //byte  -128 ve 127 arası değer alabilir
        byte a = 125;
        System.out.println(a);
        
        //short -32768 ve 32767 arası değer alabilir
        short b = 32767;    
        System.out.println(b);

        //int -2147483648 ve 2147483647 arası değer alabilir . 9 basamağa kadar tam sayılar için kullanılır
        int c = 2147483647;
        System.out.println(c);      

        //long -9223372036854775808 ve 9223372036854775807 arası değer alabilir
        long d = 9223372036854775806L; // L harfi long
        long dd = Long.MAX_VALUE;
        System.out.println(d);
        System.out.println(dd); // Long.MAX_VALUE ile en büyük long değerini alabiliriz 

        //float 3.40282347E+38 ve -3.40282347E+38 arası değer alabilir
        float e = 3.40282347E+38F; // F harfi float
        float ee = Float.MAX_VALUE; // Float.MAX_VALUE ile en büyük float değerini alabiliriz
        float eee = Float.MIN_VALUE; // Float.MIN_VALUE ile en küçük float değerini alabiliriz

        System.out.println(e);
        System.out.println(ee);
        System.out.println(eee);

        //double 1.7976931348623157E+308 ve -1.7976931348623157E+308 arası değer alabilir
        double f = 1.7976931348623157E+308; // double
        System.out.println(f);  

        boolean g = true; // boolean sadece true veya false değerlerini alabilir
        boolean gg = 5 < 2;
        System.out.println(g);
        System.out.println(gg);

        char h = 'A'; // char tek karakter tutar ve tek tırnak içinde yazılır
        char hh = 65; // char ASCII değerlerini de tutabilir
        System.out.println(h);
        System.out.println(hh); 

        String i = "Hello World"; // String birden fazla karakter tutar ve çift tırnak içinde yazılır
        String ii = "Java Programming" + " is fun"; // String birleştirme işlemi yapılabilir
        System.out.println(i);
        System.out.println(ii); 

    }
}

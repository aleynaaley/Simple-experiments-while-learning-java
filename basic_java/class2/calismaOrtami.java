
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
        System.out.println(e);      

        //double 1.7976931348623157E+308 ve -1.7976931348623157E+308 arası değer alabilir
        double f = 1.7976931348623157E+308; // double
        System.out.println(f);  
    }
}

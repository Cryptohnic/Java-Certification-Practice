public class Main {
    public static void main(String[] args){
        /*
            Negative numbers in binary are created with the leading bit being a 1 and then the rest being represented-
            the same as normal except all the bits are flipped and then 1 is added. 
            This is called 2's complement and that is the method java uses for signed binary number storage.
         */ 
        byte a;
        a=10;
        System.out.println(a+=3);
        a=15;
        System.out.println(a-=3);
        a=20;
        System.out.println(a*=3);
        a=25;
        System.out.println(a/=3);
        a=30;
        System.out.println(a%=3);
        a=35;
        System.out.println(a&=3);
        a=40;
        System.out.println(a^=3);
        a=45;
        System.out.println(a|=3);
        a=50;
        System.out.println(a<<=3);
        a=55;
        System.out.println(a>>=3);
        a=60;
        System.out.println(a>>>=3);
        byte b=(byte)0b11111111;
        System.out.println(b);
    }    
}

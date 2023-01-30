public class Main {
    public static void main(String[] args){
        /*
            Negative numbers in binary are evaluated if the leading bit is a 1. Once java sees a 1 it will evaluate
            the rest of the byte by flipping all bits and adding 1 to the result and adding a negative sign.
            EX: a = 0b11111111
                b = -0b00000001
                a==b -> True
            This is called 2's complement and that is the method java uses for signed number storage.
            When using unsigned shift right the number is always cast to an int so using
            >>>= will always work the same as >>= on a byte because after it gets recasted back to a byte,
            since bytes can only shift a max of 7 times, any effect of zeroes added to the front gets truncated
            since only the last 8 bits are used.
            EX: a = 0b11111111
                a>>>1 -> 2147483647 (0b01111111111111111111111111111111 or max value of an int - no longer a byte)
                a>>>=1 -> -1
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
        System.out.println(b>>>1);
        System.out.println(b>>>=1);
        System.out.println(-0b00000001);
        System.out.println(false&false);
        byte c=0b00000001;
        System.out.println(~c);
    }    
}

public class Test {
    public static void main(String args[]){
        /*   
            All literals get converted to base 10 during evaluation.
            Chars being assigned a base 10 value will be converted to the ASCII character
            Cannot use multiple characters in single quotes for char assignment unless starting with \ to-
            create a literal such as \ for octal or \\u for unicode (without the first \)
            Only unicode requires 4 hex digits
            You can create literals by starting with 0 as octal, starting with 0x is hexadecimal, 0b binary.
            You can compare chars to literals because chars get turned into base 10 ASCII and literals get converted-
            to base 10 during evaluation.
            When using a zero and then a letter or no letter to create a literal, all leading zeros of the literal-
            can be ignored
            Strings take in literals as decimals rather than converting them to chars the same way concatinating an-
            int would add an int to the string rather than that int's ASCII character.
        */ 
        char A='A';
        System.out.println(A);
        A='\u0041';
        System.out.println(A);
        A=\u0041;
        System.out.println(A);
        A=0x41;
        System.out.println(A);
        A=65;
        System.out.println(A);
        A=0101;
        System.out.println(A);
        A='\101';
        System.out.println(A);
        A=0b1000001;
        System.out.println(A);
        System.out.println(A==65);
        System.out.println(A=='\101');
        System.out.println(A==0101);
        System.out.println(A==\u0041);
        System.out.println(A=='A');
        String B="";
        B+=0b1000010;
        System.out.println(B);
    }
}

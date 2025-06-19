//arithmetic operators
class Operators{
    public static void main(String[] args){
        int a=10;
        int b=20;
        System.out.println("a+b="+(a+b));
        System.out.println("a-b="+(a-b));
        System.out.println("a*b="+(a*b));
        System.out.println("a/b="+(a/b));
        System.out.println("a%b="+(a%b));
    }
}
//inc and dec
public class IncDec {
    static int increment(int x) { return ++x; }     
    static int decrement(int x) { return --x; }      
    public static void main(String[] args) {
        int a = 5;
        System.out.println("Original: " + a);
        a = increment(a);
        System.out.println("After increment: " + a);
        a = decrement(a);
        System.out.println("After decrement: " + a);
    }
}
//Equal or not
public class EqualOrNot {
    public static void main(String[] args) {
        int a = 10, b = 20;
        
        if (a == b) {
            System.out.println("a is equal to b");
        } 
        if (a != b) {
            System.out.println("a is not equal to b  ");
        } 
    }
}


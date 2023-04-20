import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Simple Interest Calculator

    Scanner sc = new Scanner(System.in);
    int p = sc.nextInt();
    int r = sc.nextInt();
    int t = sc.nextInt();

    int si = (p*r*t)/100;
    System.out.println("Simple Interest = " + si);
    
    // Inputs - Scanner
    /*
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    System.out.println(x*x);
    */

    // Constant in Java
    /*
    final int a = 1;
    System.out.println(a);

    a = 6;
    System.out.println(a);
    */
    
    // Typecasting
    /*
     * // Widening Tyepcasting
     * int a = 10;
     * long b = a;
     * // Explicit Typecastin
     * long c = 10000;
     * int d = (int)c;
     */

    // Strings in Java
    /*
     * String myString = "This is Java";
     * System.out.println(myString);
     * System.out.println(myString.charAt(2));
     */

    // Variables in Java;
    // int num = 10;
    // int num2 = 30;
    // int num3 = 90;

    // DataTypes -
    // Primitive - int, float, char, etc
    // Non-Primitive - string, arrays, user defined

    // char c = '6';
    // System.out.println(c);

    // long l = 30000000000000L;
    // System.out.println(l);
  }
}
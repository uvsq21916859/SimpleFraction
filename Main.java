public class Main {

    public static void main(String[] args) {
        System.out.println("hello world");
                
        Fraction a = new Fraction(12,8);
        double z = a.doubleValue(); 
        a.pgcd();
        System.out.println(z);
        System.out.println(a.toString());
    } 
}
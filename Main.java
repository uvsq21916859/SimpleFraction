public class Main {

    public static void main(String[] args) {
        System.out.println("hello world");
                
        Fraction a = new Fraction(1,8);
        Fraction o = new Fraction(1,5);

        System.out.println(a.addition(o).toString());
        double z = a.doubleValue(); 
        System.out.println(a.pgcd());

        System.out.println(z);
        System.out.println(a.toString());
        System.out.println(a.comparaison(o));
        a.TestESga(o);
    } 
}
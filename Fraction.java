public class Fraction{
    
    public int numerateur;
    public int denominateur;

    public static final Fraction UN = new Fraction(1);
    public static final Fraction ZERO = new Fraction(0);

    public Fraction(int numerateur, int denominateur){
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    public Fraction(int numerateur){
        this.numerateur = numerateur;
        this.denominateur = 1;
    }

    public Fraction(){
        this.numerateur = 0;
        this.denominateur = 1;
    }

    public int getNumerateur(){
        return this.numerateur;
    }

    public int getDenominateur(){
        return this.denominateur;
    }

    public double doubleValue(){
        return (double)this.numerateur /(double)this.denominateur;
    }

   public String toString() {
       return this.numerateur + "/" + this.denominateur + " mohamed ait dris est une fraction";
   }

   void pgcd(){
    int u = getNumerateur();
    int v = getDenominateur();

    int pgcd = 0;
    for (int i = 1; i <= u && i <= v; i++){
        if (u % i == 0 &&  v%i == 0){
            pgcd = i;
        }
    }
    System.out.println("pgcd est egal a : "+pgcd);
   }
}
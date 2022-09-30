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
       return this.numerateur + "/" + this.denominateur;
   }

   public int pgcd(){
    int u = getNumerateur();
    int v = getDenominateur();

    int pgcd = 0;
    for (int i = 1; i <= u && i <= v; i++){
        if (u % i == 0 &&  v%i == 0){
            pgcd = i;
        }
    }
    return pgcd;
   }

   public Fraction addition(Fraction i){
    
    int u,v;
    
    u = getNumerateur() * i.denominateur + i.numerateur * getDenominateur();
    v = getDenominateur() * i.denominateur;

    Fraction p = new Fraction(u,v);
    p.pgcd();

    return p;
   }

   void TestESga(Fraction u){
    int r = this.pgcd();
    int y = u.pgcd();

    int q = u.numerateur / y; int n = u.denominateur / y;
    int d = this.numerateur / r; int j = this.denominateur /r;

    assert q == d : "il ne sont pas egaux";
    assert n == j : "il ne sont pas egaux";

   }
}
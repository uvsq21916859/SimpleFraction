public class Fraction{
    
    public int numerateur;
    public int denominateur;

    public Fraction(int numerateur, int denominateur){
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    public Fraction(int numerateur){
        this.numerateur = numerateur;
        this.denominateur = 1;
    }


   public String toString() {
       return this.numerateur + "/" + this.denominateur + " mohamed ait dris est une fraction";
   }
}
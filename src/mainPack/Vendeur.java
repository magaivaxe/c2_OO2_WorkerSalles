
package mainPack;


public class Vendeur extends Employe
{
    private double taux;
    private double volume;

    public Vendeur(double taux, double volume, String nom, double salaire)
    {
        super(nom, salaire);
        this.taux = taux;
        this.volume = volume;
        setSalaire(salaire * this.taux + salaire);
    }

    public double getTaux()
    {
        return taux;
    }

    public double getVolume()
    {
        return volume;
    }
    
    
}

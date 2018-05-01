/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPack;

/**
 *
 * @author eleves
 */
public class Exec extends Employe
{
    private double bonus;

    public Exec(double bonus, String nom, double salaire)
    {
        super(nom, salaire);
        this.bonus = bonus;
        setSalaire(salaire + this.bonus);
    }
    
    public double getBonus()
    {
        return bonus;
    }

    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }
    
    
    
}

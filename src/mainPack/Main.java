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
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Vendeur veronica = new Vendeur(.1, 3000, "Verônica", 6000);
        Benevole brice = new Benevole("Brice");
        Exec marcos = new Exec(4000, "Marcos", 10000);
        
        System.out.println(veronica.toString());
        //the method override executes the method stanciated by the class even if 
        //the superclass method have the same name
        //Overloas is the method taht have the same name but different
        //paramethers
        System.out.println(brice.toString());
        System.out.println(marcos.toString());
        
        /*
         * Lorque A herite de B A herite tout qui sont public
        A peut surcharger les méthode publiqus de B qui ne sont pas 
        finales. Une methode finale = une methode qui ne peut pas etre
        changé.
        
        Questions:
        Que se passe-t-il si on déclare getNom() finale dans Employe
        Dans le main, on a ROdrigo, Daniel, Gustavo et alessandra
        Eomplye daniel_emplyoe = daniel;
        Benevole daniel_benevole = (Benevole) daniel_employe
        Exec daniel_exec = (Exec) daniel;
        Exec gustavo_exec = (Exec) Gustavo;
        
        Quelle methode est appelee
        daniel.getSalaire;
         */
    }
    
}

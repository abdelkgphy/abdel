/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abdelrahmane;

/**
 *
 * @author elghoulami
 */
public class Abdelrahmane {

    /**
     * @param args the command line arguments
     */
    static int i=0;
    public static void main(String[] args) {
        System.out.println("Hello world !");
        lapin lap = new lapin("Brian", 10);
        while(i<=10){
            lap.crie();
            i=i+1;
        }
    }
    
}

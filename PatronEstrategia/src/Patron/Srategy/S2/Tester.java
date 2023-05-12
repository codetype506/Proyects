/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Patron.Srategy.S2;

/**
 *
 * @author Mauricio
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        Duck modelo = new ModelDuck();
        modelo.display();
        modelo.performQuack();
        modelo.performFly();
        modelo.setFlyBehavior(new FlyRocketPowered());
        modelo.performFly();
        // TODO code application logic here
    }
    
}

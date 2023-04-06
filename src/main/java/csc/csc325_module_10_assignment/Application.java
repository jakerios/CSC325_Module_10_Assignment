/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csc.csc325_module_10_assignment;

/**
 *
 * @author jam01
 */
public class Application {
    //Application class to describe the clothing
    private Tops top;
    private Pants pant;
    private Shoes shoe;
    
    public Application(GarmentFactory factory) {
        top = factory.buyTops();
        pant = factory.buyPants();
        shoe = factory.buyShoes();
    }
    
    public void revealDescription() {
        System.out.println("You purchased:");
        top.itemDescription();
        pant.itemDescription();
        shoe.itemDescription();
    }
}

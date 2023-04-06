/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csc.csc325_module_10_assignment;

/**
 *
 * @author jam01
 */
public class PartyFactory implements GarmentFactory {
    //Overrides GarmentFactory, can create new specific clothing objects
    
    @Override
    public Tops buyTops() {
        return new PartyTops();
    }
    
    @Override
    public Pants buyPants() {
        return new PartyPants();
    }
    
    @Override
    public Shoes buyShoes() {
        return new PartyShoes();
    }
}

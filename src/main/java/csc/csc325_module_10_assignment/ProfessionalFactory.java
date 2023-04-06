/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csc.csc325_module_10_assignment;

/**
 *
 * @author jam01
 */
public class ProfessionalFactory implements GarmentFactory{
    //Overrides GarmentFactory, can create new specific clothing objects
    
    @Override
    public Tops buyTops() {
        return new ProfessionalTops();
    }
    
    @Override
    public Pants buyPants() {
        return new ProfessionalPants();
    }
    
    @Override
    public Shoes buyShoes() {
        return new ProfessionalShoes();
    }
}

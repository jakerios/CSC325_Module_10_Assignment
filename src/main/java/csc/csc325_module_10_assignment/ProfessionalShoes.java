/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csc.csc325_module_10_assignment;

/**
 *
 * @author jam01
 */
public class ProfessionalShoes implements Shoes {
    //Overrides the Shoes interface and gives a specific item description
    
    @Override
    public void itemDescription() {
        System.out.println("A professional pair of shoes for fancier events");
    }
}

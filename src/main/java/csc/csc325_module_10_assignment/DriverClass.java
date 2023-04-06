/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csc.csc325_module_10_assignment;

import java.util.Scanner;

/**
 *
 * @author jam01
 */
public class DriverClass {
    
    private static Application configureApplication() {
        
        Application app;
        GarmentFactory factory;
        
        Scanner kboard = new Scanner(System.in);
        System.out.print("Enter the style of outift you would like to buy: ");
        String x = kboard.nextLine();
        
        if(x.contains("Professional")) {
            factory = new ProfessionalFactory();
            app = new Application(factory);
        } else if(x.contains("Casual")) {
            factory = new CasualFactory();
            app = new Application(factory);
        } else {
            factory = new PartyFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.revealDescription();
    }
}

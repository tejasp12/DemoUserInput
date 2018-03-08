/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demouserinput;
import java.util.Scanner;

/**
 *
 * @author Vidyadeep
 */
public class DemoUserInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        *We are going to create the object of the scanner class.
        */
        Scanner newScanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        //This method reads the number provided by the user.
        int num = newScanner.nextInt();
        //Closing scanner after use.
        newScanner.close();
        //Displaying the number provided by the user.
        System.out.println("The number you have provided is: "+num);
    }
    
}

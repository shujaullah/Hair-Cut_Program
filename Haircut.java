/*
 * Name: Shujaullah Ahsan
 * Programming project:1
 * Course: CSI233 (Fall 2018)
 * Date: November,3, 2018
 */


import java.util.*;  // for Scanner

public class Haircut{
    // String for the hair style for the haircut.
    static String hairStyle;
    
    // charcter for the measurement in the haircut
    static char measurement;
    
    // declaring the constant for the inches to i.
    static final char INCH_VAL = 'i';
    
    // declaring character g as the constant for guard calculation.
    static final char GUARD_VAL = 'g';
    
    //  variaccbles for the  top of the haircut
    // sides in the haircut
    // back in the haircut.
    static double Top, Sides, Back;

    public static void main(String []args)
    {
         // Allow the user the input for the hairstyle.
         Scanner console = new Scanner(System.in);
         
         // Display the name of the hairstyle
         System.out.println("Choosehairstyle from the following options:" + "\n Bob \n buzz cut" + 
         "\n crew cut \n mohawk \n mullet \n natural");
         // Prompt the user to enter hair style
         System.out.print("Enter Style: ");
         hairStyle = console.nextLine().toLowerCase();
      
         /*
         length in the inches for the each hair cut.
         
         HairStyle   Top      Sides    Back
         Bob         5        5        5
         Buzz cut    0.125    0.125    0.125
         Crew cut    1        0.125    0.125
         Mohawk      3        0.125    3
         Mullet      2        1        6
         Natural     0.5      0.25     0.25
         
         
         */   
         
                  
         // The switch statemnet will assign the  value to the top, sides and back the value accordinng
         // to the  hairstyle enter by the user. The values come from the table above in comments.
         switch (hairStyle) {
         
            case "bob": // bob cut
                 Top = 5;
                 Sides = 5;
                 Back = 5;
                 break;
            case "buzz cut":  // buzz cut
                Top = 0.125;
                Sides = 0.125;
                Back = 0.125;
                break;
            case "crew cut": // crew cut
                Top = 1;
                Sides = 0.125;
                Back = 0.125;
                break; 
            case "mohawk":  // mohawk cut
                Top = 3;
                Sides = 0.125;
                Back = 3;
                break;
            case "mullet": // mullet cut
                Top = 2;
                Sides = 1;
                Back = 6;
                break;
            case "natural":  // natural cut
                Top = 0.5;
                Sides = 0.25;
                Back = 0.25;
                break;
               
            default:
               // If the haircut not in the list it prompt user unknown haircut.
               System.out.printf("Unknown haircut style \"%s\"", hairStyle);
               System.exit(0); 
           
          

            
         } 
         
         // Prompt the user for the measurement of the hair style.
         //It will be in inches or in the Guard number  for the electric clippers.
         
         System.out.print("Choose the measurement (i=inches, g=guard #): ");
         measurement = console.next().charAt(0);
         
         //The guard table is as follows:
         
         /*
         Guard#   Length(inches)
         1        0.125
         2        0.25
         3        0.375
         4        0.5
         5        0.625
         6        0.75
         7        0.875
         8        1
         9        1.25
         
         */
         
         // This if statment checking for the valid input by the user fpr measurment.
         // If its true it runs the calculation for inches or guard value.
         
         if ((measurement == GUARD_VAL )|| (measurement == INCH_VAL))
         {
            //The guard number table is increase by 0.125 inches by a guard number 1 to 9
            // so the calculation respective value for top, side and back
            // get divide by 0.125 in order to get the guard number.  
            // Variale for the calculating the guard number for the
            // top, sides and back for the hair style.             
            double topG1, sidesG2, backG3;
            // Calculating the guard number for the top ogf the hair style.
            topG1= Top/0.125;
            // Calculating the guard number for the sides of the hair style.
            sidesG2 = Sides/0.125;
            //  Calculating the guard number for the back  of the hair style.
            backG3= Back/0.125;
   
            System.out.printf("Instructure:\n");
            //This  if else statements determine the  if themeaseuremnt in guard
            // and The value of top, sides and back of hairstyle should be less or equal then 9.
            //Because the clippers just have guard number 1 to 9.
            // if greater then 9  it should be come in inches as from the inches table.
            
            // checking for the guard value for the top.
            if ((measurement == GUARD_VAL) && (topG1 <= 9))
                  // if the length in range  it print the guard value of respective length.
                  System.out.printf("Top   : #%.0f guard\n",topG1);
            else{ 
                  // The boolean to check the  value of top should be less then 1 
                  // or  greater then 1 for outputing inches or inch.
                  // it is the bonus part 2.
                  boolean unit = (Top < 1 || Top > 1);
                  //bonus 1 part This print out the value in with three decimal places with units are allign
                  // also the use of the connditional operator for the unit printout label inch or inches.
                  // Output the  lenght for the top of hair style in inch or inches
                  
                  System.out.printf("Top   : %.3f" + (unit ? " inches\n" : " inch\n"), Top);
                  //System.out.print((unit ? " inches\n" : " inch\n"));
                }
            // checking for the guard value for the sides.      
            if ((measurement == GUARD_VAL) && (sidesG2 <= 9))
                  // if the length in range  it print the guard value of respective length.
                  System.out.printf("Sides : #%.0f guard\n",sidesG2);
            else{
            
                  // The boolean to check the  value of sides should be less then 1 
                  // or  greater then 1 for outputing inches or inch.
                  // it is the bonus part 2.
 
                  boolean unit = (Sides < 1 || Sides > 1);
                  
                  //bonus 1 part This print out the value in with three decimal places with units are allign
                  // also the use of the connditional operator for the unit printout label inch or inches.
                  // Output the  lenght for the sides of hair style in inch or inches.
                  
                  System.out.printf("Sides : %.3f" + (unit ? " inches\n" : " inch\n"), Sides);
                  //System.out.print((unit ? " inches\n" : " inch\n"));
                }
            // checking for the guard value for the back.    
            if ((measurement == GUARD_VAL) && (backG3 <= 9))
                  // if the length in range  it print the guard value of respective length.
                  System.out.printf("Back  : #%.0f guard\n",backG3);
            else {
                  // The boolean to check the  value of sides should be less then 1 
                  // or  greater then 1 for outputing inches or inch.
                  // it is the bonus part 2.

                  boolean unit = (Back < 1 || Back > 1);
                  
                  //bonus 1 part This print out the value in with three decimal places with units are allign
                  // also the use of the connditional operator for the unit printout label inch or inches.
                  // Output the  lenght for the sides of hair style in inch or inches.
                  
                  System.out.printf("Back  : %.3f" + (unit ? " inches\n" : " inch\n"), Back);
                  //System.out.print((unit ? " inches\n" : " inch\n"));
                 }
            }
           // if the user input invalid measurement prompt the user invalid measurement.
           else 
              System.out.printf("Invalid measurement \"%c\"", measurement);
      
                 
         

     }
}

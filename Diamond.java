import java.util.Scanner;

class Diamond {
    public static void main(String[] args) {
        System.out.println("\t!  Pattern Printing  ! \n");
            for (int i=1; i<6; i++) {
                for (int j=2; j<=5-i+1;j++) {     // for Spaces
                    System.out.print(" ");
                }
                
                for (int j=1; j<=i; j++) {    // for stars
                    System.out.print("* ");
                }
                System.out.println();
            }
            
            for (int i = 4; i > 0; i--) {
                 for (int j = 1; j <= 5 - i ;j++) {
                    System.out.print(" ");
                }
                for (int k = i; k > 0; k--) {
                    System.out.print("* ");
                }
                System.out.println();
               
            }
    }
}           

/*     !  Pattern Printing  ! for below pattern

    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    *     */
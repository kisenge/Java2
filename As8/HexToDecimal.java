/**
 This class represents the test converting Hex numbers to decimal.
 @author Kisenge Mbaga
 */
import java.util.Scanner;
import java.lang.IllegalArgumentException;
public class HexToDecimal{
  public static void main(String[] args){

  try{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter hex value");
    String hex = sc.nextLine();
    System.out.println();
    System.out.println("Decimal Value for the hex number is " + hexRecursive(hex));
    }

    catch (IllegalArgumentException e) {
      System.out.println("The input was invalid.");

  }
}

  /**
  recursive static method
  @param hexInput the hex string input
  @return decimal value
  */
  private static int hexRecursive(String hexInput){
        int dec = 0;
        String hexCode = "0123456789ABCDEF";
        hexInput = hexInput.toUpperCase();
        
        int length = hexInput.length();
        if (length > 0) {
            char ch = hexInput.charAt(0);

            int dig = hexCode.indexOf(ch);
            if(dig==-1){
              throw new IllegalArgumentException("The input is invalid.");
            }
            String shortened = hexInput.substring(1);
            dec = dig * (int) Math.pow(16, length - 1) + hexRecursive(shortened);
        }
        return dec;
    }

  
}
  
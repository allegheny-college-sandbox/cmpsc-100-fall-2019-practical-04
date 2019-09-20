package gatorcash;

/** This class gives the gator as few coins as possible.
 *
 * @author Douglas Luman
 */
public class MinCoins {
  
  /** This is program's the entry point.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    /* 
     * Accept 1 argument as a double, turn it into an integer;
     * multiply by 100 to get the value in cents, rather than
     * dollars. Currency being base 10 is wonderful.
     */
    int inputValue;
    int totalCents;
    inputValue = totalCents = (int)(Double.parseDouble(args[0]) * 100);
    /*
    /*
     * Because we only care about the coins, remove the amount
     * of dollar bills required.
     */
    int dollars = totalCents / 100;
    totalCents -= dollars * 100;
    /*
     * "Initialize," or "create" the variable which will hold the
     * number of coins required at any given step.
     */
    int totalCoins = 0;
    // Calculate the number of coins per type.
    int quarters = totalCents / 25;
    totalCents -= quarters * 25;
    totalCoins += quarters;
    int dimes = totalCents / 10;
    totalCents -= dimes * 10;
    totalCoins += dimes;
    int nickels = totalCents / 5;
    totalCents -= nickels * 5;
    totalCoins += nickels;
    int pennies = totalCents;
    totalCoins += pennies;
    // Print the number of coins in the nice list.
    System.out.println("Original value:\t" + inputValue / 100.0);
    System.out.println("Minimum coins:\t" + totalCoins);
    System.out.println("Quarters:\t" + quarters);
    System.out.println("Dimes:\t\t" + dimes);
    System.out.println("Nickels:\t" + nickels);
    System.out.println("Pennies:\t" + pennies);
  }
}
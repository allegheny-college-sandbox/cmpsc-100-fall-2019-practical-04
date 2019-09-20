package gatorcash;

/** This class gives the gator as few coins as possible.
 *
 * @author {YOUR NAME HERE}
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
    int totalCents = (int)(Double.parseDouble(args[0]) * 100);
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
    /*
     * TODO Implement count of various coins to determine
     * the smallest amount necessary to represent the value.
     */
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
    /*
     * TODO Print both the number of coins required and a breakdown
     * of how many of each coin G Wiz will receive in a "pretty,"
     * aligned list.
     */
    System.out.println("The minimum number of coins required is: " + totalCoins);
    System.out.println("Quarters: " + quarters);
    System.out.println("Dimes:\t\t" + dimes);
    System.out.println("Nickels:\t" + nickels);
    System.out.println("Pennies:\t" + pennies);
  }
}
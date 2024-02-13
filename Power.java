class Power extends ConsoleProgram {

  /**
  * A program Power.java that takes in two numbers a and b and calculates a^b
  * @author:
  */
  
  public void run() {
    
    // Declare variables
    int intBase;
    int intExponent;
    double dblPower;

    // Get base and exponent from user
    intBase = readInt("Enter the base: ");
    intExponent = readInt("Enter the exponent: ");
    
    // Calculate the base^exponent
    dblPower = Math.pow(intBase, intExponent);

    // Output results
    System.out.println(intBase + " to the power of " + intExponent + " is " + dblPower);
  }
}
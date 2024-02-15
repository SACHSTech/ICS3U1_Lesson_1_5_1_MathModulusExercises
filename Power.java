class Power extends ConsoleProgram {

  /**
  * this code takes one number and puts it to the power of the second number
  * @author:N.Judd
  */
  
  public void run() {
    // declare variables
    double dblBase;
    double dblEx;
    double dblAns;

    // receive input
    dblBase = readDouble("Enter a number as the base: ");
    dblEx = readDouble ("Enter a number as the exponent ");

    // calculate Answer
    dblAns = Math.pow(dblBase, dblEx);

    // output
    System.out.println(dblBase + " to the power of " + dblEx + " is " + dblAns);
  }
}
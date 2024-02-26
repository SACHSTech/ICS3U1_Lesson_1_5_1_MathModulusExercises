class Rads extends ConsoleProgram {

  /**
  * This code converts degrees to radians
  * @author:N.Judd
  */
  
  public void run() {
    // declare variables
    int intDegrees;
    double dblRadian;

    // get number of degrees
    intDegrees = readInt("What is the number of degrees? ");

    // calculate number of radians
    dblRadian = intDegrees * (Math.PI / 180);

    // output results
    System.out.println(intDegrees + " degrees is " + dblRadian + " radians");
  }
}
class Rads extends ConsoleProgram {

  /**
  * A program Rads.java that converts degrees to radians
  * @author:
  */
  
  public void run() {
    // Declare variables
    double dblDegrees;
    double dblRadians;

    // Get degrees from user
    dblDegrees = readDouble("Enter the angle in degrees: ");

    // Calculate radians
    dblRadians = dblDegrees * Math.PI / 180;
    
    // Output radians
    System.out.println(dblDegrees + " degrees = " + dblRadians + " radians");
  }
}
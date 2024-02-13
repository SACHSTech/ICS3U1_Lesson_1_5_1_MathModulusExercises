class Circumference extends ConsoleProgram {

  /**
  * A program Circumference.java that calculates the circumference
  * of a circle given a radius.
  * @author:
  */
  
  public void run() {
    // Declare variables
    double dblRadius;
    double dblCircumference;

    // Get radius from user
    dblRadius = readDouble("Enter the radius of the circle: ");

    // Calculation circumeference = 2*pi*r
    dblCircumference = 2 * Math.PI * dblRadius;

    // Output results
    System.out.println("The circumference of the circle is: " + dblCircumference);
  }
}
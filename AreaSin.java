class AreaSin extends ConsoleProgram {

  /**
  * A program AreaSin.java that calculates the area of a triangle given
  * two sides and the contained angle
  * @author: C. Chen
  */
  
  public void run() {
    
    // Declare variables
    double dblSideA;
    double dblSideB;
    double dblAngleC;
    double dblArea;

    // Get side A, side B, and angle C from user
    dblSideA = readDouble("Enter the length of Side A: ");
    dblSideB = readDouble("Enter the length of side B: ");
    dblAngleC = readDouble("Enter the angle of the contained angle C: ");

    // Calculate the area using A = (a*b*sinC)/2
    dblArea = (dblSideA*dblSideB*Math.sin(dblAngleC)) / 2;

    // Output results
    System.out.println("The area of the traingle is " + dblArea);
  }
}
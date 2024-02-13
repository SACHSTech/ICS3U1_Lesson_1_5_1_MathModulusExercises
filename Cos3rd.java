class Cos3rd extends ConsoleProgram {

  /**
  * A program Cos3rd.java that calculates the third side of a triangle using cosine law
  * @author: C. Chen
  */
  
  public void run() {
    
    // Declare variables
    double dblSideA;
    double dblSideB;
    double dblSideC;
    double dblAngleC;

    // Get side A, side B, and angle C from user
    dblSideA = readDouble("Enter the length of Side A: ");
    dblSideB = readDouble("Enter the length of side B: ");
    dblAngleC = readDouble("Enter the angle of the contained angle C: ");

    // Calculate Side C using cosine law
    dblSideC = Math.sqrt((Math.pow(dblSideA, 2)) + Math.pow(dblSideB, 2) - (2*dblSideA*dblSideB*Math.cos(dblAngleC)));

    // Output results
    System.out.println("The length of the third side of the triangle is: " + dblSideC);

  }
}
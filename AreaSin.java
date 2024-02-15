class AreaSin extends ConsoleProgram {

  /**
  * This code calculates the area of a triangle
  * @author:N.Judd
  */
  
  public void run() {
    // declare variables
    double dblSideA;
    double dblSideB;
    double dblAngleC;
    double dblArea;

    // get input
    dblSideA = readInt("What is the length of side A in centimeters? ");
    dblSideB = readInt("What is the length of side B in centimeters? ");
    dblAngleC = readInt("What is the angle of angle C in radians? ");

    // calculate the area
    dblArea = (dblSideA * dblSideB * Math.sin(dblAngleC)) / 2;

    // output
    System.out.println("The area of the triangle is " + dblArea + " squared centimeters");
  }
}
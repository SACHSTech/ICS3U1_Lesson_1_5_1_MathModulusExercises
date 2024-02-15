class Cos3rd extends ConsoleProgram {

  /**
  * This code calculates side C of a triangle
  * @author:N.Judd
  */
  
  public void run() {
    // define variables
    int intSideA;
    int intSideB;
    double dblSideC;
    int intAngleC;

    // get input
    intSideA = readInt("What is the length of side A in centimeters? ");
    intSideB = readInt("What is the length of side B in centimeters? ");
    intAngleC = readInt("What is the angle of angle C in degrees? ");

    // calculate side C
    dblSideC = Math.sqrt(intSideA * intSideA + intSideB * intSideB - 2 * intSideA * intSideB * Math.cos(intAngleC));

    // output
    System.out.println("Side C of the triangle is " + dblSideC + " centimeters");
  }
}
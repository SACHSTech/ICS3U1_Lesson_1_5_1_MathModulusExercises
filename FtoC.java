class FtoC extends ConsoleProgram {

  /**
  * converts fahrenheit to celsius
  * @author:N.Judd
  */
  
  public void run() {
    // declare variables 
    double dblF;
    double dblC;

    // get input
    dblF = readDouble("What is a degree measure in farhenheit? ");

    // calulate celsius
    dblC = (5.0 / 9.0) * (dblF - 32);

    // output
    System.out.println(dblF + " degrees farhenheit is " + dblC + " degrees celsius");
  }
}
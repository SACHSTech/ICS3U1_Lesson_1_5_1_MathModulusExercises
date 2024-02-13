class FtoC extends ConsoleProgram {

  /**
  * A program FtoC.java that converts Fahrenheit to Celsius
  * @author: C. Chen
  */
  
  public void run() {
    
    // Declare variables
    double dblFahrenheit;
    double dblCelsius;

    // Get Fahrenheit from user
    dblFahrenheit = readDouble("Enter the temperature in Fahrenheit: ");

    // Calculate celsius: C = (5/9)(F - 32)
    dblCelsius = (5.0/9) * (dblFahrenheit-32);

    // Output results
    System.out.println("The temperature in Celsius is " + dblCelsius + " degrees.");
  }
}
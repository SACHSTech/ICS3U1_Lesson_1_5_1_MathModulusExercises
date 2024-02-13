class Hours extends ConsoleProgram {

  /**
  * A Program Hours.java that converts hours to days and hours
  * @author: C. Chen
  */
  
  public void run() {
    
    // Declare variables
    int intTotalHours;
    int intDays;
    int intHours;

    // Get values for hours
    intTotalHours = readInt("Enter the total number of hours: ");

    // Calculations
    intDays = intTotalHours / 24;
    intHours = intTotalHours % 24;

    // Output
    System.out.println(intTotalHours + " Hours = " + intDays + " days and " + intHours + " hours");
    
  }
}
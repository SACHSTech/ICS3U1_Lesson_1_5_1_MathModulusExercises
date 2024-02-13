class Minutes extends ConsoleProgram {

  /**
  * A program Minutes.java that convers mintues to days, hours, and minutes
  * @author: C. Chen
  */
  
  public void run() {
    // Declare variables
    int intTotalMinutes;
    int intDays;
    int intHours;
    int intMinutes;

    // Get minutes from user
    intTotalMinutes = readInt("Enter the number of minutes: ");

    // Calculate number of days, hours, and minutes
    intDays = intTotalMinutes / 1440;
    intHours = (intTotalMinutes % 1440) / 60;
    intMinutes = (intTotalMinutes % 1440) % 60;

    // Output conversion
    System.out.println(intTotalMinutes + " minutes = " + 
                      intDays + " day(s), " + 
                      intHours + " hour(s) and " + 
                      intMinutes + " minute(s)");
  }
}
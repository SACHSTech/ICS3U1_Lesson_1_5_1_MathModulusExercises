class KM_to_Miles extends ConsoleProgram {

    /**
    * A program KM_to_Miles.java that converts km to miles
    * @author: C. Chen
    */
    
    public void run() {
      
        // Declare variables
        double dblDistanceKM;
        double dblDistanceMiles;

        // Get distance in kilometers 
        dblDistanceKM = readDouble("Enter the number of kilometers: ");

        // Calculate the number of miles
        dblDistanceMiles = dblDistanceKM * 0.621371;

        // Output results
        System.out.println("The total distance in miles is: " + dblDistanceMiles);
    }
  }
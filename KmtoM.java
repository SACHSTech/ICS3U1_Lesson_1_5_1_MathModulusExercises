class KmtoM extends ConsoleProgram {

    /**
    * converts kilometers into miles
    * @author:N.Judd
    */
    
    public void run() {
      // declare variables
      double dblKm;
      double dblM;

      // receive input
      dblKm = readDouble("Enter a distance in killometers: ");

      // calculate miles
      dblM = dblKm * 0.621371;

      // output
      System.out.println(dblKm + " killometers is " + dblM + " miles");
    }
  }
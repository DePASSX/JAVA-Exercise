class Car
{
   private int curSpeed;
   private int maxSpeed;
   private String reg;

   /** Create a new car object, but only if we are given the values we
    ** need to initialize our new object into a consistent  state.
    ** @param c Current speed of the car.
    ** @param m Maximum speed of the car.
    ** @param r Registration number of the car.
    */
   public Car(int c, int m, String r)
   {
      curSpeed = c;
      maxSpeed = m;
      reg = r;
   }

   /** Speed up.  If trying to increase beyond maximum speed, it will instead print an error message to stderr and not change speed.
    ** @param dv Amount to increase by; must be >= 0, otherwise prints error to STDERR and leaves speed unchanged.
    */
   public void accelerate(int dv)
   {
      if(dv < 0)
      {
	 System.err.println("Car::accelerate: dv less than zero, " + dv);
	 return;
      }
      
      if(curSpeed + dv <= maxSpeed)
      {
	 curSpeed = curSpeed + dv;
      }
      else
      {
	 System.err.println("Car::accelerate: unable to accelerate beyond maximum speed, " + (curSpeed + dv) + " > " + maxSpeed);
      }
   }
   
   /** Slow down
    ** @param dv Amount to decrease by; must be >= 0, otherwise prints error to STDERR and leaves speed unchanged.
    */
   public void decelerate(int dv)
   {
      if(dv < 0)
      {
	 System.err.println("Car::decelerate: dv less than zero, " + dv);
	 return;
      }
      
      if(curSpeed - dv >= 0)
      {
	 curSpeed = curSpeed - dv;
      }
      else
      {
	 System.err.println("Car::decelerate: unable to reduce speed below zero, " + (curSpeed - dv) + " < 0");
      }
   }

}

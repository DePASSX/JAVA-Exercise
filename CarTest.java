class CarTest
{

   public static void main(String[] args)
   {
      Car a, c;
      a = new Car(20, 50, "NB1234");
      a.accelerate(20);

      Car b = new Car(1, 2, "VERY SLOW");
      c = new Car(10, 123456, "My Car");

      b.decelerate(1);
      c.decelerate(3);
      
      b.accelerate(500);   // should print out a error

   }
   
}

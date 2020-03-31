package be.intecbrussel.eatbles;

import java.util.Arrays;

public class Cone implements Eatable {
      private  Flavor [] balls;



        public Cone(){}

    @Override
    public void eat() {


        System.out.println(" YOUR ARE EATING Cobe whith flavor" );
        for (Flavor ball : balls)
            System.out.println(ball);

    }

     // public Cone(Flavor[] balls) {


           // Flavor [] balls1 = new Flavor[8];
//            balls1 [0] = Flavor.CHOCOLATE;
//            balls1 [1] = Flavor.BANANA;
//            balls1 [2] = Flavor.LEMON;
//            balls1 [3] = Flavor.MOKKA;
//            balls1 [4] = Flavor.PISTACHE;
//            balls1 [5] = Flavor.STRACIATELLA;
//            balls1 [6] = Flavor.VANILLA;
//            balls1 [7] = Flavor.STRAWBERRY;

            ;

//           for( int i = 0 ; i <balls.length; i++ ){
//              // balls    [i] = Flavor.valueOf(String.valueOf(i)) ;
//               System.out.println(balls[i]);


    public Cone(Flavor[] balls) {
        this.balls = balls;
    }






    public enum Flavor{
                        STRAWBERRY,
                        BANANA,
                        CHOCOLATE,
                        VANILLA,
                        LEMON,
                        STRACIATELLA,
                        MOKKA,
                     PISTACHE



    }

    @Override
    public String toString() {
        return "Cone{" +
                "balls=" + Arrays.toString(balls) +
                '}';
    }
}

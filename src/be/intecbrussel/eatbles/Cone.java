package be.intecbrussel.eatbles;

import java.util.Arrays;

public class Cone implements Eatable {
      private  Flavor [] balls;



        public Cone(){}


        public Cone(Flavor[] balls) {

            this.balls = balls;
        }


    @Override
    public void eat() {


        System.out.println(" YOUR ARE EATING Hoorntje met smaak  " + Arrays.toString(balls) );
//        for (Flavor ball : balls)
//            System.out.println(ball);

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


}

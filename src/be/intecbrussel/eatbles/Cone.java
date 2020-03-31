package be.intecbrussel.eatbles;

import java.util.Arrays;

public class Cone implements Eatable {
      private  Flavor [] balls;



        public Cone(){}

    @Override
    public void eat() {


        System.out.println(" YOUR ARE EATING Cone whith flavor" );
        for (Flavor ball : balls)
            System.out.println(ball);

    }



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

package be.intecbrussel.eatbles;

public class Cone implements Eatable {
      public  Flavor [] balls;



        public Cone(){}


        public Cone(Flavor[] balls) {

            this.balls = balls;
        }


    @Override
    public void eat() {


        System.out.println(" YOUR ARE EATING Hoorntje met smaak  "+ this.balls.length    );
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

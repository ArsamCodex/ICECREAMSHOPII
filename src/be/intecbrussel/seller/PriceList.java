package be.intecbrussel.seller;

import be.intecbrussel.eatbles.Magnum.MagnumType;


public class PriceList {
    private double ballPrice;
    private double rocketPrice;
    private double magnumStandardPrice;

//    public PriceList() {
//       this.magnumStandardPrice = 1.50;
//    }

    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumStandardPrice = magnumStandardPrice;
    }


    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public double getBallPrice() {
        return ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }


    public double getMagnumPrice(MagnumType magnumType) {

        double magnumprice;
        if(magnumType != MagnumType.ALPINENUTS || magnumType!= MagnumType.ROMANTICSTRAWBERRI){
                magnumprice = this.magnumStandardPrice ;
        } else  {magnumprice = this.magnumStandardPrice * 1.50;}
                    return magnumprice;

//        switch (magnumType) {
//            case ALPINENUTS:
//            case BLACKCHOCOLATE:
//            case MILKCHOCOLATE:
//            case ROMANTICSTRAWBERRI: return magnumStandardPrice * 2.0;
//
//            case WHITECHOCOLATE: return magnumStandardPrice;
//
//        }
//
//        return 0 ;
    }
        public double arii(){
            double i = magnumStandardPrice + ballPrice + rocketPrice ;
            return getBallPrice();


        }
    @Override
    public String toString() {
        return "PriceList{" +
                "ballPrice=" + ballPrice +
                ", rocketPrice=" + rocketPrice +
                ", magnumStandardPrice=" + magnumStandardPrice +
                '}';
    }
}




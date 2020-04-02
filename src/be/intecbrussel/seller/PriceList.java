package be.intecbrussel.seller;

import be.intecbrussel.eatbles.Magnum.MagnumType;


public class PriceList {
    private double ballPrice;
    private  double rocketPrice;
    private double magnumStandardPrice;

    public PriceList() {
        this.magnumStandardPrice =1.50;
    }

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

        switch (magnumType) {
            case ALPINENUTS:
                magnumStandardPrice *= 1.50;
                break;
            case BLACKCHOCOLATE:
            case MILKCHOCOLATE:
            case ROMANTICSTRAWBERRI:
                magnumStandardPrice *= 1.0;
                break;
            case WHITECHOCOLATE:
                magnumStandardPrice= magnumStandardPrice;
                break;
        }
        return magnumStandardPrice  ;
    }

}

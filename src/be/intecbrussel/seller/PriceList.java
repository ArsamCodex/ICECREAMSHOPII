package be.intecbrussel.seller;

import be.intecbrussel.eatbles.Magnum.MagnumType;


public class PriceList {
    private double ballPrice;
    private  double rocketPrice;
    private double magnumStandardPrice;

    public PriceList() {
        this(0,0,0);
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

        double magnumPrice = magnumStandardPrice;
        switch (magnumType) {
            case ALPINENUTS:
                magnumPrice *= 1.3;
                break;
            case BLACKCHOCOLATE:
                magnumPrice *= 1;
                break;
            case MILKCHOCOLATE:
                magnumPrice *= 1;
                break;
            case WHITECHOCOLATE:
                magnumPrice *= 1;
                break;
            case ROMANTICSTRAWBERRI:
                magnumPrice *= 1.6;
                break;
        }
        return magnumPrice;
    }
    @Override
    public String toString() {
        return


                "Prijslijst{" +
                "ballPrice=" + ballPrice +
                ", rocketPrice=" + rocketPrice +
                ", magnumStandardPrice=" + magnumStandardPrice +
                '}';
    }
}

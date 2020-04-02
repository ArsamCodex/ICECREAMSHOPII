package be.intecbrussel.seller;

import be.intecbrussel.eatbles.Cone;
import be.intecbrussel.eatbles.IceRocket;
import be.intecbrussel.eatbles.Magnum;


public class IceCreamSalon implements IceCreamSeller {

    private PriceList pricelist ;
    private double totalProfit ;


    @Override
    public double getProfit() {
        return totalProfit;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavor) {

        totalProfit += (flavor != null && flavor.length > 0) ? (pricelist.getRocketPrice() * flavor.length) : pricelist.getBallPrice();
        return new Cone(flavor);
        // Hier deze method return a new CONE ( HOORNTJE)
    }
    @Override
    public IceRocket orderIceRocket(){
        totalProfit += pricelist.getRocketPrice();
        return new IceRocket();
        // hier return a New IceRocket  Dus a new object


    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumType) {
        // HIer met deze method gan we totalproFit berekenenn en
        // new Magnum Object terug geven 




    @Override
    public String toString() {
        return "IceCreamSalon{" +
                "pricelist=" + pricelist +
                ", totalProfit=" + totalProfit +
                '}';
    }
}

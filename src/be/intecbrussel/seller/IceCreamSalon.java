package be.intecbrussel.seller;

import be.intecbrussel.eatbles.Cone;
import be.intecbrussel.eatbles.IceRocket;
import be.intecbrussel.eatbles.Magnum;


public class IceCreamSalon implements IceCreamSeller {

    private PriceList pricelist ;
    private double totalProfit = 0;

    public IceCreamSalon(PriceList pricelist) {
        this.pricelist = pricelist;
    }

    @Override
    public double getProfit() {
        return this.totalProfit ;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavor) {
        System.out.println(" new order");
        totalProfit += pricelist.getBallPrice();
        return  new Cone();
    }
    @Override
    public IceRocket orderIceRocket(){
        System.out.println("new ice rcket");
        totalProfit += pricelist.getRocketPrice();
        return  new IceRocket();

//        totalProfit += pricelist.getRocketPrice();
//        return new IceRocket();
        // hier return a New IceRocket  Dus a new object


    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumType) {

        System.out.println("nw order magmum");
        totalProfit += pricelist.getMagnumPrice( Magnum.MagnumType.ROMANTICSTRAWBERRI);
        // HIer met deze method gan we totalproFit berekenenn en
        // new Magnum Object terug geven
//        totalProfit += magnumType == null ? (pricelist.getMagnumPrice(magnumType)) : (pricelist.getMagnumPrice(magnumType));
//            totalProfit += pricelist.getMagnumPrice(magnumType);


               return new Magnum(magnumType);

    }

    @Override
    public String toString() {
        return "IceCreamSalon{" +
                "pricelist=" + pricelist +
                ", totalProfit=" + totalProfit +
                '}';
    }
}

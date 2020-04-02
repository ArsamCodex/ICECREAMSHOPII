package be.intecbrussel.seller;

import be.intecbrussel.eatbles.Cone;
import be.intecbrussel.eatbles.IceRocket;
import be.intecbrussel.eatbles.Magnum;


public class IceCreamSalon implements IceCreamSeller {

    PriceList pricelist ;
    double totalProfit ;


    @Override
    public double getProfit() {
        return totalProfit;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavor) {



        totalProfit += (flavor != null && flavor.length > 0) ? (pricelist.getBallPrice() * flavor.length) : pricelist.getBallPrice();
        return new Cone(flavor);

//        Cone hoorntje = new Cone(flavor);
//       totalProfit += (pricelist.getBallPrice()) * flavor.length;
//
//        return hoorntje;
//


    }

    @Override
    public IceRocket orderIceRocket() {
        totalProfit += pricelist.getRocketPrice();
        return new IceRocket();

//        IceRocket raketijsje = new IceRocket();
//        totalProfit = totalProfit + pricelist.getRocketPrice();
//
//        return raketijsje;
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumType) {

        totalProfit += magnumType == null ? (pricelist.getMagnumPrice(Magnum.MagnumType.WHITECHOCOLATE)) : (pricelist.getMagnumPrice(Magnum.MagnumType.ROMANTICSTRAWBERRI) + pricelist.getMagnumPrice(Magnum.MagnumType.ROMANTICSTRAWBERRI));
        return new Magnum(magnumType);
//        Magnum magnum = new Magnum(magnumType);
//        totalProfit +=pricelist.getMagnumPrice(magnumType);
//        return nmagnum;
    }


    @Override
    public String toString() {
        return "IceCreamSalon{" +
                "pricelist=" + pricelist +
                ", totalProfit=" + totalProfit +
                '}';
    }
}

package be.intecbrussel.App;

import be.intecbrussel.eatbles.Cone;
import be.intecbrussel.eatbles.Eatable;
import be.intecbrussel.eatbles.IceRocket;
import be.intecbrussel.eatbles.Magnum;
import be.intecbrussel.seller.IceCreamSalon;
import be.intecbrussel.seller.IceCreamSeller;
import be.intecbrussel.seller.PriceList;

public class Apppp {
    public static void main (String [] args){


        IceCreamSeller icesalon = new IceCreamSalon(new PriceList(9.10,6.20,7));

        icesalon.orderIceRocket();
        icesalon.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRI);
       // icesalon.orderCone();

        Eatable icecreamI = new Magnum(Magnum.MagnumType.WHITECHOCOLATE);
        Eatable icecreamIV = new Magnum(Magnum.MagnumType.ALPINENUTS);
        Eatable icecreamII = new IceRocket();
        Eatable icecreamIII = new Cone(new Cone.Flavor[]{Cone.Flavor.LEMON});
        Eatable [] ice = {icecreamI , icecreamII , icecreamIII , icecreamIV};
        ice[0].eat();
        ice[1].eat();
        ice[2].eat();
        ice[3].eat();
        System.out.println(" Kassa         " + icesalon.toString());
    }
}

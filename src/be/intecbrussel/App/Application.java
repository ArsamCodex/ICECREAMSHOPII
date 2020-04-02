package be.intecbrussel.App;

import be.intecbrussel.eatbles.Cone;
import be.intecbrussel.eatbles.Eatable;
import be.intecbrussel.eatbles.IceRocket;
import be.intecbrussel.eatbles.Magnum;
import be.intecbrussel.seller.IceCreamSalon;
import be.intecbrussel.seller.PriceList;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        PriceList price = new PriceList(2,3,4);
        IceCreamSalon salon = new IceCreamSalon(price);

        Eatable [ ] ice;
        ice = new Eatable[]{
                new Magnum(Magnum.MagnumType.BLACKCHOCOLATE),
                new Magnum(Magnum.MagnumType.ALPINENUTS),
                new Magnum(Magnum.MagnumType.MILKCHOCOLATE),
                new Magnum(Magnum.MagnumType.ROMANTICSTRAWBERRI),
                new Magnum(Magnum.MagnumType.WHITECHOCOLATE),
                new Cone(new Cone.Flavor[]{Cone.Flavor.VANILLA, Cone.Flavor.CHOCOLATE,
                Cone.Flavor.STRACIATELLA, Cone.Flavor.LEMON , Cone.Flavor.BANANA, Cone.Flavor.STRAWBERRY}),
                new IceRocket()};

        System.out.println(Arrays.toString(ice));
        Eatable [] iceCream = new Eatable[]{
                new Magnum(Magnum.MagnumType.BLACKCHOCOLATE),
                new Magnum(Magnum.MagnumType.ALPINENUTS),
           new Cone(new Cone.Flavor[] {Cone.Flavor.STRAWBERRY , Cone.Flavor.LEMON}) , new IceRocket()};


            for(Eatable orders : iceCream){
                if(orders instanceof Cone) {
                    salon.orderCone(((Cone) orders).balls);}
                    else if (orders instanceof Magnum){
                    salon.orderMagnum(((Magnum) orders).getType());
                }else if (orders instanceof IceRocket){
                    salon.orderIceRocket();
                    orders.eat();
            }
        }
        System.out.println(" youe order ga ot be " + Arrays.toString(iceCream));
    }
}
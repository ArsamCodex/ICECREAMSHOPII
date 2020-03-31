package be.intecbrussel.application;

import be.intecbrussel.eatbles.Cone;
import be.intecbrussel.eatbles.Eatable;
import be.intecbrussel.eatbles.Magnum;
import be.intecbrussel.seller.IceCreamCar;
import be.intecbrussel.seller.IceCreamSalon;
import be.intecbrussel.seller.IceCreamSeller;
import be.intecbrussel.seller.PriceList;

public class IceCreamApp2 {
    public static void main(String[] args) {

        PriceList prijzen = new PriceList(2,1.5,3);
        PriceList prijzenAuto = new PriceList(2,1.5,3);
        Stock stock = new Stock();

        IceCreamSeller testje = new IceCreamSalon(prijzen);
        Cone.Flavor[] test = {Cone.Flavor.BANANA, Cone.Flavor.LEMON, Cone.Flavor.CHOCOLATE};

        Eatable[] bestelling3 = {testje.orderIceRocket(),testje.orderCone(test)};

        testConeMultipleFlavors();
        IceCreamSeller testAuto  = new IceCreamCar(prijzen,stock);

        Eatable[] bestelling4 = {testAuto.orderIceRocket(),testAuto.orderCone(test), testAuto.orderMagnum(Magnum.MagnumType.ALPINENUTS)};


        iceCreamSalonPricelistConstructorTest();


        double winst = testje.getProfit();
        System.out.println(winst);

        double winstAuto = testAuto.getProfit();
        System.out.println(winstAuto);
    }

    private static void iceCreamSalonPricelistConstructorTest() {
        System.out.println("testing icreCreamCar with pricelist in constructor\n");
        PriceList priceList = new PriceList(1,1,1.5);
        Stock stock = new Stock(10, 10, 10, 10);
        IceCreamSeller seller = new IceCreamCar(priceList,stock);
        testOrderAThousandIceRockets(seller);
    }

    private static void testOrderAThousandIceRockets(IceCreamSeller seller) {
        Eatable[] rockets = new Eatable[1000];
        for(int i = 0; i<1000;i++) {
            rockets[i] = seller.orderIceRocket();
        }
        System.out.println(rockets[0]);
        System.out.println(rockets[999]);

    }


    private static void testConeMultipleFlavors() {
        System.out.println("testing multiple flavored cone");
        Cone.Flavor[] flavors = {Cone.Flavor.BANANA, Cone.Flavor.STRAWBERRY};
        Eatable cone = new Cone(flavors);
        cone.eat();

    }
}


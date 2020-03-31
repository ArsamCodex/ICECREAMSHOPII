package be.intecbrussel.application;

import be.intecbrussel.eatbles.Magnum;
import be.intecbrussel.seller.PriceList;

public class PriceListTestApp {
    public static void main(String[] args) {
        testPriceListDefaultConstructor();
        testPriceListThreeParameterConstructor();

    }

    private static void testPriceListThreeParameterConstructor() {
        System.out.println("testing three parameter constructor");
        PriceList priceList = new PriceList(1,1,1.5);
        printPrices(priceList);
    }

    private static void testPriceListDefaultConstructor() {
        System.out.println("testing default constructor");
        PriceList priceList = new PriceList();
        printPrices(priceList);

    }

    private static void printPrices(PriceList priceList) {
        System.out.println("price of rocket: " + priceList.getRocketPrice());
        System.out.println("price of ball: " + priceList.getBallPrice());
        System.out.println("price of magnum: ");
        for(Magnum.MagnumType type : Magnum.MagnumType.values()) {
            System.out.println(type + " -> " + priceList.getMagnumPrice(type));
        }
    }

}


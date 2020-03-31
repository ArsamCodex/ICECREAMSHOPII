package be.intecbrussel.application;

import be.intecbrussel.eatbles.Cone;
import be.intecbrussel.eatbles.Eatable;
import be.intecbrussel.eatbles.IceRocket;
import be.intecbrussel.eatbles.Magnum;

public class EatablesTestApp {
    public static void main(String[] args) {
        testIceRocket();
        testMagnum();
        testCone();

    }

    private static void testCone() {
        testConeMultipleFlavors();

        testConeSingleFlavor();

        //testConeNoFlavor();
    }

    private static void testConeNoFlavor() {
        System.out.println("testing no flavored cone");
        Eatable cone = new Cone();
        cone.eat();

    }

    private static void testConeSingleFlavor() {
        System.out.println("testing single flavored cone");
        Cone.Flavor[] flavors = new Cone.Flavor[]{Cone.Flavor.STRACIATELLA};
        Eatable cone = new Cone(flavors);
        cone.eat();

    }

    private static void testConeMultipleFlavors() {
        System.out.println("testing multiple flavored cone");
        Cone.Flavor[] flavors = {Cone.Flavor.BANANA, Cone.Flavor.STRAWBERRY};
        Eatable cone = new Cone(flavors);
        cone.eat();

    }

    private static void testMagnum() {
        testMagnumWithType();
        testMagnumWithoutType();

    }

    private static void testMagnumWithoutType() {
        System.out.println("testing magnum with no flavor selected:\n");
        Eatable magnum = new Magnum(Magnum.MagnumType.BLACKCHOCOLATE);
        magnum.eat();

    }

    private static void testMagnumWithType() {
        System.out.println("testing magnum with alpinenuts selected:\n");
        Eatable magnum = new Magnum(Magnum.MagnumType.ALPINENUTS);
        magnum.eat();

    }

    private static void testIceRocket() {
        Eatable food = new IceRocket();
        food.eat();
    }

}


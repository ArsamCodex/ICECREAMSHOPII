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

        Eatable cone = new Cone();
        cone.eat();

    }

    private static void testConeSingleFlavor() {

        Cone.Flavor[] flavors = new Cone.Flavor[]{Cone.Flavor.STRACIATELLA};
        Eatable cone = new Cone(flavors);
        cone.eat();

    }

    private static void testConeMultipleFlavors() {

        Cone.Flavor[] flavors = {Cone.Flavor.BANANA, Cone.Flavor.STRAWBERRY};
        Eatable cone = new Cone(flavors);
        cone.eat();

    }

    private static void testMagnum() {
        testMagnumWithType();
        testMagnumWithoutType();

    }

    private static void testMagnumWithoutType() {

        Eatable magnum = new Magnum(Magnum.MagnumType.BLACKCHOCOLATE);
        magnum.eat();

    }

    private static void testMagnumWithType() {

        Eatable magnum = new Magnum(Magnum.MagnumType.ALPINENUTS);
        magnum.eat();


    }

    private static void testIceRocket() {
        Eatable food = new IceRocket();
        food.eat();
    }

}


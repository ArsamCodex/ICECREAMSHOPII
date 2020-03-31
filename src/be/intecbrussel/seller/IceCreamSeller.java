package be.intecbrussel.seller;

import be.intecbrussel.eatbles.Cone;
import be.intecbrussel.eatbles.IceRocket;
import be.intecbrussel.eatbles.Magnum;
import be.intecbrussel.eatbles.Magnum.MagnumType;

public interface IceCreamSeller extends Profitable {

    public Cone orderCone (Cone.Flavor[] cone);
    public IceRocket orderIceRocket();
    public Magnum orderMagnum(MagnumType magnumType);



}

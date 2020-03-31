package be.intecbrussel.eatbles;

public class Magnum implements Eatable {

    private MagnumType type ;

        //public Magnum(){}

    public Magnum(MagnumType type) {
        this.type = type;
    }

    public void eat() {
        System.out.println(" you are eating  Magnum " + " smaak is " + getType());
    }


    public MagnumType getType() {
        return type;
    }

    public enum MagnumType {
        MILKCHOCOLATE,
        WHITECHOCOLATE,
        BLACKCHOCOLATE,
        ALPINENUTS,
        ROMANTICSTRAWBERRI


    }

    @Override
    public String toString() {
        return "Magnum{" +
                "type=" + type +
                '}';
    }
}

package be.intecbrussel.seller;

import be.intecbrussel.application.Stock;
import be.intecbrussel.eatbles.Cone;
import be.intecbrussel.eatbles.IceRocket;
import be.intecbrussel.eatbles.Magnum;

public class IceCreamCar implements IceCreamSeller {
    private PriceList priceList = new PriceList();
    private Stock stock = new Stock(1,2,6,5);
    private double totalProfit = 0;

    public IceCreamCar(PriceList priceList, Stock stock) {
        super();
        this.priceList = priceList;
        this.stock = stock;
    }

    public Cone orderCone(Cone.Flavor[] balls) {
        Cone ijsje = prepareCone(balls);
        return ijsje;
    }

    private Cone prepareCone(Cone.Flavor[] balls) {
        Cone ijsje = new Cone(balls);

        int stockCones = stock.getBalls();
        int stockBalls = stock.getBalls();


        stockCones -= 1;
        for (int i =0; i < balls.length; i++) {
            totalProfit += priceList.getBallPrice();
            stockBalls -= 1;
        }

        stock.setBalls(stockBalls);
        stock.setCones(stockCones);

        return ijsje;
    }

    public IceRocket orderIceRocket() {
        IceRocket raketje = prepareIceRocket();
        return raketje;
    }

    private IceRocket prepareIceRocket() {
        int stockRacket = stock.getIceRockets();
        IceRocket raketje=null;
        if(stockRacket>0) {
            stockRacket--;
            totalProfit += priceList.getRocketPrice();
            raketje = new IceRocket();
            stock.setIceRockets(stockRacket);
        }

        return raketje;
    }

    public Magnum orderMagnum(Magnum.MagnumType type) {
        Magnum magnumke = prepareMagnum(type);

        return magnumke;
    }

    public Magnum prepareMagnum(Magnum.MagnumType type) {
        int stockMagnum = stock.getIceRockets();
        totalProfit += priceList.getMagnumPrice(type);
        Magnum magnumke = new Magnum(type);
        stock.setIceRockets(stockMagnum );
        return magnumke;
    }

    @Override
    public double getProfit() {
        return totalProfit;
    }


















}
//    PriceList pricelist ;
//    Stock stock ;
//    double profit;
//
//    public Cone orderCone(Cone.Flavor[] flavor){
//        return orderCone(Cone.Flavor.values() ) ;
//    }
//    public Cone prepareCone(Cone.Flavor[ ] flavor){
//        return null;
//    }
//    public IceRocket orderIceRocket(){
//        return orderIceRocket();
//    }
//
//    @Override
//    public Magnum orderMagnum(Magnum.MagnumType magnumType) {
//        return null;
//    }
//
//    public  IceRocket prepareRocket(){
//        return prepareRocket();
//
//    }
//
//    public Magnum prepareMagnum (){
//        return prepareMagnum();
//
//    }
//    public double getProfit(){
//        return profit;
//
//    }
//}

package designpattern.decorator;

public class ChocoSyrup implements  Icecream{
     private Icecream icecream;

    public ChocoSyrup(Icecream  icecream) {
        this.icecream =icecream;
    }

    @Override
    public int getCost() {
        return icecream.getCost() +15;
    }

    @Override
    public String getDescription() {
        return " ,ChocolateSyrup";
    }
}

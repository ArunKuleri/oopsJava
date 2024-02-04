package designpattern.decorator;

public class VanillaScoop implements Icecream{
    private Icecream icecream;
    public VanillaScoop(Icecream icecream){
        this.icecream = icecream;

    }
    @Override
    public int getCost(){
        return icecream.getCost() + 35;

    }
    @Override
    public  String getDescription(){
        return icecream.getDescription() + "Vannila Scoop";
    }
}

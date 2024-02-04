package designpattern.decorator;

public class OrangeCone implements Icecream {
    private  Icecream icecream;

    public  OrangeCone(){

    }
    public OrangeCone(Icecream icecream){
        this.icecream =icecream;
    }
    @Override
    public  int getCost(){
        if (icecream !=null){
            return icecream.getCost() + 10;
        }else {
            return 10;
        }
    }
    @Override
    public  String getDescription(){
        if(icecream !=null){
            return icecream.getDescription() + " ,Orange Cone";

        }else {
            return "Orange Cone";
        }
    }
}

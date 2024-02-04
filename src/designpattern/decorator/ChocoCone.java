package designpattern.decorator;

public class ChocoCone implements  Icecream{

    private Icecream icecream;

    public  ChocoCone(){

    }
    public  ChocoCone(Icecream icecream){
        this.icecream = icecream;
    }
    @Override
    public int getCost(){
        if(icecream != null){
            return icecream.getCost() + 20;

    }else {
            return 20;
        }


    }
    @Override
    public  String getDescription(){
        if(icecream !=null){
            return icecream.getDescription() + "Chocolate Cone";
        }else{
            return  "Chocolate Cone";
        }


    }
}

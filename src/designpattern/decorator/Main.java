package designpattern.decorator;

public class Main {
    public static void main(String[] args){
        Icecream ic = new VanillaScoop( new ChocoCone());
        System.out.println(ic.getCost());
        System.out.println(ic.getDescription());

    }
}

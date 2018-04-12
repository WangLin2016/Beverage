package Coffee;

public class StarbuzzCoffee {
    public static void main(String[] args){
        Beverege beverege=new Espresso();
        System.out.println(beverege.getDescription()+" $"+beverege.cost());
        Beverege beverege1=new Espresso();
        beverege1=new Mocha(beverege1);
        System.out.println(beverege1.getDescription()+"$" +beverege1.cost());
        Beverege beverege2=new Espresso();
        beverege2=new Mocha(beverege2);
        beverege2=new Mocha(beverege2);

        System.out.println(beverege2.getDescription()+"$" +beverege2.cost());



    }
}

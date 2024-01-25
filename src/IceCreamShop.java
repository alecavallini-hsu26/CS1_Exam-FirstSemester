public class IceCreamShop {
    public static void main(String[] args) {
        IceCreamShop creamery = new IceCreamShop();
        System.out.println("Hello World! Good luck on your exams!");

    }
    public IceCreamShop(){
        String name="Scoops & Loops: The Code Creamery";
        boolean isOpen=true;
        int yearFounded=1798;
        System.out.println("Welcome to "+ name+"! It is " +isOpen+" that we are open. We were founded in "+yearFounded+".");
        System.out.println("Welcome to "+ name+"! It is " +isOpen+" that we are open. We were founded in "+yearFounded+208+".");
        randomDiscount();
        specialOfTheDay("Cream Ice Cream");
        countScoops();
        chefsChoice();
        IceCream halesOrder;
        halesOrder = new IceCream(2,"Cookies and Cream",false);
        halesOrder.printInfo();
        IceCream myOrder;
        myOrder = new IceCream(2, "Mango Sorbet", false);
        myOrder.printInfo();

    }
    public void randomDiscount(){
        int randomInt=(int)(31*Math.random());
        System.out.println("We spun the discount wheel and you get "+randomInt+"percent off your order!");
    }
    public void specialOfTheDay(String flavor){
        System.out.println("Today's special is "+flavor);
    }
    public void countScoops(){
        for (int i=1;i<6;i=i+1){
            System.out.println(i);
        }for (int g=2;g<12;g=g+3){
            System.out.println(g);
        }
        for (int h=8;h>-1;h=h-1){
            System.out.print(h+" ");
        }
    }
    public void chefsChoice(){
        double randomNum=Math.random();
        if (randomNum<.25){
            System.out.println("The chef recommends a Banana Split");
        }if (randomNum>.25&&randomNum<.5){
            System.out.println("The chef recommends a Turtle Sundae");
        }if (randomNum>.5&&randomNum<.75){
            System.out.println("The chef recommends a Hot Fudge Sundae");
        }if (randomNum>.75&&randomNum<1){
            System.out.println("The chef recommends The Vermonster");
        }
    }
}

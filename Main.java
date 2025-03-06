import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        SingleTable t1 = new SingleTable(4, 74, 60.0);
        SingleTable t2 = new SingleTable(8, 74, 70.0);
        SingleTable t3 = new SingleTable(12, 76, 75.0);

        CombinedTable c1 = new CombinedTable(t1, t2);
        System.out.println(c1.canSeat(9));
        System.out.println(c1.canSeat(11));
        System.out.println(c1.getDesirability());

        CombinedTable c2 = new CombinedTable(t2, t3);
        System.out.println(c2.canSeat(18));
        System.out.println(c2.getDesirability());
        t2.setViewQuality(80);
        System.out.println(c2.getDesirability());

        //too easy. I'm built different.
        SingleTable s1 = new SingleTable(1, 70, 100.0);
        String[][] menu = { 
            {"Hotdog", "Burger", "Sandwich"},
            {"Hot Chocolate", "Coffee", "Water"} };
        s1.setMenu(menu);
        
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("What would you like to order? \n" + "Menu:" );
        s1.getMenu();

        String customerOrder = myObj.nextLine();
        s1.setOrder(customerOrder);
        while(true){
            if(s1.checkOrder(menu, customerOrder)){
                System.out.println("Yum! " + customerOrder + " is a good choice.");
                break;
            } else {
                System.out.println("Not an option! Try Again.");
                customerOrder = myObj.nextLine();
            }
        }
        s1.yum(customerOrder);
        myObj.close();
    }
}
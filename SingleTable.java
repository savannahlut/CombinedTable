public class SingleTable
{
    int seats = 0;
    int height = 0; 
    double quality = 0.0;
    SingleTable(int seats, int height, double quality){
        this.seats = seats;
        this.height = height;
        this.quality = quality;
    }
    /** Returns the number of seats at this table. The value is always greater than or equal to 4. */
    public int getNumSeats()
    {return seats; }
    /** Returns the height of this table in centimeters. */
    public int getHeight()
    {return height; }
    /** Returns the quality of the view from this table. */
    public double getViewQuality()
    {return quality; }
    /** Sets the quality of the view from this table to value . */
    public void setViewQuality(double value)
    {quality = value;}
    // There may be instance variables, constructors, and methods that are not shown.

    //i got bored 
    String order = "";
    String[][] menu ;
    public void setMenu(String[][] menu){
        this.menu = menu;
    }
    public void getMenu(){
        for (int i = 0; i < menu.length; i++) {
            for(int j = 0; j < menu[0].length; j++ )
                System.out.print(menu[i][j] + ", ");
                System.out.println();
        }
    }
    public String getOrder(){
        return order;
    }
    public void setOrder(String order){
        this.order = order ;
    }
    public boolean checkOrder(String[][] menu, String customerOrder){
        for (int i = 0; i < menu.length; i++) {
            for(int j = 0; j < menu[0].length; j++ ){
                if(customerOrder.equals(menu[i][j])){
                    return true;
                }
            }
        } return false;
    }

    public void yum(String food){
        for (int i = 0; i < food.length(); i++){
            for(int j=0; j<4; j++)
            System.out.print(food.charAt (i));
        }
    }
}
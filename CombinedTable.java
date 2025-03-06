public class CombinedTable{
    SingleTable one;
    SingleTable two;

    CombinedTable(SingleTable one, SingleTable two){
        this.one = one;
        this.two = two;
    }

    public boolean canSeat(int people){
        return people <= (one.getNumSeats() + two.getNumSeats() - 2);
    }

    public double getDesirability(){
        double desireable = ( one.getViewQuality() + two.getViewQuality() ) / 2 ;
        if(one.getHeight() == two.getHeight()){
            return desireable ;
        } 
        return desireable - 10;
    }

    
}
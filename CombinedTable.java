public class CombinedTable{
    SingleTable one;
    SingleTable two;

    CombinedTable(SingleTable one, SingleTable two){
        this.one = one;
        this.two = two;
    }

    public boolean canSeat(){
        return true;
    }

    public double getDesirability(){
        return 0.0;
    }
}
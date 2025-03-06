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
}
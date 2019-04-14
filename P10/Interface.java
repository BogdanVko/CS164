package P10;// P10 Assignment
// Author: Bogdan A. Vasilchenko
// Date:   4/14/2019
// Class:  CS164
// Email:  vba@cs.colostate.edu

import java.util.Date;

// Java interface definition
public interface Interface {

    // Read temperatures into an array
    public Temperature[] readTemperatures(String filename);

    // Find minimum temperature over a period
    public double findMinimum(Date start, Date end, Temperature[] data);

    // Find maximum temperature over a period
    public double findMaximum(Date start, Date end, Temperature[] data);

    // Find average temperature over a period
    public double findAverage(Date start, Date end, Temperature[] data);

    // Find highest windspeed over a period
    public double findHighest(Date start, Date end, Temperature[] data);
}
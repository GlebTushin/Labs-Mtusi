import java.util.Objects;

/**
 * This class represents a specific location in a 2D map.  Coordinates are
 * integer values.
 **/
public class Location
{
    /** X coordinate of this location. **/
    public int xCoord;

    /** Y coordinate of this location. **/
    public int yCoord;


    /** Creates a new location with the specified integer coordinates. **/
    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }

    public int getxCoord() {
        return xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }

    /** Creates a new location with coordinates (0, 0). **/
    public Location()
    {
        this(0, 0);
    }
    @Override
    public boolean equals(Object Mask){
        Location mask=(Location) Mask;
        if ((this.xCoord==mask.getxCoord())&&(this.yCoord==mask.getyCoord()))
        {return true;}
        return false;
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(xCoord, yCoord);
    }


}

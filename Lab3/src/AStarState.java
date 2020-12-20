import java.util.HashMap;
import java.util.Iterator;

/**
 * This class stores the basic state necessary for the A* algorithm to compute a
 * path across a map.  This state includes a collection of "open waypoints" and
 * another collection of "closed waypoints."  In addition, this class provides
 * the basic operations that the A* pathfinding algorithm needs to perform its
 * processing.
 **/
public class AStarState
{
    /** This is a reference to the map that the A* algorithm is navigating. **/
    private Map2D map;

    HashMap<Location, Waypoint> open = new HashMap<Location, Waypoint>();
    HashMap<Location, Waypoint> close = new HashMap<Location, Waypoint>();

    /**
     * Initialize a new state object for the A* pathfinding algorithm to use.
     **/
    public AStarState(Map2D map)
    {
        if (map == null)
            throw new NullPointerException("map cannot be null");

        this.map = map;
    }

    /** Returns the map that the A* pathfinder is navigating. **/
    public Map2D getMap()
    {
        return map;
    }

    /**
     * This method scans through all open waypoints, and returns the waypoint
     * with the minimum total cost.  If there are no open waypoints, this method
     * returns <code>null</code>.
     **/
    public Waypoint getMinOpenWaypoint()
    {
        // TODO:  Implement.
        if (open.isEmpty()) {
            return null;
        }

        Iterator<Waypoint> points = open.values().iterator();
        Waypoint min = points.next();

        for (Iterator<Waypoint> it = points; it.hasNext(); ) {
            Waypoint x = it.next();
            if (x.getTotalCost() < min.getTotalCost()) {
                min = x;
            }
        }

        return min;
    }

    /**
     * This method adds a waypoint to (or potentially updates a waypoint already
     * in) the "open waypoints" collection.  If there is not already an open
     * waypoint at the new waypoint's location then the new waypoint is simply
     * added to the collection.  However, if there is already a waypoint at the
     * new waypoint's location, the new waypoint replaces the old one <em>only
     * if</em> the new waypoint's "previous cost" value is less than the current
     * waypoint's "previous cost" value.
     **/
    public boolean addOpenWaypoint(Waypoint newWP)
    {
        // TODO:  Implement.

        Location cur = newWP.getLocation();
        if (open.get(cur) == null){
            open.put(cur,newWP);
            return true;

        } else if(newWP.getTotalCost() < open.get(cur).getTotalCost()) {
            open.put(cur, newWP);
            return true;
        }else {
            return false;}

    }


    /** Returns the current number of open waypoints. **/
    public int numOpenWaypoints()
    {
        // TODO:  Implement.
        return open.size();
    }


    /**
     * This method moves the waypoint at the specified location from the
     * open list to the closed list.
     **/
    public void closeWaypoint(Location loc)
    {
        // TODO:  Implement.
        close.put(loc, open.remove(loc));
    }

    /**
     * Returns true if the collection of closed waypoints contains a waypoint
     * for the specified location.
     **/
    public boolean isLocationClosed(Location loc)
    {
        // TODO:  Implement.
        return close.containsKey(loc);
    }
}

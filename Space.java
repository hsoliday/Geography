import java.util.ArrayList;
import java.util.List;
/**
 * @author Hunter Soliday <Hunter.Soliday@okstate.edu>
 * @version 0.1
 * this is a generic Province Class
 */
public class Space extends Name
{
  /*
  * area of a space
  */
  protected double area;
  /*
  * list of cities inside space
  */
  protected List<City> cities;
  /*
  * boundaries of a space
  */
  protected List<Boundary> boundaries;
  /*
  * capital of a space
  */
  protected City capital;
  /*
  * returns area of a space
  */
  public double area()
  {
    return area;
  }
  /*
  * returns cities in a space
  */
  public List<City> getCities()
  {
    return cities;
  }
  /**
  * returns the distance between two cities in the
  * space, otherwise returns negative 1
  */
  public double distance(City city1,City city2)
  {
    if(cities.contains(city1)&&cities.contains(city2))
    {
      return city1.distance(city2);
    }
    return -1;
  }
  /**
  * finds the total length of the boundaries of the space
  */
  public double boundaryLength()
  {
    double d =0;
    for(Boundary b:boundaries)
    {
      d+=b.boundaryLength();
    }
    return d;
  }
  /*
  * returns neighbors of a space
  */
  public ArrayList<Space> neighbors()
  {
    ArrayList<Space> list = new ArrayList<Space>();
    for(Boundary b: boundaries)
    {
      for(Space s:b.borderOf())
      {
        if(!list.contains(s))
        {
          list.add(s);
        }
      }
    }
    return list;
  }
  /*
  * returns capital of a space
  */
  public City capital()
  {
    return capital;
  }
}

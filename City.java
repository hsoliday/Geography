/**
 * @author Hunter Soliday <Hunter.Soliday@okstate.edu>
 * @version 0.1
 * this is a generic city Class
 */
public class City extends Name
{
  /**
  * holds area of city
  */
  private double area;
  /**
  * holds country city is in
  */
  private Country country;
  /**
  * holds coordinates of of city
  */
  private double lat,lon;
  /**
  * constructor for City
  * @param name name of the city
  * @param c the country the city is in
  * @param latt the latitude of city
  * @param longg the longitude of city
  * @param a the area
  */
  public City(String name,Country c,double latt,double longg,double a)
  {
    area = a;
    country=c;
    lat=latt;
    lon=longg;
    this.name=name;
  }
  /**
  * returns the country the city is in
  */
  public Country getCountry()
  {
    return country;
  }
  /**
  * returns the area of the city
  */
  public double area()
  {
    return area;
  }
  /**
  * gets coordinates of the city
  */
  public double[] getCoor()
  {
    double d[] = {lat,lon};
    return d;
  }
  /**
  * finds the distance between this city and another
  * @param c the other cit to be measured from
  */
  public double distance(City c)
  {
    return Math.sqrt(Math.pow(lat-c.getCoor()[0],2)+Math.pow(lat-c.getCoor()[1],2));
  }

}

import java.util.List;
/**
 * @author Hunter Soliday <Hunter.Soliday@okstate.edu>
 * @version 0.1
 * this is a generic Country Class
 */
public class Country extends Space
{
  /**
  *this is the constructor
  * @param name the country`s name
  * @param a the country`s area
  * @param cities the cities with the country
  * @param b a list of the countries boundary
  * @param c the capital of the country
  */
  public Country(String name,double a, List<City> cities,List<Boundary> b,City c)
  {
    this.name = name;
    area = a;
    this.cities =cities;
    boundaries = b;
    capital = c;
  }
}

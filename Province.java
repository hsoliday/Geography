import java.util.List;
/**
 * @author Hunter Soliday <Hunter.Soliday@okstate.edu>
 * @version 0.1
 * this is a generic Province Class
 */
public class Province extends State
{
  /**
  *this is the constructor
  * @param name the province`s name
  * @param a the province`s area
  * @param cities the province with the country
  * @param b a list of the province's boundaries
  * @param c the capital of the province
  */
  public Province(String name,double a, List<City> cities,List<Boundary> b,City c)
  {
    this.name = name;
    area = a;
    this.cities =cities;
    boundaries = b;
    capital = c;
  }
  /**
  * checks to see if a space is a state
  */
  public boolean isState()
  {
    return false;
  }

}

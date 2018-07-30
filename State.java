import java.util.List;
/**
 * @author Hunter Soliday <Hunter.Soliday@okstate.edu>
 * @version 0.1
 * this is a generic State Class
 */
public class State extends Space
{
  /*
  *state country is in
  */
  Country country;
  /*
  *blank constructor
  */
  public State()
  {
    this.name = null;
    area = 0;
    this.cities =null;
    boundaries = null;
    capital = null;
    country = null;
  }
  /**
  *this is the constructor
  * @param name the state`s name
  * @param a the state`s area
  * @param cities the state with the country
  * @param b a list of the state's boundaries
  * @param c the capital of the state
  */
  public State(String name,double a, List<City> cities,List<Boundary> b,City c,Country homecountry)
  {
    this.name = name;
    area = a;
    this.cities =cities;
    boundaries = b;
    capital = c;
    country = homecountry;
  }
  /**
  * checks to see if a space is a state
  */
  public boolean isState()
  {
    return true;
  }
  /**
  * returns country state is in  
  */
  public Country getCountry()
  {
    return country;
  }

}

import java.util.List;
import java.util.ArrayList;
/**
 * @author Hunter Soliday <Hunter.Soliday@okstate.edu>
 * @version 0.1
 * this is a generic boundary Class
 */
public class Boundary extends Name
{
/**
 * the areas that are adjacent
 */
  protected List<Space> adjacentSpaces;
/**
 * The length of the border
 */
  protected double length;
  /**
   * A constructor with no parameters
   */
  public Boundary()
  {
    adjacentSpaces= new ArrayList<Space>();
    name ="";
  }
  /**
   * A constructor with parameters
   * @param spaces list of all spaces this divides
   * @param name This would be the name of the border
   */
  public Boundary(List<Space> spaces, String name)
  {
    this.name = name;
    adjacentSpaces=spaces;
  }
  /**
   * adds an adjacent space
   * @param s the space to be added
   */
  public void addSpace(Space s)
  {
    adjacentSpaces.add(s);
  }
  /**
   * this checks to see if the
   * boundary is a river. Because
   * it is a boundary it will
   * always return false
   */
  public boolean isRiver()
  {
    return false;
  }
  /**
   * returns a list of the adjacent spaces
   */
  public List<Space> borderOf()
  {
    return adjacentSpaces;
  }
  /**
   * returns the length of this boundary
   */
  public double boundaryLength()
  {
    return length;
  }
}

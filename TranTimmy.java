/**
 * A BoopleSnoot is Mr. Jaffe's animal
 * 
 * @author Mr. Jaffe
 * @version 1.0 2017-07-14
 */
public class TranTimmy extends Animal
{
  public TranTimmy() {
    super("Timmy Tran", "pink", 4);
  }
  
  public String getType() {
    return "Panda";
  }
  public String speak() {
    return "boo-bop-bahh-boop";
  }
  public String getDisposition() {
    return "Ecstatic";
  }
   public String getName() {
    return "Gerald";
  }
  @Override
  public String toString() {
    StringBuffer buffer = new StringBuffer("");
    buffer.append("It is a "+this.getType()+"\n");
    buffer.append("Its name is "+this.getName()+", it is "+this.getColor()+" with "+this.getLegs()+" legs\n");
    buffer.append("Its disposition is "+this.getDisposition()+" and it says "+this.speak()+"\n");
    return buffer.toString();
  }
}

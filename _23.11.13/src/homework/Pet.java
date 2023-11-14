package homework;

import java.text.DecimalFormat;
import java.util.Objects;

/** This is a class to define Pet objects. Pets should be compared
 according to their owner's names, ignoring capitalization. Ties
 should be broken based on the pet's name, ignoring capitalization.

 Your job is to add the necessary data and methods to support the
 P3main program, as well as the related classes in this system. Some
 required methods are noted below with comments, but these are not the
 only things you will need.
 */
public class Pet implements Comparable<Pet>{

    /** Handy for formatting. */
    private static DecimalFormat money = new DecimalFormat("0.00");

    private double tmpMoney;
    /* The access specifiers for these variables must not be changed! */

    private String name;
    private String owner;
    private double weight;

    private int visitTime = 0;


    /** Create a Pet object, initializing data members.
     *  @param pname the Pet's name
     *  @param oname the owner's name
     *  @param wt the weight of the pet
     */
    public Pet(String pname, String oname, double wt) {
        this.name = pname;
        this.owner = oname;
        this.weight = wt;
    }

    @Override
    public String toString() {
        String result = "";
        if(this instanceof Cat c)
        {
            if(c.getI_O() == 0)
            {
                result += "outside cat ";
            }
            else {
                result += "inside cat ";
            }
        }
        if(this instanceof Dog d)
        {
            result += d.getSize()+ " dog ";
        }
        return result + this.name + " (owner " + this.owner + ") " + this.weight
                + " lbs, $" + money.format(this.avgCost()) + " avg cost/visit  ";
    }

    /** The Pet is visiting the vet, and will be charged accordingly.
     *  The base cost for a visit is $85.00, and $30/shot is added.
     *  @param shots the number of shots the pet is getting
     *  @return the entire cost for this particular visit
     */
    public double visit(int shots) {
        visitTime++;
        tmpMoney += (85 + 30 * shots);
        return 85 + 30 * shots;
    }

    /** Determine the average cost per visit for this pet.
     *  @return that cost, or 0 if no visits have occurred yet
     */
    public double avgCost() {
        if(visitTime != 0) {
            return tmpMoney / visitTime;
        }
        else {
            return tmpMoney;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pet pet = (Pet) o;
        return pet.getName().equalsIgnoreCase(this.getName())
                && pet.getOwner().equalsIgnoreCase(this.getOwner());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, owner);
    }

    //下面是一些get/set方法
    public DecimalFormat getMoney() {
        return money;
    }
    public void setMoney(DecimalFormat money) {
        Pet.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getTmpMoney() {
        return tmpMoney;
    }

    public void setTmpMoney(double tmpMoney) {
        this.tmpMoney = tmpMoney;
    }

    public int getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(int visitTime) {
        this.visitTime = visitTime;
    }

    @Override
    public int compareTo(Pet p) {
        if(this.getOwner().compareToIgnoreCase(p.getOwner()) == 0)
        {
            return this.getName().compareToIgnoreCase(p.getName());
        }
        return this.getOwner().compareToIgnoreCase(p.getOwner());
    }
}

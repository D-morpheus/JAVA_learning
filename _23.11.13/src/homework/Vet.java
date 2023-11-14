package homework;

import java.util.Arrays;

/** Class to keep track of client (Pet) information for a Veterinary
 practice. Some methods are sketched for you, but others will need
 to be added in order to implement the Database interface and
 support the P3main program and expected output. You'll also need
 to add the data members.
 */
public class Vet implements Database {

    private int startSize;
    private String who;
    private int count = 0;



    public Vet() {
    }

    /** Create a veterinary practice.
     * @param startSize the capacity for how
     * many clients they can handle
     * @param who the name of the vet practice
     */
    public Vet(int startSize, String who) {
        this.startSize = startSize;
        this.who = who;


    }


    /** Display the name of the Vet and all the clients, one per line,
     * on the screen. (See sample output for exact format.)
     */
    @Override
    public void display() {
        System.out.println("Vet "+ who + " client list:");
        for(int i = 0; i < count; i++)
        {
            Pet p = pets[i];
            System.out.println(p.toString());
        }
    }

    @Override
    public Object find(Object o) {
        if(o instanceof Pet p1)
        {
            Pet p2;
            for(int i = 0; i < count; i++)
            {
                p2 = pets[i];
                if(p2.equals(p1))
                {
                    return p2;
                }
            }
        }
        return null;
    }



    /** Add an item to the database, if there is room.
     You are limited by the initial capacity.
     @param o the object to add (must be a Pet)
     @return true if added, false otherwise
     */
    @Override
    public boolean add(Object o) {
        if(o instanceof Pet p)
        {
            pets[count] = p;
            count++;
            return true;
        }
        return false;
    }


    /** Delete an item from the database, if it is there,
     maintaining the current ordering of the list.
     @param o the object to delete
     @return the item if one is deleted, null otherwise
     */
    @Override
    public Object delete(Object o) {
        if(o instanceof Pet p2)
        {
            Pet p1;
            for(int i = 0; i < count; i++)
            {
                p1 = pets[i];
                if(p1.equals(p2))
                {
                    for(int j = i; j < count - 1; j++)
                    {
                        pets[j] = pets[j + 1];
                    }
                    count--;
                    return p1;
                }
            }
        }
        return null;
    }

    /** Compute the average weight over all clients.
     @return the average
     */
    public double averageWeight() {
        double sum = 0;
        for(int i = 0; i < count; i++)
        {
            Pet p = pets[i];
           sum += p.getWeight();
        }
        return sum / count;
    }


    /** Sort the clients. (This is complete.)
     */
//    public void sort() {
//        Arrays.sort(this.clients, 0, this.size());
//    }

    @Override
    public int size() {
        return count;
    }

    public void sort(){
        Arrays.sort(pets,0,count);
    }



}


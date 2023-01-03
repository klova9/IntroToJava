// Work in progress

package BallsandBoxes;

import java.util.LinkedList;
import java.util.Scanner;
import java.lang.Iterable;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Collections;

public class BallContainer implements Iterable<Ball> {
    Scanner reader = new Scanner(System.in);
    private Set<Ball> contents;
    private double totalVolume;
    private int size;

    public BallContainer() {
        contents = new LinkedHashSet<Ball>();
        totalVolume = 0;
        size = 0;
    }

    public Iterator<Ball> iterator() {
        return Collections.unmodifiableSet(contents).iterator();
    }

    public boolean add() {
        if (contents.contains(b)) {
            return false;
        } else {
            totalVolume += b.getVolume();
            size++;
            return contents.add(b);
        }

    }

    public boolean remove(Ball b){
        if(!contents.contains(b)){
            return false;
        } else {
            totalVolume -= b.getVolume();
            size--;
            return.contents.remove(b);
        }
    }

    public double getVolume() {
        return totalVolume;
    }

    public int size() {
        return size;
    }

    public void clear() {
        contents.clear();
        totalVolume = 0;
        size = 0;
    }
    public boolean contains(Ball b) {
        Ball temp = it.next();
        if(temp.equals(b))
        return false;
    }

}

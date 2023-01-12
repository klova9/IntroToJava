package BallsandBoxes;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * This is a container can be used to contain Balls. The key
 * difference between a BallContainer and a Box is that a Box has a
 * finite capacity. Once a box is full, we cannot put in more Balls.
 */
public class Box extends BallContainer {
	private double _capacity;

    /**
     * Constructor that creates a new box.
     * @param capacity Total capacity of balls that this box can contain.
     */
    public Box(double capacity) {
    	_capacity = capacity;
    }
    
    /**
     * This method replaces (overrides) the <tt>add(Ball)</tt> method
     * in <tt>BallContainer</tt>, because we have to check if the
     * <tt>Box</tt> has enough remaining space when we try to put a
     * Ball inside. Hence, this method returns true if a ball is
     * successfully added to the box, i.e., ball is not already in the
     * box and if the box is not already full; and it returns false,
     * if ball is already in the box or if the box is too full to
     * contain the new ball.
     * @param b Ball to be added.
     * @return true if ball was successfully added to the box,
     * i.e. ball is not already in the box and if the box is not
     * already full. Returns false, if ball is already in the box or
     * if the box is too full to contain the new ball.
     */
    public boolean add(Ball b) {
    	double cap = 0;
  // 	Iterator<Ball> it = this.contents.iterator();
 //   	while (it.hasNext()) cap += it.next().getCapacity(); 
		if (cap >= _capacity) return false;
		return super.add(b);
    }

    /**
     * This method returns an iterator that returns all the balls in
     * this box in ascending size, i.e., return the smallest Ball
     * first, followed by Balls of increasing size.
     * @return an iterator that returns all the balls in this box in
     * ascending size.
     */
    public Iterator<Ball> getBallsFromSmallest() {
		SortedSet<Ball> s = new TreeSet<Ball>(this.contents);
		return s.iterator();
    }

}
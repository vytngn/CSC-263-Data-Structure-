import java.util.ArrayDeque;
import java.util.Queue;


public class findMax {

	public static void main(String[] args) {
		Queue <Integer> q = new ArrayDeque<Integer>( );
		 q.add(100);
		 q.add(25);
		 q.add(6);
		 q.add(1);
		 System.out.println(findMax(q));
		 
	}
	public static <E> Comparable findMax(Queue<E> queue) { //my test would ask me to return the max value
	    Comparable max = (Comparable) queue.remove();
	    queue.add((E) max); //add it back to the end
	    for(int i=0; i<queue.size()-1; i++) {
	        Comparable current = (Comparable) queue.remove();
	        if (((Comparable) current).compareTo(max) > 0) {
	            max = current;
	        }
	        queue.add((E) current);
	    }
	    return max;
	}
}

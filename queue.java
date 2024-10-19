import java.util.Queue;
import java.util.LinkedList;
public class queue {
    public static void main(String[] args) {
 Queue<String> queue = new LinkedList<String>();
queue.offer("bandar");
queue.offer("bhalu");
queue.offer("bhatak");
queue.offer("doggy");


// System.out.println(queue.peek());
queue.poll();
// queue.poll();
// queue.poll();
// queue.poll();
System.out.println(queue.isEmpty());
System.out.println(queue.size());
System.out.println(queue.contains("doggy"));
System.out.println(queue);

    }
    
}
// its fifo first in first out
// a collection designed for holding elements prior to processing Linear Data structure
//  add() = enqueue,offer()
// remove() = dequeue,poll()
// element()= check the first one, peek()
// we are using these cause they dont throw exception






// uses of queue
//1. keyboard buffer(letters,should appear on the screen in the order they are pressed)
// 2.printer queue(print,jobs should nbe completed in order)
// 3. used in LinkedLists, priortyQueues, Breadth first search
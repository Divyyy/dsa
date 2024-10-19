import java.util.*;
public class priority_queue {
    public static void main(String args[]){
    Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
    queue.offer("B");
    queue.offer("A");
    queue.offer("C");
    queue.offer("D");
    while(!queue.isEmpty()){
     System.out.println(queue.poll());
    }
}
    
}





//  priorty queue = a fifo data structure taht serves elemenets with the highest priorities first before elements with lower priority

//                                                                      
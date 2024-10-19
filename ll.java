import java.util.*;

public class ll {
    public static void main(String[] args){
        LinkedList<String> linkedlist = new  LinkedList<String>();
        // linkedlist.push("A");
        // linkedlist.push("B");
        // linkedlist.push("C");
        // linkedlist.push("D");
        // linkedlist.push("E");
        // linkedlist.push("F");
        // linkedlist.pop();

        linkedlist.offer("A");
        linkedlist.offer("B");
        linkedlist.offer("C");
        linkedlist.offer("D");
        linkedlist.offer("E");
        linkedlist.offer("F");
        // linkedlist.poll();
        linkedlist.add(4,"h");
        linkedlist.remove("E");
        System.out.println(linkedlist.indexOf("F"));
        System.out.println(linkedlist.peekFirst());
        System.out.println(linkedlist.peekLast());
        linkedlist.addFirst("0");
        linkedlist.addLast("G");
        // String first = linkedlist.removeFirst();to remove first 
        // String last = linkedlist.removeLast(); to remove last node
        System.out.println(linkedlist);



    }
    
}








// LinkedList = stores nodes in 2 parts ( data + address)
//  nodes are in non-consecutive memory locations
//  elements are linked usingt pointers


//                               singly linked list
//           Node              Node          Node
//         [data/address] ->[data/address]->[data/address]
//                next                            next
//                         Doubly Linked list
//            Node                            Node
//     [address/data/address]<->[address/data/address]
//     previous       next      previous       next



//  advatnages?
//   1. dynamic data structure (allocation needed memory while running)
//   2. Insertion and deletion pf node is easy . o(1)
//   3. no/low memory waste 

//  disadavnatages
//  1 . greater memory uses(additional pointer)
//  2. no random access of element( no index[1])
// 3. Accessing/searching element is more time consuming. 0(n)


//  uses?
//  1. implement stacks/queues
// 2.   gps navigation
// 3. music playlist
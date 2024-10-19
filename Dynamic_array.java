import java.util.*;
public class Dynamic_array {
    int size =0;
    int capacity = 10;
    Object[] array;
     

    public Dynamic_array() {
        this.array= new Object[capacity];
        
    }

    public Dynamic_array(int capacity) {
        this.capacity = capacity;

        this.array= new Object[capacity];
    }


    public void add(Object data){
        if(size >= capacity){
            grow();
        }
        array[size] = data;
        size++;

    }
    public void insert(int index, Object data){

    }
    public void delete(Object data){

    }
    public int search(Object data){
        return -1;
         
    }
    private void grow(){

    }
    private void shrink(){

    }
    public boolean isEmpty(){
        return size == 0;
    }
    public String toString(){
        String string = "";
        for(int i = 0; i < size; i++){
            string += array[i] + ", ";
        }
        if (string !=""){
            string = "[" + string.substring(0,string.length() -2)+ "]";
        }
        else{
            string ="[]";
        }
        return string;
    }



        public static void main(String[] args){
        Dynamic_array dynamicArray= new Dynamic_array();
        // dynamicArray.add("A");
        // dynamicArray.add("B");
        // dynamicArray.add("C");


        System.out.println(dynamicArray);
        System.out.println("empty" + dynamicArray.isEmpty());
        

    }
}













// Advantages
// 1. Random acces of elemnet
// 2. good locality of refrence and data cache utilization
//  3. easy to insert/delete at the end


// Disadvantages
// 1. waste more memory
// 2. shifting elements is time consumin o(n)
// 3. expanding/shrinking the array is time consuming o(n)
import java.util.Stack;
class stack{
    // based on lifo last in first out
    public static void main(String[] args){
        Stack<String> stack = new Stack<String>();

        stack.push("Minecraft");
        stack.push("Halo");
        stack.push("Doom");
        stack.push("Call of Duty");
        // stack.pop();
        // stack.pop();
        // stack.pop();
        // String myfavgame = stack.pop();

        // System.out.println(stack.peek());

        System.out.println(stack.search("Halo"));
        System.out.println(stack);
        // System.out.println(myfavgame);
    }
}
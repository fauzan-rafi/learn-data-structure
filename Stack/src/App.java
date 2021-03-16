package Stack.Stack.src;
public class App {
    
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack(3);
        System.out.println(stack.push("T"));
        System.out.println(stack.push("K"));
        System.out.println(stack.push("J"));
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.printArr();
    }
}

public class CustomMain {
    public static void main(String[] args) throws StackException {
        DynamicStack stack = new DynamicStack(5);
        // CustomStack stack = new DynamicStack(5);
        // The above implementation works as well but with limited access to functions 
        // as it cannot access the functions offered by DynamicStack

        
        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);
        stack.push(89);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}

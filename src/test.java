import java.util.Stack;

public class test {
    public static void main(String[] args) {
        int num = 24;
        int temp;
        Stack<Integer> stack = new Stack<>();
        System.out.print("Before: " + num);
        System.out.print("\nAfter: ");
        while (num != 0){
            temp = num % 2;
            stack.push(temp);
            num = num/2;
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}

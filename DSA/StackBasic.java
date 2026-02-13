// Demonstration of basic stack operations in Java (push, pop, peek, search, size).

import java.util.Stack;

public class StackBasic {
    
    public static void main(String[] args){

        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        System.out.println("Size of the stack is : "+st.size());
        System.out.println("Top element of the stack is : "+st.peek());
        System.out.println("Stack elements are : "+st);

        System.out.println("Position of 10 is : "+st.search(10));
        System.out.println(st);

        st.pop();
        st.pop();
        System.out.println("Stack after pop operation : "+st);
    }
}

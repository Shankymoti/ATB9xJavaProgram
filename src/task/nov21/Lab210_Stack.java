package task.nov21;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class Lab210_Stack {
    public static void main(String[] args) {
//        Stack st =  new Stack();
//        st.add("Shashank");
//        st.add(1);
//        System.out.println(st);
//    }

        Stack stack =  new Stack();
        stack.push("shashank");
        stack.push("kuamr");
        stack.push("amit");
        stack.push("sumit");

        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.empty());
        System.out.println(stack.contains("amit"));
        System.out.println(stack.contains("xyz"));
        System.out.println(stack.get(3));
        stack.add("reddy");
        System.out.println(stack);
        stack.push('s');
        stack.push(786);
        stack.add(890);
        stack.push(null);
        stack.push(null);
        stack.push("shashank");
        stack.push(true);
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);
        stack.add(0,"Lucky");
        System.out.println(stack);
        System.out.println(stack.get(1));
        System.out.println(stack.get(0));
        System.out.println(" using iterator to iterate the stack");
        Iterator iterator = stack.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("using enumeration");
        Enumeration enumeration = stack.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
        System.out.println("using for each");
        for (Object o : stack){
            System.out.println(o);
        }

//        for (Stack s : stack){  // here is Stack is not working
//
//        }
        System.out.println("usnig for loop");
        for (int i =0 ; i<stack.size(); i++){
            System.out.println(stack.get(i));
        }

    }
}



package stacks;
import java.util.*;
public class Stack {
		//insertion == push
		//removal == pop
	static void showpush(Stack st, int a) {
	      st.push(new Integer(a));
	      System.out.println("push(" + a + ")");
	      System.out.println("stack: " + st);
	   }

	   private void push(Integer integer) {
		// TODO Auto-generated method stub
		
	}

	static void showpop(Stack st) {
	      System.out.print("pop -> ");
	      Integer a = (Integer) st.pop();
	      System.out.println(a);
	      System.out.println("stack: " + st);
	   }

	   private Integer pop() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String args[]) {
	      Stack st = new Stack();
	      System.out.println("stack: " + st);
	      showpush(st, 42);
	      showpush(st, 66);
	      showpush(st, 99);
	      showpop(st);
	      showpop(st);
	      showpop(st);
	      try {
	         showpop(st);
	      } catch (EmptyStackException e) {
	         System.out.println("empty stack");
	      }
	   }
}

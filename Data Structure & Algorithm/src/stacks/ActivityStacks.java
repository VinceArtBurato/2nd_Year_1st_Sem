// Name: Burato, Vince Art        Section code: T207
package stacks;

import java.util.*;

	class stack<T> {

		ArrayList<T> A;
		
		int top = -1;
		int size;

		stack(int size)
		{

			this.size = size;
			this.A = new ArrayList<T>(size);
		}

		void push(T X)
		{
			if (top + 1 == size) {
				
				System.out.println("Stack Overflow");
				
			} else {

				top = top + 1;

				if (A.size() > top)
					A.set(top, X);

				else
					A.add(X);
			}
		}

		T top()
		{

			if (top == -1) {

				System.out.println("Stack Underflow");

				return null;
			}

			else
				return A.get(top);
		}

		void pop()
		{
			if (top == -1) {

				System.out.println("Stack Underflow");
			} else {
				top--;
			}
				
				
		}

		boolean empty() { return top == -1; }

		public String toString()
		{

			String Ans = "";

			for (int i = 0; i < top; i++) {
				Ans += String.valueOf(A.get(i)) + " ";
			}

			Ans += String.valueOf(A.get(top));

			return Ans;
		}
	}

public class ActivityStacks {

		public static void main(String[] args)
		{
			stack<String> s1 = new stack<String>(9);

			s1.push("My");
			s1.push("very");
			s1.push("educated");
			s1.push("mother");
			s1.push("just");
			s1.push("serve");
			s1.push("us");
			s1.push("nine");
			s1.push("puto");
	
			System.out.println("Sentence:\n" + s1);
			
			s1.pop();
			s1.pop();
			s1.pop();
			s1.pop();
			s1.pop();
			s1.pop();
			s1.pop();
			s1.pop();
			
			s1.push("educated");
			s1.push("mother");
			s1.push("just");
			s1.push("serve");
			s1.push("us");
			s1.push("nine");
			s1.push("puto");
			
			s1.pop();
			s1.pop();
			
			s1.push("puto");
			
			System.out.println("\nUpdated Sentence:\n" + s1);

		}
	}


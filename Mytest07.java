import java.util.Stack;
public class Mytest07 {

	Stack<String> stack1 = new Stack<String>();
	Stack<String> stack2 = new Stack<String>();
	
	public void appendTail(String s) {
		stack1.push(s);
	}
	
	public String deleteHead() {
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		if (stack2.isEmpty()) {
			throw new RuntimeException("No more Element."); 
		}
		return stack2.pop();
	}
	public static void main(String[] args) {
		Mytest07 test = new Mytest07();
		test.appendTail("1");
		System.out.println(test.deleteHead());
		test.appendTail("3");
		test.appendTail("2");
		test.appendTail("1");
		System.out.println(test.deleteHead());
	}
}

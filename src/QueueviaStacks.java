import java.util.Stack;

public class QueueviaStacks {
	public static Stack<Integer>st1=new Stack<>();
	public static Stack<Integer>st2=new Stack<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>st1=new Stack<>();
		Stack<Integer>st2=new Stack<>();
		enQueue(2);
		enQueue(3);
		enQueue(4);
		enQueue(5);
		System.out.println(deQueue());
		enQueue(6);
		enQueue(7);
		System.out.println(deQueue());
	}
	private static void enQueue(int i) {
		// TODO Auto-generated method stub
		st1.push(i);
	}
	private static int deQueue(){
		while(!st1.empty()){
			int val=st1.pop();
			st2.push(val);
		}
		int res= st2.pop();
		while(!st2.empty()){
			int val=st2.pop();
			st1.push(val);
		}
		return res;
	}
}

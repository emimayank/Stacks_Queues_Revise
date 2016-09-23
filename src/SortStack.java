import java.util.Stack;

public class SortStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>st=new Stack<>();
		Stack<Integer>st_temp=new Stack<>();
		st.push(7);
		st.push(2);
		st.push(8);
		st.push(3);
		st.push(6);
		while(!st.empty()){
			int temp=st.pop();
			if(!st_temp.empty()){	
				while(temp>st_temp.peek()){
					st.push(st_temp.pop());
					if(st_temp.empty()){
						break;
					}
				}
				st_temp.push(temp);
			}
			else{
				st_temp.push(temp);
			}
		}
		while(!st_temp.empty()){
			System.out.println(st_temp.pop());
		}
	}

}

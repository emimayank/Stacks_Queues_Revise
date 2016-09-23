
public class StackMin {
	public static int arr[]=new int[1000];
	public static int index=0;
	public static int min=Integer.MAX_VALUE;
	public static int minarr[]=new int[100];
	public static int minindex=0;
	
	public void init(){
		minarr[0]=Integer.MAX_VALUE;
	}
	public void push(int val){
		arr[index++]=val;
		if(val<peek2()){			
			push2(val);
		}
	}
	private int peek2() {
		// TODO Auto-generated method stub
		if(minindex>0){
			return minarr[minindex-1];
		}
		return minarr[minindex];
	}
	public int getmin(){
		return pop2();
	}
	private void push2(int min2) {
		// TODO Auto-generated method stub
		minarr[minindex++]=min2;
	}
	public int pop(){
		if(index>0){
			int val= arr[--index];
			if(val==min){
				pop2();
			}
			return val;
		}
		else{
			return -1;
		}
	}
	
	private int pop2() {
		// TODO Auto-generated method stub
		if(minindex>0){
			return minarr[--minindex];
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackMin st=new StackMin();
		st.init();
		st.push(13);
		st.push(15);
		st.push(1);
		st.push(7);
		System.out.println(st.getmin());
		int x=st.pop();
		x=st.pop();
		System.out.println(st.getmin());
		
	}

}

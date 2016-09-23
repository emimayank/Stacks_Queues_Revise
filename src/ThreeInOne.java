
public class ThreeInOne {
	public static int arr[]=new int[300];
	public static int index1=0;
	public static int index2=100;
	public static int index3=200;
	
	public void push1(int val){
		arr[index1++]=val;
	}
	public int pop1(){
		if(index1>0){
			return arr[--index1];
		}
		else{
			return -1;
		}
	}
	
	public void push2(int val){
		arr[index2++]=val;
	}
	public int pop2(){
		if(index2>0){
			return arr[--index2];
		}
		else{
			return -1;
		}
	}
	
	public void push3(int val){
		arr[index3++]=val;
	}
	public int pop3(){
		if(index3>0){
			return arr[--index3];
		}
		else{
			return -1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeInOne ex=new ThreeInOne();
		ex.push1(1);
		ex.push1(2);
		ex.push1(3);
		
		
		System.out.println(ex.pop1());
		ex.push1(4);
		System.out.println(ex.pop1());
		
		System.out.println("Stack 2 ops");
		ex.push2(4);
		ex.push2(5);
		System.out.println(ex.pop2());
		System.out.println(ex.pop2());
	}

}

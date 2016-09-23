
public class StackofPlates {
	public static int arr[]=new int[300];
	public static int st_ht=0;
	public static int index=0;
	public void push(int val){
		if(st_ht<6){
			st_ht++;
		}
		else{
			st_ht=0;
			index++;
		}
		arr[(index*6)+st_ht]=val;		
	}
	public void pop(){
		for(int i=0;i<=st_ht;i++){
			System.out.println(arr[index*6+i]);
		}
		st_ht=0;
		index--;
	}
	public void popAt(int k){
		System.out.println(arr[k*6]);
		arr[k*6]=0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelter {
	public static Queue<String>queueAny=new LinkedList<>();
	public static Queue<String>queueDog=new LinkedList<>();
	public static Queue<String>queueCat=new LinkedList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		enqueue("D1","dog");
		enqueue("C1","cat");
		enqueue("D2","dog");
		enqueue("D3","dog");
		enqueue("C3","cat");
		enqueue("C2","cat");
		enqueue("D4","dog");
		enqueue("C5","cat");
		String anyAnimal1=dequeueAny();
		String dog1=dequeueDog();
		String cat1=dequeueCat();
		String anyAnimal2=dequeueAny();
		System.out.println(anyAnimal1+" "+dog1+" "+cat1+" "+anyAnimal2);
		
	}

	private static String dequeueDog() {
		// TODO Auto-generated method stub
		return queueDog.poll();
	}

	private static String dequeueCat() {
		// TODO Auto-generated method stub
		return queueCat.poll();
	}

	private static String dequeueAny() {
		// TODO Auto-generated method stub
		return queueAny.poll();
	}

	private static void enqueue(String name, String type) {
		// TODO Auto-generated method stub
		queueAny.add(name);
		if(type=="dog"){
			queueDog.add(name);
		}
		else{
			queueCat.add(name);
		}
	}

}

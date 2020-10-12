package map;

public class Main {
	public static void main(String[] args) {
		HashMapImplementation map = new HashMapImplementation();
		map.putData("KING", 100);
		map.putData("BLAKE", 200);
		map.putData(3, 300);
		map.putData("18",500);
		
		System.out.println(map.getData(3));
		System.out.println(map.getData("KING"));	//Index 7
		System.out.println(map.getData("BLAKE"));
		System.out.println(map.getData("18"));	//Index 7
	}
}

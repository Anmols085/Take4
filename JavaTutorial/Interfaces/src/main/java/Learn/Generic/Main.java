package Learn.Generic;

public class Main {
	
	static Pair<Double> pairA = null;
	static Pair<Double> pairB = null;
	
	public static void main(String[] args) {
		pairA = new Pair<Double>(1.1, 2.2);
		pairB = new Pair<Double>(2.2, 1.1);
		
		System.out.println(pairA.addCordinates(pairA, pairB).getFirst()+" "+pairA.addCordinates(pairA, pairB).getSecond());
	}
}

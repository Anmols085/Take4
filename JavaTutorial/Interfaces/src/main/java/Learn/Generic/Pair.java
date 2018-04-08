package Learn.Generic;

public class Pair<T> {
	
	private T first;
	private T second;
	
	public Pair() {
		first = null;
		second = null;
	}
	public Pair(T first, T second ) {
		super();
		this.first = first;
		this.second = second;
	}
	public T getFirst() {
		return first;
	}
	public void setFirst(T first) {
		this.first = first;
	}
	public T getSecond() {
		return second;
	}
	public void setSecond(T second) {
		this.second = second;
	}
	public Pair<Double> addCordinates(Pair<Double> a, Pair<Double> b) {
		Pair<Double> sum = new Pair<Double>();
		sum.setFirst(a.getFirst()+b.getFirst());
		sum.setSecond(a.getSecond()+b.getSecond());
		return sum;
	}
}

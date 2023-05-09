package coll02;

public class GStack<T> {
	int tos;
	Object[] stck;
	public GStack() {
		tos = 0;
		stck = new Object[10];
	} // GStack
	
	public void push(T item) {
		if(tos == 10)
			return;
		stck[tos] = item;
		tos++;
	} // push
	
	public T pop() {
		if(tos == 0)
			return null;
		tos--;
		return (T)stck[tos];
	} // T pop
}

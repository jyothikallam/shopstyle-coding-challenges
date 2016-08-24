package shopstyle.example;

import java.util.Optional;

/**
 * An {@link Integer} implementation of {@link Stack}.
 *
 * <p>Instances of this class are not thread-safe.</p>
 */
final class IntegerStack implements Stack<Integer>{
	
	private final static int DEFAULT_SIZE = 10;
	private int top;
	int size;
	Integer[] stack;
	
	//default constructor
	public IntegerStack(){
		this.size = DEFAULT_SIZE;
		stack = new Integer[this.size];
		top = -1;
	}
	
	public IntegerStack(int size){
		this.size = size;
		stack = new Integer[size];
		top = -1;
	}
	
	public boolean isEmpty() {
		if (top == -1) {
			return true;
		} else
			return false;
	}
	
	public Optional<Integer> peek(){
		if(!isEmpty()){
			return Optional.of(stack[top]);
		} 
		else {
			return Optional.empty();
		}	
	}
	
	public Optional<Integer> pop(){
		if(!isEmpty()){
			int topElem = stack[top];
			stack[top] = null;
			top = top - 1;
			return Optional.of(topElem);
		} 
		else {
			return Optional.empty();
		}
	}
	
	public void push(Integer val){
		if(top +1 < size) {
			stack[top + 1] = val;
			top += 1;
		}
		else if (top+1 >= size){
			 System.out.println("can't add the value to stack");
		}
	}

}

package Homework;

public class lab2_Stack<Item> {
	
		private lab2_Node<Item> top = null;
	    private int size = 0;
	
	    public lab2_Stack() {
			super();
		}

		/* Push an item onto the stack */
	    public void push(Item item) {
	    	lab2_Node<Item> newnode = new lab2_Node<Item>(item);
	    	if(isEmpty()) {
	    		this.top = newnode;
	    	} else {
	    		newnode.setNext(this.top);
	    		this.top = newnode;
	    	}
	    	this.size++;
	    }
	    
	    /* Check if the stack is empty */
	    public boolean isEmpty() {
			return this.size==0;
	    }
	    
	    /* Remove the top item from the stack, and return its data */
	    public Item pop() {
	    	Item temp = this.top.getVal();
	    	this.top = this.top.getNext();
	        return temp;
	    }
	    
	    /* Return the current size of the stack */
	    public int size() {
	        return size;
	    }
	
}

package Homework;

public class lab2_Node<Item> {
		
	private Item val;
	private lab2_Node<Item> prev;
	private lab2_Node<Item> next;
	
	public lab2_Node() {
		super();
	}

	public lab2_Node(Item val) {
		super();
		this.val = val;
	}

	public Item getVal() {
		return val;
	}

	public void setVal(Item val) {
		this.val = val;
	}

	public lab2_Node<Item> getNext() {
		return next;
	}

	public void setNext(lab2_Node<Item> next) {
		this.next = next;
	}

	public lab2_Node<Item> getPrev() {
		return prev;
	}

	public void setPrev(lab2_Node<Item> prev) {
		this.prev = prev;
	}
	
	
	
}

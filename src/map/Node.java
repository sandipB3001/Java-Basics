package map;

public class Node {

	private Object key;
	private Integer hashValue;
	private Object value;
	private Node next;
	public Object getKey() {
		return key;
	}
	public void setKey(Object key) {
		this.key = key;
	}
	public Integer getHashValue() {
		return hashValue;
	}
	public void setHashValue(Integer hashValue) {
		this.hashValue = hashValue;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}

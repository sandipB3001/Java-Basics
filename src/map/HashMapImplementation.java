package map;

public class HashMapImplementation {

	private Node[] nodes;

	public HashMapImplementation() {
		super();
		nodes= new Node[16];
	}
	public void putData(Object key, Object value) {
		Integer hashValue = getHashCode(key);
		Integer index = getIndex(hashValue);
		Node node = new Node();
		node.setKey(key);
		node.setValue(value);
		node.setHashValue(hashValue);
		node.setNext(null);
		if(null==nodes[index])
			nodes[index] = node;
		else {
			Node temp = nodes[index];
			while(temp.getNext()!=null) {
				temp = temp.getNext();
			}
			temp.setNext(node);
		}
	}

	public Object getData(Object key) {
		Integer hashCode = getHashCode(key);
		Integer index = getIndex(hashCode);
		Node node = nodes[index];
		if(null!=node && node.getHashValue().equals(hashCode)
				&& node.getKey().equals(key))
			return node.getValue();
		else if(null!= node && !node.getHashValue().equals(hashCode)) {
			Node temp = nodes[index].getNext();
			while(null!=temp) {
				if(temp.getHashValue().equals(hashCode) && temp.getKey().equals(key))
					return node.getValue();
				temp = temp.getNext();
			}
		}
		return null;
	}

	private Integer getHashCode(Object val) {
		if(null==val)
			return 0;
		return val.hashCode();
	}

	private Integer getIndex(Integer hashValue) {
		return (hashValue & 15);
	}
}

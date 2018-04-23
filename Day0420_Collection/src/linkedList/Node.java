package linkedList;

public class Node { // 문자열 하나를 저장할 수 있는 노드
	private String data;
	Node next;

	public Node() {

	}

	public Node(String data) {
		this.data = data;
		
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Node next() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return data + " ";
	}

}

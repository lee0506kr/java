package linkedList;

public class NodeG<T> { // 문자열 하나를 저장할 수 있는 노드
	private T data;
	NodeG<T> next;

	public  NodeG() {

	}

	public NodeG(T data) {
		this.data = data;
		
	}
	public NodeG(T data, NodeG<T> next ) {
		this.data = data;
		this.next = next;
		
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public NodeG<T> next() {
		return next;
	}

	public void setNext(NodeG<T> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return data + " ";
	}

}

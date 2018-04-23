package linkedList;

public class MyLinkedList {
	// 애가 가져야할 값:
	// node
	// 첫번째 노드만 저장하고 있으면 연결되어 있는 모든 노드들에 접근 가능
	// 데이터가 몇개 있는지 알아야함: size

	private int size;
	private Node head;

	public MyLinkedList() {
		size = 0;
		head = null;
	}

	// 추가하기 add(String)
	// Node를 하나 만들어서, 맨마지막 노드의 next에 붙이기
	public void add(String data) {
		// 맨마지막 노드 가져오는 메서드도 있어야 함 getTail()
		if (head == null) {
			// head가 null이면 아무 데이터도 없기 때문에 next를 하지 못함
			head = new Node(data);
		} else {
			// head가 존재하면 마지막 노드를 얻어와서 새로운

			Node newNode = new Node(data);
			getTail().setNext(newNode);
		}
		size++;
	}

	// 마지막 노드를 가져오는 메서드
	// [head][e][e][e][e][tail]
	// 길이는 6, 다섯번 next를 호출하려면 길이 6에서 마지막 노드를 가져올 수 있음
	// [head] 길이 1이면 next 0번 호출 해야됨
	public Node getTail() {
		// tail 사실은 next가 null인 노드를 찾으면 됩니다.
		Node tail = head;
		
		 for (int i = 1; i < size; i++) { tail = tail.next(); }
		 
		while (tail.next() != null) {
			tail = tail.next();
		}
		return tail;
	}

	public void remove(int index) {
		//지우려는 인덱스의 전에 있는 노드(index-1)를 선택
				//해당노드의 next를 지우려는 node의 next로 지정
				
				//cur : 지우려는 노드
				//prev : 이전 노드
		
		//0번 노드를 지우려고 할때 예외 처리 하기
		//지우려는 노드가 0번 (head)이라면
		if(index == 0) {
			
			head = head.next();
		}else {
			Node cur = head;
			Node prev = null;
			for(int i =0; i<index; i++) {
				prev = cur;
				cur = cur.next();
			}
			prev.setNext(cur.next());
		}
		size --;

	}
//인덱스를 전달받아서 해당 인덱스의 데이터를 반환
	/*public String get(int index) {
		String str = null;
		
		Node cur = head;
		for(int i=0; i<index; i++) {
			cur = cur.next();
		}
		str = cur.getData();
		return str;
	}*/
	public String get(int index) {
		String str = null;
		for(int i=0; i<index; i++) {
			head = head.next();
		}
		str = head.getData();
		return str;	
	}
	

	/*public void set(int index, String data) {
		Node cur = head;
		for(int i=0; i<index;i++) {
			cur =cur.next();
		}
		cur.setData(data);
	}*/

	public void set(int index , String data) {
		Node cur = head; //주소를 저
		
		for(int i=0; i<index; i++) {
		
			cur = cur.next();
		} 
		
		cur.setData(data);
	}
	
	public int size() {
		return this.size;
	}

	public String toString() {
		// 노드들의 데이터를 하나씩 추가해서 문자열 만들어서 반환

		StringBuilder sb = new StringBuilder();

		Node cur = head;

		for (int i = 0; i < size; i++) {
			sb.append(cur.getData()).append(" ");
			cur = cur.next();
		}
		return sb.toString();
	}
}
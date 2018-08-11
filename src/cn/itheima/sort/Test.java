package cn.itheima.sort;



class SinglotLinkedList<T> {
	
	//头部节点
	Node head;
	//当前节点
	Node nodes;
	
	class Node{
		//当前对象的值
		T item;
		//指向下一个节点
		Node next;
		public Node(T item, Node next) {
			super();
			this.item = item;
			this.next = next;
		}
	}
	//增加
	public void add(T obj){
		//封装成一个节点对象
		Node node = new Node(obj, null);
		//判断是否为 头部节点
		if(head==null){
			head = node;
			this.nodes = node;
		}else{
			//如果不是第一个节点，那么指针指向下一个节点位置
			this.nodes.next = node;
			this.nodes = node;
		}
	}
	
	//遍历
	public void foreachList(Node node){
		while(node!=null){
			//如果节点不为空，则获得该节点存储的对象
			System.out.println(node.item);
			node = node.next;
		}
	}
		
}

public class Test{
	public static void main(String[] args) {
		SinglotLinkedList<String> linkedList = new SinglotLinkedList<String>();
		//存储
		
		linkedList.add("aaa");
		linkedList.add("bbb");
		linkedList.add("ccc");
		linkedList.add("ddd");
		linkedList.add("eee");
		linkedList.add("fff");
		linkedList.foreachList(linkedList.head);
		
	}
}

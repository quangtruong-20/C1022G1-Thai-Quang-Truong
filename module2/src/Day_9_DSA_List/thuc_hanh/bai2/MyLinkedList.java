package Day_9_DSA_List.thuc_hanh.bai2;

import javax.xml.soap.Node;

public class MyLinkedList {
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }
    private class  Node {
        private Node next;
        private Object data;

        public Node (Object data){
            this.data=data;
        }
        public Object getData(){
            return this.data;
        }
    }

   public void add (int index,Object data){
        Node temp = head;
        Node holder;

        for (int i =0;i< index-1 && temp.next != null;i++){
//            temp
        }
   }
//    public void addFirst (Object data){}
//
//    public Node get(int index) {
//        return null;
//    }
//    public void printList(){}
}

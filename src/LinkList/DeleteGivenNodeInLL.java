public class DeleteGivenNodeInLL {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node getDeleletedNodeList(Node list, Node node){

        Node temp = list;
        
        if(node == null || node.next == null){
            System.out.println("we can't delete the last element or null in this given list..");
            return null;
        }

        while(list != null){
            if(list.data == node.data){
                list.data = list.next.data;
                list.next = list.next.next;
            }
            list = list.next;
        }
        return temp;
    }
    
     public static void main(String[] args){
        Node list = new Node(1);
        list.next = new Node(2);
        list.next.next = new Node(3);
        list.next.next.next = new Node(4);

       Node head = getDeleletedNodeList(list, list.next.next);
       while(head != null){
        System.out.print(head.data + "->");
        head = head.next;
       }
       System.out.print("null");
    }
}

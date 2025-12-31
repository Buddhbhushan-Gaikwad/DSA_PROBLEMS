public class DeleteGivenNodeInLL {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

     public static Node getCycleInLinkList(Node list) {
        Node slow = list;
        Node fast = list;
        boolean cycle = false;

        // Step 1: Detect if cycle exists
        while (fast != null && slow != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { // meeting point
                cycle = true;
                break;
            }
        }

        if (cycle) {
            System.out.println("cycle detected in the linked list.");
            return slow.next;
        } else{
            System.out.println("No Cycle detected in the linked list.");
            return null;
        }

        // Step 2: Find the start node of the cycle
        // slow = list; // move slow to head

        // while (slow != fast) {
        //     slow = slow.next;
        //     fast = fast.next;
        // }
        

    }

    public static void main(String[] args) {

        Node list = new Node(1);
        list.next = new Node(2);
        list.next.next = new Node(3); 
        list.next.next.next = new Node(4);
        list.next.next.next.next = new Node(5);

        // Create a cycle — 5 -> 3
        list.next.next.next.next.next = new Node(0);

        int count = 0;

        Node temp = getCycleInLinkList(list);
        if(temp != null){
            while (list != null) {
            System.out.print(list.data + " -> ");    
            list = list.next;
            if(list == temp ){
               count++;
               if(count == 2){
                break;
               }
            }
            }
            System.out.print("( continious )");
        } else {
            while (list != null) {
            System.out.print(list.data + " -> ");
            list = list.next;
            }
            System.out.print("null");
        }
    }
}

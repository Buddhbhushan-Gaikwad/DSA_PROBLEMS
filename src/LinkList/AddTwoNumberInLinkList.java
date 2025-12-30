
public class AddTwoNumberInLinkList {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node addTwoNumbers(Node l1, Node l2){

        Node dummy = new Node(0);
        Node current = dummy;
        int carry = 0, sum = 0;

        while(l1 != null || l2 != null){

            sum = carry;

            if(l1 != null){
                sum += l1.data;
                l1 = l1.next;
            }

            if(l2 != null){
                sum += l2.data;
                l2 = l2.next;
            }

            sum += carry;
            carry = sum / 10;
            int digit = sum % 10;

            current.next = new Node(digit);
            current = current.next;
        }

        if(carry > 0){
            current.next = new Node(carry);
        }

        return dummy.next;
    }
    
    public static void main(String[] args) {
        Node l1 = new Node(2);
        l1.next = new Node(1);
        l1.next.next = new Node(2);

        Node l2 = new Node(1);
        l2.next = new Node(1);
        l2.next.next = new Node(9);

        Node head = addTwoNumbers(l1, l2);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}

public class CheckIsPalindrome {
    
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean isPalindrome(Node head){

        Node slow = head;
        Node fast = head;

        while(fast !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node prev = null;
        Node curr = slow;

        while(curr != null){
            
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        Node left = head;
        Node right = prev;

        while(left != null && right != null){

            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }


        return true;
    }

    public static void main(String[] args) {
        
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(1);

        if(isPalindrome(head)){
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }
}



public class AddTwoNumbers {
    public static class Node {
        int data;
        Node next;
    
        Node(){}
        Node(int data){ this.data = data; this.next = null; }
    }
    
    public Node addTwoNumbers(Node list1, Node list2){
        Node dummyHead = new Node(0);
        Node curr = dummyHead;
        int carry = 0;

        while(list1 != null || list2 !=  null || carry != 0) {
            int sum = carry;

            if(list1 != null){
                sum += list1.data;
                list1 = list1.next;
            }

            if(list2 != null){
                sum += list2.data;
                list2 = list2.next;
            }

            carry = sum / 10;
            curr.next = new Node(sum % 10);
            curr = curr.next;
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {
        AddTwoNumbers solution = new AddTwoNumbers();
        
        Node list1 = new Node(2);
        list1.next = new Node(4);
        list1.next.next = new Node(3);

        Node list2 = new Node(5);
        list2.next = new Node(6);
        list2.next.next = new Node(4);

        Node result = solution.addTwoNumbers(list1, list2);

        while(result != null){
            System.out.print(result.data + " ");
            result = result.next;
        }
    }
}
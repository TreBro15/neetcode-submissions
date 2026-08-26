/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> oldCopy = new HashMap<>();

        oldCopy.put(null,null);

        Node current = head;

        while(current != null){
            if(!oldCopy.containsKey(current)){
                oldCopy.put(current,new Node(0));
            }

            oldCopy.get(current).val = current.val;

            if(!oldCopy.containsKey(current.next)){
            oldCopy.put(current.next,new Node(0));
            }

            oldCopy.get(current).next = oldCopy.get(current.next);

            if(!oldCopy.containsKey(current.random)){
                oldCopy.put(current.random, new Node(0));
            }

            oldCopy.get(current).random = oldCopy.get(current.random);
            current = current.next;
        }
        return oldCopy.get(head);
    }
}

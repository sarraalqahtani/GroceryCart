public class Stack <T> extends List <T> {
    Stack() {
        super();
    }

    public void push (T value) {
        Node newNode = new Node(value, null, null); // create new node

        if (empty()) { // empty stack, so create stack with new node
            head = newNode;
        }
        else {
            newNode.next = head; // insert new node at the beginning of stack
            head.prev = newNode; // head's previous is the new node
            head = newNode; // move head to new node
        }
    }

    public T pop () {
        if(!empty()){ // if stack is not empty
            T value = head.value; // save value in first node
            head = head.next; // move head over one node
            if (!empty()) {
                head.prev = null; // head's previous is null
            }
            return value; // return value
        } else {
            return null; // empty list so return null
        }
    }

    // Return the value at the beginning of the stack
    public T peek() {
        if(!empty()){ // if stack is not empty
            return head.value; // return value in first node
        } else {
            return null; // empty list so return null
        }
    }
}

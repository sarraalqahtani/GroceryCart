public class Queue <T> extends List <T> {
    private Node tail; // last node in list

    Queue() {
        super();
        tail = null;
    }

    public void enqueue (T value) {
        Node newNode = new Node(value, null, null); // create new node

        if (empty()) { // empty queue, so create queue with new node
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode; // insert new node at the end of queue
            newNode.prev = tail; // new node's previous is last node
            tail = newNode; // move tail to new node
        }
    }

    public T dequeue () {
        if(!empty()){ // if queue is not empty
            T value = head.value; // save value in first node
            head = head.next; // move tail back one node
            if (!empty()) {
                head.prev = null; // tail's next is null
            }
            return value; // return value
        } else {
            return null; // empty list so return null
        }
    }

    // Return the value at the beginning of the queue
    public T peek() {
        if(!empty()){ // if queue is not empty
            return head.value; // return value in first node
        } else {
            return null; // empty list so return null
        }
    }

}

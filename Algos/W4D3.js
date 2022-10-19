class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}
class Stack {
    constructor() {
        this.top = null;
    }
    // add to top
    push(newNode) {
        if (this.top === null) {
            this.top = newNode;
        } else {
            newNode.next = this.top;
            this.top = newNode;
        }
    }

    pop() {
        if (this.top === null) return null;
        var removed = this.top;
        this.top = this.top.next;
        removed.next = null;
        return removed;
    }

    peek() {
        return this.top;
    }

}


class Queue {
    constructor() {
        this.front = null;
        this.rear = null;

    }

    getFront() {
        if (this.front) {
            return this.front.data;
        } else {
            return null;
        }
    }

    getRear() {
        if (this.rear) {
            return this.rear.data;
        } else {
            return null;
        }
        //return the front
    }

    enqueue(node) {
        // construct a new node and add to the current queue
        if (this.front == null) {
            this.front = node;
            this.rear = node;
        } else {
            this.rear.next = node;
            this.rear = node;
        }
    }

    dequeue() {
        // remove and return from the front of the queue
        if (!this.front) {
            return null;
        }

        const dequeued = this.front;
        this.front = this.front.next;

        if (this.front === null) {
            this.rear = null;
        }
        return dequeued;
    }

    isEmpty() {
        if (this.front) {
            return false;
        } else {
            return true;
        }
        // check if the queue is empty
    }

    printQueue() {
        console.log("Front: " + this.getFront());
        console.log("Rear: " + this.getRear());
        var tempQ = new SLLQueue();
        while (!this.isEmpty()) {
            var tempData = this.dequeue();
            tempQ.enqueue(tempData);
            console.log(tempData);
        }
        while (!tempQ.isEmpty()) {
            var tempData = tempQ.dequeue();
            this.enqueue(tempData);
        }

    }

}


var test1 = new Queue();
test1.enqueue(new Node("a"));
test1.enqueue(new Node("b"));
test1.enqueue(new Node("c"));
test1.enqueue(new Node("d"));
test1.printQueue();


var test2 = new Queue();
test2.enqueue(new Node("a"));
test2.enqueue(new Node("b"));
test2.enqueue(new Node("c"));
test2.enqueue(new Node("d"));

var test3 = new Queue();
test3.enqueue(new Node("a"));
test3.enqueue(new Node("b"));
test3.enqueue(new Node("b"));
test3.enqueue(new Node("a"));


/**
 * Compares 2 qeues to see if they are equal.
 * Avoid indexing the queue items directly via bracket notation, use the
 * queue methods instead for practice.
 * Use no extra array or objects.
 * The queues should be returned to their original order when done.
 * - Time: O(?).
 * - Space: O(?).
 * @param {Queue} q1 q2 The queues to be compared 
 * @returns {boolean} Whether all the items of the two queues are equal and
 *    in the same order.
 */
 function compareQueue(q1, q2){
    current1 = q1.front;
    current2 = q2.front;
    while(current1 || current2){
      if(current1.data == current2.data){
          current1 = current1.next;
          current2 = current2.next;
      }
      else{
        return false
      }
    }
     return true
  }

/**
 * Determines if the queue is a palindrome (same items forward and backwards).
 * Avoid indexing queue items directly via bracket notation, instead use the
 * queue methods for practice.
 * Use only 1 stack as additional storage, no other arrays or objects.
 * The queue should be returned to its original order when done.
 * - Time: O(?).
 * - Space: O(?).
 * @returns {boolean}
 */
function isPalindrome(q) {
}



console.log(compareQueue(test1, test2)) // expected: true
console.log(compareQueue(test1, test3)) // expected: false

console.log(isPalindrome(test3)); // expected : true
console.log(isPalindrome(test2)); // expected : false
// class Node 
class ListNode {
    constructor(data) {
      this.data = data;
      this.next = null;
    }
  }
  
  // class SLL - Singly Linked List
  class SLL {
    constructor() {
      this.head = null;
    }
  
    insertAtBack(data) {
      var newNode = new ListNode(data);
      if (this.head) {
        var runner = this.head;
        while (runner.next) {
          runner = runner.next;
        }
        runner.next = newNode;
      } else {
        this.head = newNode;
      }
    }
    //given
    printList() {
      if (!this.head) {
        console.log("Empty list");
        return
      }
      var runner = this.head;
      while (runner) {
        console.log(runner.data);
        runner = runner.next;
      }
    }
  
    /**
      * Retrieves the data of the second to last node in this list.
      * @returns {any} The data of the second to last node or null 
      *   if there is no second to last node.
      */
    secondToLast() {
      var runner = this.head;
        // finds if the list is empty
      if (runner == null || runner.next == null) {
        return "Empty list";
      }
      while (runner != null) {
          // finds second to last
        if (runner.next.next == null) {
          return runner.data;
        }
          // moves the the next node
        runner = runner.next;
      }
    }
  
    /**
     * Removes the node that has the matching given val as it's data.
     * @param {any} val The value to compare to the node's data 
     *   to find the node to be removed.
     * @returns {boolean} Indicates if a node was removed or not.
     */
    removeData(data) {
      var runner = this.head
      var prev = null
      // if runner has data and runner's data matches, set head to next runner
      if(runner != null && runner.data == data){
        this.head = runner.next;
        return;
      }
      // while runner has data, and the data doesn't match our search, move on to the next node
      while(runner != null && runner.data != data){
        prev = runner
        runner = runner.next;
      }
      // if runner is empty return list is empty
      if(runner == null){
        return "List is Empty";
      }
      prev.next = runner.next;
      
    }
  
      //HINT: The list is constructed by connecting nodes with pointers
      // Play with the pointers so that you can remove that node from the list. 
    // prev, curr
    // level 1 : remove a middle node
    // level 2: remove the node if it is tail
    // level 3: remove the node if it is head
  
  
  }
  
  
  var list1 = new SLL();
  
  var list2 = new SLL();
  list2.insertAtBack(5);
  list2.insertAtBack(6);
  list2.insertAtBack(7);
  list2.insertAtBack(8);
  //       HEAD
  // list2: (1) --> (2) --> (3) --> null
  
  
  list1.printList();
  list2.printList();
  console.log(list2.secondToLast());
  list2.removeData(8);
  list2.printList();
  console.log(list1.secondToLast());
  
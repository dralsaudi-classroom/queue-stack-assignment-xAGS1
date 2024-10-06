package com.example.project;

public class DLL<T> implements List<T>{
	private DLLNode<T> head;
	private DLLNode<T> current;

    public DLL() {
        head = current = null;
    }
    public boolean empty() {
        return head == null;
    }
    public boolean last() {
        return current.next == null;
    }
    public boolean first() {
        return current.previous == null;
    }
    public boolean full() {
        return false;
    }
    public void findFirst() {
        current = head;
    }
    public void findNext() {
        current = current.next;
    }
    public void findPrevious() {
        current = current.previous;
    }
    public T retrieve() {
        return current.data;
    }
    public void update(T val) {
        current.data = val;
    }
    public void insert(T val) {
        DLLNode<T> tmp = new DLLNode<T>(val);
        if(empty()) {
            current = head = tmp;
        }
        else {
            tmp.next = current.next;
            tmp.previous = current;
            if(current.next != null)
                current.next.previous = tmp;
            current.next = tmp;
            current = tmp;
        }
    }
    public void remove() {
        if(current == head) {
            head = head.next;
            if(head != null)
               head.previous = null;
        }
        else {
            current.previous.next = current.next;
            if(current.next != null)
               current.next.previous = current.previous;
        }
        if(current.next == null)
            current = head;
        else
            current = current.next;
    }
	
    public void removeBetween(T e1, T e2) {
        
    	  DLLNode<T> runner = head;
          DLLNode<T> node1 = null;
          DLLNode<T> node2 = null;
          
          boolean exsist1 = false;
          boolean exsist2 = false;
          
          while (runner!=null) {
              if (runner.data.equals(e1)) {
                  node1 = runner;
                  exsist1 = true;
              }
              else if (runner.data.equals(e2)) {
            	  node2 = runner;
            	  exsist2 = true;
                  break;
              }
              runner = runner.next;
          }
          if (exsist1 && exsist2) {
              node1.next = node2;
              node2.previous = node1;
              current = head; 
          }

      }
    
    
    public void All() {
    	
    	DLLNode<T> tmp = head;
    	while(tmp != null) {
    		System.out.print(tmp.data + " -> ");
    		tmp = tmp.next;
    	}
    	
    }
    
    
    
}

    
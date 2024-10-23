package com.example.project;

import com.example.project.LinkedPQ;
import com.example.project.PQElement;
import com.example.project.Queue;

public class QueueStackTester {
    public static <T> void split(Queue<T> q, Queue<T> oq, Queue<T> eq)
    {
    	  // throw new UnsupportedOperationException("Not supported yet.");
        
    	if (q.length() == 0)
    		return;
    	  
          int count = 1;
    	split(q,oq,eq, count);
        
        // Write the recursive static method split that splits a queue of n elements into two
        // queues. The elements with odd orders (i.e. 1st, 3rd, 5th ...) should be put in the
        // first queue and elements with even orders (i.e. 2nd, 4th, 6th ...) should be put in
        // the second queue. The original queue should remain unchanged at the end of the
        // method.
        // Example. Given the queue (A, B, C, D, E), split results in oq (A, C, E), and eq(B, D).
    }
    private static <T> void split(Queue<T> q, Queue<T> oq, Queue<T> eq,  int count)
    {
    	if(count == q.length()+1)
    		return;
    	
    	 T e = q.serve();
    	 if(count%2 ==0) {
    		 eq.enqueue(e);
    		 count++;
    	 }
    	 else {
    		 oq.enqueue(e);
    		 count++;
    	 }
     	q.enqueue(e);
     	
     	split(q, oq, eq,   count);
     	
    }
    public static <T> void remove(LinkedPQ<T> pq, int p)
    {
    	LinkedPQ<T> tmp = new LinkedPQ<T>();
        
    	PQElement<T> pqe;
    	for(int i =0; i < pq.length(); i++) {
    		pqe = pq.serve();
    		if(pqe.p >= p) {
    			tmp.enqueue(pqe.data, pqe.p); ;
    		}
    	}
    }
    	
    public static <T> boolean search(Stack<T> st, T e)
    {
    	if(st.empty())
    		return false;
    	
    	T z = st.pop();
    	if(e.equals(z)) {
    		st.push(z);
    		return true;
    	}
    	 boolean found = search(st, e);
    	    st.push(z);
    	    return found;
    	
      //  throw new UnsupportedOperationException("Not supported yet.");
        // Write the recursive static method search that searches for an element e in a stack st
        // and returns true if it’s found or false otherwise. st should not change at the end of
        // the method. You are not allowed to use any auxiliary data structures.
        // Example. Given the stack st (top-to-bottom): 5, 7, 5, 3, 2. search(st, 3) returns
        // true while search(st, 1) returns false.
    }
}
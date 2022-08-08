	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}
  
  -----------------------------------------------------
  
  public class Solution {

	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
        
        // a temporary variable pointing towards head
        LinkedListNode<Integer> temp = head;
        
        
    	// if no element is present in the list 
        if(head==null){
            return null;
		}
        
        // this while loop will iterate through the whole list and in c will provide the number of nodes to us
		int c = 0;
        while(temp.next!=null){
            c++;
            temp=temp.next;
            
        }
        
        
        // pointing the last element towards the head 
        if(temp!=null){
        temp.next = head;
        }
        
        // finding the element just before the nth last Node  
        int beforeNLast = c - n;
        
        // pointing the temp again to head so that we can traverse to the beforeNLast Node
        temp = head;
        
        for(int i =0;i<beforeNLast;i++){
            temp = temp.next;
            
        }
        if(temp!=null){ // Now temp is pointing to the beforeNLast Node
            
        head = temp.next; // pointing the head to the Nth Last Node
        temp.next = null; // pointing the beforeNLast Node to null as it will be last now.
            
        }
        return head; // Returning the N Last Element which is now added to the first position
	}

}

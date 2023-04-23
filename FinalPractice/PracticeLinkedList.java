public class PracticeLinkedList{

Node head;

private class Node {    
public int data;    
public Node next;    

 public Node(int data){      
 this.data = data;      
 this.next = null;    
 } 
}

 public boolean unsortedFindDuplicates() 
    { 
    	boolean result=false;
        Node current = head; 
        String vals; 

  
       
        while (current != null) { 
            
             vals+= String.valueOf(current.data)+",";
             current=current.next;
        }

        int size= vals.length();

        int[] values= new Int[size];

        for( int i=1; i<size; i++){

        	if( vals.charAt(0)==vals.next()){
        		result = true;
        	}
        }

        return result;        
 }


 public boolean sortedFindDuplicates(){
 		boolean result=false;
 		Node temp= head;

 		while(temp!=null){
 			if(temp=temp.next){
 				result= true;
 			}

 			temp=temp.next;
 		}
 		return result;

 }











 }
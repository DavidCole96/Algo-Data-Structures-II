import java.awt.Dimension;
import java.util.Stack;
public class List{  //need his help here
    ///////////////////////////////////////////////////
    ///////////////////////////////////////////////////
    ////// Replace this arraylist implementation/ ///////
    ////// with a Linked List implementation ///////////
    ///////////////////////////////////////////////////
    //////////////////////////////////////////////////
    
   
    public LLNode head;
    public LLNode tail;
    public int listCount;
    protected LLNode traversal;
    protected LLNode prev;

   
    public List() { // constructors always have the same name as the class
    
    	
    	tail = null;
    	head = null;
    	listCount = 0;
    }
    public int size(){
    	return listCount;
    }
    public void insertItem(String aname) {
    LLNode newNode = new LLNode(aname);
    if (size() == 0){
    head = newNode;
   tail =head;
    listCount++;
    }
    else if(size() != 0){
   tail.setNext(newNode);
    	
    	// tail.setNext(newNode);//possible swap new node and tail
    tail = newNode;
    listCount++;
    }}
    public void insertItem(String aname, int pos){
    	LLNode newNode = new LLNode(aname);
    		if(pos > listCount || pos <0){
        		System.out.println("attempted to insert at a position out of bounds");
        	}
    		else if(pos == 0){   			
    			newNode.setNext(head);
    			head = newNode;
    			listCount++;
    		}
    		else if(pos != 0){	
    		traversal = head;
    			int x = 0;
    			listCount++;
    			LLNode previous = new LLNode();
    			while(traversal != null && x < pos){
    					previous = traversal; 
    					traversal = traversal.getNext();
    					x++;
    					
    				}
    			if(traversal ==null){
    				tail = newNode;
    			}
    				newNode.setNext(previous.getNext());
    				previous.setNext(newNode);
    			}}	 
void removeItem(int pos)  {
	
	if(pos > listCount || pos < 0){
	System.out.println("attempted to remove from a position not in the list");
}

	else if(pos == 0){
		head = head.getNext();
		listCount--;
	}
	else if(pos != 0){
		int x = 0;
		LLNode temp = head;
			while(x < pos-1){
				temp = temp.getNext();
				x++;
	}
			temp.setNext(temp.getNext().getNext());
	if(temp.getNext() == null){
		tail = temp;	
	}
listCount--;}
}
public boolean removeItem(String aname) {
	boolean found = contains(aname);
	LLNode temp = head;
	int dist = 0;
	if(found){
	while(!temp.getData().equals(aname)){
		dist++;
		temp = temp.getNext();
	}
	removeItem(dist);
	}return found;}




public boolean contains(String aname) {
    boolean found = false;	
	LLNode location = head.getNext();//.getnext?
    	while(location != null){
    		if(location.getData().equals(aname)){
    			found = true;
    			return found;
    		
    		}
    		else{
    			//prev = location;
    			location = location.getNext(); }	}
    			return found;}
public void clear() {
   LLNode newNode= null;
	   head = newNode; 
	   listCount = 0;
   }
public String get(int index) {
   
	if(index > listCount && index < 0){
    	System.out.println("attmempt to get item from an index that is out of bounds");
    }
    int DistFromHead =0;{
    /*if(index == 0){
    	LLNode temp = head.getNext();
    	String message = temp.getData();    	
    	return message;
    	*/
    }
    LLNode temp = head;
    for(int i=0;i<listCount;i++){
    	
    	if(DistFromHead == index){
    		String message = temp.getData();
    		return message;
    	}
    	temp = temp.getNext();
    	DistFromHead++;	
    }   	
    	String msg = "not found in this list";
    	return msg;
    }

    public String toHTMLString() {
        String message = "<html>PlayList<br/>";
        LLNode loc = head;
        for(int i = 0;i<listCount;i++){
    		message = message + loc.getData() + "<br/>";
    		loc = loc.getNext();    		
    	} 	
    	return message;
    }
    @Override
    public String toString() {
    	LLNode loc = head;
    	String msg = "";
    	for(int i = 0;i<listCount;i++){
    		msg = msg + loc.getData()+"\n";
    		loc = loc.getNext();	
    		 
    	}
    	return msg;
    }
}
class Song{
	String name;
	LLNode position;
	
	Song(String n, LLNode x){
		name = n;
		position = x;		
	}
	String getName(){return name;}
	LLNode getPosition(){return position;}
}

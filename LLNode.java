

public class LLNode {
	  String name;
	  LLNode link;
	
	  public LLNode(){
		  name = null;
	  }
	  public LLNode(String name){
		this.name = name;
	  }
	  public LLNode(String name, LLNode next)
	  {
	    this.name = name;
	    this.link = next;
	   
	  }
	  public String getData(){ return name;}
	  public void setData(String name){this.name = name;}
	  public LLNode getNext(){return link;}
	  public void setNext(LLNode link){this.link = link;}
	
}

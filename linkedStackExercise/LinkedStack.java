//----------------------------------------------------------------------
// LinkedStack.java         by Dale/Joyce/Weems                Chapter 2
//
// Implements StackInterface using a linked list to hold the elements.
//-----------------------------------------------------------------------


public class LinkedStack<T> implements StackInterface<T>
{
  //only need to keep track of top(head) of linked list
	protected LLNode<T> top; // not sure what I did wrong here

  public LinkedStack()
  {
    top = null; //declaring an empty stack
  }

  public void push(T element)
  // Places element at the top of this stack.
  { //here we are creating and initializng a stack
    LLNode<T> newNode = new LLNode<T>(element); //the <T> is the type, which are generic objects, at run time when we declare a variable will choose a type
    newNode.setLink(top); //linking the node with head idk
    top = newNode;
  }     

  public void pop()
  // Throws StackUnderflowException if this stack is empty,
  // otherwise removes top element from this stack.
  {                  
    if(isEmpty()){
    	throw new StackUnderflowException("Attempted to pop on an empty stack");
    }
	  top = top.getlink();
  }

  public T top()
  // Throws StackUnderflowException if this stack is empty,
  // otherwise returns top element of this stack.
  {    
	  T elt = null;
	  if(isEmpty()){
		  throw new StackUnderflowException("Top on an empty stack");
	  }
	  else{
		  elt = top.getInfo();
	  }
      return elt;
  }

  public boolean isEmpty()
  {              
     boolean answer = (head == null);
	  return answer;
  }

  public boolean isFull()
  {              
      return false;  //done for the interface requirements, will not be used
  }

}


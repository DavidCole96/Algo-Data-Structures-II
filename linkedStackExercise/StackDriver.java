

public class StackDriver 
{
  public static void main(String[] args)
  {
      StackInterface<String> test;
      test = new LinkedStack<String>();
      
      test.push("amet");
      test.push("sit");
      test.push("dolor");
      test.push("ipsum");
      test.push("Lorem");
      
      while(!test.isEmpty()){
          System.out.println(test.top());
          test.pop();
      }
  }
}

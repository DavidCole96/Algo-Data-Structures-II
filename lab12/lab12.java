
public class lab12 {
	public static void main(String[] args){
		BinarySearchTree<String> testBST = new BinarySearchTree<>();
		testBST.add("hello");
		testBST.add("yes");
		testBST.add("this");
		testBST.add("is");
		testBST.add("dog");
		
		System.out.println("Print the elements in the tree in sorted order:");
		for(String s : testBST)
			System.out.println(s);
		System.out.println("\nTest methods:");
		System.out.println("min2 (expect \"dog\"): " + testBST.min2());
		System.out.println("leafCount (expect 2): " + testBST.leafCount());
		System.out.println("height (expect 3): " + testBST.height() + "\n");
	}

}

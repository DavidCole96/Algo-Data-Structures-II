import java.util.*;

public class HuffmanTree {
	Node root;
	
	public HuffmanTree(){
		PriorityQueue<Node> characters = new PriorityQueue<>();
		characters.add(new Node(3,' '));
		characters.add(new Node(2, 'a'));
		characters.add(new Node(2, 'e'));
		characters.add(new Node(2, 'm'));
		characters.add(new Node(2, 'o'));
		characters.add(new Node(1, 'd'));
		characters.add(new Node(1, 'g'));
		characters.add(new Node(1, 'h'));
		characters.add(new Node(1, 'r'));
		characters.add(new Node(1, 's'));
		characters.add(new Node(1, 'u'));
		characters.add(new Node(1, 'v'));
		
		Node current = null;
		while(characters.size() > 1){
			Node left = characters.poll();
			Node right = characters.poll();
			current = new Node(left.freq + right.freq);
			current.left = left;
			current.right = right;
			characters.add(current);
		}
		root = current;
	}
	
	public void decode(String s){
		//IMPLEMENT: traverse the tree and print the letters in succession to reveal the message
		
	}

	
	public static void main(String[] args){
		HuffmanTree lab = new HuffmanTree();
		lab.decode("101110011000011111001111101100000010101111101001000110110010101");
	}
	
	//The Huffman tree node class: DO NOT MODIFY
	private class Node implements Comparable<Node>{
		char data;
		int freq;
		Node left;
		Node right;
		
		Node(int freq){
			data = '~';
			this.freq = freq;
			left = null;
			right = null;
		}
		
		Node(int freq, char c){
			data = c;
			this.freq = freq;
			left = null;
			right = null;
		}
		
		public int compareTo(Node node){
			return (this.freq - node.freq);
		}
		
		public boolean isLeaf(){
			return (left == null && right == null);
		}
		
		@Override
		public String toString(){
			String toReturn = freq + ": " + data;
			return toReturn;
		}

	}
}
package org.digitalstain.datrie;

public class TestDoubleArrayTrieWrapper {
	public static void main(String []args) {
		DoubleArrayTrie datrie = new DoubleArrayTrie(Character.MAX_VALUE);	
		System.out.println(datrie.find("hello"));
		String s = "hello";
		datrie.put(s);
		System.out.println(datrie.find("hello"));
		datrie.remove(s);
		System.out.println(datrie.find("hello"));
	}
}

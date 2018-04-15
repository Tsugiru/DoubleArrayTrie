package org.digitalstain.datrie;

import org.digitalstain.datrie.store.IntegerList;

/**
 * A wrapper for the methods in DoubleArrayTrie and
 * DoubleArrayTrieImpl that rename the methods to 
 * names people are usually more familiar with such as the ones
 * found in standard STL implementations, it also allows us to 
 * insert strings instead of just lists of integers.
 */
class DoubleArrayTrie {
	DoubleArrayTrieImpl datrie;

	/**
	 * Constructs a DoubleArrayTrie by using the DoubleArrayTrieImpl Contructor
	 *
	 * @param alphabetLength The size of the set of values that are to be stored
	 */
	public DoubleArrayTrie(int alphabetLength) {
		datrie = new DoubleArrayTrieImpl(alphabetLength);
	}

	/**
	 * Adds a key to the trie by using the addToTrie method, originally implemented in the AbstractDoubleArrayTrie.java file
	 *
	 * @param key The key to be inserted into the trie
	 */	
	public boolean put(String key) {
		IntegerList intKey = new IntegerArrayList(key.length());
		for(int i = 0; i < key.length(); i++) {
			intKey.add((int)key[i]);
		}
		datrie.addToTrie(intKey);
	}

	/**
	 * Here, SearchResult is an enum type that encompasses the three cases we could have when we query the trie
	 * 1- PERFECT_MATCH: This is when the search ends successfully at a leaf node, meaning the key is present in the trie
	 * 2- PURE_PREFIX: When the search ends at a non-leaf node, meaning that thethe key we used to query the trie is in fact not present in the trie, but is a prefix of another key
	 * 3- NOT_FOUND: Neither of the above two, the key is not recognized by the trie.
	 *
	 * @param key The key to be used when querying the trie.
	 */
	public SearchResult find(String key) {
		IntegerList intKey = new IntegerArrayList(key.length());
		for(int i = 0; i < key.length(); i++) {
			intKey.add((int)key[i]);
		}
		SearchResult result = containsPrefix(intKey);
		return result;
	}
	
	/**
	 * Deletes the key from the trie
	 *
	 * @param key The key to be deleted.
	 */
	public boolean remove(String key) {
		//TODO: implement the remove method in the AbstractDoubleArrayTrie.java file
	}
}

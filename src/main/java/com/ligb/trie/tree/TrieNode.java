package com.ligb.trie.tree;

import java.io.Serializable;
import java.util.HashMap;

public class TrieNode implements Serializable {

    private boolean isWord = false;
    private HashMap<Character, TrieNode> children;

    public boolean isWord() {
        return isWord;
    }

    public void setWord(boolean word) {
        isWord = word;
    }

    public HashMap<Character, TrieNode> getChildren() {
        return children;
    }

    public void setChildren(HashMap<Character, TrieNode> children) {
        this.children = children;
    }
}

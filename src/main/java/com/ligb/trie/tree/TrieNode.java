package com.ligb.trie.tree;

import java.io.Serializable;
import java.util.HashMap;

public class TrieNode implements Serializable {

    private String word;
    private HashMap<Character, TrieNode> children;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public HashMap<Character, TrieNode> getChildren() {
        return children;
    }

    public void setChildren(HashMap<Character, TrieNode> children) {
        this.children = children;
    }
}

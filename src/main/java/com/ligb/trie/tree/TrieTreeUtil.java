package com.ligb.trie.tree;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;

public class TrieTreeUtil {

    private final HashMap<Character, TrieNode> children = new HashMap<>();

    public void add(String word){
        if(StringUtils.isBlank(word) || StringUtils.isBlank(word.trim())){
            return;
        }
        word = word.trim().replace(" ", "");

        char[] keys = word.toCharArray();
        HashMap<Character, TrieNode> point = children;
        for (int i = 0; i < keys.length; i++) {
            TrieNode node = point.get(keys[i]);
            if (node == null) {
                node = new TrieNode();
                point.put(keys[i], node);
            }
            if (i == (keys.length - 1)) {
                node.setWord(word);
                break;
            }
            if (node.getChildren() == null) {
                node.setChildren(new HashMap<>());
            }
            point = node.getChildren();
        }
    }

    public String contains(String word){
        if(StringUtils.isBlank(word) || StringUtils.isBlank(word.trim())){
            return null;
        }
        word = word.trim().replace(" ", "");
        char[] keys = word.toCharArray();
        for(int i = 0; i < keys.length; i++){
            String ret = contains(keys, i, children);
            if(ret != null){
                return ret;
            }
        }
        return null;
    }

    private String contains(char[] keys, int begin, HashMap<Character, TrieNode> children){
        for(int i = begin; i < keys.length; i++){
            TrieNode node = children.get(keys[i]);
            if (node == null) {
                return null;
            }
            if(node.getWord() != null){
                return node.getWord();
            }
            children = node.getChildren();
        }
        return null;
    }

    private void add(char[] keys, HashMap<Character, TrieNode> children){

    }

    public HashMap<Character, TrieNode> getChildren() {
        return children;
    }
}

import com.sun.source.tree.Tree;

import java.util.*;
public class WordSearchTrie {
    public static class TrieNode{
        Map<Character, TrieNode> children;
        boolean terminates = false;

        public TrieNode(){
            children = new HashMap<Character, TrieNode>();
        }

        public void addWord(String word){
            if(word==null || word.length()==0){
                return;
            }

            char firstChar = word.charAt(0);
            TrieNode child = children.get(firstChar);
            if(child==null){
                child = new TrieNode();
                children.put(firstChar,child);
            }
            if(word.length()>1){
                child.addWord(word.substring(1));
            }
            else{
                child.terminates = true;
            }
        }

        public boolean contains(String prefix){

            if(prefix==null || prefix.length()==0){
                return false;
            }
            TrieNode child = children.get(prefix.charAt(0));
            if(child==null){
                return false;
            }
            else{
                if(prefix.length()>1){
                    return child.contains(prefix.substring(1));
                }
                else{
                    return terminates;
                }
            }
        }

    }

    public static List<String> findWords(char[][] board, String[] words) {
        Set<String> out = new HashSet<>();
        TrieNode trie = new TrieNode();
        for(String word : words){
            trie.addWord(word);
        }

        int m = board[0].length;
        int n = board.length;
        boolean[][] visited = new boolean[n][m];
        for(int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                String prefix = String.valueOf(board[i][j]);
                TrieNode child = trie.children.get(board[i][j]);
                if(child==null){
                    continue;
                }
                else{
                    if(child.terminates){
                        out.add(prefix);
                    }
                    visited[i][j] = true;
                    findWordsHelper(board, child, prefix, i, j, visited, out);
                    visited[i][j] = false;
                }
            }
        }

        List<String> list = new ArrayList<>();
        for(String str : out){
            list.add(str);
        }
        return list;
    }

    public static void findWordsHelper(char[][] board, TrieNode trie , String prefix, int i, int j, boolean[][] visited, Set<String> out){

        if(j+1<board[0].length && !(visited[i][j+1])) {
            String right = String.valueOf(board[i][j + 1]);
            TrieNode child = trie.children.get(board[i][j+1]);
            if(child!=null){
                if(child.terminates){
                    out.add(prefix.concat(right));
                }
                visited[i][j + 1] = true;
                findWordsHelper(board, child, prefix.concat(right), i, j+1, visited, out);
                visited[i][j+1] = false;
            }
        }


        if(j-1>=0 && !(visited[i][j-1])) {
            String left = String.valueOf(board[i][j - 1]);
            TrieNode child = trie.children.get(board[i][j - 1]);
            if (child != null) {
                if (child.terminates) {
                    out.add( prefix.concat(left));
                }
                visited[i][j - 1] = true;
                findWordsHelper(board, child, prefix.concat(left), i, j - 1, visited, out);
                visited[i][j - 1] = false;
            }
        }


        if(i+1<board.length && !(visited[i+1][j])) {
            String up = String.valueOf(board[i + 1][j]);
            TrieNode child = trie.children.get(board[i + 1][j]);
            if (child != null) {
                if (child.terminates) {
                    out.add(prefix.concat(up));
                }
                visited[i + 1][j] = true;
                findWordsHelper(board, child, prefix.concat(up), i + 1, j, visited, out);
                visited[i + 1][j] = false;
            }
        }


        if(i-1>=0 && !(visited[i-1][j])) {
            String down = String.valueOf(board[i - 1][j]);
            TrieNode child = trie.children.get(board[i-1][j]);
            if(child!=null) {
                if (child.terminates) {
                    out.add(prefix.concat(down));
                }
                visited[i-1][j] = true;
                findWordsHelper(board, child, prefix.concat(down), i-1, j, visited, out);
                visited[i-1][j] = false;
            }
        }

        return;
    }

    public static void main(String[] args){
        char[][] board = new char[][]{{'o', 'a', 'a', 'n'}, {'e', 't', 'a', 'e'}, {'i', 'h', 'k', 'r'}, {'i', 'f', 'l', 'v'}};
        String[] words = new String[]{"oath","pea","eat","rain"};
        List<String> out = findWords(board, words);
        System.out.println(out.toString());
    }

}

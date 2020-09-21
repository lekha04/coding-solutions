import java.util.*;
public class WordSearchII {

    public static List<String> findWords(char[][] board, String[] words) {
        Set<String> out = new HashSet<>();
        Set<String> set = new HashSet<>();
        for(String word : words){
            set.add(word);
        }

        int m = board[0].length;
        int n = board.length;
        boolean[][] visited = new boolean[n][m];
        for(int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                String prefix = String.valueOf(board[i][j]);
                if(set.contains(prefix)){
                    out.add(prefix);
                }
                visited[i][j] = true;
                findWordsHelper(board, set, prefix, i, j, visited, out);
                visited[i][j] = false;

            }
        }

        List<String> list = new ArrayList<>();
        for(String str : out){
            list.add(str);
        }
        return list;
    }

    public static void findWordsHelper(char[][] board, Set<String> set , String prefix, int i, int j, boolean[][] visited, Set<String> out){

        if(j+1<board[0].length && !(visited[i][j+1])) {
            String right = String.valueOf(board[i][j + 1]);
            visited[i][j + 1] = true;
            if(set.contains(prefix.concat(right))){
                out.add(prefix.concat(right));
            }
            findWordsHelper(board, set, prefix.concat(right), i, j+1, visited, out);
            visited[i][j+1] = false;
        }


        if(j-1>=0 && !(visited[i][j-1])) {
            String left = String.valueOf(board[i][j - 1]);
            visited[i][j - 1] = true;
            if(set.contains(prefix.concat(left))){
                out.add(prefix.concat(left));
            }
            findWordsHelper(board, set, prefix.concat(left), i, j-1, visited, out);
            visited[i][j-1] = false;
        }


        if(i+1<board.length && !(visited[i+1][j])) {
            String up = String.valueOf(board[i + 1][j]);
            visited[i + 1][j] = true;
            if(set.contains(prefix.concat(up))){
                out.add(prefix.concat(up));
            }
            findWordsHelper(board, set, prefix.concat(up), i+1, j, visited, out);
            visited[i+1][j] = false;
        }


        if(i-1>=0 && !(visited[i-1][j])) {
            String down = String.valueOf(board[i - 1][j]);
            visited[i - 1][j] = true;
            if(set.contains(prefix.concat(down))){
                out.add(prefix.concat(down));
            }
            findWordsHelper(board, set, prefix.concat(down), i-1, j, visited, out);
            visited[i - 1][j] = false;
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

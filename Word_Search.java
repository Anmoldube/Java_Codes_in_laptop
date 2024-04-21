public class Word_Search {
    public static void main(String[] args) {
        char[][] maze = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
        String word = "ABCCED";
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                if (maze[i][j] != word.charAt(0)) {
                    continue;
                } else {
                    boolean ans = FindWord(maze, i, j, word, 0);
                    if (ans == true) {
                        System.out.println(ans);
                        return;
                    }
                }
            }
            System.out.println(false);
        }
    }

    public static boolean FindWord(char[][] maze, int cr, int cc, String str, int idx) {
        if(idx==str.length()){
            return true;
        }
        if (cc < 0 || cc >= maze[0].length || cr < 0 || cr >= maze.length || maze[cr][cc] != str.charAt(idx)) {
            return false;
        }
        int[] r = { -1, 1, 0, 0 };
        int[] c = { 0, 0, 1, -1 };
        maze[cr][cc] = '*';
        for (int i = 0; i < c.length; i++) {
            boolean ans = FindWord(maze, cr + r[i], cc + c[i], str, idx+1);
             if(ans == true)
                return true;
        }
        maze[cr][cc] = str.charAt(idx);
        return false;
    }
}
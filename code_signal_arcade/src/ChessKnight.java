/*50. Given a position of a knight on the standard chessboard, find the number of different moves the knight can perform.

The knight can move to a square that is two squares horizontally and one square vertically, or two squares vertically and one square horizontally away from it. The complete move therefore looks like the letter L. Check out the image below to see all valid moves for a knight piece that is placed on one of the central squares.



Example

For cell = "a1", the output should be
chessKnight(cell) = 2.



For cell = "c2", the output should be
chessKnight(cell) = 6.

*/

public class ChessKnight {

    int chessKnight2(String cell) {

        int col = cell.charAt(0) - 'a';

        int row = cell.charAt(1) - '0';
        // System.out.println(col);
        // System.out.println(row);

        int count=0;

        if(row-2>=1 && col-1>=0) count++;
        if(row-2>=1 && col+1<=7) count++;
        if(row-1>=1 && col-2>=0) count++;
        if(row-1>=1 && col+2<=7) count++;

        if(row+2<=8 && col-1>=0) count++;
        if(row+2<=8 && col+1<=7) count++;
        if(row+1<=8 && col-2>=0) count++;
        if(row+1<=8 && col+2<=7) count++;

        return count;

    }

    int chessKnight(String cell){
        char col = cell.charAt(0);
        char row = cell.charAt(1);

        int count = 8;

        if(col=='b' || col=='g'){
            count-=2;
        }

        if(row=='2' || row=='7'){
            count-=2;
        }

        if(col=='a' || col=='h'){
            count/=2;
        }

        if(row=='1' || row=='8'){
            count/=2;
        }

        return count;
    }

}

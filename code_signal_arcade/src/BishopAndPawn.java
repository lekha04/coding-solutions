/*42. Given the positions of a white bishop and a black pawn on the standard chess board, determine whether the bishop can capture the pawn in one move.

The bishop has no restrictions in distance for each move, but is limited to diagonal movement. Check out the example below to see how it can move:


Example

For bishop = "a1" and pawn = "c3", the output should be
bishopAndPawn(bishop, pawn) = true.



For bishop = "h1" and pawn = "h3", the output should be
bishopAndPawn(bishop, pawn) = false.

*/

public class BishopAndPawn {

    boolean bishopAndPawn(String bishop, String pawn) {

        int x1 = bishop.charAt(0) - 'a';
        int y1 = (int) bishop.charAt(1);

        int x2 = pawn.charAt(0) - 'a';
        int y2 = (int) pawn.charAt(1);

        if(Math.abs(x1-x2) == Math.abs(y1-y2)){
            return true;
        }

        return false;

    }

}

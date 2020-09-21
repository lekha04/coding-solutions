/*29. Given two cells on the standard chess board, determine whether they have the same color or not.

Example

For cell1 = "A1" and cell2 = "C3", the output should be
chessBoardCellColor(cell1, cell2) = true.



For cell1 = "A1" and cell2 = "H3", the output should be
chessBoardCellColor(cell1, cell2) = false.

*/

public class ChessBoardCellColor {

    boolean chessBoardCellColor(String cell1, String cell2) {

        String[] cells = new String[2];
        cells[0] = cell1;
        cells[1] = cell2;

        for(int i=0; i<2; i++){
            char c1 = cells[i].charAt(0);
            char c2 = cells[i].charAt(1);

            if(c1=='A' || c1=='C' || c1=='E' || c1=='G'){
                if(c2%2==0){
                    cells[i] = "light";
                }
                else{
                    cells[i] = "dark";
                }
            }
            else{
                if(c2%2==0){
                    cells[i] = "dark";
                }
                else{
                    cells[i] = "light";
                }
            }
        }

        if(cells[0].equals(cells[1])){
            return true;
        }

        return false;


        // char c1 = cell1.charAt(0);
        // char c2 = cell1.charAt(1);
        // String color1 = "";

        // if(c1=='A' || c1=='C' || c1=='E' || c1=='G'){
        //     if(c2%2==0){
        //         color1 = "light";
        //     }
        //     else{
        //         color1 = "dark";
        //     }
        // }
        // else{
        //     if(c2%2==0){
        //         color1 = "dark";
        //     }
        //     else{
        //         color1 = "light";
        //     }
        // }

        // c1 = cell2.charAt(0);
        // c2 = cell2.charAt(1);
        // String color2 = "";

        // if(c1=='A' || c1=='C' || c1=='E' || c1=='G'){
        //     if(c2%2==0){
        //         color2 = "light";
        //     }
        //     else{
        //         color2 = "dark";
        //     }
        // }
        // else{
        //     if(c2%2==0){
        //         color2 = "dark";
        //     }
        //     else{
        //         color2 = "light";
        //     }
        // }

        // if(color1.equals(color2)){
        //     return true;
        // }

        // return false;
    }

}

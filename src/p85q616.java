import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class p85q616 {
    public static void main(String[] args) {

    }

    public static boolean theSudokuCheckerProblem(List<List<Integer>> sudokuTable){
        for (int i = 0; i < 9; i++){
            List<Integer> lineCheck = new ArrayList<>(Collections.nCopies(9,0));
            List<Integer> rowCheck = new ArrayList<>(Collections.nCopies(9,0));

            for (int j = 0 ; j < 9; j++){
                if (sudokuTable.get(j).get(i) != 0) {
                    if (lineCheck.get(sudokuTable.get(j).get(i) - 1) != 0)
                        return false;
                    lineCheck.set(sudokuTable.get(j).get(i) - 1, 1);
                }
                if (sudokuTable.get(i).get(j) != 0 ) {
                    if (rowCheck.get(sudokuTable.get(i).get(j) - 1) != 0)
                        return false;
                    rowCheck.set(sudokuTable.get(i).get(j) - 1, 1);
                }
                if (i % 3 == 0 && j % 3 == 0){
                    List<Integer> subCheck = new ArrayList<>(Collections.nCopies(9,0));
                    for (int k = 0; k < 3; k++){
                        for (int t = 0; t < 3; t++){
                            if (sudokuTable.get(i+k).get(j+t) != 0 ) {
                                if (subCheck.get(sudokuTable.get(i+k).get(j+t) - 1) != 0)
                                    return false;
                                subCheck.set(sudokuTable.get(i+k).get(j+t) - 1, 1);
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}



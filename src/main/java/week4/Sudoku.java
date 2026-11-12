package week4;

public class Sudoku {

    public static void main(String[] args) {
        int[][] sudoku = new int[][] {
                { 0, 9, 0, 0, 0, 0, 1, 1, 0 },
                { 8, 0, 4, 0, 2, 0, 3, 0, 7 },
                { 0, 6, 0, 9, 0, 7, 0, 2, 0 },
                { 0, 0, 5, 0, 3, 0, 1, 0, 0 },
                { 0, 7, 0, 5, 0, 1, 0, 3, 0 },
                { 0, 0, 3, 0, 9, 0, 8, 0, 0 },
                { 0, 2, 0, 8, 0, 5, 0, 6, 0 },
                { 1, 0, 7, 0, 6, 0, 4, 0, 9 },
                { 0, 3, 0, 0, 0, 0, 0, 8, 0 }
        };

        checkRows(sudoku);
        checkColumns(sudoku);
        checkFields(sudoku);
    }

    public static void checkRows(int[][] sudoku) {
        for(int i = 0; i < sudoku.length; i++) {
            //Array in dem alle Zahlen sind, die noch nicht aufgetaucht sind. Wenn eine auftauch wird sie durch -1 ersetzt. Wenn eine Zahl gesucht aber nciht gefunden wird wurde sie bereits genutzt also ein fehler
            int[] checked = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
            for(int j = 0; j < sudoku[i].length; j++) {
                if (sudoku[i][j] == 0) {
                    continue;
                }

                //Der index an dem die gefundene Nummer im Array steht. Wenn -1 wurde die Zahl nicht gefunden
                int index = containsIntAt(checked, sudoku[i][j]);

                if (index != -1) {
                    checked[index] = -1;
                } else {
                    System.out.println("Duplicate number '" + sudoku[i][j] + "' in row " + i);
                }
            }
        }
    }

    public static void checkColumns(int[][] sudoku) {
        for(int i = 0; i < sudoku.length; i++) {
            int[] checked = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};

            for(int j = 0; j < sudoku[i].length; j++) {
                //Vertauschen von i und j um die Spalten zu betrachten
                if (sudoku[j][i] == 0) {
                    continue;
                }

                int index = containsIntAt(checked, sudoku[j][i]);

                if (index != -1) {
                    checked[index] = -1;
                } else {
                    System.out.println("Duplicate number '" + sudoku[j][i] + "' in column " + i);
                }
            }
        }
    }

    public static void checkFields(int[][] sudoku) {
        //Loopen über die Felder 0-9
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                int[] checked = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};

                //Loopen über die Kästchen innerhalb des aktuellen Feldes
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {

                        //Kooardinaten des aktuellen Kästchens
                        int row = i * 3 + k;
                        int col = j * 3 + l;

                        if (sudoku[row][col] == 0) {
                            continue;
                        }

                        int index = containsIntAt(checked, sudoku[row][col]);

                        if (index != -1) {
                            checked[index] = -1;
                        } else {
                            System.out.println("Duplicate number '" + sudoku[row][col] + "' in square " + i + ", " + j);
                        }
                    }
                }
            }
        }
    }

    public static int containsIntAt(int[] array, int searchNum) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchNum) {
                return i;
            }
        }

        return -1;
    }

}

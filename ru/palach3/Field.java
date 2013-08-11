package ru.palach3;

public class Field {
    private static final int FIELD_SIZE = 3;
    private static final char DEFAULT_FIELD = ' ';
    private static final String LEFT_FIELD = "[";
    private static final String RIGHT_FIELD = "]";

    private char[][] field = new char[FIELD_SIZE][FIELD_SIZE];

    public void eraseField() {
        for(int i = 0; i < FIELD_SIZE; i++) {
            erseLine(i);
        }
    }

    public void erseLine(int lineNumber) {
        for(int i = 0; i < FIELD_SIZE; i++) {
            field[i][lineNumber] = DEFAULT_FIELD;
        }
    }

    public void showField() {
        System.out.println();
        for(int i = 0; i < FIELD_SIZE; i++) {
            showLine(i);
            System.out.println();
        }
        System.out.println();
    }

    private void  showLine(int lineNumber) {
        for(int i = 0; i < FIELD_SIZE; i++) {
            showCell(i, lineNumber);
        }
    }

    private void showCell(int x, int y) {
        System.out.print(LEFT_FIELD + field[x][y] + RIGHT_FIELD);
    }


}

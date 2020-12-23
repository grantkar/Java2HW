package lesson2_hw2;

public class MyArraySizeException extends IndexOutOfBoundsException{
    private String [][] strings;

    public String[][] getStrings() {
        return strings;
    }

    public MyArraySizeException(String s) {
        super(s);
    }

    public MyArraySizeException(String s, String[][] strings) {
        super(s);
        this.strings = strings;
    }
}

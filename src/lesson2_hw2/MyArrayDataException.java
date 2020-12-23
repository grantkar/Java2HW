package lesson2_hw2;

public class MyArrayDataException extends NumberFormatException{
    private String [][] strings;

    public String[][] getStrings() {
        return strings;
    }

    public MyArrayDataException(String s, String[][] strings) {
        super(s);
        this.strings = strings;
    }


}

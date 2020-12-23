package lesson2_hw2;

public class MainHW2App {
    public static void main(String[] args) {

        int x = 0;
        int y = 0;

        String [][] s1 = {
                { "5", "2", "5", "4"},
                { "1", "5" ,"3"},
                { "1", "2", "5", "5"},
                { "1", "2", "3", "4"}
        };
        String [][] s2 = {
                { "5", "2", "5", "4"},
                { "1", "5","sdf" ,"3"},
                { "1", "2", "5", "5"},
                { "1", "2", "3", "4"}
        };
        String [][] s3 = {
                { "5", "2", "5", "4"},
                { "1", "5","5" ,"3"},
                { "1", "2", "5", "5"},
                { "1", "2", "3", "4"}
        };


       try {
           checkArr(s2);
           try {
               System.out.println(sumArray(s3));
           }
           catch (MyArraySizeException e) {
               e.printStackTrace();
           }

       }
       catch (MyArrayDataException e){
           e.printStackTrace();
       }

        System.out.println("End");

    }


    static int sumArray (String [][] arr){
        int sumArr = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i].length != 4 || arr[j].length != 4){
                    throw new MyArraySizeException("Массив должен быть размером 4*4!!!", arr);
                }
                else {

                    int x = Integer.parseInt(arr[i][j]);
                    sumArr = sumArr + x;
                }
            }
        }
        return sumArr;
    }
    public static void checkArr(String[][] strings) {

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                int [][]intArray = new int[4][4];
                try {
                    intArray[i][j]=Integer.parseInt(strings[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("В массиве есть Не число в ячейке " + i+j, strings);
                }
            }
        }
    }

}




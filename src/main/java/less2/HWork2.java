package less2;


import java.util.Random;

public class HWork2 {

    public static void main(String[] args) {
        int sizeArray = 4;
        int boundRandom = 100;
        String[][] arr1 = new String[4][4];

        fillArray(arr1, boundRandom);
        arr1[2][3] = "25t";     // for exception IllegalArgumentException
        arr1[2][2] = "t";     // for exception IllegalArgumentException
        processingArray(arr1, sizeArray);


    }

    static void fillArray(String[][] myArray, int boundRandom) {
        for (int i = 0; i < myArray.length; i++)
            for (int j = 0; j < myArray.length; j++) {
                Random random = new Random();
                myArray[i][j] = "0" + (random.nextInt(boundRandom));
            }
    }

    public static boolean parseStr(String str) {
        try {
            Integer.parseInt(str);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }

    }

    public static void processingArray(String[][] myArray, int size) {
        int result = 0;
        try {
            if ((myArray.length != size) || (myArray[0].length != size)) {
                throw new MySizeArrayException(String.format("Размер массива != [%d][%d]\n", size, size));
            }
        }
        catch (MySizeArrayException e) {
            e.printStackTrace();
            System.exit(1);
        }

        for (int i = 0; i < myArray.length; i++)
            for (int j = 0; j < myArray.length; j++) {
                try {
                    if (parseStr(myArray[i][j])) {
                        result += Integer.parseInt(myArray[i][j]);
                    }
                    else
                        throw new MyArrayDataException(i, j);
                }
                catch (MyArrayDataException e) {
                    e.printStackTrace();
                }

            }
        System.out.println("Сумма всех ЧИСЛОВЫХ значений массива: " + result);
    }
}


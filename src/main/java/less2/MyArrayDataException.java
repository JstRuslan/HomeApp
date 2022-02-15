package less2;

import java.io.IOException;

public class MyArrayDataException extends IllegalArgumentException {

    public MyArrayDataException( int indexI, int indexJ) {
        super(String.format("В ячейке[%d][%d] не корректные данные!", indexI, indexJ ));
    }

}

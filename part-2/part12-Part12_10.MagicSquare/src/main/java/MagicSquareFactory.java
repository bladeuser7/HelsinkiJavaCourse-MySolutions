
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {
        MagicSquare square = new MagicSquare(size);

        int counter = 0;
        if (size % 2 != 0) {

            int currentRow = (square.getHeight() + 0) / 2;
            int currentColumn = 0;
            
            for (int col = 0; col < square.getHeight(); col++) {
                for (int row = 0; row < square.getWidth(); row++) {
                    counter++;
                    if (square.readValue(currentRow, currentColumn) == 0 || square.readValue(currentRow, currentColumn) == -1) {
                        square.placeValue(currentRow, currentColumn, counter);
                    } else if (square.readValue(currentRow, currentColumn) >= 0) {
                        currentColumn = currentColumn + 2;
                        currentRow -= 1;
                        if (currentRow < 0) {
                            currentRow = square.getHeight() - 1;
                        }
                        if (currentColumn > square.getHeight()) {
                            currentColumn = 1;
                        }
                        square.placeValue(currentRow, currentColumn, counter);
                    }
                    currentRow = currentRow + 1;
                    currentColumn = currentColumn - 1;
                    if (currentColumn < 0) {
                        currentColumn = square.getHeight() - 1;
                    }
                    if (currentRow > square.getHeight() - 1) {
                        currentRow = 0;
                    }
                }
            }
        }
        // implement the creation of a magic square with the Siamese method algorithm here
        return square;
    }

}

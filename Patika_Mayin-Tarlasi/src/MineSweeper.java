import java.util.Random;

public class MineSweeper {
    int rowNumber;
    int colNumber;
    boolean isLost;
    boolean isWon;
    boolean isOver;
    String[][] mineMap;
    String[][] gameMap;

    int mayinSayisi;
    int total;
    int totalSpace;

    public MineSweeper(int rowNumber, int colNumber) {

        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.gameMap = new String[rowNumber][colNumber];
        this.mineMap = new String[rowNumber][colNumber];
        this.total = rowNumber * colNumber;
        this.mayinSayisi = total / 4;
        this.totalSpace = this.total - this.mayinSayisi;
        generateMineMap(rowNumber, colNumber);
    }


    public void generateMineMap(int n, int m) {
        int mineCount = n * m / 4;


        Random random = new Random();
        int count = 0;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                this.mineMap[i][j] = " - ";
                this.gameMap[i][j] = " - ";

            }
        }

        while (count < mineCount) {
            int randomRow = random.nextInt(n);
            int randomCol = random.nextInt(m);

            if (mineMap[randomRow][randomCol] == " - ") {
                mineMap[randomRow][randomCol] = " * ";
                count++;
            }

        }
    }

    public void printMineMap() {
        System.out.println("Mayinlarin Konumu");
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                System.out.print(mineMap[i][j]);
            }
            System.out.println();
        }
    }

    public void printGameeMap() {
        System.out.println("Oyun Tahtası");
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                System.out.print(gameMap[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");

    }

    public void selectMine(int row, int col) {
        int mineCount = 0;
        row--;
        col--;
        int rowCount = mineMap.length;
        int colCount = mineMap[0].length;
        if (mineMap[row][col] == " * ") {
            this.isLost = true;
            this.isOver = true;
        } else {
            for (int i = row - 1; i <= row + 1; i++) {
                for (int j = col - 1; j <= col + 1; j++) {
                    if (i >= 0 && i < rowCount && j >= 0 && j < colCount && !(i == row && j == col)) {
                        if (this.mineMap[i][j] == " * ") {
                            mineCount++;
                        }
                    }
                }
            }
            this.totalSpace--;
            if (totalSpace == 0) {
                this.isWon = true;
                this.isOver = true;
            }

        }

        gameMap[row][col] = String.valueOf(" " + mineCount + " ");

    }

    public void gameWon() {
        System.out.println("Tebrikler Kazandın!!!\n");
        printMineMap();
    }

    public void run(int n, int m) {
        selectMine(n, m);

        if (isLost) {
            System.out.println("Mayına Bastın :(");
            printMineMap();
        } else if (isWon) {
            gameWon();
        } else {
            printGameeMap();
        }
    }
}

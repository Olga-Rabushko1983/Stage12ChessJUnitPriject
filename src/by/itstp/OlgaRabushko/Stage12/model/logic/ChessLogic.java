package by.itstp.OlgaRabushko.Stage12.model.logic;

public class ChessLogic {

    public static boolean checkRock(int x1, int x2, int y1, int y2) {
        if (x1 < 0 || x2 < 0 || y1 < 0 || y2 < 0) {
            return false;
        }
        return (x1 == x2 && y1 != y2) || (x1 != x2 && y1 == y2);
    }

    public static boolean checkKing(int x1, int x2, int y1, int y2) {
        if (x1 < 0 || x2 < 0 || y1 < 0 || y2 < 0) {
            return false;
        }
        return (x2 == x1 - 1 && y2 == y1 + 1) || (x2 == x1 - 1 && y2 == y1 - 1)
                || (x2 == x1 + 1 && y2 == y1 - 1) || (x2 == x1 + 1 && y2 == y1 + 1)
                || (x2 == x1 - 1 && y2 == y1) || (x2 == x1 && y2 == y1 - 1)
                || (x2 == x1 && y2 == y1 + 1) || (x2 == x1 + 1 && y2 == y1);
    }

    public static boolean checkBishop(int x1, int x2, int y1, int y2) {
        if (x1 < 0 || x2 < 0 || y1 < 0 || y2 < 0) {
            return false;
        }
        return (x1 != x2 && y1 != y2) && ((x1 - y1) == (x2 - y2) || (x1 + y1) == (x2 + y2));
    }

    public static boolean checkQueen(int x1, int x2, int y1, int y2) {
        if (x1 < 0 || x2 < 0 || y1 < 0 || y2 < 0) {
            return false;
        }
        return (y1 == y2 && x1 != x2) || (y1 != y2 && x1 == x2) ||
                ((x1 != x2 && y1 != y2) && (Math.abs(x2 - x1) == Math.abs(y2 - y1)));
    }

    public static boolean checkKnight(int x1, int x2, int y1, int y2) {
        if (x1 < 0 || x2 < 0 || y1 < 0 || y2 < 0) {
            return false;
        }
        return (x2 == x1 + 1 && y2 == y1 - 2) || (x2 == x1 + 1 && y2 == y1 + 2) ||
                (x2 == x1 + 2 && y2 == y1 - 1) || (x2 == x1 + 2 && y2 == y1 + 1) ||
                (x2 == x1 - 1 && y2 == y1 + 2) || (x2 == x1 - 2 && y2 == y1 + 1) ||
                (x2 == x1 - 2 && y2 == y1 - 1) || (x2 == x1 - 1 && y2 == y1 - 2);

    }
    public static boolean checkFoolProof(int x1, int y1, int x2, int y2){

        return (x1 > 0 && x1 <= 8) && (x2 > 0 && x2 <= 8)
                && (y1 > 0 && y1 <= 8) && (y2 > 0 && y2 <= 8);
    }
}

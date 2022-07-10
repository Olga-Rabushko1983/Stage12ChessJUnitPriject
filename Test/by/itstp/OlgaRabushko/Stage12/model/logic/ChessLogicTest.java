package by.itstp.OlgaRabushko.Stage12.model.logic;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Assert;

public class ChessLogicTest {
    @Test
    public void checkRockPozitiveTest1() {

        int x1 = 4;
        int x2 = 5;
        int y1 = 4;
        int y2 = 5;

        boolean expected = false;
        boolean actual = ChessLogic.checkRock(x1, x2, y1, y2);

        assertEquals (expected, actual);
    }

    @Test
    public void checkRockPozitiveTest2() {
        int x1 = 4;
        int x2 = 3;
        int y1 = 4;
        int y2 = 3;

        boolean expected = false;

        boolean actual = ChessLogic.checkRock(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkRockPozitiveTest3() {
        int x1 = 4;
        int x2 = 3;
        int y1 = 4;
        int y2 = 5;

        boolean expected = false;

        boolean actual = ChessLogic.checkRock(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkRockPozitiveTest4() {
        int x1 = 4;
        int x2 = 5;
        int y1 = 4;
        int y2 = 3;

        boolean expected = false;

        boolean actual = ChessLogic.checkRock(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkRockPozitiveTest5() {
        int x1 = 4;
        int x2 = 7;
        int y1 = 4;
        int y2 = 1;

        boolean expected = false;

        boolean actual = ChessLogic.checkRock(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkRockPozitiveTest6() {
        int x1 = 4;
        int x2 = 1;
        int y1 = 4;
        int y2 = 7;

        boolean expected = false;

        boolean actual = ChessLogic.checkRock(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkRockPozitiveTest7() {
        int x1 = 4;
        int x2 = 1;
        int y1 = 4;
        int y2 = 1;

        boolean expected = false;

        boolean actual = ChessLogic.checkRock(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkRockPozitiveTest8() {
        int x1 = 4;
        int x2 = 7;
        int y1 = 4;
        int y2 = 7;

        boolean expected = false;

        boolean actual = ChessLogic.checkRock(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkRockPozitiveTest9() {
        int x1 = 4;
        int x2 = 4;
        int y1 = 4;
        int y2 = 5;

        boolean expected = true;

        boolean actual = ChessLogic.checkRock(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkRockPozitiveTest10() {
        int x1 = 4;
        int x2 = 4;
        int y1 = 4;
        int y2 = 3;

        boolean expected = true;

        boolean actual = ChessLogic.checkRock(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkRockPozitiveTest11() {
        int x1 = 4;
        int x2 = 4;
        int y1 = 4;
        int y2 = 1;

        boolean expected = true;

        boolean actual = ChessLogic.checkRock(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkRockPozitiveTest12() {
        int x1 = 4;
        int x2 = 4;
        int y1 = 4;
        int y2 = 8;

        boolean expected = true;

        boolean actual = ChessLogic.checkRock(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkRockPozitiveTest13() {
        int x1 = 4;
        int x2 = 5;
        int y1 = 4;
        int y2 = 4;

        boolean expected = true;

        boolean actual = ChessLogic.checkRock(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkRockPozitiveTest14() {
        int x1 = 4;
        int x2 = 3;
        int y1 = 4;
        int y2 = 4;

        boolean expected = true;

        boolean actual = ChessLogic.checkRock(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkRockPozitiveTest15() {
        int x1 = 4;
        int x2 = 1;
        int y1 = 4;
        int y2 = 4;

        boolean expected = true;

        boolean actual = ChessLogic.checkRock(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkRockPozitiveTest16() {
        int x1 = 4;
        int x2 = 8;
        int y1 = 4;
        int y2 = 4;

        boolean expected = true;

        boolean actual = ChessLogic.checkRock(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkRockPozitiveTest17() {
        int x1 = 4;
        int x2 = 4;
        int y1 = 4;
        int y2 = 4;

        boolean expected = false;

        boolean actual = ChessLogic.checkRock(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkRockNegativeTest18() {
        int x1 = 0;
        int x2 = 0;
        int y1 = 0;
        int y2 = 0;

        boolean expected = false;

        boolean actual = ChessLogic.checkRock(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkRockNegativeTest19() {
        int x1 = 4;
        int x2 = 0;
        int y1 = 4;
        int y2 = 0;

        boolean expected = false;

        boolean actual = ChessLogic.checkRock(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkRockNegativeTest20() {
        int x1 = 0;
        int x2 = 4;
        int y1 = 0;
        int y2 = 4;

        boolean expected = false;

        boolean actual = ChessLogic.checkRock(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkRockNegativeTest21() {
        int x1 = -4;
        int x2 = -4;
        int y1 = -4;
        int y2 = -5;

        boolean expected = false;

        boolean actual = ChessLogic.checkRock(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkRockNegativeTest22() {
        int x1 = -4;
        int x2 = 4;
        int y1 = -4;
        int y2 = 5;

        boolean expected = false;

        boolean actual = ChessLogic.checkRock(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkRockNegativeTest23() {
        int x1 = 4;
        int x2 = -4;
        int y1 = 4;
        int y2 = -5;

        boolean expected = false;

        boolean actual = ChessLogic.checkRock(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKingPozitiveTest1() {
        int x1 = 5;
        int x2 = 5;
        int y1 = 3;
        int y2 = 5;

        boolean expected = false;

        boolean actual = ChessLogic.checkKing(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKingPozitiveTest2() {
        int x1 = 5;
        int x2 = 3;
        int y1 = 3;
        int y2 = 3;

        boolean expected = false;

        boolean actual = ChessLogic.checkKing(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKingPozitiveTest3() {
        int x1 = 5;
        int x2 = 3;
        int y1 = 3;
        int y2 = 5;

        boolean expected = false;

        boolean actual = ChessLogic.checkKing(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKingPozitiveTest4() {
        int x1 = 5;
        int x2 = 7;
        int y1 = 3;
        int y2 = 1;

        boolean expected = false;

        boolean actual = ChessLogic.checkKing(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKingPozitiveTest5() {
        int x1 = 5;
        int x2 = 3;
        int y1 = 3;
        int y2 = 1;

        boolean expected = false;

        boolean actual = ChessLogic.checkKing(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKingPozitiveTest6() {
        int x1 = 5;
        int x2 = 1;
        int y1 = 3;
        int y2 = 7;

        boolean expected = false;

        boolean actual = ChessLogic.checkKing(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKingPozitiveTest7() {
        int x1 = 5;
        int x2 = 7;
        int y1 = 3;
        int y2 = 5;

        boolean expected = false;

        boolean actual = ChessLogic.checkKing(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKingPozitiveTest8() {
        int x1 = 5;
        int x2 = 7;
        int y1 = 3;
        int y2 = 3;

        boolean expected = false;

        boolean actual = ChessLogic.checkKing(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKingPozitiveTest9() {
        int x1 = 5;
        int x2 = 5;
        int y1 = 3;
        int y2 = 2;

        boolean expected = true;

        boolean actual = ChessLogic.checkKing(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKingPozitiveTest10() {
        int x1 = 5;
        int x2 = 5;
        int y1 = 3;
        int y2 = 4;

        boolean expected = true;

        boolean actual = ChessLogic.checkKing(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKingPozitiveTest11() {
        int x1 = 5;
        int x2 = 4;
        int y1 = 3;
        int y2 = 3;

        boolean expected = true;

        boolean actual = ChessLogic.checkKing(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKingPozitiveTest12() {
        int x1 = 5;
        int x2 = 6;
        int y1 = 3;
        int y2 = 3;

        boolean expected = true;

        boolean actual = ChessLogic.checkKing(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKingPozitiveTest13() {
        int x1 = 5;
        int x2 = 4;
        int y1 = 3;
        int y2 = 2;

        boolean expected = true;

        boolean actual = ChessLogic.checkKing(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKingPozitiveTest14() {
        int x1 = 5;
        int x2 = 4;
        int y1 = 3;
        int y2 = 4;

        boolean expected = true;

        boolean actual = ChessLogic.checkKing(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKingPozitiveTest15() {
        int x1 = 5;
        int x2 = 6;
        int y1 = 3;
        int y2 = 2;

        boolean expected = true;

        boolean actual = ChessLogic.checkKing(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKingPozitiveTest16() {
        int x1 = 5;
        int x2 = 6;
        int y1 = 3;
        int y2 = 4;

        boolean expected = true;

        boolean actual = ChessLogic.checkKing(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKingPozitiveTest17() {
        int x1 = 5;
        int x2 = 5;
        int y1 = 3;
        int y2 = 3;

        boolean expected = false;

        boolean actual = ChessLogic.checkKing(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKingNegativeTest18() {
        int x1 = 0;
        int x2 = 0;
        int y1 = 0;
        int y2 = 0;

        boolean expected = false;

        boolean actual = ChessLogic.checkKing(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKingNegativeTest19() {
        int x1 = 0;
        int x2 = 5;
        int y1 = 0;
        int y2 = 3;

        boolean expected = false;

        boolean actual = ChessLogic.checkKing(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKingNegativeTest20() {
        int x1 = 5;
        int x2 = 0;
        int y1 = 3;
        int y2 = 0;

        boolean expected = false;

        boolean actual = ChessLogic.checkKing(x1, x2, y1, y2);

        assertEquals(expected, actual);
    } @Test
    public void checkKingNegativeTest21() {
        int x1 = -5;
        int x2 = -5;
        int y1 = -3;
        int y2 = -2;

        boolean expected = false;

        boolean actual = ChessLogic.checkKing(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKingNegativeTest22() {
        int x1 = -5;
        int x2 = 5;
        int y1 = -3;
        int y2 = 2;

        boolean expected = false;

        boolean actual = ChessLogic.checkKing(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKingNegativeTest23() {
        int x1 = 5;
        int x2 = -5;
        int y1 = 3;
        int y2 = -2;

        boolean expected = false;

        boolean actual = ChessLogic.checkKing(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkBishopPozitiveTest1() {
        int x1 = 6;
        int x2 = 6;
        int y1 = 4;
        int y2 = 4;

        boolean expected = false;

        boolean actual = ChessLogic.checkBishop(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkBishopPozitiveTest2() {
        int x1 = 6;
        int x2 = 8;
        int y1 = 4;
        int y2 = 2;

        boolean expected = true;

        boolean actual = ChessLogic.checkBishop(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkBishopPozitiveTest3() {
        int x1 = 6;
        int x2 = 7;
        int y1 = 4;
        int y2 = 3;

        boolean expected = true;

        boolean actual = ChessLogic.checkBishop(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkBishopPozitiveTest4() {
        int x1 = 6;
        int x2 = 5;
        int y1 = 4;
        int y2 = 5;

        boolean expected = true;

        boolean actual = ChessLogic.checkBishop(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkBishopPozitiveTest5() {
        int x1 = 6;
        int x2 = 4;
        int y1 = 4;
        int y2 = 6;

        boolean expected = true;

        boolean actual = ChessLogic.checkBishop(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkBishopPozitiveTest6() {
        int x1 = 6;
        int x2 = 3;
        int y1 = 4;
        int y2 = 7;

        boolean expected = true;

        boolean actual = ChessLogic.checkBishop(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkBishopPozitiveTest7() {
        int x1 = 6;
        int x2 = 2;
        int y1 = 4;
        int y2 = 8;

        boolean expected = true;

        boolean actual = ChessLogic.checkBishop(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkBishopPozitiveTest8() {
        int x1 = 6;
        int x2 = 3;
        int y1 = 4;
        int y2 = 1;

        boolean expected = true;

        boolean actual = ChessLogic.checkBishop(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkBishopPozitiveTest9() {
        int x1 = 6;
        int x2 = 4;
        int y1 = 4;
        int y2 = 2;

        boolean expected = true;

        boolean actual = ChessLogic.checkBishop(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkBishopPozitiveTest10() {
        int x1 = 6;
        int x2 = 5;
        int y1 = 4;
        int y2 = 3;

        boolean expected = true;

        boolean actual = ChessLogic.checkBishop(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkBishopPozitiveTest12() {
        int x1 = 6;
        int x2 = 8;
        int y1 = 4;
        int y2 = 6;

        boolean expected = true;

        boolean actual = ChessLogic.checkBishop(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkBishopPozitiveTest13() {
        int x1 = 6;
        int x2 = 5;
        int y1 = 4;
        int y2 = 4;

        boolean expected = false;

        boolean actual = ChessLogic.checkBishop(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkBishopPozitiveTest14() {
        int x1 = 6;
        int x2 = 7;
        int y1 = 4;
        int y2 = 4;

        boolean expected = false;

        boolean actual = ChessLogic.checkBishop(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkBishopPozitiveTest15() {
        int x1 = 6;
        int x2 = 6;
        int y1 = 4;
        int y2 = 3;

        boolean expected = false;

        boolean actual = ChessLogic.checkBishop(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkBishopPozitiveTest16() {
        int x1 = 6;
        int x2 = 6;
        int y1 = 4;
        int y2 = 5;

        boolean expected = false;

        boolean actual = ChessLogic.checkBishop(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkBishopNegativeTest17() {
        int x1 = 0;
        int x2 = 0;
        int y1 = 0;
        int y2 = 0;

        boolean expected = false;

        boolean actual = ChessLogic.checkBishop(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkBishopNegativeTest18() {
        int x1 = 6;
        int x2 = 0;
        int y1 = 4;
        int y2 = 0;

        boolean expected = false;

        boolean actual = ChessLogic.checkBishop(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkBishopNegativeTest19() {
        int x1 = 0;
        int x2 = 6;
        int y1 = 0;
        int y2 = 4;

        boolean expected = false;

        boolean actual = ChessLogic.checkBishop(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkBishopNegativeTest20() {
        int x1 = -6;
        int x2 = -8;
        int y1 = -4;
        int y2 = -2;

        boolean expected = false;

        boolean actual = ChessLogic.checkBishop(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkBishopNegativeTest21() {
        int x1 = -6;
        int x2 = 8;
        int y1 = -4;
        int y2 = 2;

        boolean expected = false;

        boolean actual = ChessLogic.checkBishop(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkBishopNegativeTest22() {
        int x1 = 6;
        int x2 = -8;
        int y1 = 4;
        int y2 = -2;

        boolean expected = false;

        boolean actual = ChessLogic.checkBishop(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenPozitiveTest1() {
        int x1 = 6;
        int x2 = 6;
        int y1 = 4;
        int y2 = 4;

        boolean expected = false;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenPozitiveTest2() {
        int x1 = 6;
        int x2 = 8;
        int y1 = 4;
        int y2 = 2;

        boolean expected = true;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenPozitiveTest3() {
        int x1 = 6;
        int x2 = 7;
        int y1 = 4;
        int y2 = 3;

        boolean expected = true;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenPozitiveTest4() {
        int x1 = 6;
        int x2 = 5;
        int y1 = 4;
        int y2 = 5;

        boolean expected = true;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenPozitiveTest5() {
        int x1 = 6;
        int x2 = 4;
        int y1 = 4;
        int y2 = 6;

        boolean expected = true;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenPozitiveTest6() {
        int x1 = 6;
        int x2 = 3;
        int y1 = 4;
        int y2 = 7;

        boolean expected = true;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenPozitiveTest7() {
        int x1 = 6;
        int x2 = 2;
        int y1 = 4;
        int y2 = 8;

        boolean expected = true;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenPozitiveTest8() {
        int x1 = 6;
        int x2 = 3;
        int y1 = 4;
        int y2 = 1;

        boolean expected = true;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenPozitiveTest9() {
        int x1 = 6;
        int x2 = 4;
        int y1 = 4;
        int y2 = 2;

        boolean expected = true;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenPozitiveTest10() {
        int x1 = 6;
        int x2 = 5;
        int y1 = 4;
        int y2 = 3;

        boolean expected = true;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenPozitiveTest11() {
        int x1 = 6;
        int x2 = 7;
        int y1 = 4;
        int y2 = 5;

        boolean expected = true;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenPozitiveTest12() {
        int x1 = 6;
        int x2 = 8;
        int y1 = 4;
        int y2 = 6;

        boolean expected = true;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenPozitiveTest13() {
        int x1 = 6;
        int x2 = 5;
        int y1 = 4;
        int y2 = 4;

        boolean expected = true;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenPozitiveTest14() {
        int x1 = 6;
        int x2 = 4;
        int y1 = 4;
        int y2 = 4;

        boolean expected = true;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenPozitiveTest15() {
        int x1 = 6;
        int x2 = 3;
        int y1 = 4;
        int y2 = 4;

        boolean expected = true;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenPozitiveTest16() {
        int x1 = 6;
        int x2 = 2;
        int y1 = 4;
        int y2 = 4;

        boolean expected = true;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenPozitiveTest17() {
        int x1 = 6;
        int x2 = 1;
        int y1 = 4;
        int y2 = 4;

        boolean expected = true;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenPozitiveTest18() {
        int x1 = 6;
        int x2 = 7;
        int y1 = 4;
        int y2 = 4;

        boolean expected = true;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenPozitiveTest19() {
        int x1 = 6;
        int x2 = 8;
        int y1 = 4;
        int y2 = 4;

        boolean expected = true;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenPozitiveTest20() {
        int x1 = 6;
        int x2 = 6;
        int y1 = 4;
        int y2 = 3;

        boolean expected = true;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenPozitiveTest21() {
        int x1 = 6;
        int x2 = 6;
        int y1 = 4;
        int y2 = 2;

        boolean expected = true;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenPozitiveTest22() {
        int x1 = 6;
        int x2 = 6;
        int y1 = 4;
        int y2 = 1;

        boolean expected = true;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenPozitiveTest23() {
        int x1 = 6;
        int x2 = 6;
        int y1 = 4;
        int y2 = 5;

        boolean expected = true;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenPozitiveTest24() {
        int x1 = 6;
        int x2 = 6;
        int y1 = 4;
        int y2 = 6;

        boolean expected = true;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenPozitiveTest25() {
        int x1 = 6;
        int x2 = 6;
        int y1 = 4;
        int y2 = 7;

        boolean expected = true;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenPozitiveTest26() {
        int x1 = 6;
        int x2 = 6;
        int y1 = 4;
        int y2 = 8;

        boolean expected = true;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenPozitiveTest27() {
        int x1 = 6;
        int x2 = 5;
        int y1 = 4;
        int y2 = 2;

        boolean expected = false;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenPozitiveTest28() {
        int x1 = 6;
        int x2 = 2;
        int y1 = 4;
        int y2 = 6;

        boolean expected = false;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenPozitiveTest29() {
        int x1 = 6;
        int x2 = 1;
        int y1 = 4;
        int y2 = 1;

        boolean expected = false;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenPozitiveTest30() {
        int x1 = 6;
        int x2 = 8;
        int y1 = 4;
        int y2 = 8;

        boolean expected = false;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenPozitiveTest31() {
        int x1 = 6;
        int x2 = 3;
        int y1 = 4;
        int y2 = 6;

        boolean expected = false;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenPozitiveTest32() {
        int x1 = 6;
        int x2 = 4;
        int y1 = 4;
        int y2 = 5;

        boolean expected = false;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenPozitiveTest33() {
        int x1 = 6;
        int x2 = 5;
        int y1 = 4;
        int y2 = 7;

        boolean expected = false;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenPozitiveTest34() {
        int x1 = 6;
        int x2 = 8;
        int y1 = 4;
        int y2 = 3;

        boolean expected = false;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenNegativeTest35() {
        int x1 = 0;
        int x2 = 0;
        int y1 = 0;
        int y2 = 0;

        boolean expected = false;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenNegativeTest36() {
        int x1 = 6;
        int x2 = 0;
        int y1 = 4;
        int y2 = 0;

        boolean expected = false;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenNegativeTest37() {
        int x1 = 0;
        int x2 = 6;
        int y1 = 0;
        int y2 = 4;

        boolean expected = false;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenNegativeTest38() {
        int x1 = -6;
        int x2 = -8;
        int y1 = -4;
        int y2 = -2;

        boolean expected = false;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenNegativeTest39() {
        int x1 = -6;
        int x2 = 8;
        int y1 = -4;
        int y2 = 2;

        boolean expected = false;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkQueenNegativeTest40() {
        int x1 = 6;
        int x2 = -8;
        int y1 = 4;
        int y2 = -2;

        boolean expected = false;

        boolean actual = ChessLogic.checkQueen(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKnightPozitiveTest1() {
        int x1 = 3;
        int x2 = 3;
        int y1 = 6;
        int y2 = 6;

        boolean expected = false;

        boolean actual = ChessLogic.checkKnight(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKnightPozitiveTest2() {
        int x1 = 3;
        int x2 = 1;
        int y1 = 6;
        int y2 = 5;

        boolean expected = true;

        boolean actual = ChessLogic.checkKnight(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKnightPozitiveTest3() {
        int x1 = 3;
        int x2 = 2;
        int y1 = 6;
        int y2 = 4;

        boolean expected = true;

        boolean actual = ChessLogic.checkKnight(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKnightPozitiveTest4() {
        int x1 = 3;
        int x2 = 4;
        int y1 = 6;
        int y2 = 4;

        boolean expected = true;

        boolean actual = ChessLogic.checkKnight(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKnightPozitiveTest5() {
        int x1 = 3;
        int x2 = 5;
        int y1 = 6;
        int y2 = 5;

        boolean expected = true;

        boolean actual = ChessLogic.checkKnight(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKnightPozitiveTest6() {
        int x1 = 3;
        int x2 = 5;
        int y1 = 6;
        int y2 = 7;

        boolean expected = true;

        boolean actual = ChessLogic.checkKnight(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKnightPozitiveTest7() {
        int x1 = 3;
        int x2 = 4;
        int y1 = 6;
        int y2 = 8;

        boolean expected = true;

        boolean actual = ChessLogic.checkKnight(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKnightPozitiveTest8() {
        int x1 = 3;
        int x2 = 2;
        int y1 = 6;
        int y2 = 8;

        boolean expected = true;

        boolean actual = ChessLogic.checkKnight(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKnightPozitiveTest9() {
        int x1 = 3;
        int x2 = 1;
        int y1 = 6;
        int y2 = 7;

        boolean expected = true;

        boolean actual = ChessLogic.checkKnight(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKnightPozitiveTest10() {
        int x1 = 3;
        int x2 = 5;
        int y1 = 6;
        int y2 = 3;

        boolean expected = false;

        boolean actual = ChessLogic.checkKnight(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKnightPozitiveTest11() {
        int x1 = 3;
        int x2 = 7;
        int y1 = 6;
        int y2 = 5;

        boolean expected = false;

        boolean actual = ChessLogic.checkKnight(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKnightPozitiveTest12() {
        int x1 = 3;
        int x2 = 8;
        int y1 = 6;
        int y2 = 6;

        boolean expected = false;

        boolean actual = ChessLogic.checkKnight(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKnightPozitiveTest13() {
        int x1 = 3;
        int x2 = 5;
        int y1 = 6;
        int y2 = 4;

        boolean expected = false;

        boolean actual = ChessLogic.checkKnight(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKnightPozitiveTest14() {
        int x1 = 3;
        int x2 = 7;
        int y1 = 6;
        int y2 = 4;

        boolean expected = false;

        boolean actual = ChessLogic.checkKnight(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKnightPozitiveTest15() {
        int x1 = 3;
        int x2 = 6;
        int y1 = 6;
        int y2 = 3;

        boolean expected = false;

        boolean actual = ChessLogic.checkKnight(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKnightPozitiveTest16() {
        int x1 = 3;
        int x2 = 6;
        int y1 = 6;
        int y2 = 5;

        boolean expected = false;

        boolean actual = ChessLogic.checkKnight(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKnightNegativeTest17() {
        int x1 = 0;
        int x2 = 0;
        int y1 = 0;
        int y2 = 0;

        boolean expected = false;

        boolean actual = ChessLogic.checkKnight(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKnightNegativeTest18() {
        int x1 = 6;
        int x2 = 0;
        int y1 = 4;
        int y2 = 0;

        boolean expected = false;

        boolean actual = ChessLogic.checkKnight(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKnightNegativeTest19() {
        int x1 = 0;
        int x2 = 6;
        int y1 = 0;
        int y2 = 4;

        boolean expected = false;

        boolean actual = ChessLogic.checkKnight(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKnightNegativeTest20() {
        int x1 = -3;
        int x2 = -2;
        int y1 = -6;
        int y2 = -8;

        boolean expected = false;

        boolean actual = ChessLogic.checkKnight(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKnightNegativeTest21() {
        int x1 = 3;
        int x2 = -2;
        int y1 = 6;
        int y2 = -8;

        boolean expected = false;

        boolean actual = ChessLogic.checkKnight(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void checkKnightNegativeTest22() {
        int x1 = -3;
        int x2 = 2;
        int y1 = -6;
        int y2 = 8;

        boolean expected = false;

        boolean actual = ChessLogic.checkKnight(x1, x2, y1, y2);

        assertEquals(expected, actual);
    }
    @Test
    public void testCheckFoolProofPositive1() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 1;
        int y2 = 1;

        boolean expected = true;

        boolean actual = ChessLogic.checkFoolProof(x1, y1, x2, y2);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckFoolProofPositive2() {
        int x1 = 8;
        int y1 = 1;
        int x2 = 9;
        int y2 = 1;

        boolean expected = true;

        boolean actual = ChessLogic.checkFoolProof(x1, y1, x2, y2);

        if (expected == actual) {
            Assert.fail();
        }
    }

}



import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class GradeBookTest {

    @Test
    public void testAddScore() {
        GradeBook gradeBook1 = new GradeBook(5);
        gradeBook1.addScore(75.0);
        gradeBook1.addScore(85.0);
        assertEquals("75.0 85.0 ", gradeBook1.toString());

        GradeBook gradeBook2 = new GradeBook(5);
        gradeBook2.addScore(70.0);
        gradeBook2.addScore(40.0);
        gradeBook2.addScore(35.0);
        gradeBook2.addScore(15.0);
        assertEquals("70.0 40.0 35.0 15.0 ", gradeBook2.toString());
    }

    @Test
    public void testGetScoreSize() {
        GradeBook gradeBook1 = new GradeBook(5);
        gradeBook1.addScore(75.0);
        gradeBook1.addScore(85.0);
        assertEquals(2, gradeBook1.getScoreSize(), 0.1);

        GradeBook gradeBook2 = new GradeBook(5);
        gradeBook2.addScore(70.0);
        gradeBook2.addScore(40.0);
        gradeBook2.addScore(35.0);
        gradeBook2.addScore(15.0);
        assertEquals(4, gradeBook2.getScoreSize(), 0.1);
    }

    @Test
    public void testSum() {
        GradeBook gradeBook1 = new GradeBook(5);
        gradeBook1.addScore(75.0);
        gradeBook1.addScore(85.0);
        assertEquals(160.0, gradeBook1.sum(), 0.1);

        GradeBook gradeBook2 = new GradeBook(5);
        gradeBook2.addScore(70.0);
        gradeBook2.addScore(40.0);
        gradeBook2.addScore(35.0);
        gradeBook2.addScore(15.0);
        assertEquals(160.0, gradeBook2.sum(), 0.1);
    }

    @Test
    public void testMinimum() {
        GradeBook gradeBook1 = new GradeBook(5);
        gradeBook1.addScore(75.0);
        gradeBook1.addScore(85.0);
        assertEquals(75.0, gradeBook1.minimum(), 0.1);

        GradeBook gradeBook2 = new GradeBook(5);
        gradeBook2.addScore(70.0);
        gradeBook2.addScore(40.0);
        gradeBook2.addScore(35.0);
        gradeBook2.addScore(15.0);
        assertEquals(15.0, gradeBook2.minimum(), 0.1);
    }

    @Test
    public void testFinalScore() {
        GradeBook gradeBook1 = new GradeBook(5);
        gradeBook1.addScore(75.0);
        gradeBook1.addScore(85.0);
        assertEquals(85.0, gradeBook1.finalScore(), 0.1);

        GradeBook gradeBook2 = new GradeBook(5);
        gradeBook2.addScore(70.0);
        gradeBook2.addScore(40.0);
        gradeBook2.addScore(35.0);
        gradeBook2.addScore(15.0);
        assertEquals(145.0, gradeBook2.finalScore(), 0.1);
    }
}

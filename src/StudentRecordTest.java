import org.junit.Test;

import static org.junit.Assert.*;

public class StudentRecordTest {

    @Test
    public void testFullAverage() {
        StudentRecord test = new StudentRecord(new int[] {50, 50, 20, 80, 53});
        assertEquals(50.6, test.average(0, 4), 0.1);
    }

    @Test
    public void testPartialAverage() {
        StudentRecord test = new StudentRecord(new int[] {50, 50, 20, 80, 53});
        assertEquals(50.0, test.average(1, 3), 0.1);
    }

    @Test
    public void scoresIncreasing() {
        StudentRecord test = new StudentRecord(new int[] {34, 36, 70, 88, 90, 95});
        assertTrue(test.hasImproved());
    }

    @Test
    public void scoresDecreasing() {
        StudentRecord test = new StudentRecord(new int[] {95, 90, 85, 80, 75, 34, 29});
        assertFalse(test.hasImproved());
    }

    @Test
    public void scoresSame() {
        StudentRecord test = new StudentRecord(new int[] {34, 34, 70, 88, 90, 95});
        assertTrue(test.hasImproved());
    }

    @Test
    public void improvedAverage() {
        StudentRecord test = new StudentRecord(new int[] {20, 50, 50, 53, 80});
        assertEquals(61.0, test.finalAverage(), 0.0);
    }

    @Test
    public void averageDidNotImprove() {
        StudentRecord test = new StudentRecord(new int[] {95, 90, 85, 80, 75, 34, 29});
        assertEquals(69.7, test.finalAverage(), 0.1);
    }

}
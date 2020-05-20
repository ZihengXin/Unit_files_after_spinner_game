import org.junit.Test;

import static org.junit.Assert.*;

public class SoundTest {

    @Test
    public void limitAmplitudeSampleData() {
        int[] arr = {40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33, 15, -32, 2030, 3223};
        int[] after = {40, 2000, 17, -2000, -17, -2000, 2000, 1048, -420, 33, 15, -32, 2000, 2000};
        Sound sound = new Sound(arr);
        int numChaged = sound.limitAmplitude(2000);
        assertEquals(5, numChaged);
        assertArrayEquals(sound.getSamples(), after);
    }

    @Test
    public void limitAmplitudeNoChanges() {
        int[] arr = {40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33, 15, -32, 2030, 3223};
        int[] after = {40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33, 15, -32, 2030, 3223};
        Sound sound = new Sound(arr);
        int numChaged = sound.limitAmplitude(5000);
        assertEquals(0, numChaged);
        assertArrayEquals(sound.getSamples(), after);
    }

    @Test
    public void limitAmplitudeLimitZero() {
        int[] arr = {40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33, 15, -32, 2030, 3223};
        int[] after = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        Sound sound = new Sound(arr);
        int numChaged = sound.limitAmplitude(0);
        assertEquals(14, numChaged);
        assertArrayEquals(sound.getSamples(), after);
    }

    @Test
    public void trimSilenceFromBeginningSampleData() {
        int[] arr = {0, 0, 0, 0, -14, 0, -35, -39, 0, -7, 16, 32, 37, 29, 0, 0};
        int[] after = {-14, 0, -35, -39, 0, -7, 16, 32, 37, 29, 0, 0};
        Sound sound = new Sound(arr);
        sound.trimSilenceFromBeginning();
        assertArrayEquals(after, sound.getSamples());
    }

    @Test
    public void trimSilenceFromBeginningNoLeadingZeros() {
        int[] arr = {-14, 0, -35, -39, 0, -7, 16, 32, 37, 29, 0, 0};
        int[] after = {-14, 0, -35, -39, 0, -7, 16, 32, 37, 29, 0, 0};
        Sound sound = new Sound(arr);
        sound.trimSilenceFromBeginning();
        assertArrayEquals(after, sound.getSamples());
    }

    @Test
    public void trimSilenceFromBeginningOnlyOneZero() {
        int[] arr = {0, 7, -8, -20, 500, 0, 0, 0, -32, -37, -29, 5, 1};
        int[] after = {7, -8, -20, 500, 0, 0, 0, -32, -37, -29, 5, 1};
        Sound sound = new Sound(arr);
        sound.trimSilenceFromBeginning();
        assertArrayEquals(after, sound.getSamples());
    }
}
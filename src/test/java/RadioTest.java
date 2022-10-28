import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void equivalentValues() {
        Radio2 radio = new Radio2();

        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void negativeValueMinus() {
        Radio2 radio = new Radio2();

        radio.setCurrentStation(-15);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void negativeValuePlus() {
        Radio2 radio = new Radio2();

        radio.setCurrentStation(15);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void boundaryValuesLowerMinus() {
        Radio2 radio = new Radio2();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void boundaryValuesLower() {
        Radio2 radio = new Radio2();

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void boundaryValuesLowerPlus() {
        Radio2 radio = new Radio2();

        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void boundaryValuesHighMinus() {
        Radio2 radio = new Radio2();

        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void boundaryValuesHigh() {
        Radio2 radio = new Radio2();

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void boundaryValuesHighPlus() {
        Radio2 radio = new Radio2();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextEquivalentValues() {
        Radio2 radio = new Radio2();

        radio.setCurrentVolume(5);

        radio.nextVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextBoundaryValuesLower() {
        Radio2 radio = new Radio2();

        radio.setCurrentVolume(0);

        radio.nextVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextBoundaryValuesHigh() {
        Radio2 radio = new Radio2();

        radio.setCurrentVolume(10);

        radio.nextVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevBoundaryValuesLower() {
        Radio2 radio = new Radio2();

        radio.setCurrentVolume(0);

        radio.prevVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevBoundaryValuesHigh() {
        Radio2 radio = new Radio2();

        radio.setCurrentVolume(10);

        radio.prevVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationBoundaryValuesLower() {
        Radio2 radio = new Radio2();

        radio.setCurrentStation(0);

        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationBoundaryValuesHigh() {
        Radio2 radio = new Radio2();

        radio.setCurrentStation(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}

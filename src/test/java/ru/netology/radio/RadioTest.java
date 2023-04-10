package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {
    Radio radio = new Radio(30);
    Radio radio1 = new Radio();

   /* @Test // тест на геттер
    public void shouldGetCurrentStation() { // тест, позволяющий  узнать текущую радиостанцию
        Radio radio = new Radio();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }*/

    @ParameterizedTest // тест на установление станции
    @CsvSource({
            "30,0",
            "0,0",
            "29,29",
            "10,10",
            "-1,0",
            "1,1"
    })
    public void shouldSetStationNumber(int newStationNumber, int expected) {
        radio.setCurrentStation(newStationNumber);

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest // тест на установление станции
    @CsvSource({
            "10,0",
            "0,0",
            "1,1",
            "9,9",
            "-1,0"
    })
    public void shouldSetStationNumber1(int newStationNumber, int expected) {
        radio1.setCurrentStation(newStationNumber);

        int actual = radio1.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @ParameterizedTest // тест на переключение на следующую станцию
    @CsvSource({
            "28,29",
            "29,0",
            "0,1",
            "-1,1",
            "30,1"
    })
    public void shouldSetNextStationNumber(int currentStation, int expected) {
        radio.setCurrentStation(currentStation);
        radio.next();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest // тест на переключение на предыдущую станцию
    @CsvSource({
            "9,8",
            "1,0",
            "0,29",
            "29,28",
/*            "9,-1",
            "9,10"*/
    })
    public void shouldSetPrevStationNumber(int currentStation, int expected) {
        radio.setCurrentStation(currentStation);
        radio.prev();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    // ___________________________________________________________________________

    @Test // тест на геттер
    public void shouldGetCurrentVolume() {

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    /*@Test

    public void shouldSetNextVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }*/


    @ParameterizedTest
    @CsvSource({
            "1,0",
            "2,1",
            "1,101",
            "100,99",
            "1,101", //для тестирования сеттера
            "1,-1",
            "100,100"
    })

    public void shouldSetNextVolume(int expected, int volume) {
        radio.setCurrentVolume(volume);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


   /* @Test

    public void shouldSetPrevVolume() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }*/


    @ParameterizedTest
    @CsvSource({
            "0,0",
            "0,1",
            "1,2",
            "99,100",
            "98,99"
    })

    public void shouldSetPrevVolume(int expected, int volume) {
        radio.setCurrentVolume(volume);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}



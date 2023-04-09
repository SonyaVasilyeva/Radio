package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {

   /* @Test // тест на геттер
    public void shouldGetCurrentStation() { // тест, позволяющий  узнать текущую радиостанцию
        Radio radio = new Radio();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }*/

    @ParameterizedTest // тест на установление станции
    @CsvSource({
            "1,1",
            "0,0",
            "9,9",
            "0,10",
            "0,-1",
            "0,11"
    })
    public void shouldSetStationNumber(int expected, int newStationNumber) {
        Radio radio = new Radio();
        radio.setCurrentStation(newStationNumber);

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @ParameterizedTest // тест на переключение на следующую станцию
    @CsvSource({
            "3,2",
            "0,9",
            "1,0",
            "1,-1",
            "1,10"
    })
    public void shouldSetNextStationNumber(int expected, int currentStation) {
        Radio radio = new Radio();
        radio.setCurrentStation(currentStation);
        radio.next();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest // тест на переключение на предыдущую станцию
    @CsvSource({
            "8,9",
            "1,2",
            "0,1",
            "9,0",
/*            "9,-1",
            "9,10"*/
    })
    public void shouldSetPrevStationNumber(int expected, int currentStation) {
        Radio radio = new Radio();
        radio.setCurrentStation(currentStation);
        radio.prev();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    // ___________________________________________________________________________

    @Test // тест на геттер
    public void shouldGetCurrentVolume() {
        Radio radio = new Radio();

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
            "100,100",
            "100,99",
            //"1,101", для тестирования сеттера
            //"1,-1"
    })

    public void shouldSetNextVolume(int expected, int volume) {
        Radio radio = new Radio();
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
        Radio radio = new Radio();
        radio.setCurrentVolume(volume);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}



package ru.netology.radio;

public class Radio {
    private int currentVolume;
    private int currentStation; // оставить public, чтобы присвоить конкретное значение в тестах через radio.currentStation = 100

    public int getCurrentStation(

    ) {
        return currentStation;
    }

    public void setCurrentStation(int newStationNumber) {
        if (newStationNumber > 9) {
            return;
        }
        if (newStationNumber < 0) {
            return;
        }
        currentStation = newStationNumber;
    }

    public void next() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }


    //___________________________________________________


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume > 100) {
            return;
        }
        if (newVolume < 0) {
            return;
        }
        currentVolume = newVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }


    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

}

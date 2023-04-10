package ru.netology.radio;

public class Radio {
    private int amountOfStations;
    private int maxStation;
    private int minStation;
    private int currentStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;


    public Radio(int amountOfStations) {
        this.amountOfStations = amountOfStations;
        this.maxStation = this.amountOfStations - 1;
        this.minStation = 0;
        this.currentStation = this.minStation;
    }

    public Radio() {
        this.amountOfStations = 10;
        this.maxStation = 9;
        this.minStation = 0;
        this.currentStation = this.minStation;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newStationNumber) {
        if (newStationNumber > maxStation) {
            return;
        }
        if (newStationNumber < minStation) {
            return;
        }
        currentStation = newStationNumber;
    }

    public void next() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation--;
        }
    }


    //___________________________________________________


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume > maxVolume) {
            return;
        }
        if (newVolume < minVolume) {
            return;
        }
        currentVolume = newVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }


    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }

}

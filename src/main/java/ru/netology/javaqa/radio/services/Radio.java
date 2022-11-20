package ru.netology.javaqa.radio.services;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int numberOfStations = 1;

    // private int maxStation;

    public Radio(int numberOfStations) {
        if (numberOfStations < 1) {
            return;
        }
        this.numberOfStations = numberOfStations;
    }


    public Radio() {
        numberOfStations = 10;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > numberOfStations - 1) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getNumberOfStations() {
        return numberOfStations;
    }

    public void next() {
        if (currentStation < numberOfStations - 1) {
            currentStation++;
        } else currentStation = 0;
    }

    public void prev() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else currentStation = numberOfStations - 1;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}


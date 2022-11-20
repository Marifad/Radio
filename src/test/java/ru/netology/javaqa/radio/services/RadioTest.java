package ru.netology.javaqa.radio.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testParametr() {
        Radio rad = new Radio(30);
        Assertions.assertEquals(30, rad.getNumberOfStations());
    }

    @Test
    public void testParametrOneStation() {
        Radio rad = new Radio(1);
        Assertions.assertEquals(1, rad.getNumberOfStations());
    }

    @Test
    public void testParametrZeroStations() {
        Radio rad = new Radio(0);
        Assertions.assertEquals(1, rad.getNumberOfStations());
    }

    @Test
    public void shouldGetNumberOfStationsParametr() {

        Radio rad = new Radio(30);
        int expected = 30;
        int actual = rad.getNumberOfStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentStationBelowLimitParametr() {

        Radio rad = new Radio(30);
        rad.setCurrentStation(-1);
        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentStationAboveLimitParametr() {

        Radio rad = new Radio(30);
        rad.setCurrentStation(30);
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentStationAboveLimitParametr2() {

        Radio rad = new Radio(30);
        rad.setCurrentStation(31);
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationParametr() {

        Radio rad = new Radio(30);
        rad.setCurrentStation(9);
        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationZeroParametr() {

        Radio rad = new Radio(30);
        rad.setCurrentStation(0);
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetNextParametr() {
        Radio rad = new Radio(30);
        rad.setCurrentStation(28);
        rad.next();
        int expected = 29;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextIfZeroParametr() {
        Radio rad = new Radio(30);
        rad.setCurrentStation(0);
        rad.next();
        int expected = 1;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
        System.out.println(actual);

    }

    @Test
    public void shouldNotSetNextParametr() {
        Radio rad = new Radio(30);
        rad.setCurrentStation(29);
        rad.next();
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
        System.out.println(actual);

    }

    @Test
    public void shouldSetNextIfOneParametr() {
        Radio rad = new Radio(30);
        rad.setCurrentStation(1);
        rad.next();
        int expected = 2;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
        System.out.println(actual);

    }

    @Test
    public void shouldSetPrevIfZeroParametr() {
        Radio rad = new Radio(30);
        rad.setCurrentStation(0);
        rad.prev();
        int expected = 29;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetPrevIfMaxParametr() {
        Radio rad = new Radio(30);
        rad.setCurrentStation(29);
        rad.prev();
        int expected = 28;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetPrevParametr() {
        Radio rad = new Radio(30);
        rad.setCurrentStation(0);
        rad.prev();
        int expected = 29;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetPrevIfOneParametr() {
        Radio rad = new Radio(30);
        rad.setCurrentStation(1);
        rad.prev();
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetCurrentStationBelowLimit() {

        Radio rad = new Radio();
        rad.setCurrentStation(-1);
        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentStationAboveLimit() {

        Radio rad = new Radio();
        rad.setCurrentStation(10);
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStation() {

        Radio rad = new Radio();
        rad.setCurrentStation(9);
        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationZero() {

        Radio rad = new Radio();
        rad.setCurrentStation(0);
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetCurrentVolumeZero() {

        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume() {

        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        int expected = 10;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentVolumeBelowLimit() {

        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentVolumeAboveLimit() {

        Radio rad = new Radio();
        rad.setCurrentVolume(101);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNext() {
        Radio rad = new Radio();
        rad.setCurrentStation(8);
        rad.next();
        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextIfZero() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.next();
        int expected = 1;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
        System.out.println(actual);

    }

    @Test
    public void shouldNotSetNext() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.next();
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
        System.out.println(actual);

    }

    @Test
    public void shouldNotSetNextIfOne() {
        Radio rad = new Radio();
        rad.setCurrentStation(1);
        rad.next();
        int expected = 2;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
        System.out.println(actual);

    }

    @Test
    public void shouldSetPrevIfZero() {
        Radio rad = new Radio();
        rad.setCurrentStation(1);
        rad.prev();
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetPrevIfNine() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.prev();
        int expected = 8;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetPrev() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.prev();
        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetPrevIfOne() {
        Radio rad = new Radio();
        rad.setCurrentStation(1);
        rad.prev();
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.increaseVolume();
        int expected = 1;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolumeIfOne() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);
        rad.increaseVolume();
        int expected = 2;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolumeIfNine() {
        Radio rad = new Radio();
        rad.setCurrentVolume(9);
        rad.increaseVolume();
        int expected = 10;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.increaseVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        rad.decreaseVolume();
        int expected = 9;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseVolumeIfNine() {
        Radio rad = new Radio();
        rad.setCurrentVolume(9);
        rad.decreaseVolume();
        int expected = 8;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfOne() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);
        rad.decreaseVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.decreaseVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }
}
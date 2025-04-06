package ru.netology.oop2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(4);

        Assertions.assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStationNull() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStationLessMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStationAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStationNine() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStationEight() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStationOne() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStationMaximal() {
        Radio radio = new Radio();

        radio.setCurrentStation(16);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStationMinimal() {
        Radio radio = new Radio();

        radio.setCurrentStation(-5);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(65);

        Assertions.assertEquals(65, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolumeMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolumeLessMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolumeOne() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolumeNinetyNine() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        Assertions.assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolumeMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolumeMaximal() {
        Radio radio = new Radio();

        radio.setCurrentVolume(150);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolumeMinimal() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-50);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);

        radio.next();

        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStationIfOne() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.next();

        Assertions.assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStationIfEight() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.next();

        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStationIfNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStationIfNull() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.next();

        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);

        radio.prev();

        Assertions.assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStationIfOne() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.prev();

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStationIfNull() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();

        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStationIfNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.prev();

        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStationIfEight() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.prev();

        Assertions.assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void shouldNextVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(43);

        radio.nextVolume();

        Assertions.assertEquals(44, radio.getCurrentVolume());
    }

    @Test
    public void shouldNextVolumeIfOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.nextVolume();

        Assertions.assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    public void shouldNextVolumeIfNinetyNine() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.nextVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldNextVolumeIfMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.nextVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldNextVolumeIfNull() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.nextVolume();

        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldPrevVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(56);

        radio.prevVolume();

        Assertions.assertEquals(55, radio.getCurrentVolume());
    }

    @Test
    public void shouldPrevVolumeIfOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.prevVolume();

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldPrevVolumeIfNull() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.prevVolume();

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldPrevVolumeIfMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.prevVolume();

        Assertions.assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void shouldPrevVolumeIfNinetyNine() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.prevVolume();

        Assertions.assertEquals(98, radio.getCurrentVolume());
    }

}

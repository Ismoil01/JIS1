package com.company.HomeWork05;

public class Tv {
    int currentChannel = 0;
    int currentVolume = 0;
    String manufacturer = "Япония";
    String isTvOn = "Включен ли телевизор";

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getIsTvOn() {
        return isTvOn;
    }

    public void switchToNextChannel() {
        this.currentChannel++;
        System.out.println("увеличить текущий канал на 1 ед: " + currentChannel);
    }

    public void switchToPreviousChannel() {
        this.currentChannel--;
        System.out.println("(уменьшить текущий канал на 1 ед: " + currentChannel);
        if (currentChannel == 0) {
            clear();
        }
    }

    public void increaseSound() {
        this.currentVolume++;
        System.out.println("Увеличить громкость на 1 ед: "+currentVolume);
    }

    public void decreaseSound() {
        this.currentVolume--;
        System.out.println("Уменьшить громкость на 1 ед."+currentVolume);
        if (currentVolume == 0) {
            clear();
        }
    }

    public boolean turnOnTv() {
        System.out.println("ТВ включен");
        return true;
    }

    public boolean turnOffTv() {
        System.out.println("ТВ выключен");
        return false;
    }

    public void clear() {
        this.currentChannel = 0;
        this.currentChannel = 0;
    }


    @Override
    public String toString() {
        return "Tv{" +
                "currentChannel=" + currentChannel +
                ", currentVolume=" + currentVolume +
                ", manufacturer='" + manufacturer + '\'' +
                ", isTvOn='" + isTvOn + '\'' +
                '}';
    }
}


class TvDemo {
    public static void main(String[] args) {
        Tv tv = new Tv();

        System.out.println(tv.getIsTvOn());
        if (tv.turnOnTv()) {
            System.out.println(tv.getManufacturer());
            tv.switchToNextChannel();
            tv.increaseSound();
        }

    }
}
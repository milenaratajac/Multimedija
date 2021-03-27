package main;

import media.Radio;
import media.Television;

public class Main {

    public static void main(String[] args) {
        Television Panasonic = new Television ();
        Panasonic.info ();
        
        Panasonic.setIsTurnedOn(true);
        Panasonic.setVolume(34);
        Panasonic.setCurrentProgram(5);
        
        Panasonic.info();
        
        Radio myRadio = new Radio (100.3, 700,'A');
        myRadio.setAmFrequency(109);
        myRadio.setBand('F');
        myRadio.setFmFrequency(703);
        
        myRadio.info();
    }
    
}

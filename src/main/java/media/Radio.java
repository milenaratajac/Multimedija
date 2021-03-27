package media;

public class Radio {
    private double fmFrequency;
    private int amFrequency;
    private char band;

    public double getFmFrequency(){
        return this.fmFrequency;
        }
    public void setFmFrequency (double fmFrequency){
        this.fmFrequency = fmFrequency;
        }
    public int getAmFrequency (){
        return this.amFrequency;
        }
    public void setAmFrequency(int amFrequency){
        this.amFrequency = amFrequency;
        }
    public char getBand (){
        return this.band;
        }
    public void setBand (char band){
        this.band = band;
        }
public Radio (){
    this.fmFrequency = 91.8;
    this.amFrequency = 600;
    this.band = 'F';
}
public Radio (double fmFrequency, int amFrequency, char band){
    this.amFrequency = amFrequency;
    this.amFrequency = amFrequency;
    this.band = band;
}
public Radio (double fmFrequency, int amFrequency) {
    this.fmFrequency = fmFrequency;
    this.amFrequency = amFrequency;
}
public void info (){
    System.out.println("Fm frekfencija: " + this.fmFrequency);
    System.out.println("Am frekfrencija: " + this.amFrequency);
    System.out.println("Trenutni talas: " + this.band);
    System.out.println("");
}
}
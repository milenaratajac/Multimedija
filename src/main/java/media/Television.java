package media;

public class Television {
    private int volume;
    private int currentProgram;
    private boolean isTurnedOn;
    
    public int getVolume (){
        return this.volume;
        }
    public void setVolume (int newVolume){
        this.volume = newVolume;
        }
    public int getCurrentProgram (){
        return this.currentProgram;
        }
    public void setCurrentProgram (int currentProgram){
        this.currentProgram = 1;
        }
    public boolean getIsTurnedOn () {
        return this.isTurnedOn;
        }
    public void setIsTurnedOn ( boolean isTurnedOn) {
        this.isTurnedOn = isTurnedOn;
        }
    public Television (){
        this.volume = 0;
        this.currentProgram = 1;
        this.isTurnedOn = false;
    }
      public Television (int volume, int program, boolean isTurnedOn){
        this.volume = volume;
        this.currentProgram = program;
        this.isTurnedOn = isTurnedOn;
    }
      public void info (){
          System.out.println("Ukljucen: " + this.isTurnedOn);
          System.out.println("Zvuk je na: " + this.volume);
          System.out.println("Trenutni program: " + this.currentProgram);
          System.out.println("");
      }
}
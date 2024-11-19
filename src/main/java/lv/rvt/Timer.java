package lv.rvt;

public class Timer {
    private ClockHand hundredthsOfSeconds;
    private ClockHand seconds;

    public Timer(){
        this.seconds = new ClockHand(60);
        this.hundredthsOfSeconds = new ClockHand(100);
       
    }
    
    public void advance() {
        this.hundredthsOfSeconds.advance();

        if (this.hundredthsOfSeconds.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return this.seconds + " seconds, " + this.hundredthsOfSeconds + " hundredths of a second.";
    }
}

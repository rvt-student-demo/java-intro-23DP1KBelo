package lv.rvt;

public class CD implements Packable{
    private String artist;
    private String name;
    private Integer year;

    public CD(String Artist, String name, int year){
        this.artist = artist;
        this.name = name;
        this.year = year;
    }

    @Override
    public double weight() {
        return 0.1;
    }

}

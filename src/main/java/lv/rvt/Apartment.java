package lv.rvt;

public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared){
        if (this.squares > compared.squares){
            return true;
        }else{
            return false;
        }
    }
    int sum = 0;
    public int priceDifference(Apartment compared){
        if (this.squares*this.pricePerSquare > compared.squares*compared.pricePerSquare){
            sum = this.squares*this.pricePerSquare - compared.squares*compared.pricePerSquare;
        } else{
            sum = compared.squares*compared.pricePerSquare - this.squares*this.pricePerSquare;
        }
        return sum;
    }

    public boolean moreExpensiveThan(Apartment compared){
        if(this.squares*this.pricePerSquare > compared.squares*compared.pricePerSquare){
            return true;
        }else{
            return false;
        }
    }
}

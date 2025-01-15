package lv.rvt;

public class box {
    private double width;
    private double height;
    private double lenght;

    public box(double width, double height, double lenght){
        this.width = width;
        this.height = height;
        this.lenght = lenght;
    }

    public box(double side){
        this.width = side;
        this.height = side;
        this.lenght = side;
    }
    
    public box(box oldBox){
        this.lenght = oldBox.lenght();
        this.height = oldBox.height();
        this.width = oldBox.width();
    }
    public double volume(){
        double V = 0;
        V = this.width * this.height *lenght;
        return V ;
    }

    public double area(){
        return 2 * FaceArea()+ 2* TopArea()+ 2* SideArea();
    }

    public box biggerBox(box oldBox){
        return new box(1.25*oldBox.width(), 1.25*oldBox.height(), 1.25*oldBox.lenght);  
    }

    public box smallerbox(box oldBox){
        return new box(0.75*oldBox.width(), 0.75*oldBox.height(), 0.75*oldBox.lenght);  
    }

    public boolean nests(box outsideBox){
        if( this.height < outsideBox.height && this.lenght < outsideBox.lenght && this.width < outsideBox.width){
            return true;
        }
        return false;
    }
    public double lenght(){
        return this.lenght;
    }

    public double width(){
        return this.width;
    }

    public double height(){
        return this.height;
    }

    private double FaceArea(){
        return this.width * this.height;
    }

    private double TopArea(){
        return this.lenght * this.width;
    }

    private double SideArea(){
        return this.lenght*this.height;
    }

    public double topArea(){
        return TopArea();
    }

    public double sideArea(){
        return SideArea();
    }

    public double faceArea(){
        return FaceArea();
    }
}

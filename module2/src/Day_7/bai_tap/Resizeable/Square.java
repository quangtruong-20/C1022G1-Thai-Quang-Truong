package Day_7.bai_tap.Resizeable;

public class Square extends Shape implements IResizeable{


    private int edge ;

    public Square() {
    }

    public Square(int edge) {
        this.edge = edge;
    }

    public int getEdge() {
        return edge;
    }

    public void setEdge(int edge) {
        this.edge = edge;
    }

    public  int getAreaSquare (){
        return this.edge * this.edge;
    }

    @Override
    public String toString() {
        return "Square{" +
                "height=" + edge +
                '}';
    }
    @Override
    public void resize(double percent) {
        this.edge += percent;
    }
}

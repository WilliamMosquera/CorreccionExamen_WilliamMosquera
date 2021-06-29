package dominio;

public class Punto {

    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void setArriba(int valor){
        y+=valor;
    }
    public void setAbajo(int valor){
        y-=valor;
    }
    public void setIzquierda(int valor){
        x-=valor;
    }
    public void setDerecha(int valor){
        x+=valor;
    }

    public int getX(){
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString(){
        return "(" + this.x+","+this.y+")";
    }
}

package Model;

public class Jugador {

    boolean stop = true;
    int velMax = 200;
    boolean combustible = true;
    boolean choque = false;
    boolean pinchazo = false;
    int distancia = 0;

    public Jugador(boolean stop, int velMax, boolean combustible, boolean choque, boolean pinchazo, int distancia) {
        this.stop = stop;
        this.velMax = velMax;
        this.combustible = combustible;
        this.choque = choque;
        this.pinchazo = pinchazo;
        this.distancia = distancia;
    }

    // crear metodo para recibir la carta
    public void recibirCarta(Carta carta) {
        carta.accion(this);
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    public int getVelMax() {
        return velMax;
    }

    public void setVelMax(int velMax) {
        this.velMax = velMax;
    }

    public boolean isChoque() {
        return choque;
    }

    public void setChoque(boolean choque) {
        this.choque = choque;
    }

    public boolean isCombustible() {
        return combustible;
    }

    public void setCombustible(boolean combustible) {
        this.combustible = combustible;
    }

    public boolean isPinchazo() {
        return pinchazo;
    }

    public void setPinchazo(boolean pinchazo) {
        this.pinchazo = pinchazo;
    }

    public int getDistancia() {
        return distancia;
    }

    public void sumarDistancia(int recorrido){
        distancia += recorrido; 
    }

}

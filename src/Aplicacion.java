public class Aplicacion implements iObservador {

    private boolean estado=false;

    public Aplicacion() { // constructor
    }

    @Override
    public void update() {  // metodo para actualizar
        estado=true;

    }

    public boolean isEstado() {
        return estado;
    }
}

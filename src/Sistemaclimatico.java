import java.util.ArrayList;

public class Sistemaclimatico implements  isujetoObservable{

    public ArrayList<iObservador> observadores; //enlazamos el sistema climatico con la aplicacion


    public Sistemaclimatico() {
        observadores = new ArrayList<iObservador>();
    }

    @Override
    public void agregarObservador(iObservador observador) {
        observadores.add(observador);

    }

    public void cambioClimatico() {
        notificarobservadores();
    }


    @Override
    public void notificarobservadores() {
        for (iObservador obser:observadores) {
            obser.update();

        }

    }
}

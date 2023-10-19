public class Main {
    public static void main(String[] args) {


        Aplicacion aplicacion=new Aplicacion();
        Sistemaclimatico sistema=new Sistemaclimatico();

        sistema.agregarObservador(aplicacion);
        sistema.cambioClimatico();

        if (aplicacion.isEstado()){
            System.out.println("Mostrar la nueva temperatura");
        }else {
            System.out.println("NO se logró actualizar");
        }



    }
}
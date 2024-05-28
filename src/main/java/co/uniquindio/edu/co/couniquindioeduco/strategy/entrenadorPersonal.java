package co.uniquindio.edu.co.couniquindioeduco.strategy;

public class entrenadorPersonal {
    private entrenamiento usoEntrenamiento;

    public entrenadorPersonal(entrenamiento usoEntrenamiento) {
        this.usoEntrenamiento=usoEntrenamiento;
    }

    public void setUsoEntrenamiento(entrenamiento usoEntrenamiento) {
        this.usoEntrenamiento = usoEntrenamiento;
    }
    public void ejecutarEntrenamiento(){
        usoEntrenamiento.realizarEntrenamiento();
    }
}

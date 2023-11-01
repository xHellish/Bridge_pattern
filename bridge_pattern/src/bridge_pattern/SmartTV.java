package bridge_pattern;

public class SmartTV implements DispositivoCasa{
	
	@Override
    public void mostrarFotos() {
        System.out.println("Mostrando fotos en Smart TV");
    }

    @Override
    public void cambiarVolumen(int nivel) {
        System.out.println("Cambiando volumen en Smart TV a " + nivel);
    }

    @Override
    public void ajustarTamañoFoto() {
        System.out.println("Ajustando tamaño de foto en Smart TV");
    }

}

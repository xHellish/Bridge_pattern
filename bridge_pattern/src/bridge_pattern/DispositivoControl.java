package bridge_pattern;

public abstract class DispositivoControl {
	
	protected DispositivoCasa dispositivoCasa;

    public DispositivoControl(DispositivoCasa dispositivoCasa) {
        this.dispositivoCasa = dispositivoCasa;
    }

    public abstract void controlarDispositivoCasa();

}

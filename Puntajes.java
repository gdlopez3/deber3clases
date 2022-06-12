public class Puntajes{
	//Atributos
	public String jugador;
	public int puntaje;

	
	public Puntajes (String _jugador, int _puntaje) {
		//se usa _ para no escribir this. ya que java asi reconoce que _ jugador es diferente a jugador de los atributos
	jugador = _jugador;
	puntaje = _puntaje;
	}
}

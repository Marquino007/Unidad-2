package marco.giti7083.futbol;

/**
 * @author Marco
 */
public class SeleccionFutbol implements IntegranteSeleccionFutbol {

	private int id;
	private String nombre;
	private String apellidos;
	private int edad;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}



	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}



	/**
	 * 
	 */
	public SeleccionFutbol() {
		// TODO Auto-generated constructor stub
	}

}

/**
 * 
 */
package marco.giti7083.proyecto;

import java.util.Date;
import java.util.List;

/**
 * @author Marco
 */
public class Proyecto {

	private String nombre;
	private String planificacion;
	private Date fechaInicio;
	private Date fechaFin;
	private String descripcion;
	private String estado;

	private List<Presupuestos> presupuestos;

	private Maquina maquinas;

	public Proyecto(Presupuestos presupuestos,Maquina maquina) {
		// TODO Auto-generated constructor stub
	}

}

/**
 * 
 */
package marco.giti7083.proyecto;

import java.util.Date;
import java.util.List;

/**
 * @author Marco
 */
public class Viaje {

	private int limite;
	private boolean transporte;
	private String motivo;
	private Date fechaIda;
	private Date fechaVuelta;
	private String Estado;
	private List<Comercial>realiza;

	private Presupuestos se_realiza_en;

	private Gasto gasto;
	
	public Viaje(Comercial comercial, Presupuestos presupuestos, Gasto gasto) {
		// TODO Auto-generated constructor stub
	}

}

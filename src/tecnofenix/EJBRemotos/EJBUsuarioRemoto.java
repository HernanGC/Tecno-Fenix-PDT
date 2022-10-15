package tecnofenix.EJBRemotos;

import javax.naming.InitialContext;



public class EJBUsuarioRemoto {
	private static String RUTA_USUARIO_EJB = "ejb:/NOMBREPROYECTO/NombreEJBUSUARIO!tecnofenix.path";
	

//	ClasesRemotas claseRemota;
	public static void doLookUp(){
	InitialContext ctx = new InitialContext();
	
	// Instanciamos las interfaces remotas con el lookup
//	claseRemota = (ClasesRemotas) ctx.lookup("ejb:/ModuloEJB/SaludoBean!com.servicios.SaludoBeanRemote");
	
	}
}

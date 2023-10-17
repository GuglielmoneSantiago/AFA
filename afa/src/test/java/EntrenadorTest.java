import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.afa.Entrenador;
import com.afa.IntegranteSeleccion;

public class EntrenadorTest {
    @Test
    public void sueldoNetoEntrenador_Test(){
        IntegranteSeleccion Scabobi = new Entrenador("Lionel","Scaloni",2,"Argentino", 150000.0);
        assertEquals(148000.0,Scabobi.sueldoNeto(), 0);
    }
}

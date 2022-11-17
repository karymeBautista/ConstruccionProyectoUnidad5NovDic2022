package Tests;

import java.io.File;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import Controller.JsonReader;
import static org.junit.jupiter.api.Assertions.*;

public class JsonReaderTest {

    String ruta = "C:\\Users\\Usuario\\Desktop\\CLON REPOSITORIOS\\RepoPruebasConstrucci-n\\Files\\employees.json";

    @Test
    @DisplayName("Probando que el archivo JSON exista")
    public void existenciaJSON() {
        File archivo = new File(ruta);
        assertTrue(archivo.exists());
    }

    @Test
    @DisplayName("Probando que la estructura del archivo JSON sea la correcta")
    public void validacionJSON() {
        
        JsonReader ejemplo = new JsonReader();
        String contenidojson = ejemplo.readJSON();
        assertTrue(ejemplo.isValid(contenidojson));
    }
}
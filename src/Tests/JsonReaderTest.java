package Tests;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import Controller.JsonReader;

public class JsonReaderTest {

    @Test
    @DisplayName("Probando que la lectura del archivo JSON sea correcta")
    public void leerArchivoJSON(){
        JsonReader JsonReader = new JsonReader();
        JsonReader.readJSON("files\\employees.json");
    }

    @Test
    @DisplayName("Probando que la lectura del archivo sea incorrecto por ser un archivo erroneo")
    public void probandoConArchivoInvalido(){
        JsonReader JsonReader = new JsonReader();
        JsonReader.readJSON("files\\employees2.json");
    }

    @Test
    @DisplayName("Probando que la lectura del archivo JSON sea incorrecta por inexistencia")
    public void probandoSinArchivo(){
        JsonReader JsonReader = new JsonReader();
        JsonReader.readJSON("files\\employees3.json");
    }
}

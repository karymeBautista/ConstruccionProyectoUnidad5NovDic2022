package test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import main.backend.controllerJSON;
import main.backend.validadorJSON;

public class JSONReaderTest {

    @Test
    @DisplayName("Probando la ejecucion correcta de la lectura")
    public void leerArchivoJSON(){
        validadorJSON jsonReader = new validadorJSON("C:\\Users\\karym\\Documents\\A-UNIVERSIDAD\\5to-semestre\\Construccion de SW\\ConstruccionProyectoUnidad3NovDic2022-development (1)\\ConstruccionProyectoUnidad3NovDic2022-development\\files\\empleados.json");
        boolean test;
        test = jsonReader.esArchivoCorrectoJSON();
        assertTrue( test );
    }

    @Test
    @DisplayName("Probando la ejecucion con un archivo inexistente")
    public void probandoSinArchivo(){
        validadorJSON jsonReader = new validadorJSON("files\\prueba.json");
        assertFalse( jsonReader.esArchivoCorrectoJSON() );
    }

    @Test
    @DisplayName("Probando la ejecucion con un archivo de estructura incorrecta. Faltan campos")
   
    public void probandoConArchivoInvalido(){
        validadorJSON jsonReader = new validadorJSON("C:\\Users\\karym\\Documents\\A-UNIVERSIDAD\\5to-semestre\\Construccion de SW\\ConstruccionProyectoUnidad3NovDic2022-development (1)\\ConstruccionProyectoUnidad3NovDic2022-development\\files\\empleado-mal-formato-json.json");
        assertFalse( jsonReader.esArchivoCorrectoJSON());
    }

    @Test
    @DisplayName("Probando la ejecucion con un archivo invalido para JSON")
    public void probandoConEstructuraIncorrectaJSON() throws IOException {
        validadorJSON jsonReader = new validadorJSON("C:\\Users\\karym\\Documents\\A-UNIVERSIDAD\\5to-semestre\\Construccion de SW\\ConstruccionProyectoUnidad3NovDic2022-development (1)\\ConstruccionProyectoUnidad3NovDic2022-development\\files\\empleados-invalido.json");
        jsonReader.esArchivoCorrectoJSON();
        assertFalse( jsonReader.validarAtributosJSON());
    }

    @Test
    @DisplayName("Probando que los empleados son leidos correctamente")
    public void testLoadEmployees(){
        
        controllerJSON json=new controllerJSON(("C:\\Users\\karym\\Documents\\A-UNIVERSIDAD\\5to-semestre\\Construccion de SW\\ConstruccionProyectoUnidad3NovDic2022-development (1)\\ConstruccionProyectoUnidad3NovDic2022-development\\files\\empleados.json"));
        assertEquals( 3, json.leerJSON().size());
    }

    @Test
    @DisplayName("Probando actualizar un atributo")
    public void probandoModficarJSON(){
        controllerJSON jsonReader = new controllerJSON("C:\\Users\\karym\\Documents\\A-UNIVERSIDAD\\5to-semestre\\Construccion de SW\\ConstruccionProyectoUnidad3NovDic2022-development (1)\\ConstruccionProyectoUnidad3NovDic2022-development\\files\\empleados.json");

        assertTrue( jsonReader.actualizarJSON(1, "firstName", "Karyme") );
    }

}

package Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import Controller.validadorJSON;
import Controller.controllerJSON;

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

    @Test
    @DisplayName("Probando eliminar elemento JSON")
    public void probandoEliminarElementJSON(){
        controllerJSON jsonReader = new controllerJSON("C:\\Users\\lucyi\\Downloads\\AGREGARELEMENTO\\ConstruccionProyectoUnidad5NovDic2022\\Files\\empleados3.json");
        jsonReader.leerJSON();
        int tamanioInicial=jsonReader.getTamanioArray();
        assertTrue( jsonReader.eliminarEmpleado(1));
        int tamanioFinal=jsonReader.getTamanioArray();
        assertEquals(tamanioInicial-1, tamanioFinal );
    }

    @Test
    @DisplayName("Probando agregar elemento JSON")
    public void probandoAgregarElementJSON(){
        controllerJSON jsonReader = new controllerJSON("C:\\Users\\lucyi\\Downloads\\AGREGARELEMENTO\\ConstruccionProyectoUnidad5NovDic2022\\Files\\empleados3.json");
        jsonReader.leerJSON();
        int tamanioInicial=jsonReader.getTamanioArray();
        assertTrue(jsonReader.agregarElemento(5, "Adam", "Sandler", "https://jsonformatter.org/img/Robert-Downey-Jr.jpg"));
        int tamanioFinal=jsonReader.getTamanioArray();
        assertEquals(tamanioInicial+1, tamanioFinal);
    }

}

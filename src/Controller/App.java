package Controller;

import org.json.simple.JSONObject;

public class App {

    public static void main(String[] args) throws Exception {
        
        JSONObject objetoEmpleado = new JSONObject();
        JsonReader prueba = new JsonReader();
        objetoEmpleado= prueba.readJSON("files\\employees.json");

        System.out.println(objetoEmpleado);
   
    }
    
}

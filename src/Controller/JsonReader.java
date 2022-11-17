package Controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class JsonReader {

    public JSONObject readJSON(String pathFile){

        //Creamos un objetoEmpleado que almacenara lo que se recupere del JSON
        JSONObject empleados = new JSONObject();
        JSONParser parser = new JSONParser();

        try (Reader reader = new FileReader(pathFile)){

            //Creamos un objeto que recupera el JSON
            JSONObject objetoJSON = (JSONObject) parser.parse(reader);
            //Asignamos a un objeto empleados lo que se recupera del JSON
            empleados = (JSONObject) objetoJSON.get("employees");
            //Asignamos a un Array a cada empleado que se recupera del JSON 
            JSONArray employee = (JSONArray) empleados.get("employee");

        } catch (FileNotFoundException e){
            System.out.println("NO SE ENCONTRO EL ARCHIVO ESPECIFICADO");
            System.out.println(e);
        } catch (IOException e){
            System.out.println(e);
        } catch(ParseException e){
            System.out.println("EL ARCHIVO NO TIENE EL FORMATO CORRECTO");
            System.out.println(e);
        }

        return empleados;
    }

    
}

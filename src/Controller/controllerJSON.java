package main.backend;

import java.util.ArrayList;

import com.google.gson.JsonObject;

public class controllerJSON {
    String pathFile;
    validadorJSON validadorJSON;

    public validadorJSON getValidadorJSON() {
        return this.validadorJSON;
    }

    public void setValidadorJSON(validadorJSON validadorJSON) {
        this.validadorJSON = validadorJSON;
    }

    public controllerJSON validadorJSON(validadorJSON validadorJSON) {
        setValidadorJSON(validadorJSON);
        return this;
    }
  
    public controllerJSON(String pathFile) {
        this.pathFile = pathFile;
        this.validadorJSON=new validadorJSON(pathFile);
    }

    public ArrayList<JsonObject> leerJSON() {
        EmpleadoJSONParser empleadoJSONParser = new EmpleadoJSONParser();
        if (this.validadorJSON.esArchivoCorrectoJSON()) {
           empleadoJSONParser.parseToEmpleados(this.validadorJSON.getJSONLeido());
        } else {
          return null;
       }

        return empleadoJSONParser.getEmpleados();
   }


    
}

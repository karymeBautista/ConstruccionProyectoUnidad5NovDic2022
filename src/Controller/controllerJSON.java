package Controller;

import java.util.ArrayList;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

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
        this.validadorJSON = new validadorJSON(pathFile);
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

    public boolean actualizarJSON(int id, String nombreAtributo, String nuevoValor) {
        ArrayList<JsonObject> listaEmp = leerJSON();

        listaEmp.get(id - 1).remove(nombreAtributo);
        listaEmp.get(id - 1).addProperty(nombreAtributo, nuevoValor);
        JSONFileCreator fileCreator = new JSONFileCreator();
        fileCreator.createJSONFile(this.getValidadorJSON().getJSONLeido());
        System.out.println(listaEmp.get(id - 1).get(nombreAtributo).getAsString());
        if (listaEmp.get(id - 1).get(nombreAtributo).getAsString() == nuevoValor) {
            return true;
        } else {
            return false;
        }
    }

    public boolean eliminarEmpleado(int id) {
        ArrayList<JsonObject> listaEmp = leerJSON();
        boolean estado=false;
        for (int i = 0;i< listaEmp.size() ; i++) {
            if (listaEmp.get(i).get("id").getAsInt() == id) {
                listaEmp.remove(i);
                JsonParser jsonParser = new JsonParser();
                Object object;
                String nuevoString = "{'employees':{'employee':" + listaEmp.toString() + "}}";
                object = jsonParser.parse(nuevoString);
                JsonParser parser = new JsonParser();
                JsonElement json = parser.parse(object.toString());
                JsonObject jsonNuevo = json.getAsJsonObject();

                JSONFileCreator fileCreator = new JSONFileCreator();
                fileCreator.createJSONFile(jsonNuevo);
                estado=true;
            } else {
                System.out.println("El id ya no existe");
               
            }
        }
        return estado;
    }

}

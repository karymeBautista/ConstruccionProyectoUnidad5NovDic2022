package Controller;

import java.util.ArrayList;


import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class controllerJSON {
    int tamanioArray;
    String pathFile;
    validadorJSON validadorJSON;

    public int getTamanioArray(){
        return this.tamanioArray;
    }

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

        this.tamanioArray=empleadoJSONParser.getEmpleados().size();
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
            System.out.println("Este entero se manda"+id);
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
        this.tamanioArray=listaEmp.size();
        return estado;
    }


    public boolean agregarElemento(int id, String firstName, String lastName, String photo){
        ArrayList<JsonObject> listaEmp = leerJSON();
        boolean estado=true;
        JsonObject employee = new JsonObject();

        for (int i = 0;i< listaEmp.size() ; i++) {
            if (listaEmp.get(i).get("id").getAsInt() == id) {
                estado=false;
            }
        }
    
        if(estado){
            employee.addProperty("id", String.valueOf(id));
            employee.addProperty("firstName", firstName);
            employee.addProperty("lastName", lastName );
            employee.addProperty("photo", photo);
            listaEmp.add(employee);
            //listaEmp.add(id, employee);
            JsonParser jsonParser = new JsonParser();
                Object object;
                String nuevoString = "{'employees':{'employee':" + listaEmp.toString() + "}}";
                object = jsonParser.parse(nuevoString);
                JsonParser parser = new JsonParser();
                JsonElement json = parser.parse(object.toString());
                JsonObject jsonNuevo = json.getAsJsonObject();

                JSONFileCreator fileCreator = new JSONFileCreator();
                fileCreator.createJSONFile(jsonNuevo);
        }

        this.tamanioArray=listaEmp.size();
        System.out.println(estado);
       return estado;
    }




public static void main(String[] args) {
    controllerJSON jsonReader = new controllerJSON("C:\\Users\\lucyi\\Downloads\\AGREGARELEMENTO\\ConstruccionProyectoUnidad5NovDic2022\\Files\\empleados3.json");
    int tamanioInicial=jsonReader.getTamanioArray();
    jsonReader.agregarElemento(3, "Adam", "Sandler", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.amazon.com%2Fprime-video%2Factor%2FAdam-Sandler%2Fnm0001191%2Fref%3Datv_dp_md_pp%3Flanguage%3Des&psig=AOvVaw1it3ivhi8QTez_Gi2swSuM&ust=1670336017189000&source=images&cd=vfe&ved=0CA8QjRxqFwoTCMC7iNnU4vsCFQAAAAAdAAAAABAJ");
    int tamanioFinal=jsonReader.getTamanioArray();
    System.out.println(tamanioInicial + "xd" + tamanioFinal);
        
}
}
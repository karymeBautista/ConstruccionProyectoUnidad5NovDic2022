package Controller;
import java.util.ArrayList;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;


public class EmpleadoJSONParser {
    
    private ArrayList<JsonObject> empleados;

    public EmpleadoJSONParser(){
        this.empleados = new ArrayList<>();
    }

    public ArrayList<JsonObject> getEmpleados() {
        return empleados;
    }

    public void parseToEmpleados( JsonObject json ){
        JsonObject employees = json.get("employees").getAsJsonObject();
        JsonArray employee = employees.get( "employee" ).getAsJsonArray();
        int employeesArraySize = employee.size();
        for( int i = 0; i < employeesArraySize; i++){
            empleados.add(employee.get(i).getAsJsonObject());
        }
    }
    
}

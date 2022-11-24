package Controller;

import java.io.*;
import com.google.gson.*;

public class JSONFileCreator {

    public boolean createJSONFile(JsonObject json){

        try (Writer writer = new FileWriter("files/empleados3.json")) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(json, writer);
            return true;

        } catch (IOException e) {
            return false;
        }
    }
}

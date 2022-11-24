package Controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.*;

public class validadorJSON {

    String pathFile;
    JsonObject jsonLeido;

    public validadorJSON(String pathFile) {
        this.pathFile = pathFile;
    }

    public boolean esArchivoCorrectoJSON() {

        JsonParser jsonParser = new JsonParser();
        Object object;

        try (FileReader reader = new FileReader(this.pathFile)) {

            object = jsonParser.parse(reader);
            JsonParser parser = new JsonParser();
            JsonElement json = parser.parse(object.toString());
            this.jsonLeido = json.getAsJsonObject();
            validarAtributosJSON();
            return true;

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
            return false;
        } catch (IOException e) {
            System.out.println("Error al abrir el archivo");
            return false;
        } catch (JsonSyntaxException e) {
            System.out.println("El archivo no cuenta con el formato correcto");
            return false;
        }

    }

    public boolean validarAtributosJSON() {

        try {
            JsonObject employees = getAtributo(getJSONLeido(), "employees").getAsJsonObject();
            JsonArray employee = getAtributo(employees, "employee").getAsJsonArray();

            for (JsonElement jsonObject : employee) {
                JsonObject empleado = jsonObject.getAsJsonObject();
                getAtributo(empleado, "id").getAsString();
                getAtributo(empleado, "firstName").getAsString();
                getAtributo(empleado, "lastName").getAsString();
                getAtributo(empleado, "photo").getAsString();
            }

            return true;

        } catch (JsonSyntaxException e) {
            return false;
        }
    }

    private JsonElement getAtributo(JsonObject object, String atributo) {
        if (!object.has(atributo)) {
            throw new JsonSyntaxException("No existe el campo: " + atributo);
        }
        return object.get(atributo);
    }

    public JsonObject getJSONLeido() {
        if (this.jsonLeido == null) {
            throw new RuntimeException("JSON is null");
        }
        return this.jsonLeido;
    }

}

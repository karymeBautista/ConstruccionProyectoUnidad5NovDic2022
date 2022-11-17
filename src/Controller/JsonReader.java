package Controller;

import static org.junit.Assert.fail;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class JsonReader {

    public String readJSON(){

        JSONObject objetoJson = new JSONObject();
        JSONParser parser = new JSONParser();
        
        try (Reader reader = new FileReader("C:\\Users\\Usuario\\Desktop\\CLON REPOSITORIOS\\RepoPruebasConstrucci-n\\Files\\employees.json")){
            
            objetoJson = (JSONObject) parser.parse(reader);

        } catch (IOException | ParseException e){
            fail("La lectura falló: " + e.getMessage());
        } 

        return objetoJson.toString();
    }

    public boolean isValid(String json) {
        
        try {
            JsonParser.parseString(json);
            return true;
        } catch (JsonSyntaxException e) {
            fail("La validacion falló: " + e.getMessage());
            return false;
        }

    }


}


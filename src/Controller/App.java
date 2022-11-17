package Controller;

public class App {

    public static void main(String[] args) throws Exception {
        
        JsonReader prueba = new JsonReader();
        System.out.println(prueba.readJSON());
        System.out.println(prueba.isValid(prueba.readJSON()));
    }
    
}

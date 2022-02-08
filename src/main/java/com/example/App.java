package com.example;

/*import java.io.File;
import java.io.FileInputStream;*/
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static spark.Spark.get;
import static spark.Spark.port;

/**
 * Hello world!
 */
public final class App {

    /**
    * Frase corta descriptiva.
    * Descripción de la clase.
    * @author Rodrigo Callisaya
    * @version 1.0, 07/02/2022
    */

    public static final int PUERTO = 3456;

    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     * @throws IOException
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        /*properties.load(new FileInputStream(new File("src/main/resources/vars.properties")));*/
        properties.load(App.class.getClassLoader().getResourceAsStream("vars.properties"));
        port(PUERTO);
        get("/entornos", (req, res) -> "En el ambiente " + properties.getProperty("AMBIENTE"));
    }
}

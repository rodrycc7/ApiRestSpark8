package com.example;

import static spark.Spark.get;
import static spark.Spark.port;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Hello world!
 */
public final class App {
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
        properties.load(new FileInputStream(new File("src/main/resources/vars.properties")));
        port(3456);
        get("/entornos", (req, res) -> "En el ambiente " + properties.getProperty("AMBIENTE_PRU"));
    }
}

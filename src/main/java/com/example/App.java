package com.example;

import static spark.Spark.get;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        get("/helloworld", (req, res) -> "Hello World");
    }
}

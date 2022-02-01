package edu.escuelaing.arep;

import static spark.Spark.get;
import static spark.Spark.port;

public class SparkWebApp {
    public static void main(String[] args) {
        
        port(getPort());
        get("/celsius/:temp", (req, res) -> {
            float temp = Integer.parseInt(req.params(":temp"));
            return  ((temp * 9)/5) + 32;
        });

        get("/fahrenheit/:temp", (req, res) -> {
            float temp = Integer.parseInt(req.params(":temp"));
            return  ((temp - 32) * 5) / 9;
        });

    }
    static int getPort(){
        if (System.getenv("PORT") != null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}

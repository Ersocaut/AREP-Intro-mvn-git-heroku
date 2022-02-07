package edu.escuelaing.arep;

import static spark.Spark.get;
import static spark.Spark.port;
import com.google.gson.JsonObject;

public class SparkWebApp {
    public static void main(String[] args) {
        
        port(getPort());
        get("/celsius/:temp", "application/json",(req, res) -> {
            float temp = Integer.parseInt(req.params(":temp"));
            JsonObject ret = new JsonObject();
            ret.addProperty("Celsius", temp);
            ret.addProperty("Fahrenheit", ((temp * 9)/5) + 32);
            ret.addProperty("Status", 200);
            return  ret;
        });

        get("/fahrenheit/:temp", "application/json",(req, res) -> {
            float temp = Integer.parseInt(req.params(":temp"));
            JsonObject ret = new JsonObject();
            ret.addProperty("Celsius", ((temp - 32) * 5) / 9);
            ret.addProperty("Fahrenheit", temp);
            ret.addProperty("Status", 200);
            return  ret;
        });

    }
    static int getPort(){
        if (System.getenv("PORT") != null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}

package edu.escuelaing.arep;

import com.google.gson.JsonObject;

import java.util.ArrayList;

import static spark.Spark.*;

public class SparkWebApp {

    static void testThreads(){
        ArrayList<TestThread> threads = new ArrayList<TestThread>();
        for (int i = 0; i < 5; i++){
            threads.add(new TestThread());
        }
        for (TestThread tt : threads){
            tt.start();
        }
    }

    public static void main(String[] args) {
        
        port(getPort());

        after((request, response) -> {
            response.header("Access-Control-Allow-Origin", "*");
            response.header("Access-Control-Allow-Methods", "GET");
        });

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

        testThreads();

    }
    static int getPort(){
        if (System.getenv("PORT") != null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}

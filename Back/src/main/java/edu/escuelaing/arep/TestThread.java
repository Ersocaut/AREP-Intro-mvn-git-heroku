package edu.escuelaing.arep;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ThreadLocalRandom;

public class TestThread extends Thread{

    private static final String USER_AGENT = "Mozilla/5.0";
    private static final String GET_URL = "https://lab01-back.herokuapp.com/";
    private final int value = ThreadLocalRandom.current().nextInt(-5,81);

    public TestThread (){

    }

    private void setThreads() throws IOException {

        URL celurl = new URL(GET_URL + "/celsius/" + value);
        URL fahurl = new URL(GET_URL + "/fahrenheit/" + value);

        HttpURLConnection cel = (HttpURLConnection) celurl.openConnection();
        HttpURLConnection fah = (HttpURLConnection) fahurl.openConnection();

        cel.setRequestMethod("GET");
        cel.setRequestProperty("User-Agent", USER_AGENT);

        fah.setRequestMethod("GET");
        fah.setRequestProperty("User-Agent", USER_AGENT);

        int rcel = cel.getResponseCode();
        int rfah = fah.getResponseCode();

        if (rcel == HttpURLConnection.HTTP_OK && rfah == HttpURLConnection.HTTP_OK){
            System.out.println("Response code: " + rfah);
            System.out.println("Response code: " + rcel);
        }
       else{
            System.out.println("Something failed.");
        }
    }

    @Override
    public void run(){
        try{
            setThreads();
        }catch(Exception e){
            System.out.println("Damn son.");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.io.FileNotFoundException;
    import java.io.PrintWriter;
    import java.net.URI;
    import java.net.http.HttpClient;
    import java.net.http.HttpRequest;
    import java.net.http.HttpResponse;
    import org.json.simple.JSONArray;
    import org.json.simple.JSONObject;
    import org.json.simple.parser.JSONParser;

/**
 *
 * @author Usuario
 */
public class MatrixAPI {
    private static final String API_KEY = "AIzaSyBMPDtKCHtfLb5shu4m7lJBrpGT1HG-Oug";
    public static float[][] distances;
    public static float[][] times;
    public static String[] cities = {"", "SanJose,+CostaRica", "Escazú", "Desamparados", "Barbacoas,+Puriscal", "Santiago,+Puriscal", "Tarrazu", "Aserri", "CiudadColon", "SantaAna,+CostaRica", "Alajuelita", "VazquezdeCoronado", "Acosta,+CostaRica,+", "Turrubares", "Dota,+CostaRica", "PerezZeledon"};
    public static final int n = cities.length;




public static String getData(String source, String destination) throws Exception {
var url = "https://maps.googleapis.com/maps/api/distancematrix/json?origins=" + source + "&destinations=" + destination + "&key=" + API_KEY;
var request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
var client = HttpClient.newBuilder().build();
var response = client.send(request, HttpResponse.BodyHandlers.ofString()).body();
System.out.println(response);
return response;



}

public static void parse(String response,int i,int j){
    long distance = -1L;
    long time = -1L;
    //parsing json data and updating data
    {
    try {
        JSONParser jp = new JSONParser();
        JSONObject jo = (JSONObject) jp.parse(response);
        JSONArray ja = (JSONArray) jo.get("rows");
        jo = (JSONObject) ja.get(0);
        ja = (JSONArray) jo.get("elements");
        jo = (JSONObject) ja.get(0);
        JSONObject je = (JSONObject) jo.get("distance");
        JSONObject jf = (JSONObject) jo.get("duration");
        distance = (long) je.get("value");
        time = (long) jf.get("value");



    distances[i][j] = distance;
    times[i][j] = time;



    } catch (Exception e) {
    System.out.println(e + " for " + cities[j]);
    }
    }
    }



public static void make_text_file() throws FileNotFoundException {
    PrintWriter out =new PrintWriter("distanceMatrix.txt");
    for (int i = 0 ; i < n ; i++) {
    for (int j = 0; j < n; j++) {
    out.print(distances[i][j] + " ");
    }
    out.println();
    }
    out.close();
    PrintWriter out2 =new PrintWriter("timeMatrix.txt");
    for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
    out2.print(times[i][j] + " ");
    }
    out2.println();
    }
    out2.close();
    }



public static void main(String[] args) throws Exception {
    distances = new float[n][n];
    times = new float[n][n];
    int count=0;
    for (int i = 1; i < n; i++)
    for (int j = 1; j < n; j++) {
    // System.out.print(++count+"/100 ");
    if (i != j) {
    String response = getData(cities[i], cities[j]);
    parse(response,i,j);
    }
    else {
    times[i][j] = 0;
    distances[i][j] = 0;
    }
    }
    make_text_file();
    }

 
}

    

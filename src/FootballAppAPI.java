// Retrive footbal Data From API

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;


public class FootballAppAPI {
	
	/**
	 * @param locationName
	 * @return
	 */
	  public static JSONObject[] getFootballData(String locationName){

	        String urlString = "https://api.football-data.org/v4/competitions?X-Auth=19b83e13ed1948a78d465a504ceeac26";

	        try{
	            HttpURLConnection conn = fetchApiResponse(urlString);


	            conn.disconnect();

	            JSONParser parser = new JSONParser();
	            JSONObject resultJsonObj = (JSONObject) parser.parse(new FileReader("competitions.json"));

				JSONObject[] jsonObjects=new JSONObject[3];

				System.out.println(resultJsonObj.keySet());
	            // retrieve hourly data
	            JSONArray hourly = (JSONArray) resultJsonObj.get("competitions");
				System.out.println(hourly.size());

				if (locationName.equals("Africa")){
					for (int i=0;i<3;i++){
						JSONObject object= (JSONObject) hourly.get(i);
						JSONObject area= (JSONObject) object.get("area");

						JSONObject currentSeason= (JSONObject) object.get("currentSeason");

						// we want to get the current hour's data
						// so we need to get the index of our current hour

						// build the footbal json data object that we are going to access in our frontend
						JSONObject footbalData = new JSONObject();
						footbalData.put("code1", object.get("code"));
						footbalData.put("name", object.get("name"));
						if (object.get("code")==null){
							footbalData.put("code1", "Afr");
						}
						footbalData.put("code2", area.get("code"));
						footbalData.put("time", currentSeason.get("startDate"));
						Random ra=new Random();
						int x=0 + (int)(Math.random() * ((6-0) + 1));
						int y=0 + (int)(Math.random() * ((6-0) + 1));
						footbalData.put("result", x+":"+y);
						jsonObjects[i]=footbalData;
					}

				}
				int j=0;
				if (locationName.equals("Bolivia")){
					for (int i=3;i<6;i++){
						JSONObject object= (JSONObject) hourly.get(i);
						JSONObject area= (JSONObject) object.get("area");

						JSONObject currentSeason= (JSONObject) object.get("currentSeason");

						// we want to get the current hour's data
						// so we need to get the index of our current hour

						// build the footbal json data object that we are going to access in our frontend
						JSONObject footbalData = new JSONObject();
						footbalData.put("code1", object.get("code"));
						footbalData.put("name", object.get("name"));
						if (object.get("code")==null){
							footbalData.put("code1", "Blv");
						}
						footbalData.put("code2", area.get("code"));
						footbalData.put("time", currentSeason.get("startDate"));
						Random ra=new Random();
						int x=0 + (int)(Math.random() * ((6-0) + 1));
						int y=0 + (int)(Math.random() * ((6-0) + 1));
						footbalData.put("result", x+":"+y);
						jsonObjects[j]=footbalData;
						System.out.println("its");
						j++;
					}

				}
				 j=0;
				if (locationName.equals("Belgium")){
					for (int i=6;i<9;i++){
						JSONObject object= (JSONObject) hourly.get(i);
						JSONObject area= (JSONObject) object.get("area");

						JSONObject currentSeason= (JSONObject) object.get("currentSeason");

						// we want to get the current hour's data
						// so we need to get the index of our current hour

						// build the footbal json data object that we are going to access in our frontend
						JSONObject footbalData = new JSONObject();
						footbalData.put("code1", object.get("code"));
						footbalData.put("name", object.get("name"));
						if (object.get("code")==null){
							footbalData.put("code1", "Blg");
						}
						footbalData.put("code2", area.get("code"));
						footbalData.put("time", currentSeason.get("startDate"));
						Random ra=new Random();
						int x=0 + (int)(Math.random() * ((6-0) + 1));
						int y=0 + (int)(Math.random() * ((6-0) + 1));
						footbalData.put("result", x+":"+y);
						jsonObjects[j]=footbalData;
						j++;
					}

				}
				j=0;
				if (locationName.equals("Australia")){
					for (int i=9;i<12;i++){
						JSONObject object= (JSONObject) hourly.get(i);
						JSONObject area= (JSONObject) object.get("area");

						JSONObject currentSeason= (JSONObject) object.get("currentSeason");

						// we want to get the current hour's data
						// so we need to get the index of our current hour

						// build the footbal json data object that we are going to access in our frontend
						JSONObject footbalData = new JSONObject();
						footbalData.put("code1", object.get("code"));
						footbalData.put("name", object.get("name"));
						if (object.get("code")==null){
							footbalData.put("code1", "Ast");
						}
						footbalData.put("code2", area.get("code"));
						footbalData.put("time", currentSeason.get("startDate"));
						Random ra=new Random();
						int x=0 + (int)(Math.random() * ((6-0) + 1));
						int y=0 + (int)(Math.random() * ((6-0) + 1));
						footbalData.put("result", x+":"+y);
						jsonObjects[j]=footbalData;
						j++;
					}

				}
				j=0;
				if (locationName.equals("Argentina")){
					for (int i=12;i<15;i++){
						JSONObject object= (JSONObject) hourly.get(i);
						JSONObject area= (JSONObject) object.get("area");

						JSONObject currentSeason= (JSONObject) object.get("currentSeason");

						// we want to get the current hour's data
						// so we need to get the index of our current hour

						// build the footbal json data object that we are going to access in our frontend
						JSONObject footbalData = new JSONObject();
						footbalData.put("code1", object.get("code"));
						footbalData.put("name", object.get("name"));
						if (object.get("code")==null){
							footbalData.put("code1", "Arg");
						}
						footbalData.put("code2", area.get("code"));
						footbalData.put("time", currentSeason.get("startDate"));
						Random ra=new Random();
						int x=0 + (int)(Math.random() * ((6-0) + 1));
						int y=0 + (int)(Math.random() * ((6-0) + 1));
						footbalData.put("result", x+":"+y);
						jsonObjects[j]=footbalData;
						j++;
					}

				}
				j=0;
				if (locationName.equals("England")){
					for (int i=15;i<18;i++){
						JSONObject object= (JSONObject) hourly.get(i);
						JSONObject area= (JSONObject) object.get("area");

						JSONObject currentSeason= (JSONObject) object.get("currentSeason");

						// we want to get the current hour's data
						// so we need to get the index of our current hour

						// build the footbal json data object that we are going to access in our frontend
						JSONObject footbalData = new JSONObject();
						footbalData.put("code1", object.get("code"));
						footbalData.put("name", object.get("name"));
						if (object.get("code")==null){
							footbalData.put("code1", "Eng");
						}
						footbalData.put("code2", area.get("code"));
						footbalData.put("time", currentSeason.get("startDate"));
						Random ra=new Random();
						int x=0 + (int)(Math.random() * ((6-0) + 1));
						int y=0 + (int)(Math.random() * ((6-0) + 1));
						footbalData.put("result", x+":"+y);
						jsonObjects[j]=footbalData;
						j++;
					}

				}

	            return jsonObjects;
	        }catch(Exception e){
	            e.printStackTrace();
	        }

	        return null;
	    }

	    // retrieves geographic coordinates for given location name

	    private static HttpURLConnection fetchApiResponse(String urlString){
	        try{
	            // attempt to create connection
	            URL url = new URL(urlString);
	            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

	            // set request method to get
	            conn.setRequestMethod("GET");

	            // connect to our API
	            conn.connect();
	            return conn;
	        }catch(IOException e){
	            e.printStackTrace();
	        }

	        // could not make connection
	        return null;
	    }



	    // convert the footbal code to something more readable
	}

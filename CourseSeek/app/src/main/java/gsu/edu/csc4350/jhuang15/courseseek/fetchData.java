package gsu.edu.csc4350.jhuang15.courseseek;

import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class fetchData extends AsyncTask<Void,Void,Void>  {
    String data = ""; //the whole JSON file
    String dataParsed = "";
    String singleParsed =""; //single JSON object


    @Override
    protected Void doInBackground(Void... voids) {
        try{
            URL url = new URL("http://www.khanacademy.org/api/v1/videos/number-grid?modal=1");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";
            while(line != null){
                line = bufferedReader.readLine();
                data = data +line;
            }

            JSONArray JA= new JSONArray(data);
            for (int i = 0; i <JA.length(); i++){
                JSONObject JO = (JSONObject) JA.get(i);
                singleParsed = "Title: " +JO.get("display_name")+"\n";

                dataParsed = dataParsed +singleParsed +"\n" ;


            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);

        VideoActivity.data.setText(this.data);
    }
}


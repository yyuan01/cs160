package com.example.yuanyuan.prog_02;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.net.URL;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class cong_1 extends AppCompatActivity {

    RequestQueue rq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cong_1);


        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra("zipcode").toString(); //Just to stringe3d
        rq = Volley.newRequestQueue(this);

        // Capture the layout's TextView and set the string as its text

        loadData(message);


    }

    protected void loadData(String message) {
        String url = "https://api.geocod.io/v1.3/geocode?q=" + message + "&fields=cd,stateleg&api_key=99d55d4bd2d74beb665d2bb56994514949da2bd";

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        //zipView.setText("Response: " + response.toString());
                        displayCong(response);
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // TODO: Handle error

                    }
                });

// Access the RequestQueue through your singleton class.
        rq.add(jsonObjectRequest);
    }

    protected void displayCong(JSONObject jsonObj) {
        // Name Pict Email Party Web
        try {
            JSONArray array = jsonObj.getJSONArray("results");
            JSONObject object = array.getJSONObject(0);
            JSONObject object1 = object.getJSONObject("fields");
            JSONArray array1 = object1.getJSONArray("congressional_districts");
            JSONObject object2 = array1.getJSONObject(0);
            JSONArray array2 = object2.getJSONArray("current_legislators");
            JSONObject object3 = array2.getJSONObject(0);
            JSONObject object4 = object3.getJSONObject("bio");
            JSONObject object5 = object3.getJSONObject("contact");
            JSONObject object6 = object3.getJSONObject("references");
            Button button2 = findViewById(R.id.button2);
            String last_name = object4.getString("last_name");
            String first_name = object4.getString("first_name");
            String party = object4.getString("party");
            String url = object5.getString("url");
            String contact_form = object5.getString("contact_form");
            String bioguide_id = object6.getString("bioguide_id");
            String img_url = "https://bioguide.congress.gov/bioguide/photo/" +
                    bioguide_id.charAt(0) + "/" + bioguide_id + ".jpg";

            String type2 = object3.getString("type");

            TextView name2 = findViewById(R.id.name2);
            ImageView imageView2 = findViewById(R.id.imageView5);
            TextView email2 = findViewById(R.id.email2);
            TextView party2 = findViewById(R.id.party5);
            TextView web2 = findViewById(R.id.web4);
            name2.setText(type2.toUpperCase() + "     " + first_name + " " + last_name);
            email2.setText(contact_form);
            party2.setText(party);
            web2.setText(url);
            //img_url = "http://bioguide.congress.gov/bioguide/photo/F/F000062.jpg";
            imageView2.setImageDrawable(LoadImageFromWebOperations(img_url));


            JSONArray arrayP = jsonObj.getJSONArray("results");
            JSONObject objectP = arrayP.getJSONObject(0);
            JSONObject object1P = objectP.getJSONObject("fields");
            JSONArray array1P = object1P.getJSONArray("congressional_districts");
            JSONObject object2P = array1P.getJSONObject(0);
            JSONArray array2P = object2P.getJSONArray("current_legislators");
            JSONObject object3P = array2P.getJSONObject(1);
            JSONObject object4P = object3P.getJSONObject("bio");
            JSONObject object5P = object3P.getJSONObject("contact");
            JSONObject object6P = object3P.getJSONObject("references");
            //Button button2P = findViewById(R.id.button2);
            String last_nameP = object4P.getString("last_name");
            String first_nameP = object4P.getString("first_name");
            String partyP = object4P.getString("party");
            String urlP = object5P.getString("url");
            String contact_formP = object5P.getString("contact_form");
            String bioguide_idP = object6P.getString("bioguide_id");
            String img_urlP = "https://bioguide.congress.gov/bioguide/photo/" +
                    bioguide_idP.charAt(0) + "/" + bioguide_idP + ".jpg";
            String type2P = object3P.getString("type");


            TextView name2P = findViewById(R.id.name5);
            ImageView imageView2P = findViewById(R.id.imageView4);
            TextView email2P = findViewById(R.id.email5);
            TextView party2P = findViewById(R.id.party4);
            TextView web2P = findViewById(R.id.web5);
            name2P.setText(type2P.toUpperCase() + "     " + first_nameP + " " + last_nameP);
            email2P.setText(contact_formP);
            party2P.setText(partyP);
            web2P.setText(urlP);
            imageView2P.setImageDrawable(LoadImageFromWebOperations(img_urlP));


            JSONArray arrayQ = jsonObj.getJSONArray("results");
            JSONObject objectQ = arrayQ.getJSONObject(0);
            JSONObject object1Q = objectQ.getJSONObject("fields");
            JSONArray array1Q = object1Q.getJSONArray("congressional_districts");
            JSONObject object2Q = array1Q.getJSONObject(0);
            JSONArray array2Q = object2Q.getJSONArray("current_legislators");
            JSONObject object3Q = array2Q.getJSONObject(2);
            JSONObject object4Q = object3Q.getJSONObject("bio");
            JSONObject object5Q = object3Q.getJSONObject("contact");
            JSONObject object6Q = object3Q.getJSONObject("references");
            //Button button2Q = findViewById(R.id.button2);
            String last_nameQ = object4Q.getString("last_name");
            String first_nameQ = object4Q.getString("first_name");
            String partyQ = object4Q.getString("party");
            String urlQ = object5Q.getString("url");
            String contact_formQ = object5Q.getString("contact_form");
            String bioguide_idQ = object6Q.getString("bioguide_id");
            String img_urlQ = "https://bioguide.congress.gov/bioguide/photo/" +
                    bioguide_idQ.charAt(0) + "/" + bioguide_idQ + ".jpg";
            String type2Q = object3Q.getString("type");

            TextView name2Q = findViewById(R.id.name3);
            ImageView imageView2Q = findViewById(R.id.imageView2);
            TextView email2Q = findViewById(R.id.email4);
            TextView party2Q = findViewById(R.id.party2);
            TextView web2Q = findViewById(R.id.web2);
            name2Q.setText(type2Q.toUpperCase() + "     " +  first_nameQ + " " + last_nameQ);
            email2Q.setText(contact_formQ);
            party2Q.setText(partyQ);
            web2Q.setText(urlQ);
            imageView2Q.setImageDrawable(LoadImageFromWebOperations("http://bioguide.congress.gov/bioguide/photo/F/F000062.jpg"));










            button2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    cong_1.super.onBackPressed();
                }
            });





        } catch (Exception e) {
            e.printStackTrace();
        }



    }
    public static Drawable LoadImageFromWebOperations(String url) {
        try {
            InputStream is = (InputStream) new URL(url).getContent();
            Drawable d = Drawable.createFromStream(is, "name");
            return d;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    protected void displayDetail(JSONObject jsonObj) {
        //Name Pict Party + Name of each committee EC + recent Bills EC
        try {
            JSONArray array = jsonObj.getJSONArray("results");
            // Name
            JSONObject object = array.getJSONObject(0);
            JSONObject object1 = object.getJSONObject("fields");
            JSONArray array1 = object1.getJSONArray("congressional_districts");
            JSONObject object2 = array1.getJSONObject(0);
            JSONArray array2 = object2.getJSONArray("current_legislators");
            JSONObject object3 = array2.getJSONObject(0);
            JSONObject object4 = object3.getJSONObject("bio");
            JSONObject object5 = object3.getJSONObject("contact");
            JSONObject object6 = object3.getJSONObject("references");
            String last_name = object4.getString("last_name");
            String first_name = object4.getString("first_name");
            String party = object4.getString("party");
            String url = object5.getString("url");
            String contact_form = object5.getString("contact_form");
            String bioguide_id = object6.getString("bioguide_id");
            String img_url = "http://bioguide.congress.gov/bioguide/photo/" +
                    bioguide_id.charAt(0) + "/" + bioguide_id + ".jpg";

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}


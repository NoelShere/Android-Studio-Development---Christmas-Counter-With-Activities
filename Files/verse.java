package ns.noelistic.christmascountdown;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class verse extends AppCompatActivity {

    String a;
    public static String other;
    TextView textView;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verse);
        textView = (TextView) findViewById(R.id.textView2); // ideally do this in onCreate()

//        {
//            if (isNetworkAvailable() == true) {
//                new Thread(new Runnable() {
//
//                    public void run() {
//
//
//                        final ArrayList<String> urls = new ArrayList<String>(); //to read each line
//                        //TextView t; //to show the result, please declare and find it inside onCreate()
//
//
//                        try {
//
//
//                            // Create a URL for the desired page
//                            URL url = new URL("https://beta.ourmanna.com/api/v1/get/?format=text&order=random"); //My text file location
//                            //First open the connection
//                            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//                            conn.setConnectTimeout(60000); // timing out in a minute
//
//                            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//
//                            textView = (TextView) findViewById(R.id.textView2); // ideally do this in onCreate()
//                            String str;
//                            while ((str = in.readLine()) != null) {
//                                urls.add(str);
//
//                            }
//                            in.close();
//                        } catch (Exception e) {
//                            Log.d("MyTag", e.toString());
//
//                        }
//
//
//                        //since we are in background thread, to post results we have to go back to ui thread. do the following for that
//
//                        verse.this.runOnUiThread(new Runnable() {
//                            public void run() {
//
//                                a = urls.toString();
//                                textView.setText(urls.get(0)); // My TextFile has 3
//                                //  tvHeaderText.setText(urls.get(0));
//                            }
//                        });
//
//                    }
//                }).start();
//
//
//            }
//        }




        new Timer().scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {
                //your method

//                if (isNetworkAvailable() == false) {
//
//                    textView.setText(R.string.access);
//
//                }

               // if (isNetworkAvailable() == true) {
                    new Thread(new Runnable() {

                        public void run() {


                            final ArrayList<String> urls = new ArrayList<String>(); //to read each line
                            //TextView t; //to show the result, please declare and find it inside onCreate()


                            try {


                                // Create a URL for the desired page
                                URL url = new URL("https://beta.ourmanna.com/api/v1/get/?format=text&order=random"); //My text file location
                                //First open the connection
                                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                                conn.setConnectTimeout(100000); // timing out in a minute

                                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));

//                                textView = (TextView) findViewById(R.id.textView2); // ideally do this in onCreate()
                                String str;
                                while ((str = in.readLine()) != null) {
                                    urls.add(str);

                                }
                                in.close();
                            } catch (Exception e) {
                                Log.d("MyTag", e.toString());

                            }


                            //since we are in background thread, to post results we have to go back to ui thread. do the following for that

                            verse.this.runOnUiThread(new Runnable() {
                                public void run() {

                                    textView = (TextView) findViewById(R.id.textView2); // ideally do this in onCreate()

                                    if (isNetworkAvailable() == false) {

                                        textView.setText(R.string.access);
                                    }
                                    else {

                                        other = urls.toString();
                                        a = urls.toString();
                                        textView.setText(urls.get(0)); // My TextFile has 3
                                        //  tvHeaderText.setText(urls.get(0));
                                    }

                                }
                            });

                        }
                    }).start();







            }
        }, 0, 10000);//put here time 1000 milliseconds=1 second



        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                a = a.replace("[","");
////                a = a.replace("]","");

                String s = textView.getText().toString();
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Bible Verse:");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
                startActivity(Intent.createChooser(sharingIntent, "Share Text Via"));
            }
        });






    }

    public  boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }



    @Override
    public void onBackPressed(){
        super.onBackPressed();
        Animatoo.animateSlideDown(verse.this);
    }
}

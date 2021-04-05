package ns.noelistic.christmascountdown;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class MainActivity extends AppCompatActivity {
    private TextView txtDay, txtHour, txtMinute, txtSecond,textView5_col,textView6,textView7,textView2,textView10;
    private ImageView wicview;
    private ImageView carolsview;
    private ImageView musicview;
    //private ImageView cookingview;
    private ImageView verseview;
   // private ImageView coloringview;
    //private ImageView storiesview;
    //private ImageView wallpaperview;
    private ImageView cardsview;
    private ImageView settingsview;
    private Handler handler;
    private Runnable runnable;
    // private AdView mAdView;
    private ScrollView scrollView2;

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        txtDay = (TextView) findViewById(R.id.txtDay);
        txtHour = (TextView) findViewById(R.id.txtHour);
        txtMinute = (TextView) findViewById(R.id.txtMinute);
        txtSecond = (TextView) findViewById(R.id.txtSecond);
        textView5_col = (TextView) findViewById(R.id.textView5_col);

        textView6 = (TextView) findViewById(R.id.textView6);

        textView7 = (TextView) findViewById(R.id.textView7);

        textView2 = (TextView) findViewById(R.id.textView2);

        wicview = (ImageView) findViewById(R.id.whatischristmasbutton);

        carolsview = (ImageView) findViewById(R.id.carolsbutton);

        musicview = (ImageView) findViewById(R.id.musicButon);

        //cookingview = (ImageView) findViewById(R.id.cookingbutton);

        verseview = (ImageView) findViewById(R.id.bibleversebutton);

       // coloringview = (ImageView) findViewById(R.id.colorbookbutton);

       // storiesview = (ImageView) findViewById(R.id.christstoriesbutton) ;

       // wallpaperview = (ImageView) findViewById(R.id.wallpaperbutton);

        cardsview = (ImageView) findViewById(R.id.cardsbutton);

        settingsview = (ImageView) findViewById(R.id.settingbutton);





        //textView10 = (TextView) findViewById(R.id.textView10);
        // tvEventStart = (TextView) findViewById(R.id.tveventStart);

        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance(DateFormat.LONG).format(calendar.getTime());

        TextView textViewDate = findViewById(R.id.text_view_date);
        textViewDate.setText(currentDate);


        //setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        countDownStart();


        /* Onclick buttons */



        wicview.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
//
//                Intent intent = new Intent(MainActivity.this,whatischristmas.class);
//                startActivity(intent);
//                Animatoo.animateSlideUp(MainActivity.this);



                Toast.makeText(MainActivity.this, "Sorry, Not Avaiable Yet",
                        Toast.LENGTH_LONG).show();

            }

        });

        carolsview.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,carols.class);

                startActivity(intent);

                Animatoo.animateSlideUp(MainActivity.this);

            }

        });

        musicview.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {



                Intent intent3 = new Intent(MainActivity.this, music.class);
                startActivity(intent3);
                Animatoo.animateSlideUp(MainActivity.this);


//                Toast.makeText(MainActivity.this, "Sorry, Not Avaiable Yet",
//                        Toast.LENGTH_LONG).show();

            }

        });


//        cookingview.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//
////                Intent intent = new Intent(MainActivity.this, music.class);
////
////                startActivity(intent);
////
////                Animatoo.animateSlideUp(MainActivity.this);
//                Toast.makeText(MainActivity.this, "Sorry, Not Avaiable Yet",
//                        Toast.LENGTH_LONG).show();
//
//            }
//
//        });

        verseview.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, verse.class);

                startActivity(intent);

                Animatoo.animateSlideUp(MainActivity.this);

//                Toast.makeText(MainActivity.this, "Sorry, Not Avaiable Yet",
//                        Toast.LENGTH_LONG).show();

            }

        });

//        coloringview.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//
////                Intent intent = new Intent(MainActivity.this, music.class);
////
////                startActivity(intent);
////
////                Animatoo.animateSlideUp(MainActivity.this);
//                Toast.makeText(MainActivity.this, "Sorry, Not Avaiable Yet",
//                        Toast.LENGTH_LONG).show();
//
//            }
//
//        });

//        storiesview.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//
////                Intent intent = new Intent(MainActivity.this, music.class);
////
////                startActivity(intent);
////
////                Animatoo.animateSlideUp(MainActivity.this);
//                Toast.makeText(MainActivity.this, "Sorry, Not Avaiable Yet",
//                        Toast.LENGTH_LONG).show();
//
//            }
//
//        });



//        wallpaperview.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//
////                Intent intent = new Intent(MainActivity.this, music.class);
////
////                startActivity(intent);
////
////                Animatoo.animateSlideUp(MainActivity.this);
//                Toast.makeText(MainActivity.this, "Sorry, Not Avaiable Yet",
//                        Toast.LENGTH_LONG).show();
//
//            }
//
//        });

        cardsview.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(MainActivity.this, cards.class);
                startActivity(intent1);
                Animatoo.animateSlideUp(MainActivity.this);



//                Toast.makeText(MainActivity.this, "Sorry, Not Avaiable Yet",
//                        Toast.LENGTH_LONG).show();

            }

        });

        settingsview.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

//                Intent intent = new Intent(MainActivity.this, music.class);
//
//                startActivity(intent);
//
//                Animatoo.animateSlideUp(MainActivity.this);
                Toast.makeText(MainActivity.this, "Sorry, Not Avaiable Yet",
                        Toast.LENGTH_LONG).show();

            }

        });



    }













    public void countDownStart() {
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                handler.postDelayed(this, 1000);
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    // Please here set your event date//YYYY-MM-DD
                    Date futureDate = dateFormat.parse("2020-12-25");
                    Date currentDate = new Date();
                    if (!currentDate.after(futureDate)) {
                        long diff = futureDate.getTime()
                                - currentDate.getTime();
                        long days = diff / (24 * 60 * 60 * 1000);
                        diff -= days * (24 * 60 * 60 * 1000);
                        long hours = diff / (60 * 60 * 1000);
                        diff -= hours * (60 * 60 * 1000);
                        long minutes = diff / (60 * 1000);
                        diff -= minutes * (60 * 1000);
                        long seconds = diff / 1000;
                        txtDay.setText("" + String.format("%02d", days));
                        txtHour.setText("" + String.format("%02d", hours));
                        txtMinute.setText(""  + String.format("%02d", minutes));
                        txtSecond.setText(""
                                + String.format("%02d", seconds));
                    } else {
                        //  tvEventStart.setVisibility(View.VISIBLE);
                        //  tvEventStart.setText("The event started!");
                        txtDay.setVisibility(View.INVISIBLE);
                        txtHour.setVisibility(View.INVISIBLE);
                        txtMinute.setVisibility(View.INVISIBLE);
                        txtSecond.setVisibility(View.INVISIBLE);
                        textView5_col.setVisibility(View.INVISIBLE);
                        textView6.setVisibility(View.INVISIBLE);
                        textView7.setVisibility(View.INVISIBLE);
                        textView2.setVisibility(View.INVISIBLE);
                        textView10.setVisibility(View.INVISIBLE);
                        scrollView2.setVisibility(View.INVISIBLE);
                        // textViewGone();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        handler.postDelayed(runnable, 1 * 1000);
    }

    //   public void textViewGone() {
    //   findViewById(R.id.LinearLayout1).setVisibility(View.GONE);
    //  findViewById(R.id.LinearLayout2).setVisibility(View.GONE);
    //   findViewById(R.id.LinearLayout3).setVisibility(View.GONE);
    //   findViewById(R.id.LinearLayout4).setVisibility(View.GONE);
//        findViewById(R.id.textViewheader1).setVisibility(View.GONE);
//        findViewById(R.id.textViewheader2).setVisibility(View.GONE);
    // }


    @Override
    public void onBackPressed(){


    }

}


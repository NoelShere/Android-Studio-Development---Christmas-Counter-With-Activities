package ns.noelistic.christmascountdown;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

import java.io.File;
import java.io.IOException;

public class music extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private MediaPlayer mediaPlayer2;
    private MediaPlayer mediaPlayer3;
    private MediaPlayer mediaPlayer4;

    //  private Button backbtn;


    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //backbtn = (Button) findViewById(R.id.backbtn);

//        backbtn.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//
//                Intent intent = new Intent(carols.this, MainActivity.class);
//
//                startActivity(intent);
//
//                Animatoo.animateSlideDown(carols.this);
//
//            }
//
//        });


        Button playButton = (Button) findViewById(R.id.start);
        mediaPlayer = MediaPlayer.create(music.this, R.raw.beginning);
        playButton.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {


                                              if (mediaPlayer2.isPlaying()) {

                                                  mediaPlayer2.pause();
                                              }
                                              if (mediaPlayer3.isPlaying()) {
                                                  mediaPlayer3.pause();
                                              }
                                              if (mediaPlayer4.isPlaying()) {
                                                  mediaPlayer4.pause();
                                              }


                                              mediaPlayer.start();


                                          }
                                      }
        );


        Button pauseButton = (Button) findViewById(R.id.stop);

        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  mediaPlayer.pause();

                if (mediaPlayer.isPlaying()) {

                    mediaPlayer.pause();
                }
                if (mediaPlayer2.isPlaying()) {

                    mediaPlayer2.pause();
                }
                if (mediaPlayer3.isPlaying()) {
                    mediaPlayer3.pause();
                }
                if (mediaPlayer4.isPlaying()) {
                    mediaPlayer4.pause();
                }




            }
        });


        Button playButton2 = (Button) findViewById(R.id.start2);
        mediaPlayer2 = MediaPlayer.create(music.this, R.raw.alliwant);
        playButton2.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {


                                               if (mediaPlayer.isPlaying()) {
                                                   mediaPlayer.pause();

                                               }
                                               if (mediaPlayer3.isPlaying()) {
                                                   mediaPlayer3.pause();
                                               }
                                               if (mediaPlayer4.isPlaying()) {
                                                   mediaPlayer4.pause();
                                               }


                                               mediaPlayer2.start();}



                                       }
        );


        Button pauseButton2 = (Button) findViewById(R.id.stop2);

        pauseButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {





                // mediaPlayer2.pause();

                if (mediaPlayer.isPlaying()) {

                    mediaPlayer.pause();
                }
                if (mediaPlayer2.isPlaying()) {

                    mediaPlayer2.pause();
                }
                if (mediaPlayer3.isPlaying()) {
                    mediaPlayer3.pause();
                }
                if (mediaPlayer4.isPlaying()) {
                    mediaPlayer4.pause();
                }

            }
        });


        // button 3


        Button playButton3 = (Button) findViewById(R.id.start3);
        mediaPlayer3 = MediaPlayer.create(music.this, R.raw.wonderfull);
        playButton3.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {


                                               if (mediaPlayer.isPlaying()) {
                                                   mediaPlayer.pause();
                                               }
                                               if (mediaPlayer2.isPlaying()) {
                                                   mediaPlayer2.pause();
                                               }
                                               if (mediaPlayer4.isPlaying()) {
                                                   mediaPlayer4.pause();
                                               }
                                               mediaPlayer3.start();
                                           }
                                       }
        );


        Button pauseButton3 = (Button) findViewById(R.id.stop3);

        pauseButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                mediaPlayer3.pause();

                if (mediaPlayer.isPlaying()) {

                    mediaPlayer.pause();
                }
                if (mediaPlayer2.isPlaying()) {

                    mediaPlayer2.pause();
                }
                if (mediaPlayer3.isPlaying()) {
                    mediaPlayer3.pause();
                }
                if (mediaPlayer4.isPlaying()) {
                    mediaPlayer4.pause();
                }


            }
        });

        // button 4
        Button playButton4 = (Button) findViewById(R.id.start4);
        mediaPlayer4 = MediaPlayer.create(music.this, R.raw.last);
        playButton4.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {

                                               if (mediaPlayer.isPlaying()) {
                                                   mediaPlayer.pause();

                                               }

                                               if (mediaPlayer2.isPlaying()) {
                                                   mediaPlayer2.pause();
                                               }
                                               if (mediaPlayer3.isPlaying()) {
                                                   mediaPlayer3.pause();
                                               }
                                               mediaPlayer4.start();


                                           }
                                       }
        );


        Button pauseButton4 = (Button) findViewById(R.id.stop4);

        pauseButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //mediaPlayer4.pause();

                if (mediaPlayer.isPlaying()) {

                    mediaPlayer.pause();
                }
                if (mediaPlayer2.isPlaying()) {

                    mediaPlayer2.pause();
                }
                if (mediaPlayer3.isPlaying()) {
                    mediaPlayer3.pause();
                }
                if (mediaPlayer4.isPlaying()) {
                    mediaPlayer4.pause();
                }

            }
        });



    }



    @Override
    public void onPause() {
        super.onPause();
        mediaPlayer.stop();
        mediaPlayer2.stop();
        mediaPlayer3.stop();
        mediaPlayer4.stop();
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        Animatoo.animateSlideDown(music.this);
    }
}


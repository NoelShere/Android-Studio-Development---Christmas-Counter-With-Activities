package ns.noelistic.christmascountdown;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.FileProvider;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.Toast;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class cards extends AppCompatActivity {
    CardView card1, card2, card3, card4, card5, card6, card7, card8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cards);

        card1 = (CardView) findViewById(R.id.card1);
        card2 = (CardView) findViewById(R.id.card2);
        card3 = (CardView) findViewById(R.id.card3);
        card4 = (CardView) findViewById(R.id.card4);
        card5 = (CardView) findViewById(R.id.card5);
        card6 = (CardView) findViewById(R.id.card6);
        card7 = (CardView) findViewById(R.id.card7);
        card8 = (CardView) findViewById(R.id.card8);



        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




          //      Uri uri = FileProvider.getUriForFile(this, BuildConfig.APPLICATION_ID, imageFile);


                Uri imageUri = Uri.parse("android.resource://" + getPackageName() + "/drawable/card1");
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
                sendIntent.putExtra(Intent.EXTRA_STREAM, imageUri);
                sendIntent.setType("image/png");

                startActivity(Intent.createChooser(sendIntent, "send"));


//                sendIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
//                sendIntent.addFlags(Intent.FLAG_GRANT_PREFIX_URI_PERMISSION);
//                sendIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
//                sendIntent.addFlags(Intent.FLAG_GRANT_WRITE_URI_PERMISSION);
//                sendIntent.setPackage("com.whatsapp");
//                startActivity(Intent.createChooser(sendIntent, "send"));

//                Uri uri = Uri.parse(path);
//
//                Intent intent = new Intent(Intent.ACTION_SEND);
//                intent.setType("image/jpeg");
//                intent.putExtra(Intent.EXTRA_STREAM, uri);
//                startActivity(Intent.createChooser(intent, "Share Image"));

//                Intent shareIntent = new Intent();
//                shareIntent.setAction(Intent.ACTION_SEND);
//                shareIntent.setType("image/png");
//                Uri uri = Uri.parse("android.resource://ns.noelistic.christmascountdown/"+R.drawable.card1);
//                shareIntent.putExtra(Intent.EXTRA_STREAM, uri);
////                shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, This is test Sharing");
//                startActivity(Intent.createChooser(shareIntent, "Send your image"));






//                //Create a chooser by using the following code. You can add it in the part where you say imageview.setonclicklistener().
//                        Intent intent = new Intent();
//// Show only images, no videos or anything else
//                intent.setType("image/*");
//                intent.setAction(Intent.ACTION_GET_CONTENT);
//// Always show the chooser (if there are multiple options available)
//                startActivityForResult(Intent.createChooser(intent, "Select Picture"), 1);







//                Bitmap b = BitmapFactory.decodeResource(getResources(),R.drawable.card1);
//
//                Intent share = new Intent(Intent.ACTION_SEND);
//                share.setType("image/jpeg");
//                ByteArrayOutputStream bytes = new ByteArrayOutputStream();
//                b.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
//                String path = MediaStore.Images.Media.insertImage(getContentResolver(), b, "Title", null);
//                Uri imageUri =  Uri.parse(path);
//                share.putExtra(Intent.EXTRA_STREAM, imageUri);
//                startActivity(Intent.createChooser(share, "Select"));


            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_SHORT).show();

                Uri imageUri = Uri.parse("android.resource://" + getPackageName() + "/drawable/card2");
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
                sendIntent.putExtra(Intent.EXTRA_STREAM, imageUri);
                sendIntent.setType("image/png");

                startActivity(Intent.createChooser(sendIntent, "send"));

            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_SHORT).show();

                Uri imageUri = Uri.parse("android.resource://" + getPackageName() + "/drawable/card3");
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
                sendIntent.putExtra(Intent.EXTRA_STREAM, imageUri);
                sendIntent.setType("image/png");

                startActivity(Intent.createChooser(sendIntent, "send"));

            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           //     Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_SHORT).show();
                Uri imageUri = Uri.parse("android.resource://" + getPackageName() + "/drawable/x2");
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
                sendIntent.putExtra(Intent.EXTRA_STREAM, imageUri);
                sendIntent.setType("image/png");

                startActivity(Intent.createChooser(sendIntent, "send"));

            }
        });

        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_SHORT).show();
                Uri imageUri = Uri.parse("android.resource://" + getPackageName() + "/drawable/card5");
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
                sendIntent.putExtra(Intent.EXTRA_STREAM, imageUri);
                sendIntent.setType("image/png");

                startActivity(Intent.createChooser(sendIntent, "send"));

            }
        });

        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_SHORT).show();
                Uri imageUri = Uri.parse("android.resource://" + getPackageName() + "/drawable/x");
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
                sendIntent.putExtra(Intent.EXTRA_STREAM, imageUri);
                sendIntent.setType("image/png");

                startActivity(Intent.createChooser(sendIntent, "send"));

            }
        });

        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_SHORT).show();
                Uri imageUri = Uri.parse("android.resource://" + getPackageName() + "/drawable/card7");
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
                sendIntent.putExtra(Intent.EXTRA_STREAM, imageUri);
                sendIntent.setType("image/png");

                startActivity(Intent.createChooser(sendIntent, "send"));

            }
        });

        card8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //    Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_SHORT).show();
                Uri imageUri = Uri.parse("android.resource://" + getPackageName() + "/drawable/card8");
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
                sendIntent.putExtra(Intent.EXTRA_STREAM, imageUri);
                sendIntent.setType("image/png");

                startActivity(Intent.createChooser(sendIntent, "send"));

            }
        });

    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        Animatoo.animateSlideDown(cards.this);
    }
}

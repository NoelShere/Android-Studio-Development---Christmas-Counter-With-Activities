package ns.noelistic.christmascountdown;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class cooking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cooking);
    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
        Animatoo.animateSlideDown(cooking.this);
    }
}

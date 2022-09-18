package hu.petrik.szinek;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.slider.Slider;

import java.util.Random;

public class MainActivity extends AppCompatActivity {



    private RelativeLayout layout;
    private TextView textSzin;
    //private Random rnd;
    Slider slider1;
    Slider slider2;
    Slider slider3;
    public int red;
    public int green;
    public int blue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        slider1=(Slider)findViewById(R.id.slider1) ;
        slider2=(Slider)findViewById(R.id.slider2) ;
        slider3=(Slider)findViewById(R.id.slider3) ;


        init();
        slider1.addOnChangeListener(new Slider.OnChangeListener() {
            @Override
            public void onValueChange(@NonNull Slider slider, float value, boolean fromUser) {
                red = (int)slider.getValue();
                layout.setBackgroundColor(Color.rgb(red, green, blue));
                String szinSzoveges = String.format("(%d, %d, %d)", red, green, blue);
                textSzin.setText(szinSzoveges);
            }
        });

        slider2.addOnChangeListener(new Slider.OnChangeListener() {
            @Override
            public void onValueChange(@NonNull Slider slider, float value, boolean fromUser) {
                green = (int)slider.getValue();
                layout.setBackgroundColor(Color.rgb(red, green, blue));
                String szinSzoveges = String.format("(%d, %d, %d)", red, green, blue);
                textSzin.setText(szinSzoveges);
            }
        });

        slider3.addOnChangeListener(new Slider.OnChangeListener() {
            @Override
            public void onValueChange(@NonNull Slider slider, float value, boolean fromUser) {
                blue = (int)slider.getValue();
                layout.setBackgroundColor(Color.rgb(red, green, blue));
                String szinSzoveges = String.format("(%d, %d, %d)", red, green, blue);
                textSzin.setText(szinSzoveges);
            }
        });


//        init();
//        layout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int red = rnd.nextInt(256);     //0-255
//                int green = rnd.nextInt(256);
//                int blue = rnd.nextInt(256);
//                layout.setBackgroundColor(Color.rgb(red, green, blue));
//                String szinSzoveges = String.format("(%d, %d, %d)", red, green, blue);
//                textSzin.setText(szinSzoveges);
//                if (red + green + blue >450){
//                    textSzin.setTextColor(Color.BLACK);
//                }else{
//                    textSzin.setTextColor(Color.WHITE);
//                }
//            }
//        });
    }

    private void init(){
        layout = findViewById(R.id.layout);
        textSzin = findViewById(R.id.textSzin);
        //rnd = new Random();
    }
}
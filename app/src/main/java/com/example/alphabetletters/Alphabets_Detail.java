                        package com.example.alphabetletters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

    public class Alphabets_Detail extends AppCompatActivity {

        TextView Name;
        ImageView Image;
        String Alphabet_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        Name = (TextView) findViewById(R.id.tv_Name);
        Image = (ImageView) findViewById(R.id.iv_image);
        Intent iin = getIntent();
        Bundle b = iin.getExtras();
        if (b != null) {
            Alphabet_name = (String) b.get("name");
            Name.setText(Alphabet_name);
        }

        if (Alphabet_name.equalsIgnoreCase("APPLE")) {
            Image.setBackgroundResource(R.drawable.a);
        } else if (Alphabet_name.equalsIgnoreCase("BALL")) {
            Image.setBackgroundResource(R.drawable.b);
        }
         else if (Alphabet_name.equalsIgnoreCase("CAT")) {
        Image.setBackgroundResource(R.drawable.c);
        }
        else if (Alphabet_name.equalsIgnoreCase("DOG")) {
        Image.setBackgroundResource(R.drawable.d);
        }
         else if (Alphabet_name.equalsIgnoreCase("ELEPHANT")) {
            Image.setBackgroundResource(R.drawable.e);
        }
        else if (Alphabet_name.equalsIgnoreCase("FISH")) {
            Image.setBackgroundResource(R.drawable.f);
        }
        else if (Alphabet_name.equalsIgnoreCase("GRAPES")) {
            Image.setBackgroundResource(R.drawable.g);
        }
        else if (Alphabet_name.equalsIgnoreCase("HORSE")) {
            Image.setBackgroundResource(R.drawable.h);
        }
        else if (Alphabet_name.equalsIgnoreCase("ICE-CREAM")) {
            Image.setBackgroundResource(R.drawable.i);
        }
        else if (Alphabet_name.equalsIgnoreCase("JOKER")) {
            Image.setBackgroundResource(R.drawable.j);
        }
        else if (Alphabet_name.equalsIgnoreCase("KITE")) {
            Image.setBackgroundResource(R.drawable.k);
        }
        else if (Alphabet_name.equalsIgnoreCase("LION")) {
            Image.setBackgroundResource(R.drawable.l);
        }
        else if (Alphabet_name.equalsIgnoreCase("MONKEY")) {
            Image.setBackgroundResource(R.drawable.m);
        }
        else if (Alphabet_name.equalsIgnoreCase("NEST")) {
            Image.setBackgroundResource(R.drawable.n);
        }
        else if (Alphabet_name.equalsIgnoreCase("OX")) {
            Image.setBackgroundResource(R.drawable.o);
        }
        else if (Alphabet_name.equalsIgnoreCase("PARROT")) {
            Image.setBackgroundResource(R.drawable.p);
        }
        else if (Alphabet_name.equalsIgnoreCase("QUEEN")) {
            Image.setBackgroundResource(R.drawable.q);
        }
        else if (Alphabet_name.equalsIgnoreCase("RABBIT")) {
            Image.setBackgroundResource(R.drawable.r);
        }
        else if (Alphabet_name.equalsIgnoreCase("SUNFLOWER")) {
            Image.setBackgroundResource(R.drawable.s);
        }
        else if (Alphabet_name.equalsIgnoreCase("TIGER")) {
            Image.setBackgroundResource(R.drawable.t);
        }
        else if (Alphabet_name.equalsIgnoreCase("UMBRELLA")) {
            Image.setBackgroundResource(R.drawable.u);
        }
        else if (Alphabet_name.equalsIgnoreCase("VAN")) {
            Image.setBackgroundResource(R.drawable.v);
        }
        else if (Alphabet_name.equalsIgnoreCase("WATCH")) {
            Image.setBackgroundResource(R.drawable.w);
        }
        else if (Alphabet_name.equalsIgnoreCase("XMASS-TREE")) {
            Image.setBackgroundResource(R.drawable.x);
        }
        else if (Alphabet_name.equalsIgnoreCase("YAK")) {
            Image.setBackgroundResource(R.drawable.y);
        }
        else {
            Image.setBackgroundResource(R.drawable.z);
        }
    }


}

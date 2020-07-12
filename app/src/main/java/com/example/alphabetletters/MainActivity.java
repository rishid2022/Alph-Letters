package com.example.alphabetletters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {
    TextView Typewriter, txt_a,txt_b,txt_c,txt_d,txt_e,txt_f,txt_g,txt_h,txt_i,txt_j,txt_k,txt_l,txt_m,txt_n,txt_o,txt_p,txt_q,txt_r,txt_s,txt_t,txt_u,txt_v,txt_w,txt_x,txt_y,txt_z;
    String A="APPLE", B="BALL",C="CAT",D="DOG",E="ELEPHANT",F="FISH",G="GRAPES",H="HORSE",I="ICE-CREAM",J="JOKER",K="KITE",L="LION",M="MONKEY",N="NEST",O="OX",P="PARROT",Q="QUEEN",r="RABBIT",S="SUNFLOWER",T="TIGER",U="UMBRELLA",V="VAN",W="WATCH",X="XMASS-TREE",Y="YAK",Z="ZEBRA";
    private AdView adView;
    AdRequest adRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adView = (AdView) findViewById(R.id.adView);
        adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        txt_a=(TextView)findViewById(R.id.A);
        txt_b=(TextView)findViewById(R.id.B);
        txt_c=(TextView)findViewById(R.id.C);
        txt_d=(TextView)findViewById(R.id.D);
        txt_e=(TextView)findViewById(R.id.E);
        txt_f=(TextView)findViewById(R.id.F);
        txt_g=(TextView)findViewById(R.id.G);
        txt_h=(TextView)findViewById(R.id.H);
        txt_i=(TextView)findViewById(R.id.I);
        txt_j=(TextView)findViewById(R.id.J);
        txt_k=(TextView)findViewById(R.id.K);
        txt_l=(TextView)findViewById(R.id.L);
        txt_m=(TextView)findViewById(R.id.M);
        txt_n=(TextView)findViewById(R.id.N);
        txt_o=(TextView)findViewById(R.id.O);
        txt_p=(TextView)findViewById(R.id.P);
        txt_q=(TextView)findViewById(R.id.Q);
        txt_r=(TextView)findViewById(R.id.R);
        txt_s=(TextView)findViewById(R.id.S);
        txt_t=(TextView)findViewById(R.id.T);
        txt_u=(TextView)findViewById(R.id.U);
        txt_v=(TextView)findViewById(R.id.V);
        txt_w=(TextView)findViewById(R.id.W);
        txt_x=(TextView)findViewById(R.id.X);
        txt_y=(TextView)findViewById(R.id.Y);
        txt_z=(TextView)findViewById(R.id.Z);
        txt_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Alphabets_Detail.class);
                intent.putExtra("name", A);
                startActivity(intent);
                MediaPlayer ring = MediaPlayer.create(MainActivity.this,R.raw.a);
                ring.start();
            }
        });

        txt_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Alphabets_Detail.class);
                intent.putExtra("name", B);
                startActivity(intent);
                MediaPlayer ring = MediaPlayer.create(MainActivity.this,R.raw.b);
                ring.start();

            }
        });

        txt_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Alphabets_Detail.class);
                intent.putExtra("name", C);
                startActivity(intent);
                MediaPlayer ring = MediaPlayer.create(MainActivity.this,R.raw.c);
                ring.start();

            }
        });

        txt_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Alphabets_Detail.class);
                intent.putExtra("name", D);
                startActivity(intent);
                MediaPlayer ring = MediaPlayer.create(MainActivity.this,R.raw.d);
                ring.start();
            }
        });

        txt_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Alphabets_Detail.class);
                intent.putExtra("name", E);
                startActivity(intent);
                MediaPlayer ring = MediaPlayer.create(MainActivity.this,R.raw.e);
                ring.start();
            }
        });

        txt_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Alphabets_Detail.class);
                intent.putExtra("name", F);
                startActivity(intent);
                MediaPlayer ring = MediaPlayer.create(MainActivity.this,R.raw.f);
                ring.start();
            }
        });

        txt_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Alphabets_Detail.class);
                intent.putExtra("name", G);
                startActivity(intent);
                MediaPlayer ring = MediaPlayer.create(MainActivity.this,R.raw.g);
                ring.start();
            }
        });

        txt_h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Alphabets_Detail.class);
                intent.putExtra("name", H);
                startActivity(intent);
                MediaPlayer ring = MediaPlayer.create(MainActivity.this,R.raw.h);
                ring.start();
            }
        });

        txt_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Alphabets_Detail.class);
                intent.putExtra("name", I);
                startActivity(intent);
                MediaPlayer ring = MediaPlayer.create(MainActivity.this,R.raw.i);
                ring.start();
            }
        });

        txt_j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Alphabets_Detail.class);
                intent.putExtra("name", J);
                startActivity(intent);
                MediaPlayer ring = MediaPlayer.create(MainActivity.this,R.raw.j);
                ring.start();
            }
        });

        txt_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Alphabets_Detail.class);
                intent.putExtra("name", K);
                startActivity(intent);
                MediaPlayer ring = MediaPlayer.create(MainActivity.this,R.raw.k);
                ring.start();
            }
        });

        txt_l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Alphabets_Detail.class);
                intent.putExtra("name", L);
                startActivity(intent);
                MediaPlayer ring = MediaPlayer.create(MainActivity.this,R.raw.l);
                ring.start();
            }
        });

        txt_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Alphabets_Detail.class);
                intent.putExtra("name", M);
                startActivity(intent);
                MediaPlayer ring = MediaPlayer.create(MainActivity.this,R.raw.m);
                ring.start();
            }
        });

        txt_n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Alphabets_Detail.class);
                intent.putExtra("name", N);
                startActivity(intent);
                MediaPlayer ring = MediaPlayer.create(MainActivity.this,R.raw.n);
                ring.start();
            }
        });

        txt_o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Alphabets_Detail.class);
                intent.putExtra("name", O);
                startActivity(intent);
                MediaPlayer ring = MediaPlayer.create(MainActivity.this,R.raw.o);
                ring.start();
            }
        });

        txt_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Alphabets_Detail.class);
                intent.putExtra("name", P);
                startActivity(intent);
                MediaPlayer ring = MediaPlayer.create(MainActivity.this,R.raw.p);
                ring.start();
            }
        });

        txt_q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Alphabets_Detail.class);
                intent.putExtra("name", Q);
                startActivity(intent);
                MediaPlayer ring = MediaPlayer.create(MainActivity.this,R.raw.q);
                ring.start();
            }
        });

        txt_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Alphabets_Detail.class);
                intent.putExtra("name", r);
                startActivity(intent);
                MediaPlayer ring = MediaPlayer.create(MainActivity.this,R.raw.r);
                ring.start();
            }
        });

        txt_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Alphabets_Detail.class);
                intent.putExtra("name", S);
                startActivity(intent);
                MediaPlayer ring = MediaPlayer.create(MainActivity.this,R.raw.s);
                ring.start();
            }
        });

        txt_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Alphabets_Detail.class);
                intent.putExtra("name", T);
                startActivity(intent);
                MediaPlayer ring = MediaPlayer.create(MainActivity.this,R.raw.t);
                ring.start();
            }
        });

        txt_u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Alphabets_Detail.class);
                intent.putExtra("name", U);
                startActivity(intent);
                MediaPlayer ring = MediaPlayer.create(MainActivity.this,R.raw.u);
                ring.start();
            }
        });

        txt_v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Alphabets_Detail.class);
                intent.putExtra("name", V);
                startActivity(intent);
                MediaPlayer ring = MediaPlayer.create(MainActivity.this,R.raw.v);
                ring.start();
            }
        });

        txt_w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Alphabets_Detail.class);
                intent.putExtra("name", W);
                startActivity(intent);
                MediaPlayer ring = MediaPlayer.create(MainActivity.this,R.raw.w);
                ring.start();
            }
        });

        txt_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Alphabets_Detail.class);
                intent.putExtra("name", X);
                startActivity(intent);
                MediaPlayer ring = MediaPlayer.create(MainActivity.this,R.raw.x);
                ring.start();
            }
        });

        txt_y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Alphabets_Detail.class);
                intent.putExtra("name", Y);
                startActivity(intent);
                MediaPlayer ring = MediaPlayer.create(MainActivity.this,R.raw.y);
                ring.start();
            }
        });

        txt_z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,Alphabets_Detail.class);
                intent.putExtra("name",Z);
                startActivity(intent);
                MediaPlayer ring = MediaPlayer.create(MainActivity.this,R.raw.z);
                ring.start();

            }
        });







    }
}
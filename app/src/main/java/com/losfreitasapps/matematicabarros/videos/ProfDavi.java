package com.losfreitasapps.matematicabarros.videos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.losfreitasapps.matematicabarros.R;

public class ProfDavi extends AppCompatActivity {
    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prof_davi);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TextView toolbar_title = (TextView) findViewById(R.id.toolbar_title);
        toolbar_title.setText("  Professor Davi");
        ImageView ic_back = (ImageView) findViewById(R.id.iv_back);
        ic_back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        ImageView iv_share = (ImageView) findViewById(R.id.iv_share);
        iv_share.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent share = new Intent();
                share.setAction(Intent.ACTION_SEND);
                share.putExtra(Intent.EXTRA_SUBJECT, "Compartilhar");
                share.putExtra(Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id=com.losfreitasapps.matematicabarros");
                share.setType("text/plain");
                startActivity(share);
            }
        });
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-6303877676651382/1177747357");

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                requestNewInterstitial();
            }
        });
        requestNewInterstitial();

        CardView cv_epg = (CardView) findViewById(R.id.cv_epg);
        cv_epg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod3matepgD.class);
                startActivity(i);            }
        });

        CardView cv_fin1 = (CardView) findViewById(R.id.cv_fin1);
        cv_fin1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod4jusimd.class);
                startActivity(i);            }
        });

        CardView cv_angulos = (CardView) findViewById(R.id.cv_angulos);
        cv_angulos.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod1geoang.class);
                startActivity(i);            }
        });
        CardView cv_opang = (CardView) findViewById(R.id.cv_opang);
        cv_opang.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), angulosd.class);
                startActivity(i);            }
        });

        CardView cv_tabv = (CardView) findViewById(R.id.cv_tabv);
        cv_tabv.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod1logtabvD.class);
                startActivity(i);            }
        });

        CardView cv_diaglogd = (CardView) findViewById(R.id.cv_diaglogd);
        cv_diaglogd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod2logdiagD.class);
                startActivity(i);            }
        });

        CardView cv_arglog = (CardView) findViewById(R.id.cv_arglog);
        cv_arglog.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod8logarglogD.class);
                startActivity(i);            }
        });

        CardView cv_multdiv = (CardView) findViewById(R.id.cv_multdiv);
        cv_multdiv.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod6multdiv.class);
                startActivity(i);            }
        });

        CardView cv_siseq = (CardView) findViewById(R.id.cv_siseq);
        cv_siseq.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod3matseD.class);
                startActivity(i);            }
        });

        CardView cv_spi = (CardView) findViewById(R.id.cv_spi);
        cv_spi.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod5propinv.class);
                startActivity(i);            }
        });

        CardView cv_sismed = (CardView) findViewById(R.id.cv_sismed);
        cv_sismed.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod7sismed.class);
                startActivity(i);            }
        });

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    private void requestNewInterstitial() {
        AdRequest adRequest = new AdRequest.Builder().build();
        mInterstitialAd.loadAd(adRequest);
    }
}

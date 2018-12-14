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

public class SEtapaLogica extends AppCompatActivity {
    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setapa_logica);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TextView toolbar_title = (TextView) findViewById(R.id.toolbar_title);
        toolbar_title.setText("  2ª Etapa");
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
        mInterstitialAd.setAdUnitId("ca-app-pub-4218805607147921/4598688096");

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                requestNewInterstitial();
            }
        });
        requestNewInterstitial();

        CardView cv_proba = (CardView) findViewById(R.id.cv_proba);
        cv_proba.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod13probab.class);
                startActivity(i);            }
        });
        CardView cv_pfc = (CardView) findViewById(R.id.cv_pfc);
        cv_pfc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod6logcont.class);
                startActivity(i);            }
        });
        CardView cv_teccont = (CardView) findViewById(R.id.cv_teccont);
        cv_teccont.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod7logcont.class);
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
        CardView cv_matr = (CardView) findViewById(R.id.cv_matr);
        cv_matr.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod10matri.class);
                startActivity(i);            }
        });
        CardView cv_laplace = (CardView) findViewById(R.id.cv_laplace);
        cv_laplace.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod10loglaplace.class);
                startActivity(i);            }
        });
        CardView cv_cramer = (CardView) findViewById(R.id.cv_cramer);
        cv_cramer.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod10logcramer.class);
                startActivity(i);            }
        });
        CardView cv_dissislin = (CardView) findViewById(R.id.cv_dissislin);
        cv_dissislin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod10logsislin.class);
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

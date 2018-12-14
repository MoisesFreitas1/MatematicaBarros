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

public class PEtapa extends AppCompatActivity {
    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petapa);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TextView toolbar_title = (TextView) findViewById(R.id.toolbar_title);
        toolbar_title.setText("  1ª Etapa");
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

        CardView cv_div = (CardView) findViewById(R.id.cv_div);
        cv_div.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod1div1.class);
                startActivity(i);            }
        });
        CardView cv_multi = (CardView) findViewById(R.id.cv_multi);
        cv_multi.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod2mult1.class);
                startActivity(i);            }
        });
        CardView cv_porcliana = (CardView) findViewById(R.id.cv_porcliana);
        cv_porcliana.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod2porceliana.class);
                startActivity(i);            }
        });
        CardView cv_porcf = (CardView) findViewById(R.id.cv_porcf);
        cv_porcf.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod3porrz.class);
                startActivity(i);            }
        });
        CardView cv_porc1f = (CardView) findViewById(R.id.cv_porc1f);
        cv_porc1f.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod3porc1f.class);
                startActivity(i);            }
        });
        CardView cv_porc2f = (CardView) findViewById(R.id.cv_porc2f);
        cv_porc2f.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod3porc2f.class);
                startActivity(i);            }
        });
        CardView cv_porc3 = (CardView) findViewById(R.id.cv_porc3);
        cv_porc3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod3porc3.class);
                startActivity(i);            }
        });
        CardView cv_r3sc = (CardView) findViewById(R.id.cv_r3sc);
        cv_r3sc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod3r3sc.class);
                startActivity(i);            }
        });
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
        CardView cv_probsis = (CardView) findViewById(R.id.cv_probsis);
        cv_probsis.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod3siseq.class);
                startActivity(i);            }
        });
        CardView cv_probfr = (CardView) findViewById(R.id.cv_probfr);
        cv_probfr.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod4probfra.class);
                startActivity(i);            }
        });
        CardView cv_opefrac = (CardView) findViewById(R.id.cv_opefrac);
        cv_opefrac.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod4fra1.class);
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
        CardView cv_rzpr = (CardView) findViewById(R.id.cv_rzpr);
        cv_rzpr.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod5rzpro.class);
                startActivity(i);            }
        });
        CardView cv_rzesp = (CardView) findViewById(R.id.cv_rzesp);
        cv_rzesp.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod5rzesp.class);
                startActivity(i);            }
        });
        CardView cv_spd = (CardView) findViewById(R.id.cv_spd);
        cv_spd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod5spd.class);
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

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    private void requestNewInterstitial() {
        AdRequest adRequest = new AdRequest.Builder().build();
        mInterstitialAd.loadAd(adRequest);
    }
}

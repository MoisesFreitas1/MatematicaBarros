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

public class ProfDelon extends AppCompatActivity {
    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prof_delon);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TextView toolbar_title = (TextView) findViewById(R.id.toolbar_title);
        toolbar_title.setText("  Professor Delon");
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

        CardView cv_intpp = (CardView) findViewById(R.id.cv_intpp);
        cv_intpp.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), integralpp.class);
                startActivity(i);            }
        });

        CardView cv_esg = (CardView) findViewById(R.id.cv_esg);
        cv_esg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod6esg.class);
                startActivity(i);            }
        });

        CardView cv_psg = (CardView) findViewById(R.id.cv_psg);
        cv_psg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod7psg.class);
                startActivity(i);            }
        });

        CardView cv_fin2 = (CardView) findViewById(R.id.cv_fin2);
        cv_fin2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), matfinloga.class);
                startActivity(i);            }
        });

        CardView cv_conj = (CardView) findViewById(R.id.cv_conj);
        cv_conj.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod7matconjnum.class);
                startActivity(i);            }
        });
        CardView cv_func = (CardView) findViewById(R.id.cv_func);
        cv_func.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod9fpg.class);
                startActivity(i);            }
        });

        CardView cv_geo1 = (CardView) findViewById(R.id.cv_geo1);
        cv_geo1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), geo1.class);
                startActivity(i);            }
        });
        CardView cv_geo2 = (CardView) findViewById(R.id.cv_geo2);
        cv_geo2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), geo2.class);
                startActivity(i);            }
        });
        CardView cv_geo3 = (CardView) findViewById(R.id.cv_geo3);
        cv_geo3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), geo3.class);
                startActivity(i);            }
        });
        CardView cv_geo4 = (CardView) findViewById(R.id.cv_geo4);
        cv_geo4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), geo4.class);
                startActivity(i);            }
        });
        CardView cv_geo5 = (CardView) findViewById(R.id.cv_geo5);
        cv_geo5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), geo5.class);
                startActivity(i);            }
        });
        CardView cv_geo6 = (CardView) findViewById(R.id.cv_geo6);
        cv_geo6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), geo6.class);
                startActivity(i);            }
        });
        CardView cv_geo7 = (CardView) findViewById(R.id.cv_geo7);
        cv_geo7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), geo7.class);
                startActivity(i);            }
        });
        CardView cv_geo8 = (CardView) findViewById(R.id.cv_geo8);
        cv_geo8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), geo8.class);
                startActivity(i);            }
        });
        CardView cv_geo9 = (CardView) findViewById(R.id.cv_geo9);
        cv_geo9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), geo9.class);
                startActivity(i);            }
        });
        CardView cv_geo10 = (CardView) findViewById(R.id.cv_geo10);
        cv_geo10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), geo10.class);
                startActivity(i);            }
        });
        CardView cv_geo11 = (CardView) findViewById(R.id.cv_geo11);
        cv_geo11.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), geo11.class);
                startActivity(i);            }
        });
        CardView cv_geo12 = (CardView) findViewById(R.id.cv_geo12);
        cv_geo12.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), geo12.class);
                startActivity(i);            }
        });
        CardView cv_geo13 = (CardView) findViewById(R.id.cv_geo13);
        cv_geo13.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), geo13.class);
                startActivity(i);            }
        });
        CardView cv_geo14 = (CardView) findViewById(R.id.cv_geo14);
        cv_geo14.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), geo14.class);
                startActivity(i);            }
        });
        CardView cv_geo15 = (CardView) findViewById(R.id.cv_geo15);
        cv_geo15.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), geo15.class);
                startActivity(i);            }
        });
        CardView cv_geo16 = (CardView) findViewById(R.id.cv_geo16);
        cv_geo16.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), geo16.class);
                startActivity(i);            }
        });

        CardView cv_diaglog = (CardView) findViewById(R.id.cv_diaglog);
        cv_diaglog.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod2logdiag.class);
                startActivity(i);            }
        });
        CardView cv_estrlog = (CardView) findViewById(R.id.cv_estrlog);
        cv_estrlog.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod3logestlog.class);
                startActivity(i);            }
        });
        CardView cv_estrlogcev = (CardView) findViewById(R.id.cv_estrlogcev);
        cv_estrlogcev.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), estrlog.class);
                startActivity(i);            }
        });
        CardView cv_eqlog = (CardView) findViewById(R.id.cv_eqlog);
        cv_eqlog.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod3logeqlog.class);
                startActivity(i);            }
        });
        CardView cv_negprop = (CardView) findViewById(R.id.cv_negprop);
        cv_negprop.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod3logneg.class);
                startActivity(i);            }
        });
        CardView cv_pombos = (CardView) findViewById(R.id.cv_pombos);
        cv_pombos.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod4logpombo.class);
                startActivity(i);            }
        });
        CardView cv_comq = (CardView) findViewById(R.id.cv_comq);
        cv_comq.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod5logcom.class);
                startActivity(i);            }
        });
        CardView cv_datas = (CardView) findViewById(R.id.cv_datas);
        cv_datas.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod5logdata.class);
                startActivity(i);            }
        });
        CardView cv_raclog = (CardView) findViewById(R.id.cv_raclog);
        cv_raclog.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), raclog1.class);
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
        CardView cv_rq = (CardView) findViewById(R.id.cv_rq);
        cv_rq.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod6rq.class);
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

        CardView cv_ma = (CardView) findViewById(R.id.cv_ma);
        cv_ma.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), medarit.class);
                startActivity(i);            }
        });
        CardView cv_pa = (CardView) findViewById(R.id.cv_pa);
        cv_pa.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod8pa.class);
                startActivity(i);            }
        });
        CardView cv_pg = (CardView) findViewById(R.id.cv_pg);
        cv_pg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent i = new Intent(v.getContext(), mod8pg.class);
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

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    private void requestNewInterstitial() {
        AdRequest adRequest = new AdRequest.Builder().build();
        mInterstitialAd.loadAd(adRequest);
    }
}

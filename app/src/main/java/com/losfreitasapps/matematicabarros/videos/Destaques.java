package com.losfreitasapps.matematicabarros.videos;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.losfreitasapps.matematicabarros.R;

public class Destaques extends Fragment {
    InterstitialAd mInterstitialAd;

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.activity_destaques,container,false);

        mInterstitialAd = new InterstitialAd(getActivity());
        mInterstitialAd.setAdUnitId("ca-app-pub-6303877676651382/1177747357");

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                requestNewInterstitial();
            }
        });
        requestNewInterstitial();

        TextView tv_calculo = (TextView) view.findViewById(R.id.tv_calculo);
        tv_calculo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), CatCalculo.class));
            }
        });

        TextView tv_probabilidade = (TextView) view.findViewById(R.id.tv_probabilidade);
        tv_probabilidade.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), CatProbabilidade.class));
            }
        });

        TextView tv_financeira = (TextView) view.findViewById(R.id.tv_financeira);
        tv_financeira.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), CatFinanceira.class));
            }
        });

        TextView tv_geometria = (TextView) view.findViewById(R.id.tv_geometria);
        tv_geometria.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), CatGeo.class));
            }
        });

        TextView tv_medidas = (TextView) view.findViewById(R.id.tv_medidas);
        tv_medidas.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), CatSisMedidas.class));
            }
        });

        TextView tv_basicas = (TextView) view.findViewById(R.id.tv_basicas);
        tv_basicas.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), CatOpBasicas.class));
            }
        });

        TextView tv_logica = (TextView) view.findViewById(R.id.tv_logica);
        tv_logica.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), CatLogica.class));
            }
        });

        TextView tv_porcentagem = (TextView) view.findViewById(R.id.tv_porcentagem);
        tv_porcentagem.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), CatPorcentagem.class));
            }
        });

        TextView tv_sislin = (TextView) view.findViewById(R.id.tv_sislin);
        tv_sislin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), CatSisLin.class));
            }
        });

        TextView tv_progress = (TextView) view.findViewById(R.id.tv_progress);
        tv_progress.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), CatProgress.class));
            }
        });

        TextView tv_function = (TextView) view.findViewById(R.id.tv_function);
        tv_function.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), CatFunction.class));
            }
        });

        TextView tv_equation = (TextView) view.findViewById(R.id.tv_equation);
        tv_equation.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), CatEquation.class));
            }
        });

        CardView cv_dica1 = (CardView) view.findViewById(R.id.cv_dica1);
        cv_dica1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                startActivity(new Intent(getActivity(), burro.class));
            }
        });

        CardView cv_dica2 = (CardView) view.findViewById(R.id.cv_dica2);
        cv_dica2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                startActivity(new Intent(getActivity(), Dicas.class));
            }
        });

        CardView cv_dica3 = (CardView) view.findViewById(R.id.cv_dica3);
        cv_dica3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                startActivity(new Intent(getActivity(), concurso.class));
            }
        });

        CardView cv_dica4 = (CardView) view.findViewById(R.id.cv_dica4);
        cv_dica4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                startActivity(new Intent(getActivity(), tv.class));
            }
        });

        ImageView banner = (ImageView) view.findViewById(R.id.banner);
        banner.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.preparaxcursos.com/#!product-page/jw4lu/cda80234-2d34-03e5-f282-e3c9a916d679");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);            }
        });
        CardView cv_cgeometria = (CardView) view.findViewById(R.id.cv_cgeometria);
        cv_cgeometria.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Geometria.class));
            }
        });
        TextView vercursos = (TextView) view.findViewById(R.id.vercursos);
        vercursos.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), CursosFree.class));
            }
        });
        CardView cv_cmatematica = (CardView) view.findViewById(R.id.cv_cmatematica);
        cv_cmatematica.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), CMatematica.class));
            }
        });
        CardView cv_clogica = (CardView) view.findViewById(R.id.cv_clogica);
        cv_clogica.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), CLogica.class));
            }
        });

        AdView mAdView = (AdView) view.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        return view;
    }

    private void requestNewInterstitial() {
        AdRequest adRequest = new AdRequest.Builder().build();
        mInterstitialAd.loadAd(adRequest);
    }
}

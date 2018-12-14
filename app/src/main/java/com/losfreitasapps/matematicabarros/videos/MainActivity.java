package com.losfreitasapps.matematicabarros.videos;

import android.app.FragmentManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.losfreitasapps.matematicabarros.R;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    FragmentManager FM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TextView toolbar_title = (TextView) findViewById(R.id.toolbar_title);
        toolbar_title.setText("Matemática Barros");

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

        FM = getFragmentManager();
        FM.beginTransaction().replace(R.id.content_principal, new Destaques()).commit();


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.nav_cursosfree) {
            Intent i = new Intent(this, CursosFree.class);
            startActivity(i);
        } else if (id == R.id.nav_mail) {
            Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","devmobile.pxc@gmail.com", null));
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Críticas e Sugestões [Delon Barros EaD]");
            emailIntent.putExtra(Intent.EXTRA_TEXT, "Olá,\n");
            startActivity(Intent.createChooser(emailIntent, "Enviar email..."));
        } else if (id == R.id.nav_facebook) {
            Uri uri = Uri.parse("https://m.facebook.com/Prepara-X-Cursos-961279907257312/");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        } else if (id == R.id.nav_site) {
            Uri uri = Uri.parse("http://www.preparaxcursos.com/");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        } else if (id == R.id.nav_delon) {
            Intent i = new Intent(this, ProfDelon.class);
            startActivity(i);
        } else if (id == R.id.nav_davi) {
            Intent i = new Intent(this, ProfDavi.class);
            startActivity(i);
        } else if (id == R.id.nav_felipe) {
            Intent i = new Intent(this, ProfFelipe.class);
            startActivity(i);
        } else if (id == R.id.nav_liana) {
            Intent i = new Intent(this, ProfLiana.class);
            startActivity(i);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

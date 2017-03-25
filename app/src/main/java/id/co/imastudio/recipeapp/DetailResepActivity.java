package id.co.imastudio.recipeapp;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class DetailResepActivity extends AppCompatActivity {

    private String intentNama;
    private int intentgambar;
    CollapsingToolbarLayout detailGambar;
    private  String intentDetail;
    TextView detailResep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_resep);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //ambil data Intent
        intentNama = getIntent().getStringExtra("extraNama");
        intentgambar = getIntent().getExtras().getInt("extraGambar");
        intentDetail = getIntent().getStringExtra("extraDetail");

        //inisialisai TextView dan SetText untuk detail resep
        detailResep = (TextView) findViewById(R.id.detailResep);
        detailResep.setText(intentDetail);

        //set Title sesuai nama resep
        getSupportActionBar().setTitle(intentNama);

        //set gambar sesuai resep
        detailGambar = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        detailGambar.setBackgroundResource(intentgambar);


    }
}

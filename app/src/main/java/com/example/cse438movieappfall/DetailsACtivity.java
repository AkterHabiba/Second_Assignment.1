package com.example.cse438movieappfall;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailsACtivity extends AppCompatActivity {

    Result result;

    Cast cast;
    private ImageView image;
    private TextView title1, rating1,overview,posterflash,name;
    private ImageView image1;
    private ImageView image2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        result = (Result) getIntent().getSerializableExtra("result");

        result = (Result) getIntent().getSerializableExtra("result");
        image  = (ImageView) findViewById(R.id.flashpic);
        image1= (ImageView) findViewById(R.id.posterflash);
        title1=(TextView) findViewById(R.id.title1);
        rating1= (TextView) findViewById(R.id.rating1);
        overview= (TextView) findViewById(R.id.overview);
        if(result !=null) {
            Glide.with(this).load("https://image.tmdb.org/t/p/w500" + result.getPosterPath()).into(image);
            title1.setText(result.getOriginalTitle());
            rating1.setText(Double.toString(result.getVoteAverage()));
            overview.setText(result.getOverview());
            Glide.with(this).load("https://image.tmdb.org/t/p/w500" + result.getBackdropPath()).into(image1);


//            RecyclerView rv = findViewById(R.id.detailsmovie);
//            rv.setLayoutManager(new GridLayoutManager(this, 2));
//            cast = (Cast) getIntent().getSerializableExtra("cast");
//            name =(TextView) findViewById(R.id.name);
//            image2=(ImageView) findViewById(R.id.posterflash);
        }
    }
}

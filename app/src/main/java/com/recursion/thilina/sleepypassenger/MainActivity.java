package com.recursion.thilina.sleepypassenger;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.larvalabs.svgandroid.SVG;
import com.larvalabs.svgandroid.SVGParser;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ImageView imageView = new ImageView(this);
        imageView.setBackgroundColor(Color.TRANSPARENT);

        SVG svg = SVGParser.getSVGFromResource(getResources(),
                R.drawable.school_bus);

        imageView.setImageDrawable(svg.createPictureDrawable());

        // ***Not in Doc*** Disable HW acceleration for SVGs
        imageView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);

        setContentView(imageView);

        setContentView(R.layout.activity_main);


    }
}

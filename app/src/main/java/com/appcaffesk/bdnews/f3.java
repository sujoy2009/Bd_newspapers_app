package com.appcaffesk.bdnews;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class f3 extends Fragment {
    ImageButton cnn,bbc,ntd,ls,poli,usa_td,abc,new_york,was,hillb;
    String url;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.f3,container,false);
        cnn=view.findViewById(R.id.cnnid);
        bbc=view.findViewById(R.id.bbcid);
        ntd=view.findViewById(R.id.ntdid);
        ls=view.findViewById(R.id.losid);
        poli=view.findViewById(R.id.politicioid);
        usa_td=view.findViewById(R.id.usatodayid);
        abc=view.findViewById(R.id.abcid);
        new_york=view.findViewById(R.id.nyid);
        was=view.findViewById(R.id.wasingid);
        hillb=view.findViewById(R.id.hillid);


        ConnectivityManager manager=(ConnectivityManager)getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
        final NetworkInfo activeNetwork=manager.getActiveNetworkInfo();


        cnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==activeNetwork){

                    Toast.makeText(getActivity(),"No internet connection",Toast.LENGTH_LONG).show();

                }
                else {
                    Intent intent=new Intent(getActivity(),web.class);
                    url="https://edition.cnn.com/";

                    intent.putExtra("urlkey", url);
                    // Toast.makeText(getApplicationContext(),"Long press to solve problem",Toast.LENGTH_LONG).show();

                    startActivity(intent);


                }

            }
        });


        ls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==activeNetwork){

                    Toast.makeText(getActivity(),"No internet connection",Toast.LENGTH_LONG).show();

                }
                else {
                    Intent intent=new Intent(getActivity(),web.class);
                    url="https://www.latimes.com/";


                    intent.putExtra("urlkey", url);
                  //  intent.putExtra("namekey", name);
                    // Toast.makeText(getApplicationContext(),"Long press to solve problem",Toast.LENGTH_LONG).show();

                    startActivity(intent);


                }

            }
        });


        poli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==activeNetwork){

                    Toast.makeText(getActivity(),"No internet connection",Toast.LENGTH_LONG).show();

                }
                else {
                    Intent intent=new Intent(getActivity(),web.class);
                    url="https://www.politico.com/";
                   // name="POLITICO";

                    intent.putExtra("urlkey", url);
                   // intent.putExtra("namekey", name);
                    // Toast.makeText(getApplicationContext(),"Long press to solve problem",Toast.LENGTH_LONG).show();

                    startActivity(intent);


                }

            }
        });


        usa_td.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==activeNetwork){

                    Toast.makeText(getActivity(),"No internet connection",Toast.LENGTH_LONG).show();

                }
                else {
                    Intent intent=new Intent(getActivity(),web.class);
                    url="https://www.usatoday.com/";


                    intent.putExtra("urlkey", url);
                    // Toast.makeText(getApplicationContext(),"Long press to solve problem",Toast.LENGTH_LONG).show();

                    startActivity(intent);


                }

            }
        });



        abc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==activeNetwork){

                    Toast.makeText(getActivity(),"No internet connection",Toast.LENGTH_LONG).show();

                }
                else {
                    Intent intent=new Intent(getActivity(),web.class);
                    url="https://abcnews.go.com/";

                    intent.putExtra("urlkey", url);
                  //  intent.putExtra("namekey", name);
                    // Toast.makeText(getApplicationContext(),"Long press to solve problem",Toast.LENGTH_LONG).show();

                    startActivity(intent);


                }

            }
        });



        new_york.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==activeNetwork){

                    Toast.makeText(getActivity(),"No internet connection",Toast.LENGTH_LONG).show();

                }
                else {
                    Intent intent=new Intent(getActivity(),web.class);
                    url="https://www.nytimes.com/international/";


                    intent.putExtra("urlkey", url);

                    // Toast.makeText(getApplicationContext(),"Long press to solve problem",Toast.LENGTH_LONG).show();

                    startActivity(intent);


                }

            }
        });



        was.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==activeNetwork){

                    Toast.makeText(getActivity(),"No internet connection",Toast.LENGTH_LONG).show();

                }
                else {
                    Intent intent=new Intent(getActivity(),web.class);
                    url="https://www.washingtonpost.com/";


                    intent.putExtra("urlkey", url);

                    // Toast.makeText(getApplicationContext(),"Long press to solve problem",Toast.LENGTH_LONG).show();

                    startActivity(intent);


                }

            }
        });


        hillb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==activeNetwork){

                    Toast.makeText(getActivity(),"No internet connection",Toast.LENGTH_LONG).show();

                }
                else {
                    Intent intent=new Intent(getActivity(),web.class);
                    url="https://thehill.com/";


                    intent.putExtra("urlkey", url);

                    // Toast.makeText(getApplicationContext(),"Long press to solve problem",Toast.LENGTH_LONG).show();

                    startActivity(intent);


                }

            }
        });


        bbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==activeNetwork){

                    Toast.makeText(getActivity(),"No internet connection",Toast.LENGTH_LONG).show();

                }
                else {
                    Intent intent=new Intent(getActivity(),web.class);
                    url="https://www.bbc.com/";

                    intent.putExtra("urlkey", url);
                    // Toast.makeText(getApplicationContext(),"Long press to solve problem",Toast.LENGTH_LONG).show();

                    startActivity(intent);


                }

            }
        });


        ntd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==activeNetwork){

                    Toast.makeText(getActivity(),"No internet connection",Toast.LENGTH_LONG).show();

                }
                else {
                    Intent intent=new Intent(getActivity(),web.class);
                    url="https://mb.ntd.com/";


                    intent.putExtra("urlkey", url);

                    // Toast.makeText(getApplicationContext(),"Long press to solve problem",Toast.LENGTH_LONG).show();

                    startActivity(intent);


                }

            }
        });



        return view;
    }

}

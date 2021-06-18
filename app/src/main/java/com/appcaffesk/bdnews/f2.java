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

public class f2 extends Fragment {
    ImageButton bb11,bb12,bb21,bb22,bb31,bb32,bb41,bb42,bb51,bb52;
    String url;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.f2,container,false);

        ConnectivityManager manager=(ConnectivityManager)getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
        final NetworkInfo activeNetwork=manager.getActiveNetworkInfo();

        bb11=view.findViewById(R.id.nn11id);
        bb12=view.findViewById(R.id.nn12id);
        bb21=view.findViewById(R.id.nn21id);
        bb22=view.findViewById(R.id.nn22id);
        bb31=view.findViewById(R.id.nn31id);
        bb32=view.findViewById(R.id.nn32id);
        bb41=view.findViewById(R.id.nn41id);
        bb42=view.findViewById(R.id.nn42id);
        bb51=view.findViewById(R.id.nn51id);
        bb52=view.findViewById(R.id.nn52id);



        bb11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==activeNetwork){

                    Toast.makeText(getActivity(),"No internet connection",Toast.LENGTH_LONG).show();

                }
                else {
                    Intent intent=new Intent(getActivity(),web.class);
                    url="https://www.thedailystar.net/";


                    intent.putExtra("urlkey", url);

                    // Toast.makeText(getApplicationContext(),"Long press to solve problem",Toast.LENGTH_LONG).show();

                    startActivity(intent);


                }



            }
        });


        bb12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==activeNetwork){

                    Toast.makeText(getActivity(),"No internet connection",Toast.LENGTH_LONG).show();

                }
                else {
                    Intent intent=new Intent(getActivity(),web.class);
                    url="https://www.observerbd.com/";


                    intent.putExtra("urlkey", url);

                    // Toast.makeText(getApplicationContext(),"Long press to solve problem",Toast.LENGTH_LONG).show();

                    startActivity(intent);


                }



            }
        });


        bb21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==activeNetwork){

                    Toast.makeText(getActivity(),"No internet connection",Toast.LENGTH_LONG).show();

                }
                else {
                    Intent intent=new Intent(getActivity(),web.class);
                    url="https://www.daily-sun.com/";


                    intent.putExtra("urlkey", url);

                    // Toast.makeText(getApplicationContext(),"Long press to solve problem",Toast.LENGTH_LONG).show();

                    startActivity(intent);


                }



            }
        });


        bb22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==activeNetwork){

                    Toast.makeText(getActivity(),"No internet connection",Toast.LENGTH_LONG).show();

                }
                else {
                    Intent intent=new Intent(getActivity(),web.class);
                    url="https://www.bangladeshtimes.com/";


                    intent.putExtra("urlkey", url);

                    // Toast.makeText(getApplicationContext(),"Long press to solve problem",Toast.LENGTH_LONG).show();

                    startActivity(intent);


                }



            }
        });


        bb31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==activeNetwork){

                    Toast.makeText(getActivity(),"No internet connection",Toast.LENGTH_LONG).show();

                }
                else {
                    Intent intent=new Intent(getActivity(),web.class);
                    url="https://bangla.bdnews24.com/";


                    intent.putExtra("urlkey", url);

                    // Toast.makeText(getApplicationContext(),"Long press to solve problem",Toast.LENGTH_LONG).show();

                    startActivity(intent);


                }



            }
        });


        bb32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==activeNetwork){

                    Toast.makeText(getActivity(),"No internet connection",Toast.LENGTH_LONG).show();

                }
                else {
                    Intent intent=new Intent(getActivity(),web.class);
                    url="https://m.theindependentbd.com/";


                    intent.putExtra("urlkey", url);

                    // Toast.makeText(getApplicationContext(),"Long press to solve problem",Toast.LENGTH_LONG).show();

                    startActivity(intent);


                }



            }
        });


        bb41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==activeNetwork){

                    Toast.makeText(getActivity(),"No internet connection",Toast.LENGTH_LONG).show();

                }
                else {
                    Intent intent=new Intent(getActivity(),web.class);
                    url="https://www.newagebd.net/";


                    intent.putExtra("urlkey", url);

                    // Toast.makeText(getApplicationContext(),"Long press to solve problem",Toast.LENGTH_LONG).show();

                    startActivity(intent);


                }



            }
        });


        bb42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==activeNetwork){

                    Toast.makeText(getActivity(),"No internet connection",Toast.LENGTH_LONG).show();

                }
                else {
                    Intent intent=new Intent(getActivity(),web.class);
                    url="https://www.dhakatribune.com/";


                    intent.putExtra("urlkey", url);

                    // Toast.makeText(getApplicationContext(),"Long press to solve problem",Toast.LENGTH_LONG).show();

                    startActivity(intent);


                }



            }
        });


        bb51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==activeNetwork){

                    Toast.makeText(getActivity(),"No internet connection",Toast.LENGTH_LONG).show();

                }
                else {
                    Intent intent=new Intent(getActivity(),web.class);
                    url="https://thedailynewnation.com/";


                    intent.putExtra("urlkey", url);

                    // Toast.makeText(getApplicationContext(),"Long press to solve problem",Toast.LENGTH_LONG).show();

                    startActivity(intent);


                }



            }
        });


        bb52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==activeNetwork){

                    Toast.makeText(getActivity(),"No internet connection",Toast.LENGTH_LONG).show();

                }
                else {
                    Intent intent=new Intent(getActivity(),web.class);
                    url="https://www.jamuna.tv/";


                    intent.putExtra("urlkey", url);

                    // Toast.makeText(getApplicationContext(),"Long press to solve problem",Toast.LENGTH_LONG).show();

                    startActivity(intent);


                }



            }
        });


        return view;
    }

}

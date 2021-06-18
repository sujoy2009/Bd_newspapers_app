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

public class f1 extends Fragment {
    ImageButton b11,b12,b21,b22,b31,b32,b41,b42,b51,b52;
    String url;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view= inflater.inflate(R.layout.f1layout,container,false);

        ConnectivityManager manager=(ConnectivityManager)getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
        final NetworkInfo activeNetwork=manager.getActiveNetworkInfo();

       b11=view.findViewById(R.id.n11id);
        b12=view.findViewById(R.id.n12id);
        b21=view.findViewById(R.id.n21id);
        b22=view.findViewById(R.id.n22id);
        b31=view.findViewById(R.id.n31id);
        b32=view.findViewById(R.id.n32id);
        b41=view.findViewById(R.id.n41id);
        b42=view.findViewById(R.id.n42id);
        b51=view.findViewById(R.id.n51id);
        b52=view.findViewById(R.id.n52id);



       b11.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(null==activeNetwork){

                   Toast.makeText(getActivity(),"No internet connection",Toast.LENGTH_LONG).show();

               }
               else {
                   Intent intent=new Intent(getActivity(),web.class);
                   url="https://www.prothomalo.com/";


                   intent.putExtra("urlkey", url);

                   // Toast.makeText(getApplicationContext(),"Long press to solve problem",Toast.LENGTH_LONG).show();

                   startActivity(intent);


               }



           }
       });


        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==activeNetwork){

                    Toast.makeText(getActivity(),"No internet connection",Toast.LENGTH_LONG).show();

                }
                else {
                    Intent intent=new Intent(getActivity(),web.class);
                    url="https://www.kalerkantho.com/";


                    intent.putExtra("urlkey", url);

                    // Toast.makeText(getApplicationContext(),"Long press to solve problem",Toast.LENGTH_LONG).show();

                    startActivity(intent);


                }



            }
        });


        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==activeNetwork){

                    Toast.makeText(getActivity(),"No internet connection",Toast.LENGTH_LONG).show();

                }
                else {
                    Intent intent=new Intent(getActivity(),web.class);
                    url="https://www.jaijaidinbd.com/";


                    intent.putExtra("urlkey", url);

                    // Toast.makeText(getApplicationContext(),"Long press to solve problem",Toast.LENGTH_LONG).show();

                    startActivity(intent);


                }



            }
        });


        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==activeNetwork){

                    Toast.makeText(getActivity(),"No internet connection",Toast.LENGTH_LONG).show();

                }
                else {
                    Intent intent=new Intent(getActivity(),web.class);
                    url="https://www.jugantor.com/";


                    intent.putExtra("urlkey", url);

                    // Toast.makeText(getApplicationContext(),"Long press to solve problem",Toast.LENGTH_LONG).show();

                    startActivity(intent);


                }



            }
        });


        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==activeNetwork){

                    Toast.makeText(getActivity(),"No internet connection",Toast.LENGTH_LONG).show();

                }
                else {
                    Intent intent=new Intent(getActivity(),web.class);
                    url="https://www.bd-pratidin.com/";


                    intent.putExtra("urlkey", url);

                    // Toast.makeText(getApplicationContext(),"Long press to solve problem",Toast.LENGTH_LONG).show();

                    startActivity(intent);


                }



            }
        });


        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==activeNetwork){

                    Toast.makeText(getActivity(),"No internet connection",Toast.LENGTH_LONG).show();

                }
                else {
                    Intent intent=new Intent(getActivity(),web.class);
                    url="https://www.bhorerkagoj.com/";


                    intent.putExtra("urlkey", url);

                    // Toast.makeText(getApplicationContext(),"Long press to solve problem",Toast.LENGTH_LONG).show();

                    startActivity(intent);


                }



            }
        });


        b41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==activeNetwork){

                    Toast.makeText(getActivity(),"No internet connection",Toast.LENGTH_LONG).show();

                }
                else {
                    Intent intent=new Intent(getActivity(),web.class);
                    url="https://www.ittefaq.com.bd/";


                    intent.putExtra("urlkey", url);

                    // Toast.makeText(getApplicationContext(),"Long press to solve problem",Toast.LENGTH_LONG).show();

                    startActivity(intent);


                }



            }
        });


        b42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==activeNetwork){

                    Toast.makeText(getActivity(),"No internet connection",Toast.LENGTH_LONG).show();

                }
                else {
                    Intent intent=new Intent(getActivity(),web.class);
                    url="https://www.dailyamarsomoy.com/";


                    intent.putExtra("urlkey", url);

                    // Toast.makeText(getApplicationContext(),"Long press to solve problem",Toast.LENGTH_LONG).show();

                    startActivity(intent);


                }



            }
        });


        b51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==activeNetwork){

                    Toast.makeText(getActivity(),"No internet connection",Toast.LENGTH_LONG).show();

                }
                else {
                    Intent intent=new Intent(getActivity(),web.class);
                    url="https://www.dailyjanakantha.com/";


                    intent.putExtra("urlkey", url);

                    // Toast.makeText(getApplicationContext(),"Long press to solve problem",Toast.LENGTH_LONG).show();

                    startActivity(intent);


                }



            }
        });


        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==activeNetwork){

                    Toast.makeText(getActivity(),"No internet connection",Toast.LENGTH_LONG).show();

                }
                else {
                    Intent intent=new Intent(getActivity(),web.class);
                    url="https://sonalisangbad.com/";


                    intent.putExtra("urlkey", url);

                    // Toast.makeText(getApplicationContext(),"Long press to solve problem",Toast.LENGTH_LONG).show();

                    startActivity(intent);


                }



            }
        });

       return view;
    }

}

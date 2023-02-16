package com.rishav.eseccgpagenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eseccgpagenerator.R;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;

public class cgparesult extends AppCompatActivity {
    TextView cgpa,perc;
  Button home,back;
    String GameID="5135551";
    String ADID="Interstitial_Android";
    Boolean Testmode=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgparesult);


        UnityAds.initialize(cgparesult.this, GameID, Testmode, new IUnityAdsInitializationListener() {
            @Override
            public void onInitializationComplete() {

            }

            @Override
            public void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String s) {

            }
        });



        cgpa=findViewById(R.id.cgparesult2);
        perc=findViewById(R.id.perresult2);
        Intent intent=getIntent();
        String cgpatxt=intent.getStringExtra(MainActivity.resultavgkey);
        String pertext=intent.getStringExtra(MainActivity.resultperkey);

        cgpa.setText(cgpatxt);
        perc.setText(pertext+" %");


        home=findViewById(R.id.backbtn);
        back=findViewById(R.id.backhome);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IUnityAdsShowListener iUnityAdsShowListener=new IUnityAdsShowListener() {
                    @Override
                    public void onUnityAdsShowFailure(String s, UnityAds.UnityAdsShowError unityAdsShowError, String s1) {
                        UnityAds.load(ADID);
                        UnityAds.show(cgparesult.this,ADID);
                    }

                    @Override
                    public void onUnityAdsShowStart(String s) {

                    }

                    @Override
                    public void onUnityAdsShowClick(String s) {

                    }

                    @Override
                    public void onUnityAdsShowComplete(String s, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {

                    }
                };

                UnityAds.load(ADID);
                UnityAds.show(cgparesult.this,ADID);
                startActivity(new Intent(cgparesult.this,cgpacalc.class));
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cgparesult.this,startpage.class));

            }
        });


}
}
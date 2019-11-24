package com.daily.nickelapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class Splash extends AppCompatActivity {



 //   InterstitialAd mInterstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

//        MobileAds.initialize(this, "ca-app-pub-7266395538441550~1253194859");
//
//        AdView mAdViewB = (AdView)findViewById(R.id.adViewB);
//        AdRequest adRequest = new AdRequest.Builder().build();
//        mAdViewB.loadAd(adRequest);

//        mInterstitialAd = new InterstitialAd(getApplicationContext());
//        mInterstitialAd.setAdUnitId(getResources().getString(R.string.intestital_ads));
//        mInterstitialAd.setAdListener(new AdListener() {
//            @Override
//            public void onAdClosed() {
//            }
//
//            @Override
//            public void onAdLoaded() {
//                mInterstitialAd.show();
//            }
//        });
//
//        requestNewInterstitial();


        final Handler handel = new Handler();
        handel.postDelayed(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                Intent loadSplash = new Intent(Splash.this, MainActivity.class);

                startActivity(loadSplash);

                finish();
            }
        }, 4000);

    }



//    private void requestNewInterstitial() {
//        AdRequest adRequest = new AdRequest.Builder().build();
//
//        mInterstitialAd.loadAd(adRequest);
//    }

}

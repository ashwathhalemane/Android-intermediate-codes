package com.dvdroid.droidpoint;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

/**
 * Created by darshanh on 01/12/15.
 */
public class Admob_Ads extends Activity {
    private InterstitialAd interstitial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admob_ads);
        AdRequest adRequest = new AdRequest.Builder().build();
        AdView adView = (AdView) findViewById(R.id.adView);
        adView.loadAd(adRequest);

        interstitial = new InterstitialAd(this);
        interstitial.setAdUnitId("ca-app-pub-12345678900/121221323");
        AdRequest adRequest2 = new AdRequest.Builder().build();
        interstitial.loadAd(adRequest2);
        interstitial.setAdListener(new AdListener() {
            public void onAdLoaded() {
                interstitial.show();
            }
        });


    }
}

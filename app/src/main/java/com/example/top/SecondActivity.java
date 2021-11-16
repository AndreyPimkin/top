package com.example.top;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main_two);
        TextView textView = findViewById(R.id.teamName);
        WebView browser = findViewById(R.id.browser);
        String nameTeam = getIntent().getStringExtra("choiceTeam");
        browser.setWebViewClient(new WebViewClient());
        if(nameTeam.equals("Natus Vincere")) {
            textView.setText(nameTeam);
            browser.loadUrl("https://cq.ru/teams/cs-go/natus-vincere-navi");
        }
        else if(nameTeam.equals("G2")) {
            textView.setText(nameTeam);
            browser.loadUrl("https://cq.ru/teams/cs-go/g2-esports-g2");
        }
        else if(nameTeam.equals("Gambit")) {
            textView.setText(nameTeam);
            browser.loadUrl("https://cq.ru/teams/cs-go/gambit-esports-gambit-2");
        }
        else if(nameTeam.equals("NIP")) {
            textView.setText(nameTeam);
            browser.loadUrl("https://cq.ru/teams/cs-go/ninjas-in-pyjamas-nip-2");
        }
        else if(nameTeam.equals("Heroic")) {
            textView.setText(nameTeam);
            browser.loadUrl("https://cq.ru/teams/cs-go/team-heroic-heroic");
        }
        else if(nameTeam.equals("Vitality")) {
            textView.setText(nameTeam);
            browser.loadUrl("https://cq.ru/teams/cs-go/vitality-vit");
        }
        else if(nameTeam.equals("Virtus.pro")) {
            textView.setText(nameTeam);
            browser.loadUrl("https://cq.ru/teams/cs-go/virtus-pro-vp-2");
        }
        else if(nameTeam.equals("FaZe")) {
            textView.setText(nameTeam);
            browser.loadUrl("https://cq.ru/teams/cs-go/faze-clan-faze");
        }
        else if(nameTeam.equals("Copenhagen Flames")) {
            textView.setText(nameTeam);
            browser.loadUrl("https://cq.ru/teams/cs-go/copenhagen-flames-cphf");
        }
        else if(nameTeam.equals("FURIA")) {
            textView.setText(nameTeam);
            browser.loadUrl("https://cq.ru/teams/cs-go/furia-esports-furia");
        }
    }

}
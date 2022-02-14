package com.example.pay2walletandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

import Adapters.ActivityListAdapter;
import Models.ActivityListModel;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ActivityListAdapter bAdapter;
    private ArrayList<ActivityListModel> homeListModelClassArrayList1;

    TextView txt;
    String itemtxt[]={"SplashActivity","WelcomeActivity","LoginActivity","SignupActivity","MobileVerificationActivity","FingerPrintActivity","OtpActivity","SecureLoginActivity",
            "HomePay2Activity","ScanAndPayActivity","OfferActivity","MyTransactionActivity","AddNewCardActivity","AddWalletBalanceActivity",
            "SaveCardsActivity","MyAccountActivity","TransactionDetailsActivity"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        homeListModelClassArrayList1 = new ArrayList<>();

        for (int i = 0; i < itemtxt.length; i++) {
            ActivityListModel beanClassForRecyclerView_contacts = new ActivityListModel(itemtxt[i]);
            homeListModelClassArrayList1.add(beanClassForRecyclerView_contacts);
        }
        bAdapter = new ActivityListAdapter(MainActivity.this,homeListModelClassArrayList1);
        recyclerView.setAdapter(bAdapter);


    }
}
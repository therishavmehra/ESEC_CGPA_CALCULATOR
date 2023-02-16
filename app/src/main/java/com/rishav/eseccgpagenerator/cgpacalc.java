package com.rishav.eseccgpagenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.eseccgpagenerator.R;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;

import java.text.DecimalFormat;

public class cgpacalc extends AppCompatActivity {
    EditText sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8;
    String sem1_str,sem2_str,sem3_str,sem4_str,sem5_str,sem6_str,sem7_str,sem8_str;
    double sem1_double,sem2_double,sem3_double,sem4_double,sem5_double,sem6_double,sem7_double,sem8_double,avg,per;
    Boolean  sem1_bool,sem2_bool,sem3_bool,sem4_bool,sem5_bool,sem6_bool,sem7_bool,sem8_bool;
    int sem1_val,sem2_val,sem3_val,sem4_val,sem5_val,sem6_val,sem7_val,sem8_val;

    protected static final String resultavgkey = "com.example.eseccgpagenerator.cgpa";
    protected static final String resultperkey = "com.example.eseccgpagenerator.percentage";

    private static final DecimalFormat decfor = new DecimalFormat("0.00");

    String GameID="5135551";
    String ADID="Interstitial_Android";
    Boolean Testmode=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpacalc);


        sem1=findViewById(R.id.sem1_edtxt);
        sem2=findViewById(R.id.sem2_edtxt);
        sem3=findViewById(R.id.sem3_edtxt);
        sem4=findViewById(R.id.sem4_edtxt);
        sem5=findViewById(R.id.sem5_edtxt);
        sem6=findViewById(R.id.sem6_edtxt);
        sem7=findViewById(R.id.sem7_edtxt);
        sem8=findViewById(R.id.sem8_edtxt);

        sem1.setFilters(new InputFilter[]{ new InputFilterMinMax("0","10")});
        sem2.setFilters(new InputFilter[]{ new InputFilterMinMax("0","10")});
        sem3.setFilters(new InputFilter[]{ new InputFilterMinMax("0","10")});
        sem4.setFilters(new InputFilter[]{ new InputFilterMinMax("0","10")});
        sem5.setFilters(new InputFilter[]{ new InputFilterMinMax("0","10")});
        sem6.setFilters(new InputFilter[]{ new InputFilterMinMax("0","10")});
        sem7.setFilters(new InputFilter[]{ new InputFilterMinMax("0","10")});
        sem8.setFilters(new InputFilter[]{ new InputFilterMinMax("0","10")});


        UnityAds.initialize(cgpacalc.this, GameID, Testmode, new IUnityAdsInitializationListener() {
            @Override
            public void onInitializationComplete() {

            }

            @Override
            public void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String s) {

            }
        });


    }

    public void result2(View view){
IUnityAdsShowListener iUnityAdsShowListener= new IUnityAdsShowListener() {
    @Override
    public void onUnityAdsShowFailure(String s, UnityAds.UnityAdsShowError unityAdsShowError, String s1) {
        UnityAds.load(ADID);
        UnityAds.show(cgpacalc.this,ADID);
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
UnityAds.show(cgpacalc.this,ADID);

        sem1_str=sem1.getText().toString();
        sem2_str=sem2.getText().toString();
        sem3_str=sem3.getText().toString();
        sem4_str=sem4.getText().toString();
        sem5_str=sem5.getText().toString();
        sem6_str=sem6.getText().toString();
        sem7_str=sem7.getText().toString();
        sem8_str=sem8.getText().toString();


        if(sem1_str.isEmpty() && sem2_str.isEmpty() && sem3_str.isEmpty() && sem4_str.isEmpty() && sem5_str.isEmpty() && sem6_str.isEmpty() && sem7_str.isEmpty() && sem8_str.isEmpty() ){

             sem1.setError("PLEASE ENTER A VALUE");
             sem2.setError("PLEASE ENTER A VALUE");
             sem3.setError("PLEASE ENTER A VALUE");
             sem4.setError("PLEASE ENTER A VALUE");
             sem5.setError("PLEASE ENTER A VALUE");
             sem6.setError("PLEASE ENTER A VALUE");
             sem7.setError("PLEASE ENTER A VALUE");
             sem8.setError("PLEASE ENTER A VALUE");

             sem1.requestFocus();
             sem2.requestFocus();
             sem3.requestFocus();
             sem4.requestFocus();
             sem5.requestFocus();
             sem6.requestFocus();
             sem7.requestFocus();
             sem8.requestFocus();

            Toast.makeText(this, "Please enter correct number of values", Toast.LENGTH_SHORT).show();


        }
        else if(sem1_str.isEmpty() ) {
            sem1.setError("PLEASE ENTER SEMESTER 1 GPA");
            sem1.requestFocus();

        }
        else if(sem2_str.isEmpty() ) {


            sem2.setText("0");
            sem3.setText("0");
            sem4.setText("0");
            sem5.setText("0");
            sem6.setText("0");
            sem7.setText("0");
            sem8.setText("0");


        } else if(sem3_str.isEmpty() ) {

            sem3_bool=false;

            sem3.setText("0");
            sem4.setText("0");
            sem5.setText("0");
            sem6.setText("0");
            sem7.setText("0");
            sem8.setText("0");



        }else if(sem4_str.isEmpty() ) {

            sem4_bool=false;

            sem4.setText("0");
            sem5.setText("0");
            sem6.setText("0");
            sem7.setText("0");
            sem8.setText("0");



        }
        else if(sem5_str.isEmpty() ) {

            sem5.setText("0");
            sem6.setText("0");
            sem7.setText("0");
            sem8.setText("0");


        }else if(sem6_str.isEmpty() ) {

            sem6.setText("0");
            sem7.setText("0");
            sem8.setText("0");

        }

        else if(sem7_str.isEmpty() ) {

            sem7.setText("0");
            sem8.setText("0");


        }else if(sem8_str.isEmpty() ) {

            sem8.setText("0");



        }
        else{

            calculationcgpa(view);
        }

    }

    private void calculationcgpa(View view) {

        sem1_str=sem1.getText().toString();
        sem2_str=sem2.getText().toString();
        sem3_str=sem3.getText().toString();
        sem4_str=sem4.getText().toString();
        sem5_str=sem5.getText().toString();
        sem6_str=sem6.getText().toString();
        sem7_str=sem7.getText().toString();
        sem8_str=sem8.getText().toString();

        sem1_double=Double.parseDouble(sem1_str);
        sem2_double=Double.parseDouble(sem2_str);
        sem3_double=Double.parseDouble(sem3_str);
        sem4_double=Double.parseDouble(sem4_str);
        sem5_double=Double.parseDouble(sem5_str);
        sem6_double=Double.parseDouble(sem6_str);
        sem7_double=Double.parseDouble(sem7_str);
        sem8_double=Double.parseDouble(sem8_str);

        if(sem1_str.matches("0")) {
            sem1_bool = false;
        }
        else{
            sem1_bool=true;
        }
        if(sem2_str.matches("0")){
            sem2_bool=false;
        }
        else{
            sem2_bool=true;
        }
        if(sem3_str.matches("0")){
            sem3_bool=false;
        }
        else{
            sem3_bool=true;
        }
        if(sem4_str.matches("0")){
            sem4_bool=false;
        }
        else{
            sem4_bool=true;
        }
        if(sem5_str.matches("0")){
            sem5_bool=false;
        }
        else{
            sem5_bool=true;
        }
        if(sem6_str.matches("0")){
            sem6_bool=false;
        }
        else{
            sem6_bool=true;
        }
        if(sem7_str.matches("0")){
            sem7_bool=false;
        }
        else{
            sem7_bool=true;
        }
        if(sem8_str.matches("0")){
            sem8_bool=false;
        }
        else{
            sem8_bool=true;
        }



        if(sem1_bool){
           sem1_val=1;
        }
        else {
            sem1_val = 0;
        }

        if(sem2_bool){
            sem2_val=1;
        }
        else {
            sem2_val = 0;
        }

        if(sem3_bool){
            sem3_val=1;
        }
        else {
            sem3_val = 0;
        }

        if(sem4_bool){
            sem4_val=1;
        }
        else {
            sem4_val = 0;
        }

        if(sem5_bool){
            sem5_val=1;
        }
        else {
            sem5_val = 0;
        }

        if(sem6_bool){
            sem6_val=1;
        }
        else {
            sem6_val = 0;
        }

        if(sem7_bool){
            sem7_val=1;
        }
        else {
            sem7_val = 0;
        }

        if(sem8_bool){
            sem8_val=1;
        }
        else {
            sem8_val = 0;
        }


        avg=(sem1_double+sem2_double+sem3_double+sem4_double+sem5_double+sem6_double+sem7_double+sem8_double)/(sem1_val+sem2_val+sem3_val+sem4_val+sem5_val+sem6_val+sem7_val+sem8_val);
        per=avg*9.5;

         double avgnew= Double.parseDouble(decfor.format(avg));
        double pernew= Double.parseDouble(decfor.format(per));


        String resultavg= Double.toString(avgnew);
        String percen=Double.toString(pernew);


        Intent intent = new Intent(cgpacalc.this,cgparesult.class);
        intent.putExtra(resultavgkey,resultavg);
        intent.putExtra(resultperkey,percen);
        startActivity(intent);

    }


}

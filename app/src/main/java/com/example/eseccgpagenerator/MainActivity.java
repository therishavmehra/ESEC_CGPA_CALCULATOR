package com.example.eseccgpagenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {
    protected static final String resultavgkey = "com.example.eseccgpagenerator.cgpa";
    protected static final String resultperkey = "com.example.eseccgpagenerator.percentage";

    private static final DecimalFormat decfor = new DecimalFormat("0.00");

    EditText o,aplus,a,bplus,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        o=findViewById(R.id.o_edtxt);
        aplus=findViewById(R.id.aplus_edtxt);
        a=findViewById(R.id.a_edtxt);
        bplus=findViewById(R.id.bplus_edtxt);
        b=findViewById(R.id.b_edtxt);

        o.setFilters(new InputFilter[]{ new InputFilterMinMax("0","12")});
        aplus.setFilters(new InputFilter[]{ new InputFilterMinMax("0","12")});
        a.setFilters(new InputFilter[]{ new InputFilterMinMax("0","12")});
        bplus.setFilters(new InputFilter[]{ new InputFilterMinMax("0","12")});
        b.setFilters(new InputFilter[]{ new InputFilterMinMax("0","12")});


    }

        public void result(View view) {

            String ostr=o.getText().toString();
            String aplusstr=aplus.getText().toString();
            String astr=a.getText().toString();
            String bplusstr=bplus.getText().toString();
            String bstr=b.getText().toString();

            if(ostr.isEmpty() && aplusstr.isEmpty() && astr.isEmpty() && bplusstr.isEmpty() && bstr.isEmpty()) {
                o.setError("PLEASE ENTER A VALUE");
                aplus.setError("PLEASE ENTER A VALUE");
                a.setError("PLEASE ENTER A VALUE");
                bplus.setError("PLEASE ENTER A VALUE");
                b.setError("PLEASE ENTER A VALUE");
                o.requestFocus();
                aplus.requestFocus();
                a.requestFocus();
                bplus.requestFocus();
                b.requestFocus();

                Toast.makeText(this, "Please enter correct number of values", Toast.LENGTH_SHORT).show();
            }
            else if(ostr.isEmpty() && aplusstr.isEmpty() && astr.isEmpty() && bplusstr.isEmpty() ){
                o.setText("0");
                aplus.setText("0");
                a.setText("0");
                bplus.setText("0");
                calculation(view);

            }
            else if(ostr.isEmpty() && aplusstr.isEmpty() && astr.isEmpty() && bstr.isEmpty() ){
                o.setText("0");
                aplus.setText("0");
                a.setText("0");
                b.setText("0");
                calculation(view);

            }
            else if(ostr.isEmpty() && astr.isEmpty() && bstr.isEmpty() && bplusstr.isEmpty() ){
                o.setText("0");
                a.setText("0");
                bplus.setText("0");
                b.setText("0");
                calculation(view);

            }
            else if(ostr.isEmpty() && aplusstr.isEmpty() && bstr.isEmpty() && bplusstr.isEmpty() ){
                o.setText("0");
                aplus.setText("0");
                bplus.setText("0");
                b.setText("0");
                calculation(view);

            }
            else if(aplusstr.isEmpty() && astr.isEmpty() && bstr.isEmpty() && bplusstr.isEmpty() ){
                aplus.setText("0");
                a.setText("0");
                bplus.setText("0");
                b.setText("0");
                calculation(view);

            }else if(ostr.isEmpty() && aplusstr.isEmpty() && astr.isEmpty() ){
                o.setText("0");
                a.setText("0");
                aplus.setText("0");
                calculation(view);

            }
            else if(ostr.isEmpty() && astr.isEmpty()  && bplusstr.isEmpty() ){
                o.setText("0");
                a.setText("0");
                bplus.setText("0");
                calculation(view);

            }
            else if(ostr.isEmpty() && aplusstr.isEmpty()  && bplusstr.isEmpty() ){
                o.setText("0");
                aplus.setText("0");
                bplus.setText("0");
                calculation(view);

            }
            else if(ostr.isEmpty() && aplusstr.isEmpty()  && bstr.isEmpty() ){
                o.setText("0");
                aplus.setText("0");
                b.setText("0");
                calculation(view);

            }
            else if(ostr.isEmpty() && astr.isEmpty()  && bstr.isEmpty() ){
                o.setText("0");
                a.setText("0");
                b.setText("0");
                calculation(view);

            }
            else if(ostr.isEmpty() && bplusstr.isEmpty()  && bstr.isEmpty() ){
                o.setText("0");
                b.setText("0");
                bplus.setText("0");
                calculation(view);

            }
            else if(aplusstr.isEmpty() && astr.isEmpty()  && bstr.isEmpty() ){
                b.setText("0");
                a.setText("0");
                aplus.setText("0");
                calculation(view);

            }
            else if(aplusstr.isEmpty() && astr.isEmpty()  && bplusstr.isEmpty() ){
                bplus.setText("0");
                a.setText("0");
                aplus.setText("0");
                calculation(view);

            }
            else if(astr.isEmpty() && bplusstr.isEmpty()  && bstr.isEmpty() ){
                b.setText("0");
                a.setText("0");
                bplus.setText("0");
                calculation(view);

            }
            else if(ostr.isEmpty() && aplusstr.isEmpty()){
                o.setText("0");
                aplus.setText("0");
                calculation(view);

            }
            else if(ostr.isEmpty() && astr.isEmpty()){
                o.setText("0");
                a.setText("0");
                calculation(view);

            }
            else if(ostr.isEmpty() && bplusstr.isEmpty()){
                o.setText("0");
                bplus.setText("0");
                calculation(view);

            }
            else if(ostr.isEmpty() && bstr.isEmpty()){
                o.setText("0");
                b.setText("0");
                calculation(view);

            }
            else if(bplusstr.isEmpty() && bstr.isEmpty()){
                bplus.setText("0");
                b.setText("0");
                calculation(view);
            }
            else if(aplusstr.isEmpty() && astr.isEmpty()){
                aplus.setText("0");
                a.setText("0");
                calculation(view);
            }
            else if(aplusstr.isEmpty() && bplusstr.isEmpty()){
                aplus.setText("0");
                bplus.setText("0");
                calculation(view);
            }
            else if(aplusstr.isEmpty() && bstr.isEmpty()){
                aplus.setText("0");
                b.setText("0");
                calculation(view);
            }
            else if(astr.isEmpty() && bplusstr.isEmpty()){
                a.setText("0");
                bplus.setText("0");
                calculation(view);
            }
            else if(astr.isEmpty() && bstr.isEmpty()){
                a.setText("0");
                b.setText("0");
                calculation(view);
            }

            else if(ostr.isEmpty()) {
                o.setText("0");
                calculation(view);
            }
            else  if(aplusstr.isEmpty()) {
                aplus.setText("0");
                calculation(view);
            }
            else  if(astr.isEmpty()) {
                a.setText("0");
                calculation(view);
            }
            else  if(bplusstr.isEmpty()) {
                bplus.setText("0");
                calculation(view);
            }
            else  if(bstr.isEmpty()) {
                b.setText("0");
                calculation(view);
            }
            else{
              calculation(view);
            }

                    }
        public void calculation(View view){
            String ostr=o.getText().toString();
            String aplusstr=aplus.getText().toString();
            String astr=a.getText().toString();
            String bplusstr=bplus.getText().toString();
            String bstr=b.getText().toString();

            int onum=Integer.parseInt(ostr);
            int aplusnum=Integer.parseInt(aplusstr);
            int anum=Integer.parseInt(astr);
            int bplusnum=Integer.parseInt(bplusstr);
            int bnum=Integer.parseInt(bstr);


            double avg=((onum*10)+(aplusnum*9)+(anum*8)+(bplusnum*7)+(bnum*6))/(double)(onum+aplusnum+anum+bplusnum+bnum);
            double per=avg*9.5;

           double avgnew = Double.parseDouble(decfor.format(avg));
           double pernew= Double.parseDouble(decfor.format(per));


            String resultavg= Double.toString(avgnew);
            String percen=Double.toString(pernew);

            Intent intent = new Intent(MainActivity.this,getresult.class);
            intent.putExtra(resultavgkey,resultavg);
            intent.putExtra(resultperkey,percen);
            startActivity(intent);

        }



}
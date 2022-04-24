package com.example.sp20_bse_056;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import android.widget.TextView;


public class calculateFragment extends Fragment {

    TextView txt1,txt2,txt3,txt4;
    Button add,minus,divide,multiply;
    Float num1,num2,num3,result;



    public calculateFragment() {

    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        View view = inflater.inflate(R.layout.fragment_calculate, container, false);

        txt1 = view.findViewById(R.id.editTextNumber);
        txt2 = view.findViewById(R.id.editTextNumber2);
        txt3 = view.findViewById(R.id.editTextNumber3);
        txt4 = view.findViewById(R.id.editTextNumber4);
        add = view.findViewById(R.id.add);
        minus = view.findViewById(R.id.minus);
        divide = view.findViewById(R.id.divide);
        multiply = view.findViewById(R.id.multiply);

        Bundle bundle=getArguments();

        num1 = Float.parseFloat( String.valueOf(bundle.getString("Number1")));
        num2 = Float.parseFloat( String.valueOf(bundle.getString("Number2")));
        num3 = Float.parseFloat( String.valueOf(bundle.getString("Number3")));

        txt1.setText("Number 1 = "+num1.toString()+"\n Number 2 = "+num2.toString()+"\n Number 3 = "+num3.toString());
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result= num1+num2+num3;
                txt4.setText("Addition is  "+result.toString());
            }
        });




        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result= num1-num2-num3;
                txt4.setText("Substraction is  "+result.toString());
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result= num1*num2*num3;
                txt4.setText("Multipilcation is  "+result.toString());
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result= num1/num2/num3;
                txt4.setText("Division is  "+result.toString());
            }
        });

        return view;
    }







    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calculate, container, false);
    }
}
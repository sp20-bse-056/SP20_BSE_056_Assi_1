package com.example.sp20_bse_056;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class inputFragment extends Fragment {

    EditText input1, input2, input3;
    Button btn;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_input, container, false);
        input1 = view.findViewById(R.id.editTextNumber);
        input2 = view.findViewById(R.id.editTextNumber2);
        input3 = view.findViewById(R.id.editTextNumber3);
        btn = view.findViewById(R.id.btnsave);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float data1, number2, number3;

                data1 = Float.parseFloat(input1.getText().toString());
                number2 = Float.parseFloat(input2.getText().toString());
                number3 = Float.parseFloat(input3.getText().toString());

                CalculateFragment cal = new CalculateFragment();

                Bundle args = new Bundle();

                args.putString("Number1", data1.toString());
                args.putString("Number2", number2.toString());
                args.putString("Number3", number3.toString());
                cal.setArguments(args);


                fragmentManager = getChildFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.add(new CalculateFragment(), String.valueOf(cal));
                fragmentTransaction.commit();
            }
        });


        return view;


    }







    public inputFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


}
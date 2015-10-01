package com.example.com.myapplication;




        import android.app.Activity;

        import android.os.Bundle;

        import android.view.View;

        import android.view.View.OnClickListener;

        import android.widget.Button;

        import android.widget.CompoundButton;

        import android.widget.ImageView;

        import android.widget.RadioButton;

        import android.widget.RadioGroup;

        import android.widget.Switch;

        import android.widget.TextView;




public class MainActivity extends Activity implements OnClickListener {



    private TextView T1;

    private Switch A1;

    private RadioGroup G1;

    private RadioButton Gg1, Gg2, Gg3;

    private Button B1, B2;

    private ImageView I;



    public void init()

    {



        setT1((TextView)findViewById(R.id.T1));

        A1 = (Switch)findViewById(R.id.A1);

        G1 = (RadioGroup)findViewById(R.id.G1);

        Gg1 = (RadioButton)findViewById(R.id.Gg1);

        Gg2 = (RadioButton)findViewById(R.id.Gg2);

        Gg3 = (RadioButton)findViewById(R.id.Gg3);

        B1 = (Button)findViewById(R.id.B1);

        B2 = (Button)findViewById(R.id.B2);

        I = (ImageView)findViewById(R.id.I);





        B2.setOnClickListener((OnClickListener) this);

        Gg1.setOnClickListener((OnClickListener) this);

        Gg2.setOnClickListener((OnClickListener) this);

        Gg3.setOnClickListener((OnClickListener) this);



    }



    public void ShowBooleanFucntion(Boolean check)

    {

        if(check)

        {

            G1.setVisibility(android.view.View.VISIBLE);

            I.setVisibility(android.view.View.VISIBLE);

            B1.setVisibility(android.view.View.VISIBLE);

            B2.setVisibility(android.view.View.VISIBLE);

        }



        else

        {

            G1.setVisibility(android.view.View.INVISIBLE);

            I.setVisibility(android.view.View.INVISIBLE);

            B1.setVisibility(android.view.View.INVISIBLE);

            B2.setVisibility(android.view.View.INVISIBLE);

        }

    }



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        setTitle("안드로이드 사진 보기");



        init();



        A1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {



            @Override

            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                // TODO Auto-generated method stub

                ShowBooleanFucntion(isChecked);

            }

        });





        B1.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                // TODO Auto-generated method stub

                finish();

            }

        });



        B2.setOnClickListener(new View.OnClickListener() {



            @Override

            public void onClick(View v) {

                // TODO Auto-generated method stub

                ShowBooleanFucntion(false);

            }

        });







        Gg1.setOnClickListener(new View.OnClickListener() {



            @Override

            public void onClick(View v) {

                // TODO Auto-generated method stub

                I.setImageResource(R.drawable.jj);

            }

        });



        Gg2.setOnClickListener(new View.OnClickListener() {



            @Override

            public void onClick(View v) {

                // TODO Auto-generated method stub

                I.setImageResource(R.drawable.hunny);

            }

        });



        Gg3.setOnClickListener(new View.OnClickListener() {



            @Override

            public void onClick(View v) {

                // TODO Auto-generated method stub

                I.setImageResource(R.drawable.ice);

            }

        });



    }











    public TextView getT1() {

        return T1;

    }



    public void setT1(TextView t1) {

        T1 = t1;

    }



    @Override

    public void onClick(View v) {

        // TODO Auto-generated method stub



    }

}

